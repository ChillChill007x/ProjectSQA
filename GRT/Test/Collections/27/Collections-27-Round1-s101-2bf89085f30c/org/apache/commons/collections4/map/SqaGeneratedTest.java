package org.apache.commons.collections4.map;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = new java.util.ArrayList();
    Object v4 = new java.util.ArrayList();
    Object v5 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v3),((java.util.Collection)v4));
    Object v6 = ((org.apache.commons.collections4.map.MultiValueMap)v1).put(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new java.util.ArrayList();
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = ((java.util.Map)v0).remove(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    ((org.apache.commons.collections4.map.MultiValueMap)v1).putAll(((java.util.Map)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v2 = new java.util.ArrayList();
    Object v3 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.map.MultiValueMap)v1).iterator();
    Object v3 = new org.apache.commons.collections4.map.LinkedMap();
    Object v4 = ((org.apache.commons.collections4.map.MultiValueMap)v1).containsValue(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = ((org.apache.commons.collections4.map.MultiValueMap)v1).iterator(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = new java.util.ArrayList();
    Object v4 = new java.util.ArrayList();
    Object v5 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v3),((java.util.Collection)v4));
    Object v6 = ((java.util.Map)v1).remove(((java.lang.Object)v2),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    ((java.util.Map)v0).putAll(((java.util.Map)v1));
    Object v2 = null;
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = ((org.apache.commons.collections4.map.MultiValueMap)v5).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new java.util.ArrayList();
    Object v7 = new java.util.ArrayList();
    Object v8 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v6),((java.util.Collection)v7));
    Object v9 = new java.util.ArrayList();
    Object v10 = ((org.apache.commons.collections4.map.MultiValueMap)v5).putAll(((java.lang.Object)v8),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = ((org.apache.commons.collections4.map.MultiValueMap)v3).values();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new java.util.ArrayList();
    Object v2 = new java.util.ArrayList();
    Object v3 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    ((org.apache.commons.collections4.map.MultiValueMap)v3).putAll(((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v3).iterator(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = ((org.apache.commons.collections4.map.MultiValueMap)v7).iterator(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.map.LinkedMap();
    Object v11 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections4.map.MultiValueMap)v11).iterator();
    Object v13 = new org.apache.commons.collections4.map.LinkedMap();
    Object v14 = ((org.apache.commons.collections4.map.MultiValueMap)v11).containsValue(((java.lang.Object)v13));
    Object v15 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v9),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected org.apache.commons.collections4.FunctorException");
    } catch (org.apache.commons.collections4.FunctorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = new java.util.ArrayList();
    Object v6 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v4),((java.util.Collection)v5));
    Object v7 = ((org.apache.commons.collections4.map.MultiValueMap)v3).size(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new java.util.ArrayList();
    Object v8 = ((java.util.Collection)v7).parallelStream();
    Object v9 = ((org.apache.commons.collections4.map.MultiValueMap)v5).putAll(((java.lang.Object)v6),((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.map.LinkedMap();
    Object v6 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v5));
    Object v7 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v8 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v6),((org.apache.commons.collections4.Factory)v7));
    Object v9 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v10 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v8),((org.apache.commons.collections4.Factory)v9));
    Object v11 = new org.apache.commons.collections4.map.LinkedMap();
    Object v12 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v11));
    Object v13 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v14 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections4.Factory)v13));
    Object v15 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections4.map.MultiValueMap)v4).removeMapping(((java.lang.Object)v10),((java.lang.Object)v15));
    Object v17 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v18 = new java.util.ArrayList();
    Object v19 = new java.util.ArrayList();
    Object v20 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v18),((java.util.Collection)v19));
    Object v21 = ((org.apache.commons.collections4.map.MultiValueMap)v4).removeMapping(((java.lang.Object)v17),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v7));
    Object v9 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v10 = ((org.apache.commons.collections4.map.MultiValueMap)v3).containsValue(((java.lang.Object)v8),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).keySet();
    ((org.apache.commons.collections4.map.MultiValueMap)v3).clear();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).equals(((java.lang.Object)v4));
    Object v6 = new java.util.ArrayList();
    Object v7 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v5),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.map.LinkedMap();
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    ((java.util.Map)v5).putAll(((java.util.Map)v6));
    Object v7 = null;
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    Object v11 = new java.util.ArrayList();
    Object v12 = new java.util.ArrayList();
    Object v13 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v11),((java.util.Collection)v12));
    Object v14 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new java.util.ArrayList();
    Object v7 = new java.util.ArrayList();
    Object v8 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v6),((java.util.Collection)v7));
    Object v9 = new org.apache.commons.collections4.map.LinkedMap();
    Object v10 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v9));
    Object v11 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v12 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v10),((org.apache.commons.collections4.Factory)v11));
    Object v13 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v14 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections4.Factory)v13));
    Object v15 = ((java.util.Map)v5).putIfAbsent(((java.lang.Object)v8),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected org.apache.commons.collections4.FunctorException");
    } catch (org.apache.commons.collections4.FunctorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = new java.util.ArrayList();
    Object v6 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v4),((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections4.map.LinkedMap();
    Object v8 = ((java.util.Map)v3).replace(((java.lang.Object)v6),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = ((java.util.Map)v5).entrySet();
    Object v7 = new java.util.ArrayList();
    Object v8 = new java.util.ArrayList();
    Object v9 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v7),((java.util.Collection)v8));
    Object v10 = new org.apache.commons.collections4.map.LinkedMap();
    Object v11 = new java.util.ArrayList();
    Object v12 = new org.apache.commons.collections4.map.LinkedMap();
    Object v13 = ((java.util.Map)v10).remove(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections4.map.LinkedMap();
    Object v15 = new java.util.ArrayList();
    Object v16 = new java.util.ArrayList();
    Object v17 = ((java.util.Map)v14).getOrDefault(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = ((java.util.Map)v5).replace(((java.lang.Object)v9),((java.lang.Object)v13),((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v8 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.map.LinkedMap();
    Object v6 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v5));
    Object v7 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v8 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v6),((org.apache.commons.collections4.Factory)v7));
    Object v9 = new org.apache.commons.collections4.map.LinkedMap();
    Object v10 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v9));
    Object v11 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v12 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v10),((org.apache.commons.collections4.Factory)v11));
    Object v13 = new java.util.ArrayList();
    Object v14 = ((org.apache.commons.collections4.map.MultiValueMap)v12).iterator(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections4.map.MultiValueMap)v4).containsValue(((java.lang.Object)v8),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = ((org.apache.commons.collections4.map.MultiValueMap)v5).containsValue(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    Object v7 = new java.util.ArrayList();
    Object v8 = new java.util.ArrayList();
    Object v9 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v7),((java.util.Collection)v8));
    Object v10 = ((java.util.Map)v5).remove(((java.lang.Object)v6),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections4.map.LinkedMap();
    Object v12 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v11));
    Object v13 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v14 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections4.Factory)v13));
    Object v15 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v16 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v14),((org.apache.commons.collections4.Factory)v15));
    Object v17 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v18 = ((java.util.Map)v3).replace(((java.lang.Object)v10),((java.lang.Object)v16),((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    Object v7 = new java.util.ArrayList();
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected org.apache.commons.collections4.FunctorException");
    } catch (org.apache.commons.collections4.FunctorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = ((java.util.Map)v0).hashCode();
    Object v2 = java.util.function.Function.identity();
    Object v3 = new org.apache.commons.collections4.map.LinkedMap();
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    ((java.util.Map)v3).putAll(((java.util.Map)v4));
    Object v5 = null;
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v2),((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v7));
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
      org.junit.Assert.fail("Expected org.apache.commons.collections4.FunctorException");
    } catch (org.apache.commons.collections4.FunctorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v4).values();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v4).entrySet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = ((org.apache.commons.collections4.map.MultiValueMap)v5).values();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new java.util.ArrayList();
    Object v7 = new java.util.ArrayList();
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v5).removeMapping(((java.lang.Object)v6),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).isEmpty();
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v3).values();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    Object v7 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections4.Factory)v8));
    Object v10 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v11 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v9),((org.apache.commons.collections4.Factory)v10));
    Object v12 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v13 = ((org.apache.commons.collections4.map.MultiValueMap)v11).containsValue(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections4.map.MultiValueMap)v5).size(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).keySet();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).putAll(((java.util.Map)v6));
    Object v7 = null;
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).keySet();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((java.util.Map)v3).get(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).keySet();
    Object v9 = ((java.util.Map)v3).equals(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v11 = new org.apache.commons.collections4.map.LinkedMap();
    Object v12 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v11));
    Object v13 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v14 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections4.Factory)v13));
    Object v15 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v14));
    Object v16 = ((java.util.Map)v3).remove(((java.lang.Object)v10),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = ((java.util.Map)v0).entrySet();
    Object v2 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v3 = new org.apache.commons.collections4.map.LinkedMap();
    Object v4 = ((java.util.Map)v0).remove(((java.lang.Object)v2),((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = new java.util.ArrayList();
    Object v9 = new java.util.ArrayList();
    Object v10 = ((org.apache.commons.collections4.map.MultiValueMap)v7).removeMapping(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v1),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).clear();
    Object v5 = null;
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    Object v7 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections4.Factory)v8));
    Object v10 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).equals(((java.lang.Object)v10));
    Object v12 = new java.util.ArrayList();
    Object v13 = new java.util.ArrayList();
    Object v14 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v12),((java.util.Collection)v13));
    Object v15 = ((org.apache.commons.collections4.map.MultiValueMap)v5).containsValue(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((java.util.Map)v3).get(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v6));
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v7).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new java.util.ArrayList();
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = ((org.apache.commons.collections4.map.MultiValueMap)v0).removeMapping(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v6 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v4),((org.apache.commons.collections4.Factory)v5));
    Object v7 = ((org.apache.commons.collections4.map.MultiValueMap)v6).totalSize();
    Object v8 = new org.apache.commons.collections4.map.LinkedMap();
    Object v9 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v8));
    Object v10 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v11 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v9),((org.apache.commons.collections4.Factory)v10));
    Object v12 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v13 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v11),((org.apache.commons.collections4.Factory)v12));
    Object v14 = ((org.apache.commons.collections4.map.MultiValueMap)v13).values();
    Object v15 = ((org.apache.commons.collections4.map.MultiValueMap)v0).putAll(((java.lang.Object)v7),((java.util.Collection)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).get(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((java.util.Map)v3).get(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v6));
    Object v8 = new org.apache.commons.collections4.map.LinkedMap();
    Object v9 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v8));
    Object v10 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v11 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v9),((org.apache.commons.collections4.Factory)v10));
    Object v12 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v13 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v11),((org.apache.commons.collections4.Factory)v12));
    Object v14 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v15 = ((org.apache.commons.collections4.map.MultiValueMap)v13).containsValue(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v7).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections4.map.MultiValueMap)v0).containsValue(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v2 = ((org.apache.commons.collections4.map.MultiValueMap)v0).containsValue(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.map.LinkedMap();
    Object v6 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v5));
    Object v7 = new org.apache.commons.collections4.map.LinkedMap();
    Object v8 = new java.util.ArrayList();
    Object v9 = new java.util.ArrayList();
    Object v10 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v8),((java.util.Collection)v9));
    Object v11 = ((java.util.Map)v6).remove(((java.lang.Object)v7),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections4.map.MultiValueMap)v4).size(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    Object v7 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections4.Factory)v8));
    Object v10 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v9));
    Object v11 = new org.apache.commons.collections4.map.LinkedMap();
    Object v12 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v11));
    Object v13 = new org.apache.commons.collections4.map.LinkedMap();
    Object v14 = new java.util.ArrayList();
    Object v15 = new java.util.ArrayList();
    Object v16 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v14),((java.util.Collection)v15));
    Object v17 = ((java.util.Map)v12).remove(((java.lang.Object)v13),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections4.map.MultiValueMap)v10).size(((java.lang.Object)v17));
    Object v19 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v20 = new org.apache.commons.collections4.map.LinkedMap();
    Object v21 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v20));
    Object v22 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v23 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v21),((org.apache.commons.collections4.Factory)v22));
    Object v24 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v23));
    Object v25 = ((org.apache.commons.collections4.map.MultiValueMap)v19).containsValue(((java.lang.Object)v24));
    Object v26 = ((java.util.Map)v5).putIfAbsent(((java.lang.Object)v18),((java.lang.Object)v25));
      org.junit.Assert.fail("Expected org.apache.commons.collections4.FunctorException");
    } catch (org.apache.commons.collections4.FunctorException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections4.map.LinkedMap();
    Object v4 = new java.util.ArrayList();
    Object v5 = new java.util.ArrayList();
    Object v6 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v4),((java.util.Collection)v5));
    Object v7 = ((java.util.Map)v2).remove(((java.lang.Object)v3),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v0).size(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v10 = new java.util.ArrayList();
    Object v11 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v12 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v11));
    ((org.apache.commons.collections4.map.MultiValueMap)v0).putAll(((java.util.Map)v9));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = new org.apache.commons.collections4.map.LinkedMap();
    Object v6 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v5));
    Object v7 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v8 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v6),((org.apache.commons.collections4.Factory)v7));
    Object v9 = ((org.apache.commons.collections4.map.MultiValueMap)v0).containsValue(((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    Object v7 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections4.Factory)v8));
    Object v10 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v11 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v9),((org.apache.commons.collections4.Factory)v10));
    Object v12 = new java.util.ArrayList();
    Object v13 = new java.util.ArrayList();
    Object v14 = ((org.apache.commons.collections4.map.MultiValueMap)v11).removeMapping(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v16 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v14),((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v3).containsValue(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).keySet();
    Object v6 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v7 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v6).containsValue(((java.lang.Object)v7));
    Object v9 = ((java.util.Map)v0).remove(((java.lang.Object)v5),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new java.util.ArrayList();
    Object v2 = new java.util.ArrayList();
    Object v3 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v1),((java.util.Collection)v2));
    Object v4 = ((org.apache.commons.collections4.map.MultiValueMap)v0).iterator(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = ((org.apache.commons.collections4.map.MultiValueMap)v3).entrySet();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new java.util.ArrayList();
    Object v5 = new java.util.ArrayList();
    Object v6 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v4),((java.util.Collection)v5));
    Object v7 = ((org.apache.commons.collections4.map.MultiValueMap)v3).iterator(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v2 = new java.util.ArrayList();
    Object v3 = new java.util.ArrayList();
    Object v4 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v2),((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v1).iterator(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.collections4.map.MultiValueMap)v0).size(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).keySet();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    ((org.apache.commons.collections4.map.MultiValueMap)v0).clear();
    Object v1 = null;
    Object v2 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = ((org.apache.commons.collections4.map.MultiValueMap)v2).containsValue(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v0).iterator(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new java.util.ArrayList();
    Object v7 = ((org.apache.commons.collections4.map.MultiValueMap)v5).iterator(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    ((java.util.Map)v0).clear();
    Object v1 = null;
    Object v2 = new java.util.ArrayList();
    Object v3 = new java.util.ArrayList();
    Object v4 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v2),((java.util.Collection)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v7 = new java.util.ArrayList();
    Object v8 = new java.util.ArrayList();
    Object v9 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v7),((java.util.Collection)v8));
    Object v10 = ((org.apache.commons.collections4.map.MultiValueMap)v6).iterator(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v12 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections4.map.MultiValueMap)v5).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    ((org.apache.commons.collections4.map.MultiValueMap)v3).putAll(((java.util.Map)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = ((org.apache.commons.collections4.map.MultiValueMap)v0).values();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v6 = ((java.util.Map)v4).get(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v8 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v4),((org.apache.commons.collections4.Factory)v7));
    Object v9 = new org.apache.commons.collections4.map.LinkedMap();
    Object v10 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v9));
    Object v11 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v12 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v10),((org.apache.commons.collections4.Factory)v11));
    Object v13 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v14 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections4.Factory)v13));
    Object v15 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v16 = ((org.apache.commons.collections4.map.MultiValueMap)v14).containsValue(((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v8).equals(((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections4.map.LinkedMap();
    Object v19 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v18));
    Object v20 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v21 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v19),((org.apache.commons.collections4.Factory)v20));
    Object v22 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v23 = ((org.apache.commons.collections4.map.MultiValueMap)v21).containsValue(((java.lang.Object)v22));
    Object v24 = ((java.util.Map)v0).replace(((java.lang.Object)v17),((java.lang.Object)v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v2 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections4.map.LinkedMap();
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v6 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v4),((org.apache.commons.collections4.Factory)v5));
    Object v7 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v2).containsValue(((java.lang.Object)v7));
    Object v9 = ((java.util.Map)v0).remove(((java.lang.Object)v1),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = ((org.apache.commons.collections4.map.AbstractIterableMap)v0).mapIterator();
    Object v2 = new org.apache.commons.collections4.map.LinkedMap();
    Object v3 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = new java.util.ArrayList();
    Object v10 = ((java.util.Collection)v9).parallelStream();
    Object v11 = ((org.apache.commons.collections4.map.MultiValueMap)v7).putAll(((java.lang.Object)v8),((java.util.Collection)v9));
    Object v12 = new org.apache.commons.collections4.map.LinkedMap();
    Object v13 = ((org.apache.commons.collections4.map.MultiValueMap)v0).containsValue(((java.lang.Object)v11),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = new java.util.ArrayList();
    Object v2 = new java.util.ArrayList();
    Object v3 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v1),((java.util.Collection)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v7).entrySet();
    Object v9 = ((java.util.Map)v0).remove(((java.lang.Object)v3),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v3).hashCode();
    Object v5 = ((org.apache.commons.collections4.map.MultiValueMap)v3).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v6 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v4),((org.apache.commons.collections4.Factory)v5));
    Object v7 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = ((java.util.Map)v6).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.map.LinkedMap();
    Object v11 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v10));
    Object v12 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v13 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v11),((org.apache.commons.collections4.Factory)v12));
    Object v14 = new org.apache.commons.collections4.map.LinkedMap();
    Object v15 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v14));
    Object v16 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v17 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v15),((org.apache.commons.collections4.Factory)v16));
    Object v18 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v17).keySet();
    Object v19 = ((java.util.Map)v13).equals(((java.lang.Object)v18));
    Object v20 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v21 = new org.apache.commons.collections4.map.LinkedMap();
    Object v22 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v21));
    Object v23 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v24 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v22),((org.apache.commons.collections4.Factory)v23));
    Object v25 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v24));
    Object v26 = ((java.util.Map)v13).remove(((java.lang.Object)v20),((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.collections4.map.MultiValueMap)v0).removeMapping(((java.lang.Object)v9),((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((java.util.Map)v3).get(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v6));
    Object v8 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v9 = ((org.apache.commons.collections4.map.MultiValueMap)v8).values();
    Object v10 = ((org.apache.commons.collections4.map.MultiValueMap)v7).size(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v2 = ((org.apache.commons.collections4.map.MultiValueMap)v1).values();
    Object v3 = ((org.apache.commons.collections4.map.MultiValueMap)v0).iterator(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v2 = new java.util.ArrayList();
    Object v3 = new org.apache.commons.collections4.map.LinkedMap();
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v6 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v4),((org.apache.commons.collections4.Factory)v5));
    Object v7 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections4.map.MultiValueMap)v7).entrySet();
    Object v9 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v2),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v9 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections4.Factory)v8));
    Object v10 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v11 = new java.util.ArrayList();
    Object v12 = new java.util.ArrayList();
    Object v13 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v11),((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.collections4.map.MultiValueMap)v10).iterator(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v16 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.collections4.map.MultiValueMap)v9).totalSize();
    Object v18 = new org.apache.commons.collections4.map.LinkedMap();
    Object v19 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v18));
    Object v20 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v21 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v19),((org.apache.commons.collections4.Factory)v20));
    Object v22 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v23 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v21),((org.apache.commons.collections4.Factory)v22));
    Object v24 = new java.util.ArrayList();
    Object v25 = new java.util.ArrayList();
    Object v26 = ((org.apache.commons.collections4.map.MultiValueMap)v23).removeMapping(((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = new org.apache.commons.collections4.map.LinkedMap();
    Object v28 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v27));
    Object v29 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v30 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v28),((org.apache.commons.collections4.Factory)v29));
    Object v31 = ((org.apache.commons.collections4.map.MultiValueMap)v30).entrySet();
    Object v32 = ((java.util.Map)v3).replace(((java.lang.Object)v17),((java.lang.Object)v26),((java.lang.Object)v31));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v5).toString();
    Object v7 = new java.util.ArrayList();
    Object v8 = new java.util.ArrayList();
    Object v9 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v7),((java.util.Collection)v8));
    Object v10 = new org.apache.commons.collections4.map.LinkedMap();
    Object v11 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v10));
    Object v12 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v13 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v11),((org.apache.commons.collections4.Factory)v12));
    Object v14 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v15 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v13),((org.apache.commons.collections4.Factory)v14));
    Object v16 = ((org.apache.commons.collections4.map.MultiValueMap)v15).values();
    Object v17 = ((java.util.Map)v4).replace(((java.lang.Object)v6),((java.lang.Object)v9),((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections4.map.LinkedMap();
    Object v19 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v18));
    Object v20 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v21 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v19),((org.apache.commons.collections4.Factory)v20));
    Object v22 = new java.util.ArrayList();
    Object v23 = ((org.apache.commons.collections4.map.MultiValueMap)v21).iterator(((java.lang.Object)v22));
    Object v24 = ((org.apache.commons.collections4.map.MultiValueMap)v4).size(((java.lang.Object)v23));
    org.junit.Assert.assertEquals((Object)(0), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v4));
    Object v6 = new org.apache.commons.collections4.map.LinkedMap();
    ((org.apache.commons.collections4.map.MultiValueMap)v5).putAll(((java.util.Map)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = ((org.apache.commons.collections4.map.MultiValueMap)v0).iterator();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v1));
    Object v3 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v4 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v2),((org.apache.commons.collections4.Factory)v3));
    Object v5 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v4).isEmpty();
    Object v6 = ((org.apache.commons.collections4.map.MultiValueMap)v4).values();
    Object v7 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = ((org.apache.commons.collections4.map.MultiValueMap)v0).iterator(((java.lang.Object)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections4.map.LinkedMap();
    ((org.apache.commons.collections4.map.MultiValueMap)v4).putAll(((java.util.Map)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.LinkedMap();
    Object v1 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections4.Factory)v2));
    Object v4 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v5 = ((java.util.Map)v3).get(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections4.Factory)v6));
    Object v8 = new org.apache.commons.collections4.map.LinkedMap();
    Object v9 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v8));
    Object v10 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v11 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v9),((org.apache.commons.collections4.Factory)v10));
    Object v12 = ((org.apache.commons.collections4.map.AbstractMapDecorator)v11).isEmpty();
    Object v13 = ((org.apache.commons.collections4.map.MultiValueMap)v11).values();
    Object v14 = java.util.function.Function.identity();
    Object v15 = ((java.util.Map)v7).remove(((java.lang.Object)v13),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections4.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections4.map.LinkedMap();
    Object v2 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v3 = new java.util.ArrayList();
    Object v4 = new org.apache.commons.collections4.map.LinkedMap();
    Object v5 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections4.functors.ExceptionFactory.exceptionFactory();
    Object v7 = new org.apache.commons.collections4.map.MultiValueMap(((java.util.Map)v5),((org.apache.commons.collections4.Factory)v6));
    Object v8 = org.apache.commons.collections4.map.MultiValueMap.multiValueMap(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections4.map.MultiValueMap)v8).entrySet();
    Object v10 = ((java.util.Map)v1).replace(((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v9));
    Object v11 = new java.util.ArrayList();
    Object v12 = new java.util.ArrayList();
    Object v13 = org.apache.commons.collections4.ListUtils.retainAll(((java.util.Collection)v11),((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.collections4.map.MultiValueMap)v0).putAll(((java.lang.Object)v10),((java.util.Collection)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }
}
