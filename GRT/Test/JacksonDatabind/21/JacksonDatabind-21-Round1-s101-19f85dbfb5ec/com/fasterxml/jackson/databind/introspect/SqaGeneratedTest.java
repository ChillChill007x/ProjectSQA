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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.annotation.JsonInclude.Include)v16));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v2));
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getRawType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v9);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v7 = java.text.DateFormat.getTimeInstance();
    Object v8 = null;
    Object v9 = "str8ing";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v3),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v6),((java.text.DateFormat)v7),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v8),((java.util.Locale)v10),((java.util.TimeZone)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15),((java.util.Map)v16));
    Object v18 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ")";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19),((java.lang.Class)v21),((java.lang.String)v22),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).hashCode();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getAnnotated();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v9));
    org.junit.Assert.assertNull(v10);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyIndex(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).annotations();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).isIgnorableType(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getName();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7).getDefaultConstructor();
    Object v9 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v23),((com.fasterxml.jackson.annotation.JsonInclude.Include)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v25));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v26);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15).getDefaultConstructor();
    Object v17 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = true;
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v15),(((java.lang.Boolean)v16).booleanValue()));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findTypeName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
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
  public void test27() throws Throwable {
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
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).isPublic();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v7 = java.text.DateFormat.getTimeInstance();
    Object v8 = null;
    Object v9 = "str8ing";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v3),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v6),((java.text.DateFormat)v7),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v8),((java.util.Locale)v10),((java.util.TimeZone)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15),((java.util.Map)v16));
    Object v18 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22),((java.util.Map)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.AnnotationIntrospector)v21),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.introspect.Annotated)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationPropertyOrder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = "items";
    Object v9 = com.fasterxml.jackson.databind.PropertyName.construct(((java.lang.String)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ")";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._classIfExplicit(((java.lang.Class)v22));
    Object v24 = false;
    Object v25 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((com.fasterxml.jackson.databind.PropertyName)v9),((java.lang.Class)v11),((java.lang.Class)v23),(((java.lang.Boolean)v24).booleanValue()));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
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
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findValueInstantiator(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).hasAnnotation(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._isIgnorable(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
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
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getGenericType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
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
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v23),((com.fasterxml.jackson.annotation.JsonInclude.Include)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v25));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNamingStrategy(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
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
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7).memberMethods();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilderConfig(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v9);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getGenericType();
    Object v9 = false;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v7),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNull(v10);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).isPublic();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v15 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13),((java.util.Map)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v16).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v16));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNamingStrategy(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
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
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findTypeName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v7 = java.text.DateFormat.getTimeInstance();
    Object v8 = null;
    Object v9 = "str8ing";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v3),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v6),((java.text.DateFormat)v7),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v8),((java.util.Locale)v10),((java.util.TimeZone)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15),((java.util.Map)v16));
    Object v18 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v22 = null;
    Object v23 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v24 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v22),((java.util.Map)v23));
    Object v25 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v20),((com.fasterxml.jackson.databind.AnnotationIntrospector)v21),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v24));
    Object v26 = new java.lang.Object[]{};
    Object v27 = java.util.List.of(((java.lang.Object[])v26));
    Object v28 = ((java.util.Collection)v27).parallelStream();
    ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findAndAddVirtualProperties(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v25),((java.util.List)v27));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
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
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v2),((java.lang.Class)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).isTypeId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v10 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v11 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v12 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v15 = java.text.DateFormat.getTimeInstance();
    Object v16 = null;
    Object v17 = "str8ing";
    Object v18 = new java.util.Locale(((java.lang.String)v17));
    Object v19 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v20 = null;
    Object v21 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v11),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v12),((com.fasterxml.jackson.databind.type.TypeFactory)v13),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v14),((java.text.DateFormat)v15),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v16),((java.util.Locale)v18),((java.util.TimeZone)v19),((com.fasterxml.jackson.core.Base64Variant)v20));
    Object v22 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v23 = null;
    Object v24 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23),((java.util.Map)v24));
    Object v26 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v21),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v22),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v30 = null;
    Object v31 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v30),((java.util.Map)v31));
    Object v33 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v28),((com.fasterxml.jackson.databind.AnnotationIntrospector)v29),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v32));
    Object v34 = new java.lang.Object[]{};
    Object v35 = java.util.List.of(((java.lang.Object[])v34));
    ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findAndAddVirtualProperties(((com.fasterxml.jackson.databind.cfg.MapperConfig)v26),((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v33),((java.util.List)v35));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findInjectableValueId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16));
    org.junit.Assert.assertNull(v17);
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
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ")";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v3).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v3)._classIfExplicit(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v2),((java.lang.Class)v14));
    org.junit.Assert.assertNull(v15);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findValueInstantiator(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
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
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).isPublic();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).hashCode();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilderConfig(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).getName();
    Object v9 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ")";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v17).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v24));
    Object v26 = null;
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = ")";
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v30));
    Object v32 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26),((java.lang.Class)v28),((java.lang.String)v29),((java.lang.Class)v31));
    Object v33 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v34 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v17).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v32),((com.fasterxml.jackson.annotation.JsonInclude.Include)v33));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.annotation.JsonInclude.Include)v34));
    Object v36 = ((java.lang.Enum)v35).hashCode();
    Object v37 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v35));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
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
  public void test74() throws Throwable {
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
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v7 = java.text.DateFormat.getTimeInstance();
    Object v8 = null;
    Object v9 = "str8ing";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v3),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v6),((java.text.DateFormat)v7),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v8),((java.util.Locale)v10),((java.util.TimeZone)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15),((java.util.Map)v16));
    Object v18 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ")";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19),((java.lang.Class)v21),((java.lang.String)v22),((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.Annotated)v25).getName();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = ((com.fasterxml.jackson.databind.JavaType)v27).isTypeOrSubTypeOf(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.introspect.Annotated)v25),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
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
    Object v8 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).equals(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).isConcrete();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).isIgnorableType(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ")";
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2),((java.lang.Class)v4),((java.lang.String)v5),((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v8));
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ")";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.annotation.JsonInclude.Include)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findEnumValue(((java.lang.Enum)v18));
    org.junit.Assert.assertEquals((Object)("NON_EMPTY"), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findFilterId(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findRootName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v16);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyIndex(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
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
  public void test85() throws Throwable {
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
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ")";
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v1),((java.lang.Class)v3),((java.lang.String)v4),((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7).getAnnotations();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findIgnoreUnknownProperties(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = "): ";
    Object v2 = "number";
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._propertyName(((java.lang.String)v1),((java.lang.String)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
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
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12),((java.util.Map)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v16).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ")";
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v25),((java.lang.Class)v27),((java.lang.String)v28),((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v33 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v16).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v31),((com.fasterxml.jackson.annotation.JsonInclude.Include)v32));
    Object v34 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.annotation.JsonInclude.Include)v33));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v34));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v35);
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
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.core.type.ResolvedType)v16).toCanonical();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    org.junit.Assert.assertNull(v18);
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
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ")";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ")";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v16).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v23));
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = ")";
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v29));
    Object v31 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v25),((java.lang.Class)v27),((java.lang.String)v28),((java.lang.Class)v30));
    Object v32 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v33 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v16).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v31),((com.fasterxml.jackson.annotation.JsonInclude.Include)v32));
    Object v34 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.annotation.JsonInclude.Include)v33));
    Object v35 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.annotation.JsonInclude.Include)v34));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.BasicClassIntrospector();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v4 = new com.fasterxml.jackson.databind.PropertyNamingStrategy.PascalCaseStrategy();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder.noTypeInfoBuilder();
    Object v7 = java.text.DateFormat.getTimeInstance();
    Object v8 = null;
    Object v9 = "str8ing";
    Object v10 = new java.util.Locale(((java.lang.String)v9));
    Object v11 = com.fasterxml.jackson.databind.util.StdDateFormat.getDefaultTimeZone();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.cfg.BaseSettings(((com.fasterxml.jackson.databind.introspect.ClassIntrospector)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v3),((com.fasterxml.jackson.databind.PropertyNamingStrategy)v4),((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder)v6),((java.text.DateFormat)v7),((com.fasterxml.jackson.databind.cfg.HandlerInstantiator)v8),((java.util.Locale)v10),((java.util.TimeZone)v11),((com.fasterxml.jackson.core.Base64Variant)v12));
    Object v14 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15),((java.util.Map)v16));
    Object v18 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v13),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v14),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v17));
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ")";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19),((java.lang.Class)v21),((java.lang.String)v22),((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v18),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v25),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
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
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v7),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v7).hasAnnotation(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = null;
    Object v16 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v17 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15),((java.util.Map)v16));
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18).getDefaultConstructor();
    Object v20 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v11).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.util.ObjectIdMap();
    Object v6 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4),((java.util.Map)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.Class)v10).getProtectionDomain();
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._classIfExplicit(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._classIfExplicit(((java.lang.Class)v10),((java.lang.Class)v15));
    org.junit.Assert.assertNull(v16);
  }
}
