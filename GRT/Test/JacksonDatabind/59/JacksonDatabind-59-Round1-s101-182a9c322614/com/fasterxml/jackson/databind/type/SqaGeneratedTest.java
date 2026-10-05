package com.fasterxml.jackson.databind.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v6),((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((java.lang.Class)v8).getEnumConstants();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._resolveSuperInterfaces(((com.fasterxml.jackson.databind.type.ClassStack)v6),((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v6).refine(((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v10),((com.fasterxml.jackson.databind.JavaType[])v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructCollectionLikeType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).isLocalClass();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructType(((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructReferenceType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructType(((java.lang.reflect.Type)v8),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = 12;
    Object v7 = -29;
    Object v8 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.lang.Class)v5).isInstance(((java.lang.Object)v8));
    Object v10 = new java.lang.Class[]{null,null};
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructParametricType(((java.lang.Class)v5),((java.lang.Class[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructReferenceType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructType(((java.lang.reflect.Type)v15),((java.lang.Class)v17));
    Object v19 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._constructSimple(((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((com.fasterxml.jackson.databind.JavaType)v18),((com.fasterxml.jackson.databind.JavaType[])v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v6),((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).uncheckedSimpleType(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).toGenericString();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructMapType(((java.lang.Class)v5),((java.lang.Class)v7),((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).findTypeParameters(((java.lang.Class)v5),((java.lang.Class)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v8),((java.lang.Class)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructReferenceType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = 12;
    Object v6 = -29;
    Object v7 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v13),((java.lang.Class)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v4),((com.fasterxml.jackson.databind.JavaType)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._resolveSuperClass(((com.fasterxml.jackson.databind.type.ClassStack)v21),((java.lang.Class)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructRawMapLikeType(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = "2.8.4-SNAPSHOT";
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeBindings)v12).withUnboundVariable(((java.lang.String)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._resolveSuperInterfaces(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = 12;
    Object v5 = -29;
    Object v6 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7).uncheckedSimpleType(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructType(((java.lang.reflect.Type)v10),((com.fasterxml.jackson.databind.JavaType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructParametricType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType[])v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v18),((java.lang.Class)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromWellKnownClass(((com.fasterxml.jackson.databind.type.ClassStack)v6),((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((java.lang.Class)v8).getDeclaredClasses();
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructType(((java.lang.reflect.Type)v5),((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    Object v16 = java.lang.ClassLoader.getSystemClassLoader();
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).withClassLoader(((java.lang.ClassLoader)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._fromWellKnownInterface(((com.fasterxml.jackson.databind.type.ClassStack)v20),((java.lang.Class)v22),((com.fasterxml.jackson.databind.type.TypeBindings)v23),((com.fasterxml.jackson.databind.JavaType)v24),((com.fasterxml.jackson.databind.JavaType[])v25));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromWellKnownClass(((com.fasterxml.jackson.databind.type.ClassStack)v6),((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).constructRawMapType(((java.lang.Class)v17));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).constructCollectionLikeType(((java.lang.Class)v17),((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._unknownType();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findWellKnownSimple(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = 12;
    Object v2 = -29;
    Object v3 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = 12;
    Object v15 = -29;
    Object v16 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v17).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v20),((java.lang.Class)v22));
    Object v24 = -18;
    Object v25 = ((com.fasterxml.jackson.databind.JavaType)v23).containedType((((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType)v23));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((java.lang.Class)v2),((java.lang.Class)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBindings)v11).getTypeParameters();
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.reflect.Type)v10),((com.fasterxml.jackson.databind.type.TypeBindings)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).constructCollectionLikeType(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v18));
    Object v20 = "";
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._findPrimitive(((java.lang.String)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._resolveSuperInterfaces(((com.fasterxml.jackson.databind.type.ClassStack)v3),((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v3),((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructMapLikeType(((java.lang.Class)v2),((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.JavaType)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new java.lang.Class[]{null};
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametricType(((java.lang.Class)v9),((java.lang.Class[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = "/string";
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._findPrimitive(((java.lang.String)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).uncheckedSimpleType(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Class[]{null,null,null};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v4),((java.lang.Class[])v5));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v2),((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v19).findTypeParameters(((java.lang.Class)v21),((java.lang.Class)v23),((com.fasterxml.jackson.databind.type.TypeBindings)v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v26));
    Object v28 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v27));
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v30 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeBindings)v30).getTypeParameters();
    Object v32 = ((com.fasterxml.jackson.databind.type.TypeFactory)v19)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v28),((java.lang.reflect.Type)v29),((com.fasterxml.jackson.databind.type.TypeBindings)v30));
    Object v33 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v34 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v18),((java.lang.reflect.Type)v32),((com.fasterxml.jackson.databind.type.TypeBindings)v33));
    org.junit.Assert.assertNotNull(v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructMapLikeType(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v5),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = "number";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBindings)v9).findBoundType(((java.lang.String)v10));
    Object v12 = 12;
    Object v13 = -29;
    Object v14 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).constructReferenceType(((java.lang.Class)v17),((com.fasterxml.jackson.databind.JavaType)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v23));
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v22),((java.lang.Class)v24));
    Object v26 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._fromWellKnownInterface(((com.fasterxml.jackson.databind.type.ClassStack)v6),((java.lang.Class)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9),((com.fasterxml.jackson.databind.JavaType)v25),((com.fasterxml.jackson.databind.JavaType[])v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = "";
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findPrimitive(((java.lang.String)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionLikeType(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8)._unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7).constructType(((java.lang.reflect.Type)v9),((java.lang.Class)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._newSimpleType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v2),((com.fasterxml.jackson.databind.JavaType)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v4).isAssignableFrom(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).isConcrete();
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._constructSimple(((java.lang.Class)v4),((com.fasterxml.jackson.databind.type.TypeBindings)v8),((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.JavaType[])v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10)._unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9).constructType(((java.lang.reflect.Type)v11),((java.lang.Class)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isAbstract();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v17)._unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v16).constructType(((java.lang.reflect.Type)v18),((java.lang.Class)v20));
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructMapLikeType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType)v14),((com.fasterxml.jackson.databind.JavaType)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.type.TypeFactory)v0).clearCache();
    Object v1 = null;
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._findWellKnownSimple(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getNestHost();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findWellKnownSimple(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v5));
    Object v7 = "";
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructFromCanonical(((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructParametricType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType[])v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v10),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v13).isLocalClass();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v11),((java.lang.Class)v13));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = 12;
    Object v18 = -29;
    Object v19 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v20).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v25));
    Object v27 = ((com.fasterxml.jackson.databind.JavaType)v16).withValueHandler(((java.lang.Object)v26));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v15),((com.fasterxml.jackson.databind.JavaType)v16));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructParametricType(((java.lang.Class)v5),((com.fasterxml.jackson.databind.JavaType[])v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v16)._unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.Class)v19).getModifiers();
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v17),((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Class[]{};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v2),((java.lang.Class)v4),((java.lang.Class[])v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromWellKnownClass(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.Class)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12),((com.fasterxml.jackson.databind.JavaType)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4)._unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructType(((java.lang.reflect.Type)v5),((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v9)._unknownType();
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v4).getAnnotation(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructReferenceType(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = "UTC6";
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._findPrimitive(((java.lang.String)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeParser)v7).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v14 = java.lang.ClassLoader.getSystemClassLoader();
    Object v15 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v7),((com.fasterxml.jackson.databind.type.TypeModifier[])v13),((java.lang.ClassLoader)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v15)._resolveSuperClass(((com.fasterxml.jackson.databind.type.ClassStack)v18),((java.lang.Class)v20),((com.fasterxml.jackson.databind.type.TypeBindings)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Class[]{};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v4),((java.lang.Class[])v5));
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = new java.lang.Class[]{null};
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructParametricType(((java.lang.Class)v5),((java.lang.Class[])v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = 12;
    Object v2 = -29;
    Object v3 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).constructParametricType(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType[])v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13).constructParametricType(((java.lang.Class)v15),((com.fasterxml.jackson.databind.JavaType[])v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.Class)v9).isAssignableFrom(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeBindings)v20).toString();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = ((com.fasterxml.jackson.databind.JavaType)v22).isAbstract();
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._constructSimple(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v20),((com.fasterxml.jackson.databind.JavaType)v22),((com.fasterxml.jackson.databind.JavaType[])v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v1),((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5)._unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructCollectionLikeType(((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.type.TypeFactory)v3).clearCache();
    Object v4 = null;
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._findWellKnownSimple(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).getClassLoader();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = 12;
    Object v2 = -29;
    Object v3 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).constructParametricType(((java.lang.Class)v6),((com.fasterxml.jackson.databind.JavaType[])v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructRawCollectionType(((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructMapType(((java.lang.Class)v8),((java.lang.Class)v10),((java.lang.Class)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructParametricType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType[])v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = 12;
    Object v18 = -29;
    Object v19 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v20).constructParametricType(((java.lang.Class)v22),((com.fasterxml.jackson.databind.JavaType[])v23));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructType(((java.lang.reflect.Type)v15),((java.lang.Class)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.JavaType[]{null,null};
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructSimpleType(((java.lang.Class)v8),((java.lang.Class)v10),((com.fasterxml.jackson.databind.JavaType[])v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    ((com.fasterxml.jackson.databind.type.TypeFactory)v1).clearCache();
    Object v2 = null;
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v1)._findWellKnownSimple(((java.lang.Class)v4));
    Object v6 = 12;
    Object v7 = -29;
    Object v8 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 12;
    Object v10 = -29;
    Object v11 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v12));
    Object v14 = 12;
    Object v15 = -29;
    Object v16 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v16));
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeParser)v13).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v17));
    Object v19 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v20 = java.lang.ClassLoader.getSystemClassLoader();
    Object v21 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v8),((com.fasterxml.jackson.databind.type.TypeParser)v13),((com.fasterxml.jackson.databind.type.TypeModifier[])v19),((java.lang.ClassLoader)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v22)._unknownType();
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v24));
    Object v26 = ((java.lang.Class)v25).getModifiers();
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v21).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v23),((java.lang.Class)v25));
    Object v28 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructType(((java.lang.reflect.Type)v5),((com.fasterxml.jackson.databind.JavaType)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v2));
    Object v4 = 12;
    Object v5 = -29;
    Object v6 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v7).constructParametricType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.JavaType[])v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeBindings)v13).asKey(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v3),((java.lang.Class)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromWellKnownClass(((com.fasterxml.jackson.databind.type.ClassStack)v3),((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.JavaType[])v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Class[]{};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v4),((java.lang.Class[])v5));
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.Class)v12).getPackageName();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v14).isConcrete();
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructCollectionLikeType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getPackage();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructMapLikeType(((java.lang.Class)v4),((java.lang.Class)v6),((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Class[]{};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v4),((java.lang.Class[])v5));
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v16));
    Object v18 = 12;
    Object v19 = -29;
    Object v20 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v23 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v22));
    Object v24 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v21).constructParametricType(((java.lang.Class)v23),((com.fasterxml.jackson.databind.JavaType[])v24));
    Object v26 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeBindings)v27).asKey(((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14)._fromClass(((com.fasterxml.jackson.databind.type.ClassStack)v17),((java.lang.Class)v26),((com.fasterxml.jackson.databind.type.TypeBindings)v27));
    Object v32 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v33 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v13),((java.lang.reflect.Type)v31),((com.fasterxml.jackson.databind.type.TypeBindings)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v11 = java.lang.ClassLoader.getSystemClassLoader();
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).withClassLoader(((java.lang.ClassLoader)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12).uncheckedSimpleType(((java.lang.Class)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6)._fromAny(((com.fasterxml.jackson.databind.type.ClassStack)v9),((java.lang.reflect.Type)v15),((com.fasterxml.jackson.databind.type.TypeBindings)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructParametricType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType[])v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((java.lang.Class)v2),((java.lang.Class)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v14 = 12;
    Object v15 = -29;
    Object v16 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()));
    Object v17 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v16));
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v21 = ((com.fasterxml.jackson.databind.type.TypeFactory)v17).constructParametricType(((java.lang.Class)v19),((com.fasterxml.jackson.databind.JavaType[])v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).findTypeParameters(((com.fasterxml.jackson.databind.JavaType)v13),((java.lang.Class)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = java.lang.ClassLoader.getSystemClassLoader();
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).withClassLoader(((java.lang.ClassLoader)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v5).uncheckedSimpleType(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.util.LRUMap)v2).putIfAbsent(((java.lang.Object)v8),((java.lang.Object)v11));
    Object v13 = 12;
    Object v14 = -29;
    Object v15 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v15));
    Object v17 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v16));
    Object v18 = new com.fasterxml.jackson.databind.type.TypeModifier[]{};
    Object v19 = java.lang.ClassLoader.getSystemClassLoader();
    Object v20 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v17),((com.fasterxml.jackson.databind.type.TypeModifier[])v18),((java.lang.ClassLoader)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getDeclaredConstructors();
    Object v8 = new java.lang.Class[]{null};
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametrizedType(((java.lang.Class)v4),((java.lang.Class)v6),((java.lang.Class[])v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Class[]{};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v4),((java.lang.Class[])v5));
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new java.lang.Class[]{};
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructParametricType(((java.lang.Class)v4),((java.lang.Class[])v5));
    Object v7 = 12;
    Object v8 = -29;
    Object v9 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v9));
    Object v11 = 12;
    Object v12 = -29;
    Object v13 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v18 = ((com.fasterxml.jackson.databind.type.TypeFactory)v14).constructParametricType(((java.lang.Class)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v21 = java.lang.ClassLoader.getSystemClassLoader();
    Object v22 = ((com.fasterxml.jackson.databind.type.TypeFactory)v20).withClassLoader(((java.lang.ClassLoader)v21));
    Object v23 = 12;
    Object v24 = -29;
    Object v25 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v22).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v25));
    Object v27 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v28 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v29 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v28));
    Object v30 = ((com.fasterxml.jackson.databind.type.TypeFactory)v26).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v27),((java.lang.Class)v29));
    Object v31 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructType(((java.lang.reflect.Type)v19),((com.fasterxml.jackson.databind.JavaType)v30));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v8));
    Object v10 = new com.fasterxml.jackson.databind.JavaType[]{null,null,null};
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0)._fromWellKnownClass(((com.fasterxml.jackson.databind.type.ClassStack)v3),((java.lang.Class)v5),((com.fasterxml.jackson.databind.type.TypeBindings)v6),((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.JavaType[])v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3)._findWellKnownSimple(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = 12;
    Object v7 = -29;
    Object v8 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v8));
    Object v10 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v9));
    Object v11 = 12;
    Object v12 = -29;
    Object v13 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v13));
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeParser)v10).withFactory(((com.fasterxml.jackson.databind.type.TypeFactory)v14));
    Object v16 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v17 = java.lang.ClassLoader.getSystemClassLoader();
    Object v18 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5),((com.fasterxml.jackson.databind.type.TypeParser)v10),((com.fasterxml.jackson.databind.type.TypeModifier[])v16),((java.lang.ClassLoader)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v20 = ((com.fasterxml.jackson.databind.type.TypeFactory)v19)._unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.Class)v22).getModifiers();
    Object v24 = ((com.fasterxml.jackson.databind.type.TypeFactory)v18).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v20),((java.lang.Class)v22));
    Object v25 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v26 = ((com.fasterxml.jackson.databind.type.TypeFactory)v25)._unknownType();
    Object v27 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructType(((java.lang.reflect.Type)v24),((com.fasterxml.jackson.databind.JavaType)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = 12;
    Object v2 = -29;
    Object v3 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v4).uncheckedSimpleType(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructArrayType(((com.fasterxml.jackson.databind.JavaType)v7));
    Object v9 = 12;
    Object v10 = -29;
    Object v11 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v11));
    Object v13 = 12;
    Object v14 = -29;
    Object v15 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v15));
    Object v17 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v18 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.TypeFactory)v16).uncheckedSimpleType(((java.lang.Class)v18));
    Object v20 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v20));
    Object v22 = new com.fasterxml.jackson.databind.type.SimpleType(((java.lang.Class)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeFactory)v12).constructType(((java.lang.reflect.Type)v19),((com.fasterxml.jackson.databind.JavaType)v22));
    Object v24 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v25 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).moreSpecificType(((com.fasterxml.jackson.databind.JavaType)v23),((com.fasterxml.jackson.databind.JavaType)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 12;
    Object v1 = -29;
    Object v2 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v7));
    Object v9 = ((com.fasterxml.jackson.databind.util.LRUMap)v2).put(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = 12;
    Object v11 = -29;
    Object v12 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v12));
    Object v14 = new com.fasterxml.jackson.databind.type.TypeParser(((com.fasterxml.jackson.databind.type.TypeFactory)v13));
    Object v15 = new com.fasterxml.jackson.databind.type.TypeModifier[]{null};
    Object v16 = java.lang.ClassLoader.getSystemClassLoader();
    Object v17 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v2),((com.fasterxml.jackson.databind.type.TypeParser)v14),((com.fasterxml.jackson.databind.type.TypeModifier[])v15),((java.lang.ClassLoader)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructMapType(((java.lang.Class)v2),((java.lang.Class)v4),((java.lang.Class)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructParametricType(((java.lang.Class)v8),((com.fasterxml.jackson.databind.JavaType[])v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructRawMapLikeType(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v3).constructGeneralizedType(((com.fasterxml.jackson.databind.JavaType)v4),((java.lang.Class)v6));
    Object v8 = 12;
    Object v9 = -29;
    Object v10 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new com.fasterxml.jackson.databind.type.TypeFactory(((com.fasterxml.jackson.databind.util.LRUMap)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v12));
    Object v14 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v11).constructParametricType(((java.lang.Class)v13),((com.fasterxml.jackson.databind.JavaType[])v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v15));
    Object v17 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Class)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).isMemberClass();
    Object v6 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructParametrizedType(((java.lang.Class)v2),((java.lang.Class)v4),((com.fasterxml.jackson.databind.JavaType[])v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).constructCollectionType(((java.lang.Class)v2),((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = new com.fasterxml.jackson.databind.type.ClassStack(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getGenericSuperclass();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = "Invalid Object Id definition for ";
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBindings)v9).withUnboundVariable(((java.lang.String)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2)._resolveSuperInterfaces(((com.fasterxml.jackson.databind.type.ClassStack)v5),((java.lang.Class)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).getErasedSignature();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructSpecializedType(((com.fasterxml.jackson.databind.JavaType)v7),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v1 = java.lang.ClassLoader.getSystemClassLoader();
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeFactory)v0).withClassLoader(((java.lang.ClassLoader)v1));
    Object v3 = 12;
    Object v4 = -29;
    Object v5 = new com.fasterxml.jackson.databind.util.LRUMap((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.type.TypeFactory)v2).withCache(((com.fasterxml.jackson.databind.util.LRUMap)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v9 = java.lang.ClassLoader.getSystemClassLoader();
    Object v10 = ((com.fasterxml.jackson.databind.type.TypeFactory)v8).withClassLoader(((java.lang.ClassLoader)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance();
    Object v14 = ((com.fasterxml.jackson.databind.type.TypeFactory)v13)._unknownType();
    Object v15 = ((com.fasterxml.jackson.databind.type.TypeFactory)v10).constructCollectionLikeType(((java.lang.Class)v12),((com.fasterxml.jackson.databind.JavaType)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeFactory)v6).constructType(((java.lang.reflect.Type)v7),((com.fasterxml.jackson.databind.JavaType)v15));
    org.junit.Assert.assertNotNull(v16);
  }
}
