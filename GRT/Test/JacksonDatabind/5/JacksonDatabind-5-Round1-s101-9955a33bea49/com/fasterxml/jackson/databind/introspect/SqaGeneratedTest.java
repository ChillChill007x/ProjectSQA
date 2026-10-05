package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).memberMethods();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).hasAnnotation(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new java.util.TreeMap();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addFieldMixIns(((java.lang.Class)v6),((java.lang.Class)v8),((java.util.Map)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((java.lang.Class)v6).isAssignableFrom(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14).memberMethods();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v21 = null;
    Object v22 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v19),((com.fasterxml.jackson.databind.AnnotationIntrospector)v20),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v22).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMemberMethods(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v15),((java.lang.Class)v17),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMemberMethods(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v12),((java.lang.Class)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new java.lang.annotation.Annotation[][]{};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._collectRelevantAnnotations(((java.lang.annotation.Annotation[][])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotations();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = null;
    Object v12 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v9),((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v12).memberMethods();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMethodMixIns(((java.lang.Class)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v13),((java.lang.Class)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._constructConstructor(((java.lang.reflect.Constructor)v8),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getProtectionDomain();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new java.util.TreeMap();
    Object v11 = ((java.util.Map)v10).size();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addFieldMixIns(((java.lang.Class)v6),((java.lang.Class)v9),((java.util.Map)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ",num";
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = "number";
    Object v6 = new java.lang.Class[]{null,null,null};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotations();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getStaticMethods();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addFactoryMixIns(((java.lang.Class)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getMemberMethodCount();
    org.junit.Assert.assertEquals((Object)(11), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getDeclaringClass();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMethodMixIns(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v12),((java.lang.Class)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAnnotations();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10).get(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((java.lang.Class)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getConstructors();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getStaticMethods();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getFieldCount();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).annotations();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAnnotations();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((java.lang.Class)v12),((java.lang.Class)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getDefaultConstructor();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addConstructorMixIns(((java.lang.Class)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new java.util.TreeMap();
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._findFields(((java.lang.Class)v6),((java.util.Map)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).hasAnnotations();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getDefaultConstructor();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).isPublic();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new java.util.TreeMap();
    Object v9 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._findFields(((java.lang.Class)v7),((java.util.Map)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAnnotations();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((java.lang.Class)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).isPublic();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAllAnnotations();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getRawType();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getFieldCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotation(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).fields();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getStaticMethods();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).annotations();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).fields();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10).getRawType();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotation(((java.lang.Class)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = new java.lang.annotation.Annotation[][]{};
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._collectRelevantAnnotations(((java.lang.annotation.Annotation[][])v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getDefaultConstructor();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).memberMethods();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).fields();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).toString();
    org.junit.Assert.assertEquals((Object)("[AnnotedClass java.lang.Object]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getRawType();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addFactoryMixIns(((java.lang.Class)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAllAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10).annotations();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.Class)v15).isEnum();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((java.lang.Class)v13),((java.lang.Class)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.lang.reflect.Executable)v8).getParameters();
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._constructConstructor(((java.lang.reflect.Constructor)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v18 = null;
    Object v19 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v16),((com.fasterxml.jackson.databind.AnnotationIntrospector)v17),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19).getDefaultConstructor();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v19).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMemberMethods(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v12),((java.lang.Class)v14),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).annotations();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).hasAnnotations();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = "";
    Object v6 = new java.lang.Class[]{null,null,null};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v13 = null;
    Object v14 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v11),((com.fasterxml.jackson.databind.AnnotationIntrospector)v12),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v14)._findFields(((java.lang.Class)v16),((java.util.Map)v17));
    Object v19 = new java.util.TreeMap();
    ((java.util.Map)v18).putAll(((java.util.Map)v19));
    Object v20 = null;
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._findFields(((java.lang.Class)v9),((java.util.Map)v18));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10).toString();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16).getRawType();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10),((java.lang.Class)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getConstructors();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAllAnnotations();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getName();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getDeclaredMethods();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.Annotated)v13).isPublic();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new java.util.TreeMap();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13)._findFields(((java.lang.Class)v16),((java.util.Map)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._findFields(((java.lang.Class)v7),((java.util.Map)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new java.lang.annotation.Annotation[]{null};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._collectRelevantAnnotations(((java.lang.annotation.Annotation[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getMemberMethodCount();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getStaticMethods();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addConstructorMixIns(((java.lang.Class)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotation(((java.lang.Class)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.lang.reflect.Constructor)v8).getTypeParameters();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._constructConstructor(((java.lang.reflect.Constructor)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.lang.reflect.Executable)v8).getParameters();
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._constructConstructor(((java.lang.reflect.Constructor)v8),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).withFallBackAnnotationsFrom(((com.fasterxml.jackson.databind.introspect.Annotated)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new java.lang.annotation.Annotation[]{};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._collectRelevantAnnotations(((java.lang.annotation.Annotation[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getMemberMethodCount();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addFactoryMixIns(((java.lang.Class)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).getDefaultConstructor();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v17 = null;
    Object v18 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v15),((com.fasterxml.jackson.databind.AnnotationIntrospector)v16),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v18).getRawType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v23 = null;
    Object v24 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v21),((com.fasterxml.jackson.databind.AnnotationIntrospector)v22),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v23));
    Object v25 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24).getDefaultConstructor();
    Object v26 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v24).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMemberMethods(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v13),((java.lang.Class)v19),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).getDefaultConstructor();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).getDefaultConstructor();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMemberMethods(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v13),((java.lang.Class)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).toString();
    org.junit.Assert.assertEquals((Object)("[AnnotedClass java.lang.Object]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getDefaultConstructor();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getDefaultConstructor();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getDefaultConstructor();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotation(((java.lang.Class)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).withFallBackAnnotationsFrom(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAllAnnotations();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = false;
    Object v17 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = ((java.lang.reflect.Constructor)v17).getTypeParameters();
    Object v19 = false;
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13)._constructConstructor(((java.lang.reflect.Constructor)v17),(((java.lang.Boolean)v19).booleanValue()));
    Object v21 = false;
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMixOvers(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedConstructor)v20),(((java.lang.Boolean)v21).booleanValue()));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new java.lang.annotation.Annotation[][]{null};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._collectRelevantAnnotations(((java.lang.annotation.Annotation[][])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = new java.lang.annotation.Annotation[][]{null,null,null};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._collectRelevantAnnotations(((java.lang.annotation.Annotation[][])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder();
    Object v8 = ((java.lang.Class)v6).cast(((java.lang.Object)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13).getDefaultConstructor();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13).memberMethods();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).getRawType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v25 = null;
    Object v26 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v23),((com.fasterxml.jackson.databind.AnnotationIntrospector)v24),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v25));
    Object v27 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v26).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMemberMethods(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v15),((java.lang.Class)v21),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).fields();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).hasAnnotation(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getMemberMethodCount();
    org.junit.Assert.assertEquals((Object)(11), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = "Attempted to unwrap single value array for single 'Byte' value but there was more than a single value in the array";
    Object v6 = new java.lang.Class[]{null,null,null};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = "[";
    Object v6 = new java.lang.Class[]{null,null,null};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getRawType();
    Object v11 = new java.util.TreeMap();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._findFields(((java.lang.Class)v10),((java.util.Map)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = "string";
    Object v6 = new java.lang.Class[]{};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotated();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getModifiers();
    Object v6 = new java.lang.annotation.Annotation[][]{};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._collectRelevantAnnotations(((java.lang.annotation.Annotation[][])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).isPublic();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getDefaultConstructor();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = new java.lang.annotation.Annotation[]{};
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10)._collectRelevantAnnotations(((java.lang.annotation.Annotation[])v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getClassLoader();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v12),((java.lang.Class)v14));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).getDefaultConstructor();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).getDefaultConstructor();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMethodMixIns(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v13),((java.lang.Class)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = new java.lang.annotation.Annotation[]{};
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9)._collectRelevantAnnotations(((java.lang.annotation.Annotation[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((java.lang.Class)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getConstructors();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAllAnnotations();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((java.lang.Class)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAnnotated();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotation(((java.lang.Class)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = "";
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).memberMethods();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).fields();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).toString();
    Object v6 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getConstructors();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.lang.reflect.AccessibleObject)v8).trySetAccessible();
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._constructConstructor(((java.lang.reflect.Constructor)v8),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.lang.reflect.Constructor)v8).getTypeParameters();
    Object v10 = false;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._constructConstructor(((java.lang.reflect.Constructor)v8),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).annotations();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17).getRawType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v11).hasAnnotation(((java.lang.Class)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).withFallBackAnnotationsFrom(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotations();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getStaticMethods();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v14 = null;
    Object v15 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v12),((com.fasterxml.jackson.databind.AnnotationIntrospector)v13),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).withFallBackAnnotationsFrom(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10).getAnnotations();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.Class)v19).getAnnotations();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v17),((java.lang.Class)v19),((java.lang.Class)v22));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAllAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getModifiers();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAllAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).getStaticMethods();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v16 = null;
    Object v17 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v14),((com.fasterxml.jackson.databind.AnnotationIntrospector)v15),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v17).getAnnotated();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).getAnnotation(((java.lang.Class)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAllAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = false;
    Object v15 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = null;
    Object v20 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v17),((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).getDefaultConstructor();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v20).getDefaultConstructor();
    Object v23 = false;
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11)._addMixOvers(((java.lang.reflect.Constructor)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedConstructor)v22),(((java.lang.Boolean)v23).booleanValue()));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotations();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = false;
    Object v9 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._constructConstructor(((java.lang.reflect.Constructor)v9),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v10 = null;
    Object v11 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v8),((com.fasterxml.jackson.databind.AnnotationIntrospector)v9),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).getDefaultConstructor();
    Object v13 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.Class)v15).isAnnotation();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = null;
    Object v21 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v18),((com.fasterxml.jackson.databind.AnnotationIntrospector)v19),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21).getDefaultConstructor();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v21).memberMethods();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMemberMethods(((java.lang.Class)v6),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v13),((java.lang.Class)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMethodMap)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = false;
    Object v8 = com.fasterxml.jackson.databind.util.ClassUtil.findConstructor(((java.lang.Class)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = null;
    Object v13 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13).getDefaultConstructor();
    Object v15 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v13).getDefaultConstructor();
    Object v16 = true;
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addMixOvers(((java.lang.reflect.Constructor)v8),((com.fasterxml.jackson.databind.introspect.AnnotatedConstructor)v15),(((java.lang.Boolean)v16).booleanValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new java.util.TreeMap();
    Object v10 = ((java.util.Map)v9).entrySet();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addFieldMixIns(((java.lang.Class)v6),((java.lang.Class)v8),((java.util.Map)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getRawType();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotation(((java.lang.Class)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).hasAnnotations();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = null;
    Object v10 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v10).getAllAnnotations();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16).getRawType();
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v11),((java.lang.Class)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).getAnnotations();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4)._addFactoryMixIns(((java.lang.Class)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = "Failed/to narrow type ";
    Object v6 = new java.lang.Class[]{null,null};
    Object v7 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).findMethod(((java.lang.String)v5),((java.lang.Class[])v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).hasAnnotation(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v9).isAssignableFrom(((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.Annotated)v4).hasAnnotation(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAllAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11).memberMethods();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v3 = null;
    Object v4 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v1),((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v8 = null;
    Object v9 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v6),((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9).getAllAnnotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v4).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v15 = null;
    Object v16 = com.fasterxml.jackson.databind.introspect.AnnotatedClass.construct(((java.lang.Class)v13),((com.fasterxml.jackson.databind.AnnotationIntrospector)v14),((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v15));
    Object v17 = new java.lang.annotation.Annotation[]{};
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v16)._collectRelevantAnnotations(((java.lang.annotation.Annotation[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    ((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v11)._addClassMixIns(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v18),((java.lang.Class)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }
}
