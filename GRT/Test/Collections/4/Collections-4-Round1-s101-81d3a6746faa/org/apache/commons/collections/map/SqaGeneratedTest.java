package org.apache.commons.collections.map;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((java.util.Map)v0).replace(((java.lang.Object)v1),((java.lang.Object)v2));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v3).size(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v3).putAll(((java.lang.Object)v7),((java.util.Collection)v10));
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v3).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v3).values();
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v3).iterator(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    ((java.util.Map)v4).clear();
    Object v5 = null;
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v6));
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.util.function.Function.identity();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v3).iterator(((java.lang.Object)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((java.util.Map)v3).keySet();
    Object v5 = java.util.function.Function.identity();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v6).put(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v10).put(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v9).size(((java.lang.Object)v13));
    Object v15 = ((java.util.Map)v3).replace(((java.lang.Object)v5),((java.lang.Object)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v6).values();
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v6).iterator(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v0).containsValue(((java.lang.Object)v2),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = ((java.util.Collection)v5).toArray();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v0).putAll(((java.lang.Object)v3),((java.util.Collection)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v9));
    Object v11 = ((java.util.Map)v4).putIfAbsent(((java.lang.Object)v7),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v3).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.function.Function.identity();
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v0).putAll(((java.lang.Object)v1),((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = ((org.apache.commons.collections.map.MultiValueMap)v0).values();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v1).values();
    Object v3 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v0).replace(((java.lang.Object)v2),((java.lang.Object)v3),((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v4));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v6));
    Object v8 = ((java.util.Map)v0).replace(((java.lang.Object)v2),((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v6 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).containsValue(((java.lang.Object)v5),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    ((org.apache.commons.collections.map.MultiValueMap)v3).putAll(((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v7).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v10).values();
    Object v12 = java.util.Comparator.reverseOrder();
    Object v13 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v12));
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v10).iterator(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v4).containsValue(((java.lang.Object)v6),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v3).iterator(((java.lang.Object)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v4).containsValue(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = java.util.Comparator.reverseOrder();
    Object v12 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v10),((org.apache.commons.collections.Factory)v13));
    ((org.apache.commons.collections.map.MultiValueMap)v4).putAll(((java.util.Map)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v5 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).get(((java.lang.Object)v4));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = java.util.function.Function.identity();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v8).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    Object v12 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v4),((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v4).size(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v5));
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v7));
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v6),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = ((java.util.Map)v0).entrySet();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v2).put(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = java.util.Comparator.reverseOrder();
    Object v10 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v9));
    Object v11 = ((java.util.Map)v0).remove(((java.lang.Object)v8),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = ((java.util.Collection)v9).toArray();
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v4).putAll(((java.lang.Object)v7),((java.util.Collection)v9));
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v9));
    Object v11 = java.util.Comparator.reverseOrder();
    Object v12 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v11));
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v7).containsValue(((java.lang.Object)v10),((java.lang.Object)v12));
    Object v14 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v15 = ((java.util.Map)v3).remove(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v3).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v7).values();
    Object v9 = java.util.Comparator.reverseOrder();
    Object v10 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v10));
    Object v12 = ((java.util.Map)v6).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v5 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v5));
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v9).put(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = new org.apache.commons.collections.map.MultiValueMap();
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = ((org.apache.commons.collections.map.MultiValueMap)v14).put(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = java.util.function.Function.identity();
    Object v19 = java.util.function.Function.identity();
    Object v20 = ((java.util.Map)v17).computeIfAbsent(((java.lang.Object)v18),((java.util.function.Function)v19));
    Object v21 = ((java.util.Map)v12).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v20));
    Object v22 = ((java.util.Map)v3).replace(((java.lang.Object)v6),((java.lang.Object)v8),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((java.util.Map)v3).entrySet();
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v6));
    Object v8 = null;
    Object v9 = ((java.util.Map)v3).computeIfPresent(((java.lang.Object)v7),((java.util.function.BiFunction)v8));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v4).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v6));
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v4).size(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v5));
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v3).iterator(((java.lang.Object)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).get(((java.lang.Object)v8));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v8).values();
    Object v10 = ((java.util.Map)v4).putIfAbsent(((java.lang.Object)v7),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v7).values();
    Object v9 = java.util.Comparator.reverseOrder();
    Object v10 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v7).iterator(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v1).containsValue(((java.lang.Object)v3),((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v14 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v12),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v4).values();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v4).values();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v6).put(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v9).computeIfAbsent(((java.lang.Object)v10),((java.util.function.Function)v11));
    Object v13 = ((java.util.Map)v3).remove(((java.lang.Object)v5),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v8).totalSize();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v6));
    Object v8 = java.util.function.Function.identity();
    Object v9 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v7),((java.util.function.Function)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v5));
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v7));
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v6),((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = ((java.util.Map)v0).values();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v2).put(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v7));
    Object v9 = java.util.Comparator.reverseOrder();
    Object v10 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v5).containsValue(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v13 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v11),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).get(((java.lang.Object)v8));
    Object v10 = java.util.Comparator.reverseOrder();
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v7).containsValue(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v12).values();
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v11),((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v9).values();
    Object v11 = ((java.util.Map)v7).remove(((java.lang.Object)v8),((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((java.util.Map)v3).remove(((java.lang.Object)v6),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v0).getCollection(((java.lang.Object)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v0).iterator(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = ((java.util.Map)v7).remove(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).remove(((java.lang.Object)v12));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v8).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    Object v12 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v13 = ((org.apache.commons.collections.map.AbstractMapDecorator)v11).equals(((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v3).replace(((java.lang.Object)v5),((java.lang.Object)v7),((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).remove(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections.Factory)v10));
    Object v12 = ((org.apache.commons.collections.map.AbstractMapDecorator)v11).hashCode();
    Object v13 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).iterator(((java.lang.Object)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v0).size(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v5).size(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v4).get(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v4).size(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v7).put(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v11).put(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v10).size(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v3).removeMapping(((java.lang.Object)v6),((java.lang.Object)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).keySet();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v0),((org.apache.commons.collections.Factory)v3));
    Object v5 = ((org.apache.commons.collections.map.AbstractMapDecorator)v4).size();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v6).putAll(((java.lang.Object)v7),((java.util.Collection)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v4).containsValue(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v3).values();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v4).size(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v6),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    ((org.apache.commons.collections.map.MultiValueMap)v3).putAll(((java.util.Map)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v6).put(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = java.util.function.Function.identity();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v9).computeIfAbsent(((java.lang.Object)v10),((java.util.function.Function)v11));
    Object v13 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v5),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v10).put(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = java.util.function.Function.identity();
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v13).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v15));
    Object v17 = ((java.util.Map)v8).putIfAbsent(((java.lang.Object)v9),((java.lang.Object)v16));
    Object v18 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((java.util.Map)v3).isEmpty();
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v6));
    Object v8 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v0).removeMapping(((java.lang.Object)v1),((java.lang.Object)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v5).size(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v8).size(((java.lang.Object)v9));
    Object v11 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = java.util.function.Function.identity();
    Object v15 = ((java.util.Map)v12).computeIfAbsent(((java.lang.Object)v13),((java.util.function.Function)v14));
    Object v16 = java.util.Comparator.reverseOrder();
    Object v17 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v16));
    Object v18 = new org.apache.commons.collections.map.MultiValueMap();
    Object v19 = new org.apache.commons.collections.map.MultiValueMap();
    Object v20 = new org.apache.commons.collections.map.MultiValueMap();
    Object v21 = ((org.apache.commons.collections.map.MultiValueMap)v18).put(((java.lang.Object)v19),((java.lang.Object)v20));
    Object v22 = java.util.function.Function.identity();
    Object v23 = java.util.function.Function.identity();
    Object v24 = ((java.util.Map)v21).computeIfAbsent(((java.lang.Object)v22),((java.util.function.Function)v23));
    Object v25 = ((java.util.Map)v15).getOrDefault(((java.lang.Object)v17),((java.lang.Object)v24));
    Object v26 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v25));
    Object v27 = new org.apache.commons.collections.map.MultiValueMap();
    Object v28 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v27));
    ((org.apache.commons.collections.map.MultiValueMap)v0).putAll(((java.util.Map)v28));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).hashCode();
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v0).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v9));
    Object v11 = java.util.Comparator.reverseOrder();
    Object v12 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v11));
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v7).containsValue(((java.lang.Object)v10),((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v13),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v4));
    Object v6 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).containsKey(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    ((org.apache.commons.collections.map.MultiValueMap)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = java.util.Comparator.reverseOrder();
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v0).size(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v7).put(((java.lang.Object)v8),((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v11).values();
    Object v13 = java.util.Comparator.reverseOrder();
    Object v14 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v13));
    Object v15 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v14));
    Object v16 = ((java.util.Map)v10).getOrDefault(((java.lang.Object)v12),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = java.util.Comparator.reverseOrder();
    Object v19 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v18));
    Object v20 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v17),((org.apache.commons.collections.Factory)v20));
    Object v22 = new org.apache.commons.collections.map.MultiValueMap();
    Object v23 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v24 = ((org.apache.commons.collections.map.MultiValueMap)v22).size(((java.lang.Object)v23));
    Object v25 = ((org.apache.commons.collections.map.AbstractMapDecorator)v21).get(((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.collections.map.AbstractMapDecorator)v21).size();
    Object v27 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v28 = ((java.util.Map)v3).replace(((java.lang.Object)v16),((java.lang.Object)v26),((java.lang.Object)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).get(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).toString();
    Object v3 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v1).values();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v1),((org.apache.commons.collections.Factory)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v4));
    Object v6 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v7 = ((org.apache.commons.collections.map.AbstractMapDecorator)v5).get(((java.lang.Object)v6));
    Object v8 = java.util.Comparator.reverseOrder();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v5).containsValue(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v10).put(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v13).isEmpty();
    Object v15 = java.util.Comparator.reverseOrder();
    Object v16 = java.util.Comparator.reverseOrder();
    Object v17 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v16));
    Object v18 = ((java.util.Map)v13).putIfAbsent(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = ((java.util.Map)v1).replace(((java.lang.Object)v9),((java.lang.Object)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.Comparator.reverseOrder();
    Object v5 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v8).put(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v11).values();
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v14).values();
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = java.util.function.Function.identity();
    Object v19 = ((java.util.Map)v16).computeIfAbsent(((java.lang.Object)v17),((java.util.function.Function)v18));
    Object v20 = ((java.util.Map)v7).replace(((java.lang.Object)v12),((java.lang.Object)v15),((java.lang.Object)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((java.util.Map)v3).hashCode();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v8).keySet();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v10).put(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v13).values();
    Object v15 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v9),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v1));
    Object v3 = ((org.apache.commons.collections.map.AbstractMapDecorator)v2).toString();
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v2).hashCode();
    Object v5 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v4),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = java.util.function.Function.identity();
    Object v5 = ((java.util.Map)v2).computeIfAbsent(((java.lang.Object)v3),((java.util.function.Function)v4));
    Object v6 = ((org.apache.commons.collections.map.AbstractMapDecorator)v5).toString();
    Object v7 = java.util.Comparator.reverseOrder();
    Object v8 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v7));
    Object v9 = ((java.util.Collection)v8).stream();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v1).putAll(((java.lang.Object)v6),((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v3));
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v1).putAll(((java.lang.Object)v2),((java.util.Collection)v4));
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v6).put(((java.lang.Object)v7),((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v9).values();
    Object v11 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.FactoryUtils.prototypeFactory(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.functors.CloneTransformer.getInstance();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v10).put(((java.lang.Object)v11),((java.lang.Object)v12));
    Object v14 = java.util.function.Function.identity();
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v13).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v15));
    Object v17 = ((java.util.Map)v8).putIfAbsent(((java.lang.Object)v9),((java.lang.Object)v16));
    Object v18 = ((java.util.Map)v1).replace(((java.lang.Object)v4),((java.lang.Object)v17));
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = java.util.Comparator.reverseOrder();
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v2).size(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.Comparator.reverseOrder();
    Object v7 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v8).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v11).values();
    Object v13 = java.util.Comparator.reverseOrder();
    Object v14 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v13));
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v11).iterator(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v5).containsValue(((java.lang.Object)v7),((java.lang.Object)v15));
    Object v17 = ((java.util.Map)v1).replace(((java.lang.Object)v4),((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).entrySet();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = java.util.Comparator.reverseOrder();
    Object v3 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).containsKey(((java.lang.Object)v3));
    Object v5 = java.util.Comparator.reverseOrder();
    Object v6 = new org.apache.commons.collections.bag.TreeBag(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.BagUtils.synchronizedSortedBag(((org.apache.commons.collections.SortedBag)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).get(((java.lang.Object)v7));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }
}
