package org.apache.commons.lang3.reflect;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.getImplicitBounds(((java.lang.reflect.TypeVariable)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.lang.reflect.Type[]{null,null};
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new java.lang.reflect.Type[]{};
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = new java.lang.reflect.Type[]{};
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v3));
    Object v5 = new java.lang.reflect.Type[]{null,null};
    Object v6 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v5));
    Object v7 = ((java.util.Map)v2).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.lang3.reflect.TypeUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = new java.lang.reflect.Type[]{null,null};
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v3));
    Object v5 = ((java.util.Map)v2).containsKey(((java.lang.Object)v4));
    Object v6 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.lang.reflect.Type[]{null};
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = "byte";
    Object v4 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v2),((java.lang.String)v3));
    Object v5 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v1),((java.lang.reflect.Type)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = "byte";
    Object v4 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v1),((java.lang.reflect.Type)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.reflect.Type[]{null,null,null};
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v10));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v7),((java.lang.Class)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.lang.reflect.Type[]{null};
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = "byte";
    Object v4 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v7 = "byte";
    Object v8 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v8));
    Object v10 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v1),((java.lang.reflect.Type)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v26));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v13));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v13),((java.lang.Class)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = "byte";
    Object v5 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v8 = "byte";
    Object v9 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v9),((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v5),((java.lang.reflect.Type)v14));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = ((java.lang.reflect.Type)v24).getTypeName();
    Object v26 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v27 = "byte";
    Object v28 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v26),((java.lang.String)v27));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v24),((java.lang.reflect.Type)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v29));
    Object v32 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v31));
    Object v33 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v2),((java.lang.reflect.Type)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.lang.reflect.Type[]{null};
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = "byte";
    Object v4 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v7 = "byte";
    Object v8 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v9),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v1),((java.lang.reflect.Type)v19));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v2));
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v15));
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v3),((java.lang.reflect.Type)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v28 = "byte";
    Object v29 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v27),((java.lang.String)v28));
    Object v30 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v25),((java.lang.reflect.Type)v29));
    Object v31 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v30));
    Object v32 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v31));
    org.junit.Assert.assertEquals((Object)(true), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v26));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v28));
    Object v30 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v29));
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.getImplicitLowerBounds(((java.lang.reflect.WildcardType)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.getImplicitUpperBounds(((java.lang.reflect.WildcardType)v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v7),((java.lang.Class)v10));
    Object v12 = java.util.function.Function.identity();
    Object v13 = java.util.Comparator.comparing(((java.util.function.Function)v12));
    Object v14 = ((java.util.Map)v11).get(((java.lang.Object)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v11));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    Object v24 = ((java.lang.reflect.Type)v23).getTypeName();
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v23));
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v26));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v29));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v2));
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v15));
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v3),((java.lang.reflect.Type)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v23));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = ((java.util.Map)v2).keySet();
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = "byte";
    Object v4 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v7 = "byte";
    Object v8 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v6),((java.lang.String)v7));
    Object v9 = ((java.lang.reflect.Type)v8).getTypeName();
    Object v10 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v11 = "byte";
    Object v12 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v8),((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v13));
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = ((java.lang.reflect.Type)v18).getTypeName();
    Object v20 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v21 = "byte";
    Object v22 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v18),((java.lang.reflect.Type)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v1),((java.lang.reflect.Type)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v23));
    Object v25 = ((java.lang.reflect.Type)v24).getTypeName();
    Object v26 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v27 = "byte";
    Object v28 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v26),((java.lang.String)v27));
    Object v29 = ((java.lang.reflect.Type)v28).getTypeName();
    Object v30 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v31 = "byte";
    Object v32 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v30),((java.lang.String)v31));
    Object v33 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v28),((java.lang.reflect.Type)v32));
    Object v34 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v24),((java.lang.reflect.Type)v33));
    Object v35 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v34));
    Object v36 = ((java.lang.reflect.Type)v35).getTypeName();
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v7),((java.lang.reflect.Type)v35));
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v25));
    Object v28 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v29 = "byte";
    Object v30 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v28),((java.lang.String)v29));
    Object v31 = ((java.lang.reflect.Type)v30).getTypeName();
    Object v32 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v33 = "byte";
    Object v34 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v32),((java.lang.String)v33));
    Object v35 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v30),((java.lang.reflect.Type)v34));
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v27),((java.lang.reflect.Type)v35));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v13),((java.lang.Class)v36));
    org.junit.Assert.assertNotNull(v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v16));
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v13),((java.lang.Class)v21));
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v22));
    org.junit.Assert.assertEquals((Object)(true), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v14),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v19));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v7));
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v28 = "byte";
    Object v29 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v27),((java.lang.String)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v32 = "byte";
    Object v33 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v31),((java.lang.String)v32));
    Object v34 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v29),((java.lang.reflect.Type)v33));
    Object v35 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v25),((java.lang.reflect.Type)v34));
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v35));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v8),((java.lang.reflect.Type)v36));
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v2));
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = "byte";
    Object v7 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v18),((java.lang.reflect.Type)v26));
    Object v28 = ((java.lang.reflect.Type)v27).getTypeName();
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v4),((java.lang.reflect.Type)v27));
    org.junit.Assert.assertEquals((Object)(false), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v26));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v28));
    Object v30 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v31 = "byte";
    Object v32 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v30),((java.lang.String)v31));
    Object v33 = ((java.lang.reflect.Type)v32).getTypeName();
    Object v34 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v35 = "byte";
    Object v36 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v34),((java.lang.String)v35));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v32),((java.lang.reflect.Type)v36));
    Object v38 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v29),((java.lang.Class)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    ((java.util.Map)v2).putAll(((java.util.Map)v5));
    Object v6 = null;
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = ((java.util.Map)v2).isEmpty();
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v26));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    Object v24 = ((java.lang.reflect.Type)v23).getTypeName();
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v23));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v25));
    Object v28 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v29 = "byte";
    Object v30 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v28),((java.lang.String)v29));
    Object v31 = ((java.lang.reflect.Type)v30).getTypeName();
    Object v32 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v33 = "byte";
    Object v34 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v32),((java.lang.String)v33));
    Object v35 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v30),((java.lang.reflect.Type)v34));
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v27),((java.lang.reflect.Type)v35));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v13),((java.lang.Class)v36));
    Object v38 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v37));
    org.junit.Assert.assertEquals((Object)(true), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v16));
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v26));
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v17),((java.lang.reflect.Type)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = "byte";
    Object v5 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v8 = "byte";
    Object v9 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v7),((java.lang.String)v8));
    Object v10 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v5),((java.lang.reflect.Type)v9));
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v10),((java.lang.Class)v13));
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v17));
    Object v20 = ((java.util.Map)v2).replace(((java.lang.Object)v14),((java.lang.Object)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v26));
    Object v29 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v30 = "byte";
    Object v31 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v29),((java.lang.String)v30));
    Object v32 = ((java.lang.reflect.Type)v31).getTypeName();
    Object v33 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v34 = "byte";
    Object v35 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v33),((java.lang.String)v34));
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v31),((java.lang.reflect.Type)v35));
    Object v37 = ((java.lang.reflect.Type)v36).getTypeName();
    Object v38 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v28),((java.lang.reflect.Type)v36));
    Object v39 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v38));
    org.junit.Assert.assertNotNull(v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.lang.reflect.Type[]{null};
    Object v1 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = "byte";
    Object v4 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v7 = "byte";
    Object v8 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v6),((java.lang.String)v7));
    Object v9 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v9),((java.lang.reflect.Type)v18));
    Object v20 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v1),((java.lang.reflect.Type)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = ((java.lang.reflect.Type)v18).getTypeName();
    Object v20 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v21 = "byte";
    Object v22 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v20),((java.lang.String)v21));
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v18),((java.lang.reflect.Type)v22));
    Object v24 = ((java.lang.reflect.Type)v23).getTypeName();
    Object v25 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v26 = "byte";
    Object v27 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v25),((java.lang.String)v26));
    Object v28 = ((java.lang.reflect.Type)v27).getTypeName();
    Object v29 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v30 = "byte";
    Object v31 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v29),((java.lang.String)v30));
    Object v32 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v27),((java.lang.reflect.Type)v31));
    Object v33 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v23),((java.lang.reflect.Type)v32));
    Object v34 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v33));
    Object v35 = org.apache.commons.lang3.reflect.TypeUtils.isAssignable(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v34));
    org.junit.Assert.assertEquals((Object)(true), v35);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v14),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v19));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    ((java.util.Map)v2).putAll(((java.util.Map)v5));
    Object v6 = null;
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v14));
    Object v16 = ((java.lang.reflect.Type)v15).getTypeName();
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v7),((java.lang.reflect.Type)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = ((java.util.Map)v2).isEmpty();
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = "byte";
    Object v7 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v5),((java.lang.String)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v11));
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v4),((java.lang.reflect.Type)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v14),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v19));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.reflect.Type)v22).getTypeName();
    Object v24 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v25 = "byte";
    Object v26 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v24),((java.lang.String)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v29 = "byte";
    Object v30 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v28),((java.lang.String)v29));
    Object v31 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v26),((java.lang.reflect.Type)v30));
    Object v32 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v22),((java.lang.reflect.Type)v31));
    org.junit.Assert.assertNotNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = new java.lang.reflect.Type[]{};
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v3));
    Object v5 = new java.lang.reflect.Type[]{null,null};
    Object v6 = org.apache.commons.lang3.reflect.TypeUtils.normalizeUpperBounds(((java.lang.reflect.Type[])v5));
    Object v7 = ((java.util.Map)v2).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = ((java.lang.reflect.Type)v23).getTypeName();
    Object v25 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v26 = "byte";
    Object v27 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v25),((java.lang.String)v26));
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v23),((java.lang.reflect.Type)v27));
    Object v29 = ((java.lang.reflect.Type)v28).getTypeName();
    Object v30 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v28));
    Object v31 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v30));
    Object v32 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v8),((java.lang.reflect.Type)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v17));
    Object v20 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v21 = "byte";
    Object v22 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v20),((java.lang.String)v21));
    Object v23 = ((java.lang.reflect.Type)v22).getTypeName();
    Object v24 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v25 = "byte";
    Object v26 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v24),((java.lang.String)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v22),((java.lang.reflect.Type)v26));
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v19),((java.lang.reflect.Type)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v17));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = "byte";
    Object v4 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v2),((java.lang.String)v3));
    Object v5 = ((java.lang.reflect.Type)v4).getTypeName();
    Object v6 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v7 = "byte";
    Object v8 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v6),((java.lang.String)v7));
    Object v9 = ((java.lang.reflect.Type)v8).getTypeName();
    Object v10 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v11 = "byte";
    Object v12 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v10),((java.lang.String)v11));
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v8),((java.lang.reflect.Type)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v4),((java.lang.reflect.Type)v13));
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v15),((java.lang.reflect.Type)v18));
    Object v20 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v1),((java.lang.reflect.Type)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v21));
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v28 = "byte";
    Object v29 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v27),((java.lang.String)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v32 = "byte";
    Object v33 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v31),((java.lang.String)v32));
    Object v34 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v29),((java.lang.reflect.Type)v33));
    Object v35 = ((java.lang.reflect.Type)v34).getTypeName();
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v25),((java.lang.reflect.Type)v34));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v22),((java.lang.reflect.Type)v36));
    Object v38 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v37));
    org.junit.Assert.assertNotNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v14),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v19));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.reflect.Type)v22).getTypeName();
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v22));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = ((java.util.Map)v2).hashCode();
    Object v4 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v21));
    Object v23 = null;
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.determineTypeArguments(((java.lang.Class)v22),((java.lang.reflect.ParameterizedType)v23));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = "byte";
    Object v5 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v8 = "byte";
    Object v9 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v9),((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v5),((java.lang.reflect.Type)v14));
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v22 = "byte";
    Object v23 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v21),((java.lang.String)v22));
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v19),((java.lang.reflect.Type)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v2),((java.lang.reflect.Type)v25));
    org.junit.Assert.assertEquals((Object)(false), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.Long[]{2L,52L,1L};
    Object v1 = -22L;
    Object v2 = org.apache.commons.lang3.ArrayUtils.toPrimitive(((java.lang.Long[])v0),(((java.lang.Long)v1).longValue()));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = "byte";
    Object v5 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v8 = "byte";
    Object v9 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v9),((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v5),((java.lang.reflect.Type)v14));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = ((java.lang.reflect.Type)v24).getTypeName();
    Object v26 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v27 = "byte";
    Object v28 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v26),((java.lang.String)v27));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v24),((java.lang.reflect.Type)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v29));
    Object v32 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v31));
    Object v33 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v2),((java.lang.reflect.Type)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v21));
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v28 = "byte";
    Object v29 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v27),((java.lang.String)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v32 = "byte";
    Object v33 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v31),((java.lang.String)v32));
    Object v34 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v29),((java.lang.reflect.Type)v33));
    Object v35 = ((java.lang.reflect.Type)v34).getTypeName();
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v25),((java.lang.reflect.Type)v34));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v22),((java.lang.reflect.Type)v36));
    Object v38 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v37));
    Object v39 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v38));
    org.junit.Assert.assertEquals((Object)(false), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = "byte";
    Object v5 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v8 = "byte";
    Object v9 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v7),((java.lang.String)v8));
    Object v10 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v5),((java.lang.reflect.Type)v9));
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v21));
    Object v23 = ((java.lang.reflect.Type)v22).getTypeName();
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v22));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v28 = "byte";
    Object v29 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v27),((java.lang.String)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v32 = "byte";
    Object v33 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v31),((java.lang.String)v32));
    Object v34 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v29),((java.lang.reflect.Type)v33));
    Object v35 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v25),((java.lang.reflect.Type)v34));
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v2),((java.lang.reflect.Type)v35));
    org.junit.Assert.assertEquals((Object)(false), v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v14),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v19));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v21));
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v15 = "byte";
    Object v16 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v14),((java.lang.String)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v20));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v13),((java.lang.Class)v21));
    ((java.util.Map)v22).clear();
    Object v23 = null;
    Object v24 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v22));
    org.junit.Assert.assertEquals((Object)(true), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = java.util.function.Function.identity();
    Object v1 = java.util.Comparator.comparing(((java.util.function.Function)v0));
    Object v2 = new java.util.TreeMap(((java.util.Comparator)v1));
    Object v3 = java.util.function.Function.identity();
    Object v4 = java.util.Comparator.comparing(((java.util.function.Function)v3));
    Object v5 = new java.util.TreeMap(((java.util.Comparator)v4));
    ((java.util.Map)v2).putAll(((java.util.Map)v5));
    Object v6 = null;
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v2));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v14),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v19));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = ((java.lang.reflect.Type)v25).getTypeName();
    Object v27 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v28 = "byte";
    Object v29 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v27),((java.lang.String)v28));
    Object v30 = ((java.lang.reflect.Type)v29).getTypeName();
    Object v31 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v32 = "byte";
    Object v33 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v31),((java.lang.String)v32));
    Object v34 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v29),((java.lang.reflect.Type)v33));
    Object v35 = ((java.lang.reflect.Type)v34).getTypeName();
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v25),((java.lang.reflect.Type)v34));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v36));
    Object v38 = org.apache.commons.lang3.reflect.TypeUtils.isInstance(((java.lang.Object)v7),((java.lang.reflect.Type)v37));
    org.junit.Assert.assertEquals((Object)(false), v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = ((java.lang.reflect.Type)v10).getTypeName();
    Object v12 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v13 = "byte";
    Object v14 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v12),((java.lang.String)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = "byte";
    Object v18 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v16),((java.lang.String)v17));
    Object v19 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v14),((java.lang.reflect.Type)v18));
    Object v20 = ((java.lang.reflect.Type)v19).getTypeName();
    Object v21 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v10),((java.lang.reflect.Type)v19));
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v21));
    Object v23 = org.apache.commons.lang3.reflect.TypeUtils.getArrayComponentType(((java.lang.reflect.Type)v22));
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = ((java.lang.reflect.Type)v7).getTypeName();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = "byte";
    Object v11 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v9),((java.lang.String)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v14 = "byte";
    Object v15 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v13),((java.lang.String)v14));
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v11),((java.lang.reflect.Type)v15));
    Object v17 = ((java.lang.reflect.Type)v16).getTypeName();
    Object v18 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v19 = "byte";
    Object v20 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v18),((java.lang.String)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v23 = "byte";
    Object v24 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v22),((java.lang.String)v23));
    Object v25 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v20),((java.lang.reflect.Type)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v25));
    Object v27 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v7),((java.lang.reflect.Type)v26));
    Object v28 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v29 = "byte";
    Object v30 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v28),((java.lang.String)v29));
    Object v31 = ((java.lang.reflect.Type)v30).getTypeName();
    Object v32 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v33 = "byte";
    Object v34 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v32),((java.lang.String)v33));
    Object v35 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v30),((java.lang.reflect.Type)v34));
    Object v36 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v27),((java.lang.reflect.Type)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v26));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v28));
    Object v30 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v31 = "byte";
    Object v32 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v30),((java.lang.String)v31));
    Object v33 = ((java.lang.reflect.Type)v32).getTypeName();
    Object v34 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v35 = "byte";
    Object v36 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v34),((java.lang.String)v35));
    Object v37 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v32),((java.lang.reflect.Type)v36));
    Object v38 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v29),((java.lang.Class)v37));
    Object v39 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v38));
    org.junit.Assert.assertEquals((Object)(true), v39);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v4 = "byte";
    Object v5 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v3),((java.lang.String)v4));
    Object v6 = ((java.lang.reflect.Type)v5).getTypeName();
    Object v7 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v8 = "byte";
    Object v9 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v7),((java.lang.String)v8));
    Object v10 = ((java.lang.reflect.Type)v9).getTypeName();
    Object v11 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v12 = "byte";
    Object v13 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v11),((java.lang.String)v12));
    Object v14 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v9),((java.lang.reflect.Type)v13));
    Object v15 = ((java.lang.reflect.Type)v14).getTypeName();
    Object v16 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v5),((java.lang.reflect.Type)v14));
    Object v17 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v18 = "byte";
    Object v19 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v17),((java.lang.String)v18));
    Object v20 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v16),((java.lang.reflect.Type)v19));
    Object v21 = ((java.lang.reflect.Type)v20).getTypeName();
    Object v22 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v20));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = ((java.lang.reflect.Type)v6).getTypeName();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v6),((java.lang.reflect.Type)v10));
    Object v12 = ((java.lang.reflect.Type)v11).getTypeName();
    Object v13 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v11));
    Object v14 = ((java.lang.reflect.Type)v13).getTypeName();
    Object v15 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v16 = "byte";
    Object v17 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v15),((java.lang.String)v16));
    Object v18 = ((java.lang.reflect.Type)v17).getTypeName();
    Object v19 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v20 = "byte";
    Object v21 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v19),((java.lang.String)v20));
    Object v22 = ((java.lang.reflect.Type)v21).getTypeName();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = "byte";
    Object v25 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v23),((java.lang.String)v24));
    Object v26 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v21),((java.lang.reflect.Type)v25));
    Object v27 = ((java.lang.reflect.Type)v26).getTypeName();
    Object v28 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v17),((java.lang.reflect.Type)v26));
    Object v29 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v13),((java.lang.reflect.Type)v28));
    Object v30 = org.apache.commons.lang3.reflect.TypeUtils.isArrayType(((java.lang.reflect.Type)v29));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v1 = "byte";
    Object v2 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v0),((java.lang.String)v1));
    Object v3 = ((java.lang.reflect.Type)v2).getTypeName();
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = "byte";
    Object v6 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v4),((java.lang.String)v5));
    Object v7 = org.apache.commons.lang3.reflect.TypeUtils.getRawType(((java.lang.reflect.Type)v2),((java.lang.reflect.Type)v6));
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = "byte";
    Object v10 = org.apache.commons.lang3.ClassUtils.getClass(((java.lang.ClassLoader)v8),((java.lang.String)v9));
    Object v11 = org.apache.commons.lang3.reflect.TypeUtils.getTypeArguments(((java.lang.reflect.Type)v7),((java.lang.Class)v10));
    Object v12 = org.apache.commons.lang3.reflect.TypeUtils.typesSatisfyVariables(((java.util.Map)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }
}
