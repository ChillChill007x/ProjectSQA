package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).isPublic();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getRawType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).toString();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).toString();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyIndex(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).isIgnorableType(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v11 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v10).withCreatorVisibility(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v10));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findValueInstantiator(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = "array";
    Object v2 = "-";
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._propertyName(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v8));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).hasAnnotation(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).getErasedSignature();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v11));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).annotations();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new java.lang.StringBuilder();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v9).getErasedSignature(((java.lang.StringBuilder)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNamingStrategy(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = false;
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v7),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = "array";
    Object v10 = "-";
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8)._propertyName(((java.lang.String)v9),((java.lang.String)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = true;
    Object v17 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v11),((java.lang.Class)v13),((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).getAnnotated();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getName();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.annotation.JsonInclude.Include)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v9),((com.fasterxml.jackson.annotation.JsonInclude.Include)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.ObjectMapper.findModules();
    Object v2 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).allIntrospectors(((java.util.Collection)v1));
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ")";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationPropertyOrder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilderConfig(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ")";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2),((java.lang.Class)v4),((java.lang.String)v5),((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v8),((com.fasterxml.jackson.annotation.JsonInclude.Include)v9));
    Object v11 = ((java.lang.Enum)v10).hashCode();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findEnumValue(((java.lang.Enum)v10));
    org.junit.Assert.assertEquals((Object)("NON_DEFAULT"), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilderConfig(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationPropertyOrder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.core.type.ResolvedType)v20).toCanonical();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).toString();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).getAnnotated();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v9),((com.fasterxml.jackson.databind.JavaType)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findInjectableValueId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findTypeName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).annotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findValueInstantiator(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ")";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2),((java.lang.Class)v4),((java.lang.String)v5),((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v8),((com.fasterxml.jackson.annotation.JsonInclude.Include)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findEnumValue(((java.lang.Enum)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = 0;
    Object v17 = 1.0F;
    Object v18 = new java.util.HashMap((((java.lang.Integer)v16).intValue()),(((java.lang.Float)v17).floatValue()));
    Object v19 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15),((java.util.Map)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19).getName();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findRootName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findIgnoreUnknownProperties(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).toString();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = 0;
    Object v14 = 1.0F;
    Object v15 = new java.util.HashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.core.type.ResolvedType)v18).isReferenceType();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getGenericType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.Class)v10).getSimpleName();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v10),((java.lang.Class)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = " string";
    Object v2 = "";
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._propertyName(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._isIgnorable(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).hasAnnotation(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = "8";
    Object v11 = new java.lang.Class[]{null,null};
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).findMethod(((java.lang.String)v10),((java.lang.Class[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).isIgnorableType(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ")";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2),((java.lang.Class)v4),((java.lang.String)v5),((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v8),((com.fasterxml.jackson.annotation.JsonInclude.Include)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findEnumValue(((java.lang.Enum)v10));
    org.junit.Assert.assertEquals((Object)("NON_DEFAULT"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8)._classIfExplicit(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).hasAnnotation(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v9),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ")";
    Object v2 = "-!rgs)";
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._propertyName(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.annotation.JsonInclude.Include)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v22 = null;
    Object v23 = 0;
    Object v24 = 1.0F;
    Object v25 = new java.util.HashMap((((java.lang.Integer)v23).intValue()),(((java.lang.Float)v24).floatValue()));
    Object v26 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22),((java.util.Map)v25));
    Object v27 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v20),((com.fasterxml.jackson.databind.AnnotationIntrospector)v21),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v21 = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
    Object v22 = ((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v20).withCreatorVisibility(((com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v20));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findRootName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = 0;
    Object v14 = 1.0F;
    Object v15 = new java.util.HashMap((((java.lang.Integer)v13).intValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).isPublic();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).hasAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findTypeName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ")";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationPropertyOrder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.annotation.JsonInclude.Include)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v17));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasIgnoreMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).getRawType();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v9),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = false;
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v19),(((java.lang.Boolean)v20).booleanValue()));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v3 = null;
    Object v4 = 0;
    Object v5 = 1.0F;
    Object v6 = new java.util.HashMap((((java.lang.Integer)v4).intValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3),((java.util.Map)v6));
    Object v8 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v9 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v1),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v2),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v7),((com.fasterxml.jackson.databind.util.RootNameLookup)v8));
    Object v10 = ((com.fasterxml.jackson.databind.cfg.MapperConfig)v9).getSubtypeResolver();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = null;
    Object v15 = 0;
    Object v16 = 1.0F;
    Object v17 = new java.util.HashMap((((java.lang.Integer)v15).intValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14),((java.util.Map)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v9),((com.fasterxml.jackson.databind.introspect.Annotated)v19),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._constructStdTypeResolverBuilder();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 1.0F;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v5).intValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v7));
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.constructWithoutSuperTypes(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).getName();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyIndex(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v11);
  }
}
