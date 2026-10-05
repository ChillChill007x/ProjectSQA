package com.google.gson.internal;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v2),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = new java.lang.reflect.Type[]{null,null};
    Object v7 = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v5),((java.lang.reflect.Type[])v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v1),((java.lang.reflect.Type)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getSystemClassLoader();
    Object v9 = ((java.lang.Class)v7).cast(((java.lang.Object)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v1),((java.lang.reflect.Type)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v1),((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(1231), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = java.lang.ClassLoader.getSystemClassLoader();
    Object v4 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v2),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v1),((java.lang.Class)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(1237), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v2),((java.lang.Class)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = new java.lang.reflect.Type[]{null};
    Object v8 = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v6),((java.lang.reflect.Type[])v7));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).isInterface();
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v11));
    Object v13 = null;
    Object v14 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v12).getAnnotation(((java.lang.Class)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v8));
    Object v10 = java.lang.ClassLoader.getSystemClassLoader();
    Object v11 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v6),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v2),((java.lang.Class)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v1),((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v4),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getSigners();
    Object v13 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v0));
    org.junit.Assert.assertEquals((Object)(1028566121), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v8));
    Object v10 = new java.lang.reflect.Type[]{null,null,null};
    Object v11 = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v9),((java.lang.reflect.Type[])v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v4),((java.lang.Class)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.resolveTypeVariable(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.reflect.TypeVariable)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).isInterface();
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v11));
    Object v13 = null;
    Object v14 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v12).getAnnotation(((java.lang.Class)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v12));
    Object v19 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v18));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v7));
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v8),((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getDeclaredConstructors();
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v5),((java.lang.Class)v9),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v2),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.reflect.Type)v8));
    Object v10 = null;
    Object v11 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v12));
    Object v14 = null;
    Object v15 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v15));
    Object v17 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v9),((java.lang.Class)v13),((java.lang.Class)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v6),((java.lang.Object)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).isInterface();
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v11));
    Object v13 = null;
    Object v14 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.Class)v12).getAnnotation(((java.lang.Class)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v12));
    Object v19 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v5),((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getSigners();
    Object v16 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v6),((java.lang.Class)v10),((java.lang.Class)v14));
    Object v17 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v16));
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.Class)v7).getDeclaredConstructors();
    Object v9 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getConstructors();
    Object v11 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v4),((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v5),((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.Class)v11).getTypeParameters();
    Object v13 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v2),((java.lang.Class)v6),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v8),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v2),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(1426407543), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = java.lang.ClassLoader.getSystemClassLoader();
    Object v8 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v4),((java.lang.Object)v8));
    Object v10 = null;
    Object v11 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v11));
    Object v13 = java.lang.ClassLoader.getSystemClassLoader();
    Object v14 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v9),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v4),((java.lang.Class)v9));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.reflect.Type)v8));
    Object v10 = null;
    Object v11 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v12));
    Object v14 = null;
    Object v15 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v15));
    Object v17 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v9),((java.lang.Class)v13),((java.lang.Class)v17));
    Object v19 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v18));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = java.lang.ClassLoader.getSystemClassLoader();
    Object v3 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v7));
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v8),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.reflect.Type)v8));
    Object v10 = null;
    Object v11 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v9),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
