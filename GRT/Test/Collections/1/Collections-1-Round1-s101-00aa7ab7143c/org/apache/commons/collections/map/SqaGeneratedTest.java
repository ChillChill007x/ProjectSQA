package org.apache.commons.collections.map;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).keySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).keySet();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).values();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((java.util.Map)v3).hashCode();
    ((org.apache.commons.collections.map.Flat3Map)v1).putAll(((java.util.Map)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).entrySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    ((org.apache.commons.collections.map.Flat3Map)v1).putAll(((java.util.Map)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).mapIterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = null;
    Object v7 = ((java.util.Map)v1).merge(((java.lang.Object)v4),((java.lang.Object)v5),((java.util.function.BiFunction)v6));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    ((org.apache.commons.collections.map.Flat3Map)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    ((java.util.Map)v1).clear();
    Object v2 = null;
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    Object v7 = ((java.util.Map)v1).replace(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).values();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v1).put(((java.lang.Object)v3),((java.lang.Object)v6));
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).isEmpty();
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).size();
    Object v16 = ((java.util.Map)v7).replace(((java.lang.Object)v10),((java.lang.Object)v12),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.map.Flat3Map();
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).size();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v7).equals(((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v1).containsKey(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).keySet();
    Object v4 = null;
    Object v5 = ((java.util.Map)v0).computeIfPresent(((java.lang.Object)v3),((java.util.function.BiFunction)v4));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v1).containsKey(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((org.apache.commons.collections.map.Flat3Map)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).isEmpty();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v1).put(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).keySet();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).values();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v6).put(((java.lang.Object)v8),((java.lang.Object)v11));
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v6).equals(((java.lang.Object)v13));
    Object v15 = ((java.util.Map)v1).remove(((java.lang.Object)v4),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v1).values();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).mapIterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v1).containsValue(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v1).putIfAbsent(((java.lang.Object)v3),((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    ((java.util.Map)v1).clear();
    Object v2 = null;
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).values();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v8).put(((java.lang.Object)v10),((java.lang.Object)v13));
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v8).equals(((java.lang.Object)v15));
    Object v17 = ((java.util.Map)v3).remove(((java.lang.Object)v6),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v3).values();
    Object v19 = new org.apache.commons.collections.map.Flat3Map();
    Object v20 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).values();
    Object v22 = new org.apache.commons.collections.map.Flat3Map();
    Object v23 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v22));
    Object v24 = new org.apache.commons.collections.map.Flat3Map();
    Object v25 = new org.apache.commons.collections.map.Flat3Map();
    Object v26 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v25));
    Object v27 = ((org.apache.commons.collections.map.Flat3Map)v26).keySet();
    Object v28 = java.util.function.Function.identity();
    Object v29 = ((java.util.Map)v24).computeIfAbsent(((java.lang.Object)v27),((java.util.function.Function)v28));
    Object v30 = ((org.apache.commons.collections.map.Flat3Map)v23).containsKey(((java.lang.Object)v29));
    Object v31 = ((java.util.Map)v1).replace(((java.lang.Object)v18),((java.lang.Object)v21),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).size();
    Object v7 = ((java.util.Map)v1).remove(((java.lang.Object)v3),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v4).containsValue(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v0).put(((java.lang.Object)v2),((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).size();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).entrySet();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v3).containsValue(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).size();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v1).put(((java.lang.Object)v6),((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v7).containsKey(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).size();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v2).containsKey(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    ((org.apache.commons.collections.map.Flat3Map)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    ((java.util.Map)v1).clear();
    Object v2 = null;
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((java.util.Map)v10).isEmpty();
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = java.util.function.Function.identity();
    Object v15 = ((java.util.Map)v10).computeIfAbsent(((java.lang.Object)v13),((java.util.function.Function)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).hashCode();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v8).containsValue(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).toString();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    ((org.apache.commons.collections.map.Flat3Map)v7).clear();
    Object v8 = null;
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v7).size();
    Object v10 = new org.apache.commons.collections.map.Flat3Map();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).mapIterator();
    Object v15 = new org.apache.commons.collections.map.Flat3Map();
    Object v16 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v15));
    Object v17 = ((java.util.Map)v11).getOrDefault(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v9),((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v3).containsKey(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v1).remove(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    ((java.util.Map)v1).clear();
    Object v2 = null;
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).size();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v8).get(((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v1).get(((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    ((org.apache.commons.collections.map.Flat3Map)v2).putAll(((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    ((java.util.Map)v2).clear();
    Object v3 = null;
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).toString();
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).toString();
    Object v14 = new org.apache.commons.collections.map.Flat3Map();
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    ((org.apache.commons.collections.map.Flat3Map)v15).clear();
    Object v16 = null;
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v15).size();
    Object v18 = new org.apache.commons.collections.map.Flat3Map();
    Object v19 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v18));
    Object v20 = new org.apache.commons.collections.map.Flat3Map();
    Object v21 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v20));
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v21).mapIterator();
    Object v23 = new org.apache.commons.collections.map.Flat3Map();
    Object v24 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v23));
    Object v25 = ((java.util.Map)v19).getOrDefault(((java.lang.Object)v22),((java.lang.Object)v24));
    Object v26 = ((java.util.Map)v10).replace(((java.lang.Object)v13),((java.lang.Object)v17),((java.lang.Object)v25));
    Object v27 = ((java.util.Map)v2).putIfAbsent(((java.lang.Object)v7),((java.lang.Object)v26));
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).size();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v1).containsKey(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).size();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v4).containsKey(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).values();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v7).get(((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).toString();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).mapIterator();
    Object v10 = new org.apache.commons.collections.map.Flat3Map();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((java.util.Map)v6).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v12).containsKey(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v1).put(((java.lang.Object)v4),((java.lang.Object)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v7).keySet();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).mapIterator();
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v11).containsKey(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v3).remove(((java.lang.Object)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    ((org.apache.commons.collections.map.Flat3Map)v7).putAll(((java.util.Map)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    ((java.util.Map)v9).clear();
    Object v10 = null;
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).size();
    Object v14 = new org.apache.commons.collections.map.Flat3Map();
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    Object v16 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.map.Flat3Map();
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).clone();
    Object v20 = new org.apache.commons.collections.map.Flat3Map();
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).size();
    Object v22 = java.util.function.Function.identity();
    Object v23 = ((java.util.Map)v19).computeIfAbsent(((java.lang.Object)v21),((java.util.function.Function)v22));
    Object v24 = ((java.util.Map)v7).putIfAbsent(((java.lang.Object)v16),((java.lang.Object)v23));
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((java.util.Map)v0).equals(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = new org.apache.commons.collections.map.Flat3Map();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).mapIterator();
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).hashCode();
    Object v17 = ((java.util.Map)v0).replace(((java.lang.Object)v7),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v10).containsKey(((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v1).replace(((java.lang.Object)v4),((java.lang.Object)v8),((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).toString();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v2).remove(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v2).size();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).size();
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    ((org.apache.commons.collections.map.Flat3Map)v12).clear();
    Object v13 = null;
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v12).size();
    Object v15 = ((java.util.Map)v1).replace(((java.lang.Object)v10),((java.lang.Object)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v8).put(((java.lang.Object)v10),((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).entrySet();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v5).isEmpty();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v3).containsKey(((java.lang.Object)v7));
    ((org.apache.commons.collections.map.Flat3Map)v3).clear();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).mapIterator();
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    ((java.util.Map)v8).clear();
    Object v9 = null;
    Object v10 = new org.apache.commons.collections.map.Flat3Map();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).size();
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((java.util.Map)v8).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v6),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v5).isEmpty();
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).clone();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = new org.apache.commons.collections.map.Flat3Map();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).size();
    Object v18 = new org.apache.commons.collections.map.Flat3Map();
    Object v19 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v18));
    Object v20 = ((java.util.Map)v15).getOrDefault(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.map.Flat3Map();
    Object v22 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v21));
    Object v23 = ((java.util.Map)v3).replace(((java.lang.Object)v11),((java.lang.Object)v20),((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    ((org.apache.commons.collections.map.Flat3Map)v2).clear();
    Object v3 = null;
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v2).size();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v0).get(((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).toString();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).size();
    Object v9 = ((java.util.Map)v1).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).mapIterator();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).mapIterator();
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).mapIterator();
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = new org.apache.commons.collections.map.Flat3Map();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).size();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v15).containsKey(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v3).put(((java.lang.Object)v12),((java.lang.Object)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    ((org.apache.commons.collections.map.Flat3Map)v3).putAll(((java.util.Map)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).values();
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((org.apache.commons.collections.map.Flat3Map)v0).entrySet();
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v0).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).mapIterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).mapIterator();
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).mapIterator();
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).mapIterator();
    Object v16 = new org.apache.commons.collections.map.Flat3Map();
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = ((java.util.Map)v12).getOrDefault(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = ((java.util.Map)v1).replace(((java.lang.Object)v10),((java.lang.Object)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).mapIterator();
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v11).containsKey(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.map.Flat3Map();
    Object v16 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v15));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v3).put(((java.lang.Object)v14),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = ((java.util.Map)v0).values();
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).mapIterator();
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).size();
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((java.util.Map)v10).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).mapIterator();
    Object v17 = new org.apache.commons.collections.map.Flat3Map();
    Object v18 = new org.apache.commons.collections.map.Flat3Map();
    Object v19 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v18));
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v19).clone();
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).clone();
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v17).equals(((java.lang.Object)v21));
    Object v23 = ((java.util.Map)v0).replace(((java.lang.Object)v6),((java.lang.Object)v16),((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).isEmpty();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).entrySet();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v11).size();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v4).containsValue(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).toString();
    Object v10 = ((java.util.Map)v3).remove(((java.lang.Object)v5),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).values();
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).entrySet();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((java.util.Map)v1).isEmpty();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).size();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v8).containsKey(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v6).containsValue(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).values();
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.Flat3Map();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).size();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v12).containsKey(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.Flat3Map();
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).size();
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v10).put(((java.lang.Object)v15),((java.lang.Object)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).values();
    Object v10 = new org.apache.commons.collections.map.Flat3Map();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((java.util.Map)v6).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.map.Flat3Map();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((java.util.Map)v14).isEmpty();
    Object v16 = new org.apache.commons.collections.map.Flat3Map();
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = java.util.function.Function.identity();
    Object v19 = ((java.util.Map)v14).computeIfAbsent(((java.lang.Object)v17),((java.util.function.Function)v18));
    Object v20 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).clone();
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v20).keySet();
    Object v23 = ((java.util.Map)v1).remove(((java.lang.Object)v12),((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.Flat3Map();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).size();
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Map)v1).get(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).clone();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).isEmpty();
    Object v16 = new org.apache.commons.collections.map.Flat3Map();
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = new org.apache.commons.collections.map.Flat3Map();
    Object v19 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v18));
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v17).containsValue(((java.lang.Object)v19));
    Object v21 = ((java.util.Map)v1).remove(((java.lang.Object)v15),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).size();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v6).containsKey(((java.lang.Object)v8));
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).toString();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v4).containsKey(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((java.util.Map)v3).entrySet();
    Object v5 = new org.apache.commons.collections.map.Flat3Map();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = new org.apache.commons.collections.map.Flat3Map();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = new org.apache.commons.collections.map.Flat3Map();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = new org.apache.commons.collections.map.Flat3Map();
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    Object v16 = new org.apache.commons.collections.map.Flat3Map();
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v15).containsKey(((java.lang.Object)v17));
    Object v19 = ((java.util.Map)v6).replace(((java.lang.Object)v9),((java.lang.Object)v13),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.collections.map.Flat3Map();
    Object v21 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v20));
    Object v22 = ((java.util.Map)v21).isEmpty();
    Object v23 = new org.apache.commons.collections.map.Flat3Map();
    Object v24 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v23));
    Object v25 = java.util.function.Function.identity();
    Object v26 = ((java.util.Map)v21).computeIfAbsent(((java.lang.Object)v24),((java.util.function.Function)v25));
    Object v27 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v26));
    Object v28 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v19),((java.lang.Object)v27));
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).values();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.map.Flat3Map();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = new org.apache.commons.collections.map.Flat3Map();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = new org.apache.commons.collections.map.Flat3Map();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).size();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v13).containsKey(((java.lang.Object)v15));
    Object v17 = ((java.util.Map)v2).replace(((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).entrySet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    ((java.util.Map)v1).clear();
    Object v2 = null;
    Object v3 = new org.apache.commons.collections.map.Flat3Map();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    Object v6 = new org.apache.commons.collections.map.Flat3Map();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.Flat3Map();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).hashCode();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v8).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.Flat3Map();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }
}
