package org.apache.commons.collections.map;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).keySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.LRUMap();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v2),((java.lang.Object)v3));
    ((org.apache.commons.collections.map.Flat3Map)v1).clear();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.LRUMap();
    Object v3 = ((java.util.Map)v1).containsKey(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = ((java.util.Map)v0).remove(((java.lang.Object)v7),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = ((java.util.Map)v0).size();
    Object v2 = new org.apache.commons.collections.LRUMap();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = ((java.util.Map)v4).containsKey(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = ((java.util.Map)v3).remove(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v0).replace(((java.lang.Object)v2),((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = ((java.util.Map)v4).containsKey(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v2).put(((java.lang.Object)v3),((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).mapIterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).keySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).values();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.LRUMap();
    Object v3 = ((java.util.Map)v1).containsKey(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((java.util.Map)v1).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v7),((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v2).get(((java.lang.Object)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).keySet();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = ((java.util.Map)v5).replace(((java.lang.Object)v8),((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.LRUMap();
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = ((java.util.Map)v5).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v2).containsValue(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).mapIterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).keySet();
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = new org.apache.commons.collections.LRUMap();
    Object v15 = ((java.util.Map)v9).replace(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.LRUMap();
    Object v17 = new org.apache.commons.collections.LRUMap();
    Object v18 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.collections.LRUMap();
    Object v20 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).clone();
    Object v22 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v18),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    ((org.apache.commons.collections.map.Flat3Map)v2).putAll(((java.util.Map)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).mapIterator();
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).keySet();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v6).put(((java.lang.Object)v10),((java.lang.Object)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).size();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).keySet();
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.LRUMap();
    Object v13 = ((java.util.Map)v7).replace(((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.LRUMap();
    Object v15 = new org.apache.commons.collections.LRUMap();
    Object v16 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.LRUMap();
    Object v18 = ((java.util.Map)v0).replace(((java.lang.Object)v4),((java.lang.Object)v16),((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).isEmpty();
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).isEmpty();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v10),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v6).values();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).keySet();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).size();
    Object v11 = ((java.util.Map)v0).replace(((java.lang.Object)v3),((java.lang.Object)v6),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = ((java.util.Map)v3).containsKey(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).hashCode();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v2).remove(((java.lang.Object)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).values();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v2).containsValue(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = ((java.util.Map)v7).containsKey(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).hashCode();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v6).containsKey(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).isEmpty();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = ((java.util.Map)v0).replace(((java.lang.Object)v4),((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).values();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).keySet();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = ((java.util.Map)v0).replace(((java.lang.Object)v4),((java.lang.Object)v8),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).values();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v3).remove(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).values();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v3).containsKey(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).keySet();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v3).containsKey(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v2).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    ((org.apache.commons.collections.map.Flat3Map)v2).putAll(((java.util.Map)v3));
    Object v4 = null;
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).isEmpty();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v2).put(((java.lang.Object)v5),((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).isEmpty();
    Object v9 = ((java.util.Map)v0).remove(((java.lang.Object)v4),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).keySet();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v2).entrySet();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = ((java.util.Map)v0).keySet();
    Object v2 = new org.apache.commons.collections.LRUMap();
    Object v3 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).keySet();
    Object v10 = ((java.util.Map)v0).replace(((java.lang.Object)v5),((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).values();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    ((org.apache.commons.collections.map.Flat3Map)v3).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.LRUMap();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).clone();
    Object v15 = new org.apache.commons.collections.LRUMap();
    Object v16 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v15));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v14).equals(((java.lang.Object)v18));
    Object v20 = java.util.function.Function.identity();
    Object v21 = ((java.util.Map)v11).computeIfAbsent(((java.lang.Object)v19),((java.util.function.Function)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).isEmpty();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).mapIterator();
    Object v12 = new org.apache.commons.collections.LRUMap();
    Object v13 = ((java.util.Map)v3).replace(((java.lang.Object)v7),((java.lang.Object)v11),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).values();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v7).remove(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).values();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v7).containsKey(((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.LRUMap();
    Object v19 = ((java.util.Map)v3).remove(((java.lang.Object)v17),((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    ((org.apache.commons.collections.map.Flat3Map)v3).clear();
    Object v4 = null;
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v8).equals(((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v3).put(((java.lang.Object)v5),((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).values();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).keySet();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).keySet();
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).size();
    Object v15 = ((java.util.Map)v4).replace(((java.lang.Object)v7),((java.lang.Object)v10),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.LRUMap();
    Object v17 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v15),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v3).remove(((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).size();
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v8));
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).mapIterator();
    ((org.apache.commons.collections.map.Flat3Map)v2).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = java.util.function.Function.identity();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.function.Function)v8).compose(((java.util.function.Function)v9));
    Object v11 = ((java.util.Map)v6).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v8));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).mapIterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).size();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v4).get(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v4).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).size();
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((java.util.Map)v8).computeIfAbsent(((java.lang.Object)v12),((java.util.function.Function)v13));
    Object v15 = ((java.util.Map)v4).equals(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.LRUMap();
    Object v17 = new org.apache.commons.collections.LRUMap();
    Object v18 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).clone();
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v19).clone();
    Object v21 = new org.apache.commons.collections.LRUMap();
    Object v22 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v22).clone();
    Object v24 = ((org.apache.commons.collections.map.Flat3Map)v23).size();
    Object v25 = java.util.function.Function.identity();
    Object v26 = ((java.util.Map)v20).computeIfAbsent(((java.lang.Object)v24),((java.util.function.Function)v25));
    Object v27 = ((java.util.Map)v4).remove(((java.lang.Object)v16),((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).toString();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v3).entrySet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).values();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).toString();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v8).entrySet();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v3).containsValue(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v7).get(((java.lang.Object)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).size();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v6).get(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v6).get(((java.lang.Object)v13));
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).keySet();
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = new org.apache.commons.collections.LRUMap();
    Object v15 = ((java.util.Map)v9).replace(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.LRUMap();
    Object v17 = new org.apache.commons.collections.LRUMap();
    Object v18 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.collections.LRUMap();
    Object v20 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).clone();
    Object v22 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v18),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v24 = new org.apache.commons.collections.LRUMap();
    Object v25 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v24));
    Object v26 = ((org.apache.commons.collections.map.Flat3Map)v25).clone();
    Object v27 = ((org.apache.commons.collections.map.Flat3Map)v26).clone();
    Object v28 = ((org.apache.commons.collections.map.Flat3Map)v27).size();
    Object v29 = java.util.function.Function.identity();
    Object v30 = ((java.util.Map)v23).computeIfAbsent(((java.lang.Object)v28),((java.util.function.Function)v29));
    org.junit.Assert.assertEquals((Object)(0), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).keySet();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v5).entrySet();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v2).containsKey(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).mapIterator();
    Object v12 = new org.apache.commons.collections.LRUMap();
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).clone();
    Object v17 = java.util.function.Function.identity();
    Object v18 = ((java.util.Map)v12).computeIfAbsent(((java.lang.Object)v16),((java.util.function.Function)v17));
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).clone();
    Object v20 = ((java.util.Map)v7).replace(((java.lang.Object)v11),((java.lang.Object)v19));
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).values();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v4).remove(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).clone();
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).clone();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v4).containsValue(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).entrySet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).keySet();
    Object v5 = ((java.util.Map)v0).remove(((java.lang.Object)v4));
    Object v6 = java.util.function.Function.identity();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).size();
    Object v13 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(0), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).mapIterator();
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((java.util.function.Function)v7).andThen(((java.util.function.Function)v8));
    Object v10 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    ((org.apache.commons.collections.map.Flat3Map)v4).clear();
    Object v5 = null;
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v4).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).toString();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v2).remove(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).entrySet();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    ((org.apache.commons.collections.map.Flat3Map)v12).clear();
    Object v13 = null;
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v12).hashCode();
    Object v15 = new org.apache.commons.collections.LRUMap();
    Object v16 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v15));
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).entrySet();
    Object v19 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v14),((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).values();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v7).equals(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.LRUMap();
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).clone();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    ((org.apache.commons.collections.map.Flat3Map)v18).clear();
    Object v19 = null;
    Object v20 = ((org.apache.commons.collections.map.Flat3Map)v18).hashCode();
    Object v21 = ((java.util.Map)v3).remove(((java.lang.Object)v13),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).keySet();
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = new org.apache.commons.collections.LRUMap();
    Object v15 = ((java.util.Map)v9).replace(((java.lang.Object)v12),((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.LRUMap();
    Object v17 = new org.apache.commons.collections.LRUMap();
    Object v18 = ((java.util.Map)v9).getOrDefault(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = new org.apache.commons.collections.LRUMap();
    Object v20 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).clone();
    Object v22 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v18),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v24 = new org.apache.commons.collections.LRUMap();
    Object v25 = new org.apache.commons.collections.LRUMap();
    Object v26 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v25));
    Object v27 = ((org.apache.commons.collections.map.Flat3Map)v26).clone();
    Object v28 = ((org.apache.commons.collections.map.Flat3Map)v27).keySet();
    Object v29 = ((java.util.Map)v23).getOrDefault(((java.lang.Object)v24),((java.lang.Object)v28));
    org.junit.Assert.assertNotNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).toString();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v3).containsKey(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    ((org.apache.commons.collections.map.Flat3Map)v4).clear();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).entrySet();
    Object v11 = ((java.util.Map)v0).remove(((java.lang.Object)v4),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).size();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v7).put(((java.lang.Object)v12),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).size();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).clone();
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((java.util.Map)v8).computeIfAbsent(((java.lang.Object)v12),((java.util.function.Function)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = ((java.util.Map)v3).replace(((java.lang.Object)v7),((java.lang.Object)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = new org.apache.commons.collections.LRUMap();
    ((org.apache.commons.collections.map.Flat3Map)v3).putAll(((java.util.Map)v4));
    Object v5 = null;
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v3).keySet();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).toString();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v4).values();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).clone();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).entrySet();
    Object v13 = new org.apache.commons.collections.LRUMap();
    Object v14 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).clone();
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).clone();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).entrySet();
    Object v19 = ((java.util.Map)v8).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).keySet();
    Object v12 = ((java.util.Map)v7).remove(((java.lang.Object)v11));
    Object v13 = java.util.function.Function.identity();
    Object v14 = new org.apache.commons.collections.LRUMap();
    Object v15 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections.map.Flat3Map)v15).clone();
    Object v17 = ((org.apache.commons.collections.map.Flat3Map)v16).clone();
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    Object v19 = ((org.apache.commons.collections.map.Flat3Map)v18).size();
    Object v20 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v13),((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v6).get(((java.lang.Object)v20));
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.map.Flat3Map)v8).clone();
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).size();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v6).containsKey(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).clone();
    Object v6 = ((org.apache.commons.collections.map.Flat3Map)v5).clone();
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).entrySet();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = new org.apache.commons.collections.LRUMap();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).keySet();
    Object v15 = new org.apache.commons.collections.LRUMap();
    Object v16 = new org.apache.commons.collections.LRUMap();
    Object v17 = ((java.util.Map)v11).replace(((java.lang.Object)v14),((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.LRUMap();
    Object v19 = new org.apache.commons.collections.LRUMap();
    Object v20 = ((java.util.Map)v11).getOrDefault(((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v20));
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v21).toString();
    Object v23 = ((java.util.Map)v2).remove(((java.lang.Object)v8),((java.lang.Object)v22));
    Object v24 = new org.apache.commons.collections.LRUMap();
    Object v25 = new org.apache.commons.collections.LRUMap();
    Object v26 = ((java.util.Map)v24).containsKey(((java.lang.Object)v25));
    Object v27 = new org.apache.commons.collections.LRUMap();
    Object v28 = new org.apache.commons.collections.LRUMap();
    Object v29 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v28));
    Object v30 = ((java.util.Map)v24).getOrDefault(((java.lang.Object)v27),((java.lang.Object)v29));
    Object v31 = ((org.apache.commons.collections.map.Flat3Map)v30).clone();
    ((org.apache.commons.collections.map.Flat3Map)v2).putAll(((java.util.Map)v31));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).values();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.Flat3Map)v4).keySet();
    Object v6 = new org.apache.commons.collections.LRUMap();
    Object v7 = new org.apache.commons.collections.LRUMap();
    Object v8 = ((java.util.Map)v2).replace(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.LRUMap();
    Object v11 = ((java.util.Map)v2).getOrDefault(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.LRUMap();
    Object v13 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.map.Flat3Map)v13).clone();
    Object v15 = ((org.apache.commons.collections.map.Flat3Map)v14).entrySet();
    Object v16 = new org.apache.commons.collections.LRUMap();
    Object v17 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v16));
    Object v18 = ((org.apache.commons.collections.map.Flat3Map)v17).clone();
    Object v19 = ((java.util.Map)v11).remove(((java.lang.Object)v15),((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = new org.apache.commons.collections.LRUMap();
    Object v12 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v12).keySet();
    Object v14 = new org.apache.commons.collections.LRUMap();
    Object v15 = new org.apache.commons.collections.LRUMap();
    Object v16 = ((java.util.Map)v10).replace(((java.lang.Object)v13),((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.LRUMap();
    Object v18 = new org.apache.commons.collections.LRUMap();
    Object v19 = ((java.util.Map)v10).getOrDefault(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.map.Flat3Map)v20).toString();
    Object v22 = ((org.apache.commons.collections.map.Flat3Map)v7).get(((java.lang.Object)v21));
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.LRUMap();
    Object v2 = ((java.util.Map)v0).containsKey(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.LRUMap();
    Object v4 = new org.apache.commons.collections.LRUMap();
    Object v5 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v4));
    Object v6 = ((java.util.Map)v0).getOrDefault(((java.lang.Object)v3),((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = new org.apache.commons.collections.LRUMap();
    Object v9 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.map.Flat3Map)v9).clone();
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).toString();
    Object v13 = ((org.apache.commons.collections.map.Flat3Map)v7).containsValue(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.LRUMap();
    Object v1 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.Flat3Map)v1).clone();
    Object v3 = ((org.apache.commons.collections.map.Flat3Map)v2).clone();
    Object v4 = ((org.apache.commons.collections.map.Flat3Map)v3).clone();
    Object v5 = new org.apache.commons.collections.LRUMap();
    Object v6 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.map.Flat3Map)v6).clone();
    Object v8 = ((org.apache.commons.collections.map.Flat3Map)v7).mapIterator();
    Object v9 = new org.apache.commons.collections.LRUMap();
    Object v10 = new org.apache.commons.collections.map.Flat3Map(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.map.Flat3Map)v10).clone();
    Object v12 = ((org.apache.commons.collections.map.Flat3Map)v11).isEmpty();
    Object v13 = ((java.util.Map)v4).replace(((java.lang.Object)v8),((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }
}
