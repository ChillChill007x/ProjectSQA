package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Enum[]{null,null,null};
    Object v6 = new java.lang.String[]{};
    Object v7 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findEnumValues(((java.lang.Class)v4),((java.lang.Enum[])v5),((java.lang.String[])v6));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).hasIgnoreMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).allIntrospectors(((java.util.Collection)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "stringg";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializationSortAlphabetically(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new java.lang.Enum[]{null,null,null};
    Object v8 = new java.lang.String[]{"+>;"};
    Object v9 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findEnumValues(((java.lang.Class)v6),((java.lang.Enum[])v7),((java.lang.String[])v8));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findWrapperName(((com.fasterxml.jackson.databind.introspect.Annotated)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).version();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = "stringg";
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v20),((java.lang.Class)v24),((java.lang.String)v25),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).withFallBackAnnotationsFrom(((com.fasterxml.jackson.databind.introspect.Annotated)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v33 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v32));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).version();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getDeclaredFields();
    Object v8 = new java.lang.Enum[]{};
    Object v9 = new java.lang.String[]{};
    Object v10 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findEnumValues(((java.lang.Class)v6),((java.lang.Enum[])v8),((java.lang.String[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors();
    Object v6 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).version();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findFormat(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4)._hasAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((java.lang.Class)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findNameForDeserialization(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).getType(((com.fasterxml.jackson.databind.type.TypeBindings)v18));
    Object v20 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findPropertyInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).toString();
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).hasIgnoreMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).equals(((java.lang.Object)v20));
    Object v22 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).version();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).equals(((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).allIntrospectors();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "stringg";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new java.lang.Enum[]{null,null,null};
    Object v8 = new java.lang.String[]{"Can not construt SimpleType for a Map (class: "};
    Object v9 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findEnumValues(((java.lang.Class)v6),((java.lang.Enum[])v7),((java.lang.String[])v8));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).allIntrospectors();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new java.lang.Enum[]{};
    Object v10 = new java.lang.String[]{""};
    Object v11 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findEnumValues(((java.lang.Class)v8),((java.lang.Enum[])v9),((java.lang.String[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = new java.lang.Object[]{};
    Object v4 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).allIntrospectors(((java.util.Collection)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "stringg";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).isTypeId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v17 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.annotation.JsonInclude.Include)v16));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "stringg";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v17));
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).hasIgnoreMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17).getMember();
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).hasRequiredMarker(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.JavaType)v18).containedTypeCount();
    Object v20 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findDeserializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findDeserializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v13),((com.fasterxml.jackson.databind.JavaType)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findDeserializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = new java.lang.Object[]{};
    Object v6 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors(((java.util.Collection)v6));
    Object v8 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).version();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = "stringg";
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v8),((java.lang.Class)v12),((java.lang.String)v13),((java.lang.Class)v17));
    Object v19 = new java.lang.Class[]{null,null,null};
    Object v20 = ((com.fasterxml.jackson.databind.introspect.Annotated)v18).hasOneOf(((java.lang.Class[])v19));
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v18));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).hasCreatorAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = "";
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = new com.fasterxml.jackson.databind.introspect.ObjectIdInfo(((java.lang.String)v18),((java.lang.Class)v22),((java.lang.Class)v26));
    Object v28 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.introspect.ObjectIdInfo)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findPropertyIndex(((com.fasterxml.jackson.databind.introspect.Annotated)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).isPublic();
    Object v17 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new java.lang.Enum[]{null,null,null};
    Object v10 = new java.lang.String[]{"","M","4"};
    Object v11 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findEnumValues(((java.lang.Class)v8),((java.lang.Enum[])v9),((java.lang.String[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = "stringg";
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v14),((java.lang.Class)v18),((java.lang.String)v19),((java.lang.Class)v23));
    Object v25 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v3),((com.fasterxml.jackson.databind.AnnotationIntrospector)v4));
    Object v6 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v5).allIntrospectors();
    Object v7 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).allIntrospectors(((java.util.Collection)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "stringg";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializationConverter(((com.fasterxml.jackson.databind.introspect.Annotated)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new java.lang.Enum[]{};
    Object v11 = new java.lang.String[]{"Can not refine serialization type %s into %s; types not related","' value but there was more than a single value in the array","array"};
    Object v12 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findEnumValues(((java.lang.Class)v9),((java.lang.Enum[])v10),((java.lang.String[])v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "stringg";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v22 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v7).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v20),((com.fasterxml.jackson.annotation.JsonInclude.Include)v21));
    Object v23 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findEnumValue(((java.lang.Enum)v22));
    org.junit.Assert.assertEquals((Object)("NON_EMPTY"), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Enum[]{null,null,null};
    Object v6 = new java.lang.String[]{"5","","string"};
    Object v7 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findEnumValues(((java.lang.Class)v4),((java.lang.Enum[])v5),((java.lang.String[])v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "stringg";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).isPublic();
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findWrapperName(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6));
    Object v8 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v7).allIntrospectors();
    Object v9 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors(((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findSerializationType(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = new com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver();
    Object v19 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).equals(((java.lang.Object)v18));
    Object v20 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).withAnnotations(((com.fasterxml.jackson.databind.introspect.AnnotationMap)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findPropertyDefaultValue(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2)._findAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((java.lang.Class)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findPropertyAccess(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonProperty.Access.AUTO), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).allIntrospectors();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = "stringg";
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v6),((java.lang.Class)v10),((java.lang.String)v11),((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.introspect.Annotated)v16).hashCode();
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findCreatorBinding(((com.fasterxml.jackson.databind.introspect.Annotated)v16));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new java.lang.Enum[]{};
    Object v10 = new java.lang.String[]{"INFER_PROPERTY_MUTATORS",", static serializer of type ","iBems"};
    Object v11 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findEnumValues(((java.lang.Class)v8),((java.lang.Enum[])v9),((java.lang.String[])v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).isTypeId(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v6 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v7 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v5),((com.fasterxml.jackson.databind.AnnotationIntrospector)v6));
    Object v8 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v9 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v7),((com.fasterxml.jackson.databind.AnnotationIntrospector)v8));
    Object v10 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v11 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v12 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v10),((com.fasterxml.jackson.databind.AnnotationIntrospector)v11));
    Object v13 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v12).allIntrospectors();
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v9).allIntrospectors(((java.util.Collection)v13));
    Object v15 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors(((java.util.Collection)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = "stringg";
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v18),((java.lang.Class)v22),((java.lang.String)v23),((java.lang.Class)v27));
    Object v29 = ((com.fasterxml.jackson.databind.introspect.Annotated)v28).hashCode();
    Object v30 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v31 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v32 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v30),((com.fasterxml.jackson.databind.type.TypeBindings)v31));
    Object v33 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v32));
    Object v34 = ((java.lang.Class)v33).getTypeName();
    Object v35 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4)._findAnnotation(((com.fasterxml.jackson.databind.introspect.Annotated)v28),((java.lang.Class)v33));
    org.junit.Assert.assertNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findViews(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v19 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v20 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v18),((com.fasterxml.jackson.databind.AnnotationIntrospector)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v26 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.type.TypeBindings)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = "stringg";
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v31 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v29),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v32 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v31));
    Object v33 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v23),((java.lang.Class)v27),((java.lang.String)v28),((java.lang.Class)v32));
    Object v34 = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
    Object v35 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v20).findSerializationInclusion(((com.fasterxml.jackson.databind.introspect.Annotated)v33),((com.fasterxml.jackson.annotation.JsonInclude.Include)v34));
    Object v36 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.annotation.JsonInclude.Include)v35));
    org.junit.Assert.assertEquals((Object)(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).getRawType();
    Object v17 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = ((com.fasterxml.jackson.core.type.ResolvedType)v20).toCanonical();
    Object v22 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findSerializationKeyType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new java.lang.Enum[]{null};
    Object v10 = new java.lang.String[]{};
    Object v11 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findEnumValues(((java.lang.Class)v8),((java.lang.Enum[])v9),((java.lang.String[])v10));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getMethods();
    Object v8 = new java.lang.Enum[]{null,null};
    Object v9 = new java.lang.String[]{};
    Object v10 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findEnumValues(((java.lang.Class)v6),((java.lang.Enum[])v8),((java.lang.String[])v9));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = "stringg";
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v3),((java.lang.Class)v7),((java.lang.String)v8),((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findNullSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Enum[]{null,null,null};
    Object v6 = new java.lang.String[]{"?","-args)",""};
    Object v7 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findEnumValues(((java.lang.Class)v4),((java.lang.Enum[])v5),((java.lang.String[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findPropertyDescription(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = new java.lang.Object[]{};
    Object v6 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors(((java.util.Collection)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v8));
    Object v10 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors(((java.util.Collection)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.Annotated)v17).getGenericType();
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findNameForSerialization(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findImplicitPropertyName(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSubtypes(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15).getAnnotation(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findSerializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v15));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findKeyDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = new java.lang.Object[]{};
    Object v6 = com.fasterxml.jackson.databind.util.ArrayBuilders.arrayToList(((java.lang.Object[])v5));
    Object v7 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).allIntrospectors(((java.util.Collection)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = "stringg";
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v10),((java.lang.Class)v14),((java.lang.String)v15),((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findReferenceType(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17).getMember();
    Object v19 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findDeserializationContentConverter(((com.fasterxml.jackson.databind.introspect.AnnotatedMember)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v20 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.type.TypeBindings)v19));
    Object v21 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findSerializationContentType(((com.fasterxml.jackson.databind.introspect.Annotated)v17),((com.fasterxml.jackson.databind.JavaType)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = "stringg";
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v5),((java.lang.Class)v9),((java.lang.String)v10),((java.lang.Class)v14));
    Object v16 = java.util.TimeZone.getDefault();
    Object v17 = ((com.fasterxml.jackson.databind.introspect.Annotated)v15).equals(((java.lang.Object)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v2).findFilterId(((com.fasterxml.jackson.databind.introspect.Annotated)v15));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v2 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v0),((com.fasterxml.jackson.databind.AnnotationIntrospector)v1));
    Object v3 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v4 = com.fasterxml.jackson.databind.AnnotationIntrospector.pair(((com.fasterxml.jackson.databind.AnnotationIntrospector)v2),((com.fasterxml.jackson.databind.AnnotationIntrospector)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = "stringg";
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v15 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.type.TypeBindings)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v7),((java.lang.Class)v11),((java.lang.String)v12),((java.lang.Class)v16));
    Object v18 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v4).findContentDeserializer(((com.fasterxml.jackson.databind.introspect.Annotated)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.AnnotationIntrospector.nopInstance();
    Object v1 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).allIntrospectors();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = new com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Basic(((com.fasterxml.jackson.databind.type.TypeFactory)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = "stringg";
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember(((com.fasterxml.jackson.databind.introspect.TypeResolutionContext)v4),((java.lang.Class)v8),((java.lang.String)v9),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.AnnotationIntrospector)v0).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated)v14));
    org.junit.Assert.assertNull(v15);
  }
}
