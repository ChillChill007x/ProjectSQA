package com.fasterxml.jackson.databind.type;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).setReference(((com.fasterxml.jackson.databind.JavaType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = 1;
    Object v7 = new java.lang.StringBuilder((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.lang.StringBuilder)v7).toString();
    Object v9 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).getGenericSignature(((java.lang.StringBuilder)v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v2).isTypeOrSubTypeOf(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).toString();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isEnumType();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isThrowable();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isPrimitive();
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).getBindings();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = 0;
    Object v7 = new java.util.HashMap((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).toString();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isEnumType();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).findTypeParameters(((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).hasHandlers();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v13).getSuperClass();
    Object v15 = new com.fasterxml.jackson.databind.JavaType[]{};
    Object v16 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).refine(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10),((com.fasterxml.jackson.databind.JavaType)v13),((com.fasterxml.jackson.databind.JavaType[])v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).toString();
    org.junit.Assert.assertEquals((Object)("[recursive type; UNRESOLVED"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v16 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v14),((com.fasterxml.jackson.databind.type.TypeBindings)v15));
    Object v17 = new com.fasterxml.jackson.databind.JavaType[]{null};
    Object v18 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).refine(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10),((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.JavaType[])v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.type.TypeBase)v0).containedTypeCount();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.core.type.ResolvedType)v2).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).getKeyType();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).toCanonical();
    org.junit.Assert.assertEquals((Object)("[Ljava.lang.Object;"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v2).forcedNarrowBy(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v2).getGenericSignature();
    org.junit.Assert.assertEquals((Object)("[Ljava/lang/Object;"), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = 9;
    Object v4 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).containedType((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.core.type.ResolvedType)v7).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).getContentType();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v15).toString();
    org.junit.Assert.assertEquals((Object)("[recursive type; UNRESOLVED"), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    Object v8 = 41;
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v7).containedTypeName((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).getSuperClass();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).toString();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isEnumType();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getGenericSignature();
    org.junit.Assert.assertEquals((Object)("[Ljava/lang/Object;"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).getContentValueHandler();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBase)v0).findTypeParameters(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.JavaType)v15).isConcrete();
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).findSuperType(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v0).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).getInterfaces();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v15).getSuperClass();
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findTypeParameters(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findTypeParameters(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).getRawClass();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getRawClass();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).hasRawClass(((java.lang.Class)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.type.TypeBase)v7).getInterfaces();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).getBindings();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).getValueHandler();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v15).setReference(((com.fasterxml.jackson.databind.JavaType)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v13 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v14 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v12),((com.fasterxml.jackson.databind.type.TypeBindings)v13));
    Object v15 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v14));
    Object v16 = ((com.fasterxml.jackson.databind.type.TypeBase)v11).findSuperType(((java.lang.Class)v15));
    Object v17 = ((com.fasterxml.jackson.core.type.ResolvedType)v16).isReferenceType();
    Object v18 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v8).withContentTypeHandler(((java.lang.Object)v17));
    Object v19 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v18).toString();
    Object v20 = ((com.fasterxml.jackson.databind.JavaType)v2).withTypeHandler(((java.lang.Object)v19));
    Object v21 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v22 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v23 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v21),((com.fasterxml.jackson.databind.type.TypeBindings)v22));
    Object v24 = ((com.fasterxml.jackson.databind.JavaType)v23).getRawClass();
    Object v25 = ((java.lang.Class)v24).getAnnotatedInterfaces();
    Object v26 = ((com.fasterxml.jackson.databind.JavaType)v2).hasRawClass(((java.lang.Class)v24));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5)._narrow(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).containedTypeCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v17 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v18 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v16),((com.fasterxml.jackson.databind.type.TypeBindings)v17));
    Object v19 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v20 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v21 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v19),((com.fasterxml.jackson.databind.type.TypeBindings)v20));
    Object v22 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v21));
    Object v23 = ((com.fasterxml.jackson.databind.type.TypeBase)v18).findSuperType(((java.lang.Class)v22));
    ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v15).setReference(((com.fasterxml.jackson.databind.JavaType)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).forcedNarrowBy(((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).hasHandlers();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).toString();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isEnumType();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v6).hasRawClass(((java.lang.Class)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = ((com.fasterxml.jackson.databind.type.TypeBase)v0).containedTypeName((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isContainerType();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = 1;
    Object v17 = new java.lang.StringBuilder((((java.lang.Integer)v16).intValue()));
    Object v18 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v15).getErasedSignature(((java.lang.StringBuilder)v17));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.core.type.ResolvedType)v2).toCanonical();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).getRawClass();
    Object v11 = ((java.lang.Class)v6).getDeclaredAnnotation(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v2).isTypeOrSubTypeOf(((java.lang.Class)v6));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getRawClass();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findTypeParameters(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    Object v8 = 0;
    Object v9 = ((com.fasterxml.jackson.databind.type.TypeBase)v7).containedType((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).findSuperType(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v0).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.type.TypeBase)v0).findSuperType(((java.lang.Class)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).containedTypeOrUnknown((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = 1;
    Object v4 = new java.lang.StringBuilder((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).getGenericSignature(((java.lang.StringBuilder)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).toString();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isEnumType();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v4));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v6).toCanonical();
    org.junit.Assert.assertEquals((Object)("[Ljava.lang.Object;"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.TypeBase)v10).toCanonical();
    org.junit.Assert.assertEquals((Object)("[Ljava.lang.Object;"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v10).setReference(((com.fasterxml.jackson.databind.JavaType)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = new com.fasterxml.jackson.databind.introspect.AnnotationMap();
    Object v12 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v10).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).findSuperType(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v0).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v12).getGenericSignature();
    org.junit.Assert.assertEquals((Object)("Ljava/lang/Object;"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = true;
    Object v4 = "2";
    Object v5 = com.fasterxml.jackson.databind.PropertyMetadata.construct((((java.lang.Boolean)v3).booleanValue()),((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withValueHandler(((java.lang.Object)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).getRawClass();
    Object v11 = ((java.lang.Class)v10).getClassLoader();
    Object v12 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findTypeParameters(((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v12 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v13 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v11),((com.fasterxml.jackson.databind.type.TypeBindings)v12));
    Object v14 = ((com.fasterxml.jackson.databind.JavaType)v10).withContentType(((com.fasterxml.jackson.databind.JavaType)v13));
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v10).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).getTypeHandler();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getGenericInterfaces();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v2).forcedNarrowBy(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = -10;
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v5).containedTypeOrUnknown((((java.lang.Integer)v6).intValue()));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v5).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v6).toString();
    org.junit.Assert.assertEquals((Object)("[recursive type; UNRESOLVED"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = 0;
    Object v9 = new java.util.HashMap((((java.lang.Integer)v8).intValue()));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v7).withValueHandler(((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v7).containedTypeOrUnknown((((java.lang.Integer)v11).intValue()));
    Object v13 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v6).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).containedTypeOrUnknown((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).getContentTypeHandler();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).findTypeParameters(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1063877011), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).getRawClass();
    Object v11 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v6)._narrow(((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).isMapLikeType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).forcedNarrowBy(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).hasHandlers();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).getKeyType();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.core.type.ResolvedType)v5).isInterface();
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v5).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v8).findSuperType(((java.lang.Class)v12));
    Object v14 = ((com.fasterxml.jackson.core.type.ResolvedType)v13).isReferenceType();
    Object v15 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withContentTypeHandler(((java.lang.Object)v14));
    Object v16 = ((com.fasterxml.jackson.core.type.ResolvedType)v15).isReferenceType();
    Object v17 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v15).toString();
    org.junit.Assert.assertEquals((Object)("[recursive type; UNRESOLVED"), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).isReferenceType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = 0;
    Object v2 = new java.util.HashMap((((java.lang.Integer)v1).intValue()));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v2));
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v5).isTypeOrSubTypeOf(((java.lang.Class)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).getContentType();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    org.junit.Assert.assertEquals((Object)("java.lang.Object[]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getRawClass();
    Object v7 = ((com.fasterxml.jackson.databind.type.TypeBase)v2).findSuperType(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getRawClass();
    Object v5 = ((java.lang.Class)v4).getClasses();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getRawClass();
    Object v5 = ((java.lang.Class)v4).getClasses();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v9 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v7),((com.fasterxml.jackson.databind.type.TypeBindings)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v9).getRawClass();
    Object v11 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v6)._narrow(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v11).hasValueHandler();
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isAbstract();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v4 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v2),((com.fasterxml.jackson.databind.type.TypeBindings)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v0).isTypeOrSubTypeOf(((java.lang.Class)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getRawClass();
    Object v5 = ((java.lang.Class)v4).getClasses();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v3 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v1),((com.fasterxml.jackson.databind.type.TypeBindings)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).findSuperType(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v11 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v9),((com.fasterxml.jackson.databind.type.TypeBindings)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v0).withHandlersFrom(((com.fasterxml.jackson.databind.JavaType)v11));
    Object v13 = ((com.fasterxml.jackson.databind.type.TypeBase)v12).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5)._narrow(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v10).isContainerType();
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).isInterface();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).isConcrete();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5).withStaticTyping();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v10 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v8),((com.fasterxml.jackson.databind.type.TypeBindings)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v10).getRawClass();
    Object v12 = ((java.lang.Class)v11).getClasses();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v7).forcedNarrowBy(((java.lang.Class)v11));
    ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v6).setReference(((com.fasterxml.jackson.databind.JavaType)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v2 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v0),((com.fasterxml.jackson.databind.type.TypeBindings)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v5 = new com.fasterxml.jackson.databind.type.ResolvedRecursiveType(((java.lang.Class)v3),((com.fasterxml.jackson.databind.type.TypeBindings)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeBindings.emptyBindings();
    Object v8 = com.fasterxml.jackson.databind.type.ArrayType.construct(((com.fasterxml.jackson.databind.JavaType)v6),((com.fasterxml.jackson.databind.type.TypeBindings)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v8).getRawClass();
    Object v10 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v5)._narrow(((java.lang.Class)v9));
    Object v11 = ((com.fasterxml.jackson.databind.type.ResolvedRecursiveType)v10).toString();
    org.junit.Assert.assertEquals((Object)("[recursive type; UNRESOLVED"), v11);
  }
}
