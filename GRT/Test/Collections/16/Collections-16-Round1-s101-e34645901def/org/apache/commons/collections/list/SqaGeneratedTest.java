package org.apache.commons.collections.list;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).hashCode();
    Object v5 = 6;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v8));
    Object v10 = ((java.util.Collection)v7).contains(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v3).addAll((((java.lang.Integer)v5).intValue()),((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = ((java.util.Collection)v2).stream();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = ((java.util.List)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.HashBag();
    ((org.apache.commons.collections.list.SetUniqueList)v4).add((((java.lang.Integer)v5).intValue()),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = ((java.util.List)v2).removeAll(((java.util.Collection)v3));
    Object v5 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v2).replaceAll(((java.util.function.UnaryOperator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v4).add(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v4).asSet();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v4).retainAll(((java.util.Collection)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v2).replaceAll(((java.util.function.UnaryOperator)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v11));
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v10).add(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v4).set((((java.lang.Integer)v5).intValue()),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new org.apache.commons.collections.HashBag();
    Object v2 = java.util.function.Predicate.isEqual(((java.lang.Object)v1));
    Object v3 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = true;
    Object v4 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v3).booleanValue()));
    ((java.util.List)v2).sort(((java.util.Comparator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).contains(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).containsAll(((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v8).containsAll(((java.util.Collection)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v4).add(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v4).asSet();
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).size();
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).toArray();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v4).asSet();
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v10).asSet();
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v12));
    Object v14 = new java.util.ArrayList(((java.util.Collection)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v5).createSetBasedOnList(((java.util.Set)v11),((java.util.List)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).add(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v5).replaceAll(((java.util.function.UnaryOperator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v5).iterator();
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v5).set((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).hashCode();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = true;
    Object v11 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v9).contains(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v3).set((((java.lang.Integer)v5).intValue()),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new org.apache.commons.collections.HashBag();
    Object v3 = java.util.function.Predicate.isEqual(((java.lang.Object)v2));
    Object v4 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v9).asSet();
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = ((java.util.List)v5).spliterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v4).add(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v4).remove(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v13).asSet();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v17));
    Object v19 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v18));
    Object v20 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v19));
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v4).createSetBasedOnList(((java.util.Set)v14),((java.util.List)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v6).booleanValue()));
    ((java.util.List)v5).sort(((java.util.Comparator)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = ((java.util.function.Predicate)v4).test(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = ((org.apache.commons.collections.list.AbstractListDecorator)v4).lastIndexOf(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((java.util.List)v9).listIterator();
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v11));
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v13));
    Object v15 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v14));
    Object v16 = ((org.apache.commons.collections.list.SetUniqueList)v15).asSet();
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v9),((java.util.Set)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v5).containsAll(((java.util.Collection)v17));
    Object v19 = -26;
    Object v20 = new org.apache.commons.collections.HashBag();
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll((((java.lang.Integer)v19).intValue()),((java.util.Collection)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v9).asSet();
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v10));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v11).add(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = 0;
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v5).listIterator((((java.lang.Integer)v6).intValue()));
    Object v8 = 1;
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    ((org.apache.commons.collections.list.SetUniqueList)v5).add((((java.lang.Integer)v8).intValue()),((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = ((java.util.Collection)v8).stream();
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v5).contains(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = new org.apache.commons.collections.HashBag();
    Object v11 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v9).remove(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.HashBag();
    Object v15 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v14));
    Object v16 = new java.util.ArrayList(((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v16));
    Object v18 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v17));
    Object v19 = ((org.apache.commons.collections.list.SetUniqueList)v18).asSet();
    Object v20 = new org.apache.commons.collections.HashBag();
    Object v21 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v20));
    Object v22 = new java.util.ArrayList(((java.util.Collection)v21));
    Object v23 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v22));
    Object v24 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v23));
    Object v25 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v24));
    Object v26 = ((org.apache.commons.collections.list.SetUniqueList)v9).createSetBasedOnList(((java.util.Set)v19),((java.util.List)v25));
    Object v27 = ((java.util.Collection)v26).parallelStream();
    Object v28 = new org.apache.commons.collections.HashBag();
    Object v29 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v28));
    Object v30 = new java.util.ArrayList(((java.util.Collection)v29));
    Object v31 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v30));
    Object v32 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v31));
    Object v33 = ((org.apache.commons.collections.list.SetUniqueList)v4).createSetBasedOnList(((java.util.Set)v26),((java.util.List)v32));
    org.junit.Assert.assertNotNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = 82;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v4).addAll((((java.lang.Integer)v5).intValue()),((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v4).set((((java.lang.Integer)v5).intValue()),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v5).listIterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = java.util.function.Predicate.isEqual(((java.lang.Object)v5));
    Object v7 = ((java.util.Collection)v4).removeIf(((java.util.function.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = -3;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v9));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v5).listIterator((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((java.util.Collection)v1).parallelStream();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = ((org.apache.commons.collections.list.AbstractListDecorator)v4).indexOf(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).hashCode();
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v10).asSet();
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v12));
    Object v14 = new java.util.ArrayList(((java.util.Collection)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v4).createSetBasedOnList(((java.util.Set)v11),((java.util.List)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v7).hashCode();
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v13).asSet();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v7).createSetBasedOnList(((java.util.Set)v14),((java.util.List)v17));
    Object v19 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v7).hashCode();
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v13).asSet();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v7).createSetBasedOnList(((java.util.Set)v14),((java.util.List)v17));
    Object v19 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v18));
    Object v20 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v19).toArray();
    Object v21 = new org.apache.commons.collections.HashBag();
    Object v22 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v19).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v4).iterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v4).asSet();
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v9).asSet();
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v11));
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v13));
    Object v15 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v14));
    Object v16 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v15));
    Object v17 = ((org.apache.commons.collections.list.SetUniqueList)v4).createSetBasedOnList(((java.util.Set)v10),((java.util.List)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = -3;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v4).set((((java.lang.Integer)v5).intValue()),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = -47;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v11).asSet();
    Object v13 = ((org.apache.commons.collections.list.AbstractListDecorator)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v12));
    Object v14 = 0;
    Object v15 = ((org.apache.commons.collections.list.AbstractListDecorator)v5).get((((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v4).subList((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -33;
    Object v9 = 52;
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v4).subList((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = ((java.util.List)v5).indexOf(((java.lang.Object)v6));
    Object v8 = true;
    Object v9 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((java.util.Comparator)v9).reversed();
    ((java.util.List)v5).sort(((java.util.Comparator)v9));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v7).iterator();
    Object v9 = ((java.util.List)v2).contains(((java.lang.Object)v8));
    Object v10 = ((java.util.List)v2).spliterator();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 20;
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v5).retainAll(((java.util.Collection)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.list.SetUniqueList)v3).iterator();
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).iterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v13).hashCode();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v17));
    Object v19 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v18));
    Object v20 = ((org.apache.commons.collections.list.SetUniqueList)v19).asSet();
    Object v21 = new org.apache.commons.collections.HashBag();
    Object v22 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v21));
    Object v23 = new java.util.ArrayList(((java.util.Collection)v22));
    Object v24 = ((org.apache.commons.collections.list.SetUniqueList)v13).createSetBasedOnList(((java.util.Set)v20),((java.util.List)v23));
    Object v25 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v24));
    Object v26 = ((org.apache.commons.collections.list.SetUniqueList)v5).add(((java.lang.Object)v25));
    org.junit.Assert.assertEquals((Object)(true), v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v10).add(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v4).set((((java.lang.Integer)v5).intValue()),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).removeAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = true;
    Object v5 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v4).booleanValue()));
    ((java.util.List)v3).sort(((java.util.Comparator)v5));
    Object v6 = null;
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v7).booleanValue()));
    ((java.util.List)v3).sort(((java.util.Comparator)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v7).hashCode();
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v13).asSet();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v7).createSetBasedOnList(((java.util.Set)v14),((java.util.List)v17));
    Object v19 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v18));
    Object v20 = new org.apache.commons.collections.HashBag();
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v19).retainAll(((java.util.Collection)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v7).hashCode();
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v13).asSet();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v7).createSetBasedOnList(((java.util.Set)v14),((java.util.List)v17));
    Object v19 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v18));
    Object v20 = ((java.util.List)v19).spliterator();
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).toArray();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).add(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = -12;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v11).asSet();
    Object v13 = new org.apache.commons.collections.HashBag();
    Object v14 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v12).equals(((java.lang.Object)v13));
    ((org.apache.commons.collections.list.SetUniqueList)v5).add((((java.lang.Integer)v6).intValue()),((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v10).asSet();
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = ((java.util.Set)v11).containsAll(((java.util.Collection)v12));
    Object v14 = new org.apache.commons.collections.HashBag();
    Object v15 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v14));
    Object v16 = new java.util.ArrayList(((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v5).createSetBasedOnList(((java.util.Set)v11),((java.util.List)v17));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v9).asSet();
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v10));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = java.util.function.Predicate.isEqual(((java.lang.Object)v12));
    Object v14 = ((java.util.Collection)v11).removeIf(((java.util.function.Predicate)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v12));
    Object v14 = new java.util.ArrayList(((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v14));
    Object v16 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v15));
    Object v17 = ((org.apache.commons.collections.list.SetUniqueList)v16).asSet();
    Object v18 = new org.apache.commons.collections.HashBag();
    Object v19 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v18));
    Object v20 = new java.util.ArrayList(((java.util.Collection)v19));
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v11).createSetBasedOnList(((java.util.Set)v17),((java.util.List)v20));
    Object v22 = new org.apache.commons.collections.HashBag();
    Object v23 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v22));
    Object v24 = new java.util.ArrayList(((java.util.Collection)v23));
    Object v25 = ((org.apache.commons.collections.list.SetUniqueList)v5).createSetBasedOnList(((java.util.Set)v21),((java.util.List)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = true;
    Object v7 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.collections.list.AbstractListDecorator)v5).indexOf(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v4).containsAll(((java.util.Collection)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v10).asSet();
    Object v12 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v10).asSet();
    Object v12 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v11));
    Object v13 = new org.apache.commons.collections.HashBag();
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v12).addAll(((java.util.Collection)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = -41;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    ((java.util.Collection)v12).clear();
    Object v13 = null;
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v12));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((java.util.List)v5).containsAll(((java.util.Collection)v10));
    Object v12 = true;
    Object v13 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v12).booleanValue()));
    ((java.util.List)v5).sort(((java.util.Comparator)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v9).asSet();
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v10));
    Object v12 = true;
    Object v13 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v12).booleanValue()));
    ((java.util.List)v11).sort(((java.util.Comparator)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v7).hashCode();
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v13).asSet();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v7).createSetBasedOnList(((java.util.Set)v14),((java.util.List)v17));
    Object v19 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v18));
    Object v20 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v19).toString();
    Object v21 = 1;
    Object v22 = new org.apache.commons.collections.HashBag();
    Object v23 = ((java.util.Collection)v22).parallelStream();
    Object v24 = ((org.apache.commons.collections.list.SetUniqueList)v19).addAll((((java.lang.Integer)v21).intValue()),((java.util.Collection)v22));
    org.junit.Assert.assertEquals((Object)(false), v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).toArray(((java.lang.Object[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = ((java.util.Collection)v4).stream();
    Object v6 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v10).asSet();
    Object v12 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v11));
    Object v13 = 29;
    Object v14 = 1;
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v12).subList((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).size();
    Object v8 = ((java.util.List)v6).spliterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v6).listIterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).isEmpty();
    Object v8 = new java.lang.Object[]{null};
    Object v9 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).toArray(((java.lang.Object[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).size();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).stream();
    Object v7 = 1;
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).listIterator((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = true;
    Object v6 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).equals(((java.lang.Object)v6));
    Object v8 = -13;
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v4).remove((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v4).subList((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = true;
    Object v8 = new org.apache.commons.collections.comparators.NullComparator((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v5));
    Object v7 = new java.util.ArrayList(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v9).asSet();
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 30;
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v8));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    ((org.apache.commons.collections.list.SetUniqueList)v4).clear();
    Object v5 = null;
    Object v6 = 0;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v4).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v3).replaceAll(((java.util.function.UnaryOperator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = java.util.function.Predicate.isEqual(((java.lang.Object)v4));
    Object v6 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }
}
