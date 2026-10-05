package com.fasterxml.jackson.databind;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).toString();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).widenBy(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).getGenericSignature(((java.lang.StringBuilder)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.lang.StringBuilder();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v1).getGenericSignature(((java.lang.StringBuilder)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).withContentTypeHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0)._narrow(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = 34.666157F;
    Object v3 = ((java.lang.StringBuilder)v1).append((((java.lang.Float)v2).floatValue()));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0).getGenericSignature(((java.lang.StringBuilder)v1));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).withStaticTyping();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).withContentValueHandler(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).narrowContentsBy(((java.lang.Class)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.core.type.ResolvedType)v0).toCanonical();
    Object v2 = new java.lang.StringBuilder();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withContentTypeHandler(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).widenContentsBy(((java.lang.Class)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).narrowBy(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).getErasedSignature();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((java.lang.Class)v5).getSuperclass();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    ((com.fasterxml.jackson.databind.JavaType)v2)._assertSubclass(((java.lang.Class)v5),((java.lang.Class)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = new java.lang.StringBuilder();
    Object v4 = "J";
    Object v5 = ((java.lang.StringBuilder)v3).indexOf(((java.lang.String)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).getErasedSignature(((java.lang.StringBuilder)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).hasRawClass(((java.lang.Class)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0)._narrow(((java.lang.Class)v3));
    Object v5 = new java.lang.StringBuilder();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v4).getGenericSignature(((java.lang.StringBuilder)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.lang.StringBuilder();
    Object v3 = 34.666157F;
    Object v4 = ((java.lang.StringBuilder)v2).append((((java.lang.Float)v3).floatValue()));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v1).getGenericSignature(((java.lang.StringBuilder)v2));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = new java.lang.StringBuilder();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).getGenericSignature(((java.lang.StringBuilder)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((java.lang.Class)v6).getDeclaredMethods();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v8));
    ((com.fasterxml.jackson.databind.JavaType)v2)._assertSubclass(((java.lang.Class)v6),((java.lang.Class)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = 1;
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).containedTypeOrUnknown((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).getErasedSignature(((java.lang.StringBuilder)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).toString();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).hasRawClass(((java.lang.Class)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    ((com.fasterxml.jackson.databind.JavaType)v0)._assertSubclass(((java.lang.Class)v2),((java.lang.Class)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).getErasedSignature(((java.lang.StringBuilder)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0)._narrow(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isThrowable();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).widenBy(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isContainerType();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.Class)v3).getAnnotations();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v1).hasRawClass(((java.lang.Class)v3));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).narrowBy(((java.lang.Class)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0)._narrow(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.core.type.ResolvedType)v4).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0)._narrow(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v4).forcedNarrowBy(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v4).withValueHandler(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.Class)v4).getMethods();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).narrowContentsBy(((java.lang.Class)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).getGenericSignature();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).isArrayType();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).narrowBy(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0)._narrow(((java.lang.Class)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).isContainerType();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isMapLikeType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = new java.lang.StringBuilder();
    Object v3 = 34.666157F;
    Object v4 = ((java.lang.StringBuilder)v2).append((((java.lang.Float)v3).floatValue()));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v1).getGenericSignature(((java.lang.StringBuilder)v2));
    Object v6 = ((java.lang.StringBuilder)v5).toString();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v0).getErasedSignature(((java.lang.StringBuilder)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    ((com.fasterxml.jackson.databind.JavaType)v1)._assertSubclass(((java.lang.Class)v3),((java.lang.Class)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).getParameterSource();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).getContentType();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = java.util.Map.of();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).withValueHandler(((java.lang.Object)v4));
    Object v6 = 1;
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v5).containedTypeOrUnknown((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v1).withContentValueHandler(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = -40;
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).getErasedSignature(((java.lang.StringBuilder)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).narrowBy(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = new java.lang.StringBuilder();
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v6).getErasedSignature(((java.lang.StringBuilder)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v5).getErasedSignature(((java.lang.StringBuilder)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v5).widenContentsBy(((java.lang.Class)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).hasRawClass(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v2).withTypeHandler(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).toString();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = new java.lang.StringBuilder();
    Object v11 = 34.666157F;
    Object v12 = ((java.lang.StringBuilder)v10).append((((java.lang.Float)v11).floatValue()));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v9).getGenericSignature(((java.lang.StringBuilder)v10));
    Object v14 = ((java.lang.StringBuilder)v13).toString();
    Object v15 = ((com.fasterxml.jackson.databind.JavaType)v8).getErasedSignature(((java.lang.StringBuilder)v13));
    Object v16 = ((java.lang.StringBuilder)v15).reverse();
    Object v17 = ((com.fasterxml.jackson.databind.JavaType)v6).getErasedSignature(((java.lang.StringBuilder)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).widenBy(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).isAbstract();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = -40;
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).widenBy(((java.lang.Class)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).hasGenericTypes();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isConcrete();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = new java.lang.StringBuilder();
    Object v3 = Character.valueOf((char)1);
    Object v4 = ((java.lang.StringBuilder)v2).append((((java.lang.Character)v3).charValue()));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v1).getGenericSignature(((java.lang.StringBuilder)v2));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).toString();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.core.type.ResolvedType)v2).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isPrimitive();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = java.util.Map.of();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).withValueHandler(((java.lang.Object)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).getErasedSignature(((java.lang.StringBuilder)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = 0;
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v5).containedTypeOrUnknown((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v1)._narrow(((java.lang.Class)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).getValueHandler();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isPrimitive();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).withStaticTyping();
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).isContainerType();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v2).withContentValueHandler(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).widenBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.core.type.ResolvedType)v6).toCanonical();
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v2).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).useStaticType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).narrowBy(((java.lang.Class)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    org.junit.Assert.assertEquals((Object)("[simple type, class java.lang.Object]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).containedTypeOrUnknown((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v2));
    Object v4 = new java.lang.StringBuilder();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).getGenericSignature(((java.lang.StringBuilder)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isConcrete();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = 1;
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).containedTypeOrUnknown((((java.lang.Integer)v4).intValue()));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).getGenericSignature();
    org.junit.Assert.assertEquals((Object)("Ljava/lang/Object;"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isEnumType();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isInterface();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v0)._narrow(((java.lang.Class)v3));
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v4).forcedNarrowBy(((java.lang.Class)v6));
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v4).withValueHandler(((java.lang.Object)v8));
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v11 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v9).forcedNarrowBy(((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).getErasedSignature(((java.lang.StringBuilder)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v6));
    Object v8 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v7));
    Object v9 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v10 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v9));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v8).forcedNarrowBy(((java.lang.Class)v10));
    Object v12 = ((com.fasterxml.jackson.databind.JavaType)v8).withStaticTyping();
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v2));
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).forcedNarrowBy(((java.lang.Class)v5));
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v6)._widen(((java.lang.Class)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v0));
    Object v2 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v3).widenBy(((java.lang.Class)v5));
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).useStaticType();
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withTypeHandler(((java.lang.Object)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).isPrimitive();
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = -40;
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).withContentTypeHandler(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isConcrete();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).isContainerType();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = java.util.Map.of();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v1));
    Object v3 = 0;
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v2).containedTypeOrUnknown((((java.lang.Integer)v3).intValue()));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v4).getParameterSource();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.core.type.ResolvedType)v2).toCanonical();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v5 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).widenBy(((java.lang.Class)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = -40;
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.lang.StringBuilder();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).getErasedSignature(((java.lang.StringBuilder)v4));
    Object v6 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v6).withStaticTyping();
    Object v8 = new java.lang.StringBuilder();
    Object v9 = Character.valueOf((char)1);
    Object v10 = ((java.lang.StringBuilder)v8).append((((java.lang.Character)v9).charValue()));
    Object v11 = ((com.fasterxml.jackson.databind.JavaType)v7).getGenericSignature(((java.lang.StringBuilder)v8));
    Object v12 = ((java.lang.StringBuilder)v5).compareTo(((java.lang.StringBuilder)v11));
    Object v13 = ((com.fasterxml.jackson.databind.JavaType)v2).getErasedSignature(((java.lang.StringBuilder)v5));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = com.fasterxml.jackson.databind.type.SimpleType.construct(((java.lang.Class)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v5).withStaticTyping();
    Object v7 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v8 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v7));
    Object v9 = ((com.fasterxml.jackson.databind.JavaType)v6).widenBy(((java.lang.Class)v8));
    Object v10 = ((com.fasterxml.jackson.databind.JavaType)v2).withTypeHandler(((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = new java.lang.StringBuilder();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).getErasedSignature(((java.lang.StringBuilder)v1));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v3));
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).forcedNarrowBy(((java.lang.Class)v4));
    Object v6 = 0;
    Object v7 = ((com.fasterxml.jackson.databind.JavaType)v5).containedTypeOrUnknown((((java.lang.Integer)v6).intValue()));
    Object v8 = ((com.fasterxml.jackson.databind.JavaType)v7).isCollectionLikeType();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isContainerType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).withContentValueHandler(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).isJavaLangObject();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = ((com.fasterxml.jackson.databind.JavaType)v0).withStaticTyping();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).isThrowable();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v1).withStaticTyping();
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v2).withStaticTyping();
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).isEnumType();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v0).withValueHandler(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v2 = com.fasterxml.jackson.databind.type.TypeFactory.rawClass(((java.lang.reflect.Type)v1));
    Object v3 = ((com.fasterxml.jackson.databind.JavaType)v0).narrowBy(((java.lang.Class)v2));
    Object v4 = ((com.fasterxml.jackson.databind.JavaType)v3).getKeyType();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v1 = -40;
    Object v2 = ((com.fasterxml.jackson.databind.JavaType)v0).containedTypeOrUnknown((((java.lang.Integer)v1).intValue()));
    Object v3 = com.fasterxml.jackson.databind.type.TypeFactory.unknownType();
    Object v4 = new java.lang.StringBuilder();
    Object v5 = ((com.fasterxml.jackson.databind.JavaType)v3).getErasedSignature(((java.lang.StringBuilder)v4));
    Object v6 = ((com.fasterxml.jackson.databind.JavaType)v2).getGenericSignature(((java.lang.StringBuilder)v5));
    org.junit.Assert.assertNotNull(v6);
  }
}
