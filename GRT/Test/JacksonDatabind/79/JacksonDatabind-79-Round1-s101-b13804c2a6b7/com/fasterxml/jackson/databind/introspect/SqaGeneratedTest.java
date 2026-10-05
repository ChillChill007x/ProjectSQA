package com.fasterxml.jackson.databind.introspect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.Annotated)v9).annotations();
    Object v11 = false;
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v9),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v9),((com.fasterxml.jackson.annotation.JsonInclude.Include)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "y]";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v20).getAnnotated();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v20));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = 0;
    Object v2 = new java.util.HashSet((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).allIntrospectors(((java.util.Collection)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "y]";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v8),((java.lang.String)v9),((java.lang.Class)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).getAnnotated();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1)._classIfExplicit(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = null;
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findNamingStrategy(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).getName();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.Annotated)v10).isPublic();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).getGenericType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "y]";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v10),((com.fasterxml.jackson.databind.JavaType)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8)._classIfExplicit(((java.lang.Class)v10),((java.lang.Class)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = "null";
    Object v10 = "NON_E*PTY";
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8)._propertyName(((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).getAnnotated();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v3 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v2).readResolve();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v3)._classIfExplicit(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1)._classIfExplicit(((java.lang.Class)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "y]";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = "y]";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v8).refineDeserializationType(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.introspect.Annotated)v23),((com.fasterxml.jackson.databind.JavaType)v24));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).isTypeId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "y]";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v20).isPublic();
    Object v22 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = "y]";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v26));
    Object v28 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT;
    Object v29 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v27),((com.fasterxml.jackson.annotation.JsonInclude.Include)v28));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "y]";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findPropertyContentTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "y]";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = ((com.fasterxml.jackson.databind.JavaType)v21).getErasedSignature();
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.databind.JavaType)v21));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new java.lang.Enum[]{};
    Object v12 = new java.lang.String[]{""};
    Object v13 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findEnumValues(((java.lang.Class)v10),((java.lang.Enum[])v11),((java.lang.String[])v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "y]";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findPropertyTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = "y]";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v26));
    Object v28 = true;
    Object v29 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v27),(((java.lang.Boolean)v28).booleanValue()));
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).isTypeId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findInjectableValueId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).isPublic();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "y]";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v1).refineSerializationType(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.introspect.Annotated)v16),((com.fasterxml.jackson.databind.JavaType)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17).getDeclaringClass();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1)._findConstructorName(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = 0;
    Object v3 = new java.util.HashSet((((java.lang.Integer)v2).intValue()));
    Object v4 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v1).allIntrospectors(((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v9).allIntrospectors();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).getRawType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v18).hashCode();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    Object v19 = null;
    Object v20 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v21 = null;
    Object v22 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v21));
    Object v23 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v24 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v19),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v20),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v22),((com.fasterxml.jackson.databind.util.RootNameLookup)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v25),((com.fasterxml.jackson.databind.type.TypeBindings)v26));
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = "y]";
    Object v31 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v27),((java.lang.Class)v29),((java.lang.String)v30),((java.lang.Class)v32));
    Object v34 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v35 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findPropertyTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v24),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v33),((com.fasterxml.jackson.databind.JavaType)v34));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1)._isIgnorable(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v9).version();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v13 = null;
    Object v14 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v13));
    Object v15 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v16 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v11),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v12),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v14),((com.fasterxml.jackson.databind.util.RootNameLookup)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v17),((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = "y]";
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v19),((java.lang.Class)v21),((java.lang.String)v22),((java.lang.Class)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v9).refineSerializationType(((com.fasterxml.jackson.databind.cfg.MapperConfig)v16),((com.fasterxml.jackson.databind.introspect.Annotated)v25),((com.fasterxml.jackson.databind.JavaType)v26));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = "y]";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9)._findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((com.fasterxml.jackson.databind.introspect.Annotated)v24),((com.fasterxml.jackson.databind.JavaType)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "y]";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.Annotated)v28).getAnnotated();
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v28));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "y]";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v30 = ((com.fasterxml.jackson.databind.introspect.Annotated)v28).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28));
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = null;
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findTypeName(((com.fasterxml.jackson.databind.introspect.AnnotatedClass)v9));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).hasIgnoreMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = "y]";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findInjectableValueId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "y]";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v28));
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findDeserializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = "y]";
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v21),((java.lang.Class)v23),((java.lang.String)v24),((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = null;
    Object v11 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v12 = null;
    Object v13 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v12));
    Object v14 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v15 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v10),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v11),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v13),((com.fasterxml.jackson.databind.util.RootNameLookup)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = "y]";
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v20),((java.lang.String)v21),((java.lang.Class)v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v25).equals(((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findPropertyContentTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v15),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v24),((com.fasterxml.jackson.databind.JavaType)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v19).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v20));
    Object v22 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = "y]";
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v16),((java.lang.String)v17),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = "y]";
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v11),((java.lang.Class)v13),((java.lang.String)v14),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = null;
    Object v10 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v11 = null;
    Object v12 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v11));
    Object v13 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v14 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v9),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v10),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v12),((com.fasterxml.jackson.databind.util.RootNameLookup)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = "y]";
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v17),((java.lang.Class)v19),((java.lang.String)v20),((java.lang.Class)v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.Annotated)v23).getRawType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v26 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8)._findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v14),((com.fasterxml.jackson.databind.introspect.Annotated)v23),((com.fasterxml.jackson.databind.JavaType)v25));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = null;
    Object v3 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v4 = null;
    Object v5 = new com.fasterxml.jackson.databind.introspect.SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver)v4));
    Object v6 = new com.fasterxml.jackson.databind.util.RootNameLookup();
    Object v7 = new com.fasterxml.jackson.databind.SerializationConfig(((com.fasterxml.jackson.databind.cfg.BaseSettings)v2),((com.fasterxml.jackson.databind.jsontype.SubtypeResolver)v3),((com.fasterxml.jackson.databind.introspect.SimpleMixInResolver)v5),((com.fasterxml.jackson.databind.util.RootNameLookup)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "y]";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.Annotated)v16).getName();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findPropertyTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig)v7),((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v20).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.Class)v10).getAnnotations();
    Object v12 = new java.lang.Enum[]{};
    Object v13 = new java.lang.String[]{};
    Object v14 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).findEnumValues(((java.lang.Class)v10),((java.lang.Enum[])v12),((java.lang.String[])v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findDeserializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v20).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findImplicitPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "y]";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v22),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v28));
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v20).findImplicitPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = "y]";
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v6),((java.lang.String)v7),((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = "y]";
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v27));
    Object v29 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v25),((java.lang.String)v26),((java.lang.Class)v28));
    Object v30 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v20).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "y]";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v12),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v21 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v20).readResolve();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v21)._classIfExplicit(((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v19).findSuperType(((java.lang.Class)v24));
    Object v26 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v18),((com.fasterxml.jackson.databind.JavaType)v19));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10)._classIfExplicit(((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).readResolve();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = new java.lang.Enum[]{null};
    Object v5 = new java.lang.String[]{"yyyy-MM-dd'T'HH:mm:","","]"};
    Object v6 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).findEnumValues(((java.lang.Class)v3),((java.lang.Enum[])v4),((java.lang.String[])v5));
    Object v7 = true;
    Object v8 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v1).setConstructorPropertiesImpliesCreator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v8).readResolve();
    Object v10 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v9).readResolve();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = "y]";
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v13),((java.lang.Class)v15),((java.lang.String)v16),((java.lang.Class)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v10).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = "y]";
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v5),((java.lang.String)v6),((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9).annotations();
    Object v11 = ((com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector)v0).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v9));
    org.junit.Assert.assertNull(v11);
  }
}
