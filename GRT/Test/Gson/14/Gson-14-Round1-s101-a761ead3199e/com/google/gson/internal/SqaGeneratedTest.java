package com.google.gson.internal;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = null;
    Object v2 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v0),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = null;
    Object v2 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v0),((java.lang.Object)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
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
  public void test12() throws Throwable {
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
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v2),((java.lang.Class)v6),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertEquals((Object)("java.lang.Object"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(1426407511), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
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
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = ((java.lang.Class)v6).getDeclaredAnnotation(((java.lang.Class)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v2),((java.lang.Class)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = null;
    Object v13 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v7),((java.lang.Class)v11),((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v17));
    Object v19 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v18));
    Object v20 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v19));
    Object v21 = null;
    Object v22 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v21));
    Object v23 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v22));
    Object v24 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v23));
    Object v25 = null;
    Object v26 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v25));
    Object v27 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v26));
    Object v28 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v27));
    Object v29 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v20),((java.lang.Class)v24),((java.lang.reflect.Type)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v3),((java.lang.Class)v16),((java.lang.reflect.Type)v29));
    org.junit.Assert.assertNotNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v11));
    Object v13 = null;
    Object v14 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v15));
    Object v17 = null;
    Object v18 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v17));
    Object v19 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v18));
    Object v20 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v19));
    Object v21 = null;
    Object v22 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v21));
    Object v23 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v22));
    Object v24 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v23));
    Object v25 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v16),((java.lang.Class)v20),((java.lang.reflect.Type)v24));
    Object v26 = ((java.lang.Class)v25).toGenericString();
    Object v27 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v12),((java.lang.Class)v25));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = new java.lang.reflect.Type[]{};
    Object v9 = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v7),((java.lang.reflect.Type[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v1),((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.Class)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getClasses();
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getEnclosingMethod();
    Object v16 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v9),((java.lang.Class)v14));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(1237), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v5));
    org.junit.Assert.assertEquals((Object)("?"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
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
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.Class)v9));
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v10),((java.lang.Class)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v11));
    Object v13 = ((java.lang.Class)v12).getAnnotatedSuperclass();
    Object v14 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v12));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.reflect.Type)v11));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v6),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.reflect.Type)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
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
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.Class)v9));
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v10),((java.lang.Class)v14));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getClasses();
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getEnclosingMethod();
    Object v16 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v9),((java.lang.Class)v14));
    Object v17 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v6),((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(1426407511), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = null;
    Object v2 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v0),((java.lang.Object)v3));
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(1237), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getClasses();
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getEnclosingMethod();
    Object v16 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v9),((java.lang.Class)v14));
    Object v17 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.Class)v9));
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v14));
    Object v16 = null;
    Object v17 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v17));
    Object v19 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v18));
    Object v20 = com.google.gson.internal.$Gson$Types.getSupertype(((java.lang.reflect.Type)v10),((java.lang.Class)v15),((java.lang.Class)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v3),((java.lang.reflect.Type)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v7),((java.lang.Class)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v12));
    org.junit.Assert.assertEquals((Object)("?"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.lang.ClassLoader.getSystemClassLoader();
    Object v1 = null;
    Object v2 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v0),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = null;
    Object v4 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v2),((java.lang.Class)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = null;
    Object v9 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v10));
    Object v12 = null;
    Object v13 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v13));
    Object v15 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v14));
    Object v16 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v7),((java.lang.Class)v11),((java.lang.Class)v15));
    Object v17 = null;
    Object v18 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v17));
    Object v19 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v18));
    Object v20 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = null;
    Object v23 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v22));
    Object v24 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v23));
    Object v25 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v24));
    Object v26 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.Class)v26).getClasses();
    Object v28 = null;
    Object v29 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v28));
    Object v30 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v29));
    Object v31 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v30));
    Object v32 = ((java.lang.Class)v31).getEnclosingMethod();
    Object v33 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v20),((java.lang.Class)v26),((java.lang.Class)v31));
    Object v34 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v33));
    Object v35 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v16),((java.lang.Class)v34));
    org.junit.Assert.assertNotNull(v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v3),((java.lang.Class)v8));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertEquals((Object)("?"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.getCollectionElementType(((java.lang.reflect.Type)v6),((java.lang.Class)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getClasses();
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getEnclosingMethod();
    Object v16 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v9),((java.lang.Class)v14));
    Object v17 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = null;
    Object v20 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v19));
    Object v21 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v20));
    Object v22 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v21));
    Object v23 = null;
    Object v24 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v23));
    Object v25 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v24));
    Object v26 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v25));
    Object v27 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v26));
    Object v28 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v17),((java.lang.Class)v22),((java.lang.Class)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v6),((java.lang.Class)v10),((java.lang.reflect.Type)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v7));
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v8).isAnnotationPresent(((java.lang.Class)v13));
    Object v15 = null;
    Object v16 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v15));
    Object v17 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.Class)v18).getDeclaredConstructors();
    Object v20 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v8),((java.lang.Class)v18));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.equal(((java.lang.Object)v3),((java.lang.Object)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(1237), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = null;
    Object v3 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v4));
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v1),((java.lang.Class)v5),((java.lang.Class)v9));
    com.google.gson.internal.$Gson$Types.checkNotPrimitive(((java.lang.reflect.Type)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = ((java.lang.reflect.Type)v3).getTypeName();
    Object v5 = null;
    Object v6 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.Class)v9).getClasses();
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.Class)v14).getEnclosingMethod();
    Object v16 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v9),((java.lang.Class)v14));
    Object v17 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v17));
    Object v19 = ((java.lang.reflect.Type)v18).getTypeName();
    Object v20 = null;
    Object v21 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v20));
    Object v22 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v21));
    Object v23 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v22));
    Object v24 = com.google.gson.internal.$Gson$Types.equals(((java.lang.reflect.Type)v18),((java.lang.reflect.Type)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v7));
    Object v9 = null;
    Object v10 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.Class)v13).getTypeParameters();
    Object v15 = com.google.gson.internal.$Gson$Types.getGenericSupertype(((java.lang.reflect.Type)v3),((java.lang.Class)v8),((java.lang.Class)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v2));
    Object v4 = null;
    Object v5 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v3),((java.lang.Class)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.hashCodeOrZero(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(1426407543), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = null;
    Object v8 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = null;
    Object v12 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v11));
    Object v13 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v12));
    Object v14 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v6),((java.lang.Class)v10),((java.lang.reflect.Type)v13));
    Object v15 = null;
    Object v16 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v15));
    Object v17 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v16));
    Object v18 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v17));
    Object v19 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v18));
    Object v20 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v19));
    Object v21 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v20));
    Object v22 = null;
    Object v23 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v22));
    Object v24 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v23));
    Object v25 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v24));
    Object v26 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v25));
    Object v27 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v26));
    Object v28 = com.google.gson.internal.$Gson$Types.resolve(((java.lang.reflect.Type)v14),((java.lang.Class)v21),((java.lang.reflect.Type)v27));
    org.junit.Assert.assertNotNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = null;
    Object v7 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v6));
    Object v8 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v7));
    Object v9 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v8));
    Object v10 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v9));
    Object v11 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v10));
    Object v12 = com.google.gson.internal.$Gson$Types.getMapKeyAndValueTypes(((java.lang.reflect.Type)v4),((java.lang.Class)v11));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.getArrayComponentType(((java.lang.reflect.Type)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = null;
    Object v1 = com.google.gson.internal.$Gson$Types.arrayOf(((java.lang.reflect.Type)v0));
    Object v2 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v1));
    Object v3 = com.google.gson.internal.$Gson$Types.getRawType(((java.lang.reflect.Type)v2));
    Object v4 = com.google.gson.internal.$Gson$Types.subtypeOf(((java.lang.reflect.Type)v3));
    Object v5 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v4));
    Object v6 = com.google.gson.internal.$Gson$Types.canonicalize(((java.lang.reflect.Type)v5));
    Object v7 = com.google.gson.internal.$Gson$Types.supertypeOf(((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = com.google.gson.internal.$Gson$Types.typeToString(((java.lang.reflect.Type)v7));
    org.junit.Assert.assertEquals((Object)("?"), v9);
  }
}
