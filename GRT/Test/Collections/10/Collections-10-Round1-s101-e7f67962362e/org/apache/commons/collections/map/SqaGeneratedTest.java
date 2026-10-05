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
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v8),((org.apache.commons.collections.Predicate)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v12));
    Object v14 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v11),((org.apache.commons.collections.Predicate)v13));
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v3).putAll(((java.lang.Object)v7),((java.util.Collection)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v3).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v7),((org.apache.commons.collections.Predicate)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v11).put(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.map.MultiValueMap();
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = ((org.apache.commons.collections.map.MultiValueMap)v15).put(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.map.MultiValueMap)v14).size(((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v10),((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.collections.map.MultiValueMap)v3).values();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.bag.TreeBag();
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v0).size(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v6).remove(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.bag.TreeBag();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v1).size(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v0).removeMapping(((java.lang.Object)v3),((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.bag.TreeBag();
    Object v2 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).entrySet();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((java.util.Map)v3).entrySet();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.bag.TreeBag();
    Object v2 = new org.apache.commons.collections.bag.TreeBag();
    Object v3 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v2));
    Object v4 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v1),((org.apache.commons.collections.Predicate)v3));
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v0).removeMapping(((java.lang.Object)v4),((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v7),((org.apache.commons.collections.Predicate)v9));
    Object v11 = new org.apache.commons.collections.bag.TreeBag();
    Object v12 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v10),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((java.util.Map)v3).entrySet();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v9).put(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections.Factory)v15));
    Object v17 = new org.apache.commons.collections.bag.TreeBag();
    Object v18 = ((java.util.Map)v8).remove(((java.lang.Object)v16),((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v6).remove(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.bag.TreeBag();
    Object v17 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.map.MultiValueMap();
    Object v19 = new org.apache.commons.collections.map.MultiValueMap();
    Object v20 = java.util.function.Function.identity();
    Object v21 = ((java.util.Map)v18).computeIfAbsent(((java.lang.Object)v19),((java.util.function.Function)v20));
    Object v22 = new org.apache.commons.collections.map.MultiValueMap();
    Object v23 = new org.apache.commons.collections.bag.TreeBag();
    Object v24 = ((org.apache.commons.collections.map.AbstractMapDecorator)v22).equals(((java.lang.Object)v23));
    Object v25 = ((java.util.Map)v15).replace(((java.lang.Object)v17),((java.lang.Object)v21),((java.lang.Object)v24));
    org.junit.Assert.assertEquals((Object)(false), v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).entrySet();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v7).iterator(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = ((org.apache.commons.collections.map.AbstractMapDecorator)v12).equals(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v7).iterator(((java.lang.Object)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = null;
    ((java.util.Map)v0).replaceAll(((java.util.function.BiFunction)v1));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = ((java.util.Map)v3).remove(((java.lang.Object)v4),((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    ((java.util.Map)v7).clear();
    Object v8 = null;
    Object v9 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v10 = null;
    Object v11 = ((java.util.Map)v7).computeIfPresent(((java.lang.Object)v9),((java.util.function.BiFunction)v10));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = ((java.util.Map)v7).entrySet();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections.Factory)v11));
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = new org.apache.commons.collections.bag.TreeBag();
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v13).size(((java.lang.Object)v14));
    Object v16 = ((java.util.Map)v3).replace(((java.lang.Object)v12),((java.lang.Object)v15));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v6).remove(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.bag.TreeBag();
    Object v17 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.map.MultiValueMap)v15).containsValue(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v8).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    Object v12 = ((java.util.Map)v11).entrySet();
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v11),((org.apache.commons.collections.Factory)v15));
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = new org.apache.commons.collections.map.MultiValueMap();
    Object v19 = new org.apache.commons.collections.map.MultiValueMap();
    Object v20 = ((org.apache.commons.collections.map.MultiValueMap)v17).put(((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.bag.TreeBag();
    Object v22 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v21));
    Object v23 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v22));
    Object v24 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v20),((org.apache.commons.collections.Factory)v23));
    Object v25 = new org.apache.commons.collections.bag.TreeBag();
    Object v26 = ((java.util.Map)v16).remove(((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = new org.apache.commons.collections.bag.TreeBag();
    Object v28 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v27));
    Object v29 = new org.apache.commons.collections.bag.TreeBag();
    Object v30 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v29));
    Object v31 = ((java.util.Map)v7).replace(((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v30));
    org.junit.Assert.assertEquals((Object)(false), v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    ((org.apache.commons.collections.map.MultiValueMap)v4).putAll(((java.util.Map)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).entrySet();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    ((org.apache.commons.collections.map.MultiValueMap)v4).clear();
    Object v5 = null;
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v4).values();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v6).remove(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = java.util.function.Function.identity();
    Object v19 = ((java.util.Map)v16).computeIfAbsent(((java.lang.Object)v17),((java.util.function.Function)v18));
    Object v20 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v19));
    ((org.apache.commons.collections.map.MultiValueMap)v15).putAll(((java.util.Map)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = -52;
    Object v2 = ((org.apache.commons.collections.map.MultiValueMap)v0).createCollection((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v3).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.bag.TreeBag();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v5).size(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v8).size(((java.lang.Object)v9));
    Object v11 = ((java.util.Map)v4).getOrDefault(((java.lang.Object)v7),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.bag.TreeBag();
    Object v15 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v14));
    Object v16 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v13),((org.apache.commons.collections.Predicate)v15));
    Object v17 = new org.apache.commons.collections.bag.TreeBag();
    Object v18 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v17));
    Object v19 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v16),((org.apache.commons.collections.Predicate)v18));
    Object v20 = ((org.apache.commons.collections.map.MultiValueMap)v4).putAll(((java.lang.Object)v12),((java.util.Collection)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v7).totalSize();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v3).putAll(((java.lang.Object)v8),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = ((java.util.Map)v8).entrySet();
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v8),((org.apache.commons.collections.Factory)v12));
    ((org.apache.commons.collections.map.MultiValueMap)v4).putAll(((java.util.Map)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v7).totalSize();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = -52;
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v5).createCollection((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Map)v3).replace(((java.lang.Object)v4),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v9).computeIfAbsent(((java.lang.Object)v10),((java.util.function.Function)v11));
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = java.util.function.Function.identity();
    Object v16 = ((java.util.Map)v13).computeIfAbsent(((java.lang.Object)v14),((java.util.function.Function)v15));
    Object v17 = ((org.apache.commons.collections.map.MultiValueMap)v16).totalSize();
    Object v18 = new org.apache.commons.collections.bag.TreeBag();
    Object v19 = ((org.apache.commons.collections.map.MultiValueMap)v12).putAll(((java.lang.Object)v17),((java.util.Collection)v18));
    Object v20 = new org.apache.commons.collections.bag.TreeBag();
    Object v21 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v19),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = -52;
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v4).createCollection((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((java.util.Map)v3).entrySet();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v7));
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v8).size();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = java.util.function.Function.identity();
    Object v13 = ((java.util.Map)v10).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v14 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v13));
    ((org.apache.commons.collections.map.MultiValueMap)v8).putAll(((java.util.Map)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v8).size(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v7).iterator(((java.lang.Object)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.util.function.Function.identity();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v8));
    ((org.apache.commons.collections.map.MultiValueMap)v9).clear();
    Object v10 = null;
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v9).values();
    Object v12 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v4),((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = ((org.apache.commons.collections.map.AbstractMapDecorator)v4).get(((java.lang.Object)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v7),((org.apache.commons.collections.Factory)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v11),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v6).remove(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = new org.apache.commons.collections.map.MultiValueMap();
    Object v19 = ((org.apache.commons.collections.map.MultiValueMap)v16).put(((java.lang.Object)v17),((java.lang.Object)v18));
    ((org.apache.commons.collections.map.MultiValueMap)v15).putAll(((java.util.Map)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.AbstractMapDecorator)v5).toString();
    Object v7 = ((java.util.Map)v3).remove(((java.lang.Object)v4),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = ((org.apache.commons.collections.map.AbstractMapDecorator)v8).equals(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.bag.TreeBag();
    Object v2 = new org.apache.commons.collections.bag.TreeBag();
    Object v3 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v2));
    Object v4 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v1),((org.apache.commons.collections.Predicate)v3));
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v8).put(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v12));
    Object v14 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v11),((org.apache.commons.collections.Factory)v14));
    Object v16 = ((org.apache.commons.collections.map.AbstractMapDecorator)v15).entrySet();
    Object v17 = ((java.util.Map)v0).putIfAbsent(((java.lang.Object)v7),((java.lang.Object)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.bag.TreeBag();
    Object v2 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).remove(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = -52;
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).createCollection((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v6).containsValue(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = -38;
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).createCollection((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    Object v5 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v4));
    ((java.util.Map)v0).putAll(((java.util.Map)v5));
    Object v6 = null;
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).toString();
    Object v9 = java.util.function.Function.identity();
    Object v10 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v8),((java.util.function.Function)v9));
    org.junit.Assert.assertEquals((Object)("{}"), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    ((org.apache.commons.collections.map.MultiValueMap)v3).clear();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).remove(((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v9),((org.apache.commons.collections.Predicate)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v12),((org.apache.commons.collections.Predicate)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = new org.apache.commons.collections.map.MultiValueMap();
    Object v19 = ((org.apache.commons.collections.map.MultiValueMap)v16).put(((java.lang.Object)v17),((java.lang.Object)v18));
    Object v20 = new org.apache.commons.collections.bag.TreeBag();
    Object v21 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v20));
    Object v22 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v19),((org.apache.commons.collections.Factory)v22));
    Object v24 = ((org.apache.commons.collections.map.AbstractMapDecorator)v23).entrySet();
    Object v25 = ((java.util.Map)v8).putIfAbsent(((java.lang.Object)v15),((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v25));
    org.junit.Assert.assertEquals((Object)(0), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = new org.apache.commons.collections.bag.TreeBag();
    Object v7 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v6));
    Object v8 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v5),((org.apache.commons.collections.Predicate)v7));
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v8),((org.apache.commons.collections.Predicate)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = ((java.util.Map)v4).remove(((java.lang.Object)v11),((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).hashCode();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.bag.TreeBag();
    Object v12 = ((java.util.Map)v3).replace(((java.lang.Object)v8),((java.lang.Object)v10),((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v8).toString();
    Object v10 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).get(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = -52;
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v11).createCollection((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v7).iterator(((java.lang.Object)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((java.util.Map)v3).isEmpty();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = new org.apache.commons.collections.bag.TreeBag();
    Object v7 = new org.apache.commons.collections.bag.TreeBag();
    Object v8 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v6),((org.apache.commons.collections.Predicate)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v9),((org.apache.commons.collections.Predicate)v11));
    Object v13 = ((java.util.Map)v3).putIfAbsent(((java.lang.Object)v5),((java.lang.Object)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.bag.TreeBag();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v2).put(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v9).size(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v8).remove(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.bag.TreeBag();
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = ((java.util.Map)v8).putIfAbsent(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.bag.TreeBag();
    Object v19 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.collections.map.MultiValueMap)v17).containsValue(((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.collections.map.MultiValueMap)v0).containsValue(((java.lang.Object)v1),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v1).put(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v8).size(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.bag.TreeBag();
    Object v12 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v11));
    Object v13 = ((java.util.Map)v7).remove(((java.lang.Object)v10),((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.bag.TreeBag();
    Object v15 = new org.apache.commons.collections.map.MultiValueMap();
    Object v16 = ((java.util.Map)v7).putIfAbsent(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.bag.TreeBag();
    Object v18 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.map.MultiValueMap)v16).containsValue(((java.lang.Object)v18));
    Object v20 = new org.apache.commons.collections.bag.TreeBag();
    Object v21 = ((java.util.Map)v0).remove(((java.lang.Object)v19),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = new org.apache.commons.collections.bag.TreeBag();
    Object v7 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v6));
    Object v8 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v5),((org.apache.commons.collections.Predicate)v7));
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v8),((org.apache.commons.collections.Predicate)v10));
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v12).put(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.bag.TreeBag();
    Object v17 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v16));
    Object v18 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v17));
    Object v19 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v15),((org.apache.commons.collections.Factory)v18));
    Object v20 = ((org.apache.commons.collections.map.AbstractMapDecorator)v19).entrySet();
    Object v21 = ((java.util.Map)v4).putIfAbsent(((java.lang.Object)v11),((java.lang.Object)v20));
    Object v22 = java.util.function.Function.identity();
    Object v23 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v21),((java.util.function.Function)v22));
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.bag.TreeBag();
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v6).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v5),((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = ((org.apache.commons.collections.map.AbstractMapDecorator)v9).toString();
    Object v11 = ((java.util.Map)v7).remove(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v12).put(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = -52;
    Object v19 = ((org.apache.commons.collections.map.MultiValueMap)v17).createCollection((((java.lang.Integer)v18).intValue()));
    Object v20 = ((java.util.Map)v15).replace(((java.lang.Object)v16),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.map.MultiValueMap();
    Object v22 = new org.apache.commons.collections.map.MultiValueMap();
    Object v23 = java.util.function.Function.identity();
    Object v24 = ((java.util.Map)v21).computeIfAbsent(((java.lang.Object)v22),((java.util.function.Function)v23));
    Object v25 = new org.apache.commons.collections.map.MultiValueMap();
    Object v26 = new org.apache.commons.collections.map.MultiValueMap();
    Object v27 = java.util.function.Function.identity();
    Object v28 = ((java.util.Map)v25).computeIfAbsent(((java.lang.Object)v26),((java.util.function.Function)v27));
    Object v29 = ((org.apache.commons.collections.map.MultiValueMap)v28).totalSize();
    Object v30 = new org.apache.commons.collections.bag.TreeBag();
    Object v31 = ((org.apache.commons.collections.map.MultiValueMap)v24).putAll(((java.lang.Object)v29),((java.util.Collection)v30));
    Object v32 = new org.apache.commons.collections.bag.TreeBag();
    Object v33 = ((org.apache.commons.collections.map.MultiValueMap)v15).containsValue(((java.lang.Object)v31),((java.lang.Object)v32));
    Object v34 = ((java.util.Map)v3).remove(((java.lang.Object)v11),((java.lang.Object)v33));
    org.junit.Assert.assertEquals((Object)(false), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v3).values();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v1).put(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v4),((org.apache.commons.collections.Factory)v7));
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v8).isEmpty();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = java.util.function.Function.identity();
    Object v13 = ((java.util.Map)v10).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v13).totalSize();
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v0).containsValue(((java.lang.Object)v9),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((java.util.Map)v7).entrySet();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v7),((org.apache.commons.collections.Factory)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v6).remove(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v15).values();
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.bag.TreeBag();
    Object v12 = ((org.apache.commons.collections.map.AbstractMapDecorator)v10).equals(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v7).containsValue(((java.lang.Object)v9),((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v3).containsKey(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.bag.TreeBag();
    Object v16 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v15));
    Object v17 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).entrySet();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v9).computeIfAbsent(((java.lang.Object)v10),((java.util.function.Function)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.bag.TreeBag();
    Object v15 = ((java.util.Map)v12).remove(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = java.util.function.Function.identity();
    Object v17 = ((java.util.Map)v3).replace(((java.lang.Object)v8),((java.lang.Object)v15),((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).put(((java.lang.Object)v4),((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = new org.apache.commons.collections.bag.TreeBag();
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v7).size(((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v10));
    Object v12 = ((java.util.Map)v6).remove(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = ((java.util.Map)v6).putIfAbsent(((java.lang.Object)v13),((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.bag.TreeBag();
    Object v17 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.map.AbstractMapDecorator)v15).get(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.map.AbstractMapDecorator)v15).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).toString();
    Object v9 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).size();
    org.junit.Assert.assertEquals((Object)(0), v4);
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
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).hashCode();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = -52;
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v9).createCollection((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).toString();
    org.junit.Assert.assertEquals((Object)("{}"), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = java.util.function.Function.identity();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = java.util.function.Function.identity();
    Object v12 = ((java.util.Map)v9).computeIfAbsent(((java.lang.Object)v10),((java.util.function.Function)v11));
    Object v13 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v12));
    ((org.apache.commons.collections.map.MultiValueMap)v13).clear();
    Object v14 = null;
    Object v15 = ((org.apache.commons.collections.map.MultiValueMap)v13).values();
    Object v16 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).remove(((java.lang.Object)v16));
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v9).put(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections.Factory)v15));
    Object v17 = new org.apache.commons.collections.bag.TreeBag();
    Object v18 = ((java.util.Map)v8).getOrDefault(((java.lang.Object)v16),((java.lang.Object)v17));
    Object v19 = java.util.function.Function.identity();
    Object v20 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v18),((java.util.function.Function)v19));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = java.util.function.Function.identity();
    Object v8 = ((java.util.Map)v5).computeIfAbsent(((java.lang.Object)v6),((java.util.function.Function)v7));
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v8).totalSize();
    Object v10 = ((org.apache.commons.collections.map.MultiValueMap)v3).removeMapping(((java.lang.Object)v4),((java.lang.Object)v9));
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = java.util.function.Function.identity();
    Object v4 = ((java.util.Map)v1).computeIfAbsent(((java.lang.Object)v2),((java.util.function.Function)v3));
    Object v5 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.map.AbstractMapDecorator)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.map.MultiValueMap)v8).values();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = java.util.function.Function.identity();
    Object v14 = ((java.util.Map)v11).computeIfAbsent(((java.lang.Object)v12),((java.util.function.Function)v13));
    Object v15 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v14));
    ((java.util.Map)v10).putAll(((java.util.Map)v15));
    Object v16 = null;
    Object v17 = new org.apache.commons.collections.map.MultiValueMap();
    Object v18 = ((org.apache.commons.collections.map.AbstractMapDecorator)v17).toString();
    Object v19 = java.util.function.Function.identity();
    Object v20 = ((java.util.Map)v10).computeIfAbsent(((java.lang.Object)v18),((java.util.function.Function)v19));
    Object v21 = ((org.apache.commons.collections.map.MultiValueMap)v4).containsValue(((java.lang.Object)v9),((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.collections.map.MultiValueMap)v3).containsValue(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((java.util.Map)v7).entrySet();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v7),((org.apache.commons.collections.Factory)v11));
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = new org.apache.commons.collections.map.MultiValueMap();
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v13).put(((java.lang.Object)v14),((java.lang.Object)v15));
    Object v17 = new org.apache.commons.collections.bag.TreeBag();
    Object v18 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v17));
    Object v19 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v18));
    Object v20 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v16),((org.apache.commons.collections.Factory)v19));
    Object v21 = ((org.apache.commons.collections.map.AbstractMapDecorator)v20).isEmpty();
    Object v22 = ((java.util.Map)v12).containsKey(((java.lang.Object)v21));
    Object v23 = new org.apache.commons.collections.map.MultiValueMap();
    Object v24 = new org.apache.commons.collections.bag.TreeBag();
    Object v25 = ((org.apache.commons.collections.map.AbstractMapDecorator)v23).equals(((java.lang.Object)v24));
    Object v26 = java.util.function.Function.identity();
    Object v27 = ((java.util.Map)v12).computeIfAbsent(((java.lang.Object)v25),((java.util.function.Function)v26));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).containsKey(((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.bag.TreeBag();
    Object v7 = ((org.apache.commons.collections.map.AbstractMapDecorator)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v4).values();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = -52;
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v5).createCollection((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v4).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = ((java.util.Map)v7).entrySet();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v7),((org.apache.commons.collections.Factory)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections.Factory)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = org.apache.commons.collections.map.MultiValueMap.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.bag.TreeBag();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v5).size(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = java.util.function.Function.identity();
    Object v11 = ((java.util.Map)v8).computeIfAbsent(((java.lang.Object)v9),((java.util.function.Function)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = ((org.apache.commons.collections.map.AbstractMapDecorator)v11).containsKey(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.bag.TreeBag();
    Object v15 = ((org.apache.commons.collections.map.AbstractMapDecorator)v11).equals(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.map.MultiValueMap)v4).containsValue(((java.lang.Object)v7),((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((java.util.Map)v3).entrySet();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v9).put(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v8).putAll(((java.lang.Object)v12),((java.util.Collection)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v3).getCollection(((java.lang.Object)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = ((java.util.Map)v3).entrySet();
    Object v5 = new org.apache.commons.collections.bag.TreeBag();
    Object v6 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = ((org.apache.commons.collections.map.MultiValueMap)v9).put(((java.lang.Object)v10),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections.bag.TreeBag();
    Object v14 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v12),((org.apache.commons.collections.Factory)v15));
    Object v17 = ((org.apache.commons.collections.map.AbstractMapDecorator)v16).toString();
    Object v18 = ((org.apache.commons.collections.map.AbstractMapDecorator)v16).hashCode();
    Object v19 = java.util.function.Function.identity();
    Object v20 = ((java.util.Map)v8).getOrDefault(((java.lang.Object)v18),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.map.MultiValueMap();
    Object v22 = new org.apache.commons.collections.map.MultiValueMap();
    Object v23 = java.util.function.Function.identity();
    Object v24 = ((java.util.Map)v21).computeIfAbsent(((java.lang.Object)v22),((java.util.function.Function)v23));
    Object v25 = ((org.apache.commons.collections.map.MultiValueMap)v24).totalSize();
    Object v26 = new org.apache.commons.collections.bag.TreeBag();
    Object v27 = ((org.apache.commons.collections.map.MultiValueMap)v8).containsValue(((java.lang.Object)v25),((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = java.util.function.Function.identity();
    Object v7 = ((java.util.Map)v4).computeIfAbsent(((java.lang.Object)v5),((java.util.function.Function)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.bag.TreeBag();
    Object v10 = ((org.apache.commons.collections.map.AbstractMapDecorator)v8).equals(((java.lang.Object)v9));
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = -52;
    Object v13 = ((org.apache.commons.collections.map.MultiValueMap)v11).createCollection((((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.Map)v7).getOrDefault(((java.lang.Object)v10),((java.lang.Object)v13));
    ((org.apache.commons.collections.map.MultiValueMap)v3).putAll(((java.util.Map)v7));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = java.util.function.Function.identity();
    Object v6 = ((java.util.Map)v3).computeIfAbsent(((java.lang.Object)v4),((java.util.function.Function)v5));
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v3).totalSize();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = java.util.function.Function.identity();
    Object v3 = ((java.util.Map)v0).computeIfAbsent(((java.lang.Object)v1),((java.util.function.Function)v2));
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = new org.apache.commons.collections.map.MultiValueMap();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = ((org.apache.commons.collections.map.MultiValueMap)v4).put(((java.lang.Object)v5),((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.map.AbstractMapDecorator)v7).size();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = -52;
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v9).createCollection((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Map)v3).getOrDefault(((java.lang.Object)v8),((java.lang.Object)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = ((org.apache.commons.collections.map.MultiValueMap)v0).put(((java.lang.Object)v1),((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.bag.TreeBag();
    Object v5 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.functors.PrototypeFactory.getInstance(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.MultiValueMap(((java.util.Map)v3),((org.apache.commons.collections.Factory)v6));
    Object v8 = new org.apache.commons.collections.map.MultiValueMap();
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v8).put(((java.lang.Object)v9),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.map.MultiValueMap();
    Object v13 = new org.apache.commons.collections.map.MultiValueMap();
    Object v14 = ((org.apache.commons.collections.map.MultiValueMap)v11).put(((java.lang.Object)v12),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.map.MultiValueMap();
    Object v16 = new org.apache.commons.collections.bag.TreeBag();
    Object v17 = ((org.apache.commons.collections.map.MultiValueMap)v15).size(((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.bag.TreeBag();
    Object v19 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v18));
    Object v20 = ((java.util.Map)v14).remove(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.bag.TreeBag();
    Object v22 = new org.apache.commons.collections.map.MultiValueMap();
    Object v23 = ((java.util.Map)v14).putIfAbsent(((java.lang.Object)v21),((java.lang.Object)v22));
    Object v24 = new org.apache.commons.collections.bag.TreeBag();
    Object v25 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.collections.map.AbstractMapDecorator)v23).get(((java.lang.Object)v25));
    Object v27 = ((org.apache.commons.collections.map.AbstractMapDecorator)v23).isEmpty();
    Object v28 = new org.apache.commons.collections.map.MultiValueMap();
    Object v29 = new org.apache.commons.collections.map.MultiValueMap();
    Object v30 = new org.apache.commons.collections.map.MultiValueMap();
    Object v31 = ((org.apache.commons.collections.map.MultiValueMap)v28).put(((java.lang.Object)v29),((java.lang.Object)v30));
    Object v32 = ((org.apache.commons.collections.map.AbstractMapDecorator)v31).entrySet();
    Object v33 = ((java.util.Map)v7).replace(((java.lang.Object)v27),((java.lang.Object)v32));
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = new org.apache.commons.collections.map.MultiValueMap();
    Object v5 = ((org.apache.commons.collections.map.MultiValueMap)v2).put(((java.lang.Object)v3),((java.lang.Object)v4));
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = new org.apache.commons.collections.map.MultiValueMap();
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v5).put(((java.lang.Object)v6),((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.map.MultiValueMap();
    Object v10 = new org.apache.commons.collections.bag.TreeBag();
    Object v11 = ((org.apache.commons.collections.map.MultiValueMap)v9).size(((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections.bag.TreeBag();
    Object v13 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v12));
    Object v14 = ((java.util.Map)v8).remove(((java.lang.Object)v11),((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections.bag.TreeBag();
    Object v16 = new org.apache.commons.collections.map.MultiValueMap();
    Object v17 = ((java.util.Map)v8).putIfAbsent(((java.lang.Object)v15),((java.lang.Object)v16));
    Object v18 = new org.apache.commons.collections.bag.TreeBag();
    Object v19 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.collections.map.MultiValueMap)v17).containsValue(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.bag.TreeBag();
    Object v22 = ((java.util.Map)v1).remove(((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = new org.apache.commons.collections.map.MultiValueMap();
    Object v24 = new org.apache.commons.collections.map.MultiValueMap();
    Object v25 = new org.apache.commons.collections.map.MultiValueMap();
    Object v26 = ((org.apache.commons.collections.map.MultiValueMap)v23).put(((java.lang.Object)v24),((java.lang.Object)v25));
    Object v27 = ((java.util.Map)v26).isEmpty();
    Object v28 = new org.apache.commons.collections.bag.TreeBag();
    Object v29 = new org.apache.commons.collections.bag.TreeBag();
    Object v30 = new org.apache.commons.collections.bag.TreeBag();
    Object v31 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v30));
    Object v32 = org.apache.commons.collections.bag.PredicatedSortedBag.decorate(((org.apache.commons.collections.SortedBag)v29),((org.apache.commons.collections.Predicate)v31));
    Object v33 = new org.apache.commons.collections.bag.TreeBag();
    Object v34 = org.apache.commons.collections.functors.IdentityPredicate.getInstance(((java.lang.Object)v33));
    Object v35 = org.apache.commons.collections.bag.PredicatedBag.decorate(((org.apache.commons.collections.Bag)v32),((org.apache.commons.collections.Predicate)v34));
    Object v36 = ((java.util.Map)v26).putIfAbsent(((java.lang.Object)v28),((java.lang.Object)v35));
    Object v37 = ((org.apache.commons.collections.map.MultiValueMap)v0).putAll(((java.lang.Object)v22),((java.util.Collection)v36));
    org.junit.Assert.assertEquals((Object)(false), v37);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.MultiValueMap();
    Object v1 = new org.apache.commons.collections.map.MultiValueMap();
    Object v2 = new org.apache.commons.collections.map.MultiValueMap();
    Object v3 = new org.apache.commons.collections.map.MultiValueMap();
    Object v4 = ((org.apache.commons.collections.map.MultiValueMap)v1).put(((java.lang.Object)v2),((java.lang.Object)v3));
    Object v5 = java.lang.ClassLoader.getPlatformClassLoader();
    Object v6 = new org.apache.commons.collections.map.MultiValueMap();
    Object v7 = -52;
    Object v8 = ((org.apache.commons.collections.map.MultiValueMap)v6).createCollection((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.Map)v4).replace(((java.lang.Object)v5),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections.map.MultiValueMap();
    Object v11 = new org.apache.commons.collections.map.MultiValueMap();
    Object v12 = java.util.function.Function.identity();
    Object v13 = ((java.util.Map)v10).computeIfAbsent(((java.lang.Object)v11),((java.util.function.Function)v12));
    Object v14 = new org.apache.commons.collections.map.MultiValueMap();
    Object v15 = new org.apache.commons.collections.map.MultiValueMap();
    Object v16 = java.util.function.Function.identity();
    Object v17 = ((java.util.Map)v14).computeIfAbsent(((java.lang.Object)v15),((java.util.function.Function)v16));
    Object v18 = ((org.apache.commons.collections.map.MultiValueMap)v17).totalSize();
    Object v19 = new org.apache.commons.collections.bag.TreeBag();
    Object v20 = ((org.apache.commons.collections.map.MultiValueMap)v13).putAll(((java.lang.Object)v18),((java.util.Collection)v19));
    Object v21 = new org.apache.commons.collections.bag.TreeBag();
    Object v22 = ((org.apache.commons.collections.map.MultiValueMap)v4).containsValue(((java.lang.Object)v20),((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.collections.map.MultiValueMap)v0).size(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(0), v23);
  }
}
