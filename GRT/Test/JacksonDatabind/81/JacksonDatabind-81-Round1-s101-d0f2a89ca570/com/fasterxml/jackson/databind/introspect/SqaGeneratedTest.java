package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 18;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationSortAlphabetically(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findValueInstantiator(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findImplicitPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.Annotated)v14).hasAnnotation(((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v14));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 18;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findInjectableValueId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v13 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v12));
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilderConfig(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPOJOBuilderConfig(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findRootName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 18;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findImplicitPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
    Object v21 = "typ";
    Object v22 = "'";
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0)._propertyName(((java.lang.String)v21),((java.lang.String)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasAsValue(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNamingStrategy(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).hasAnnotation(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyIgnorals(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).isTypeId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v6));
    Object v8 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v8));
    Object v10 = true;
    Object v11 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v13 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v14 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.reflect.Constructor)v11),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findInjectableValue(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v35));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findMergeInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._isIgnorable(((com.fasterxml.jackson.databind.introspect.Annotated)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.Annotated)v31).getName();
    Object v33 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v13).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v13).readResolve();
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasAsValue(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v27));
    Object v29 = true;
    Object v30 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v28),(((java.lang.Boolean)v29).booleanValue()));
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v32 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v33 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v26),((java.lang.reflect.Constructor)v30),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v31),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v32));
    Object v34 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findInjectableValue(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33));
    org.junit.Assert.assertNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new java.lang.Class[]{null,null,null};
    Object v24 = ((com.fasterxml.jackson.databind.introspect.Annotated)v22).hasOneOf(((java.lang.Class[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._findConstructorName(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findTypeName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._classIfExplicit(((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyIgnorals(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10).hasAnnotation(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v25 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v24));
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasAnySetter(((com.fasterxml.jackson.databind.introspect.Annotated)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyIndex(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).toString();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findRootName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyAliases(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findTypeName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v12).version();
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v15));
    Object v17 = new java.lang.Class[]{null,null,null};
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v16).hasOneOf(((java.lang.Class[])v17));
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v12).findWrapperName(((com.fasterxml.jackson.databind.introspect.Annotated)v16));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v35));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findInjectableValueId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findNamingStrategy(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._classIfExplicit(((java.lang.Class)v14),((java.lang.Class)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = true;
    Object v20 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((java.lang.reflect.Constructor)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v13).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v13).readResolve();
    Object v26 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v25));
    Object v27 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v26).allIntrospectors();
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).getGenericType();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findClassDescription(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v12).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new java.lang.Class[]{null};
    Object v24 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22).hasOneOf(((java.lang.Class[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v22));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findClassDescription(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).getGenericType();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPOJOBuilder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v28 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26).getAnnotation(((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v26));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).isIgnorableType(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v20));
    Object v22 = true;
    Object v23 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v21),(((java.lang.Boolean)v22).booleanValue()));
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v25 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v26 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.reflect.Constructor)v23),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v24),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.Annotated)v26).toString();
    Object v28 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v26));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._isIgnorable(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializationPropertyOrder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.Annotated)v31).getType();
    Object v33 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findMergeInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasAnySetter(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = new java.lang.Enum[]{null,null};
    Object v16 = new java.lang.String[]{};
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findEnumValues(((java.lang.Class)v14),((java.lang.Enum[])v15),((java.lang.String[])v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15).toString();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializationPropertyOrder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v15));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasAnyGetter(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).getAnnotation(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSetterInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = true;
    Object v14 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v12 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v11));
    Object v13 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v18 = 18;
    Object v19 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v16),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyIgnorals(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v18 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v17));
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializationPropertyOrder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = "item";
    Object v14 = ", problem: ";
    Object v15 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12)._propertyName(((java.lang.String)v13),((java.lang.String)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).version();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v34));
    Object v36 = com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance();
    Object v37 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findAutoDetectVisibility(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35),((com.fasterxml.jackson.databind.introspect.VisibilityChecker)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v5 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v4));
    Object v6 = true;
    Object v7 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.reflect.Constructor)v7),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v13 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v14 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v13));
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v16));
    Object v18 = true;
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v15),((java.lang.reflect.Constructor)v19),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v24 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v23));
    Object v25 = com.fasterxml.jackson.databind.type.SimpleType.constructUnsafe(((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v27 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v26));
    Object v28 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v30 = 18;
    Object v31 = new com.fasterxml.jackson.databind.introspect.AnnotatedParameter(((com.fasterxml.jackson.databind.introspect.AnnotatedWithParams)v22),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v28),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v34 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v33));
    Object v35 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v34));
    Object v36 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v12).findPOJOBuilder(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v35));
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v3));
    Object v5 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v6 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v5));
    Object v7 = true;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v10 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v9),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).readResolve();
    Object v14 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v15 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v16 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v15));
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v19 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v18));
    Object v20 = true;
    Object v21 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v19),(((java.lang.Boolean)v20).booleanValue()));
    Object v22 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v23 = new com.fasterxml.jackson.databind.introspect.AnnotationMap[]{null,null,null};
    Object v24 = new com.fasterxml.jackson.databind.introspect.AnnotatedConstructor(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.reflect.Constructor)v21),((com.fasterxml.jackson.databind.introspect.AnnotationMap)v22),((com.fasterxml.jackson.databind.introspect.AnnotationMap[])v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v14).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v14).readResolve();
    Object v27 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v26));
    Object v28 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v27).allIntrospectors();
    Object v29 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).allIntrospectors(((java.util.Collection)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v31 = com.fasterxml.jackson.databind.util.ClassUtil.classOf(((java.lang.Object)v30));
    Object v32 = com.fasterxml.jackson.databind.introspect.AnnotatedClassResolver.createPrimordial(((java.lang.Class)v31));
    Object v33 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasAsValue(((com.fasterxml.jackson.databind.introspect.Annotated)v32));
    org.junit.Assert.assertNull(v33);
  }
}
