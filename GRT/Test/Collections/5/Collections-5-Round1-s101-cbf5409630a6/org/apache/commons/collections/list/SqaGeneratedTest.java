package org.apache.commons.collections.list;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.list.SetUniqueList)v3).listIterator();
    Object v5 = 0;
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7));
    Object v9 = ((java.util.Collection)v8).stream();
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v3).addAll((((java.lang.Integer)v5).intValue()),((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = null;
    Object v4 = java.util.Comparator.nullsLast(((java.util.Comparator)v3));
    ((java.util.List)v2).sort(((java.util.Comparator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).toString();
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v6 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v2).replaceAll(((java.util.function.UnaryOperator)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v3).containsAll(((java.util.Collection)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).add(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = null;
    Object v5 = java.util.Comparator.nullsLast(((java.util.Comparator)v4));
    Object v6 = ((org.apache.commons.collections.list.AbstractListDecorator)v3).lastIndexOf(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v3 = java.util.function.Predicate.isEqual(((java.lang.Object)v2));
    Object v4 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7));
    Object v9 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v10 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll(((java.util.Collection)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).contains(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v8).asSet();
    Object v10 = 19;
    Object v11 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v12 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v8).addAll((((java.lang.Integer)v10).intValue()),((java.util.Collection)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = ((java.util.List)v5).spliterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v6 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 15;
    Object v5 = 0;
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).subList((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7));
    Object v9 = ((org.apache.commons.collections.list.AbstractListDecorator)v5).lastIndexOf(((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = java.util.function.UnaryOperator.identity();
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v5).set((((java.lang.Integer)v10).intValue()),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = java.util.function.UnaryOperator.identity();
    Object v5 = java.util.function.UnaryOperator.identity();
    Object v6 = ((java.util.function.Function)v4).andThen(((java.util.function.Function)v5));
    ((java.util.List)v3).replaceAll(((java.util.function.UnaryOperator)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = -26;
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v7));
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).addAll(((java.util.Collection)v7));
    Object v9 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v10 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v10 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v9));
    Object v11 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10));
    Object v12 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v13 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v12));
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v13));
    Object v15 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v16 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v15));
    Object v17 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v14).addAll(((java.util.Collection)v16));
    Object v18 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v19 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v18));
    Object v20 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v14).equals(((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v8).add(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v6 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v5));
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6));
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v7),((java.util.Set)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v3).set((((java.lang.Integer)v4).intValue()),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).size();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = -39;
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).listIterator((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((java.util.List)v8).listIterator();
    Object v10 = java.util.function.UnaryOperator.identity();
    Object v11 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v12 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v11));
    Object v13 = ((java.util.function.Function)v10).apply(((java.lang.Object)v12));
    ((java.util.List)v8).replaceAll(((java.util.function.UnaryOperator)v10));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = -18;
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v7));
    ((org.apache.commons.collections.list.SetUniqueList)v5).add((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    ((org.apache.commons.collections.list.SetUniqueList)v3).add((((java.lang.Integer)v4).intValue()),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new java.lang.Object[]{null};
    Object v5 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).toArray(((java.lang.Object[])v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = 0;
    Object v11 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v12 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v9).addAll((((java.lang.Integer)v10).intValue()),((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v3).add(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = null;
    Object v7 = java.util.Comparator.nullsLast(((java.util.Comparator)v6));
    ((java.util.List)v5).sort(((java.util.Comparator)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = -66;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v3 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v2));
    Object v4 = ((java.util.Collection)v1).contains(((java.lang.Object)v3));
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v6 = java.util.function.Predicate.isEqual(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v7));
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v8));
    Object v10 = ((java.util.function.Predicate)v6).test(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = ((org.apache.commons.collections.list.AbstractListDecorator)v3).indexOf(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).toArray();
    Object v8 = -10;
    Object v9 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).get((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 22;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = new java.lang.Object[]{};
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).toArray(((java.lang.Object[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v5).removeIf(((java.util.function.Predicate)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = -3;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v9));
    Object v11 = 0;
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v6).remove((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v0));
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((java.util.Collection)v1).parallelStream();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).size();
    org.junit.Assert.assertEquals((Object)(0), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = ((org.apache.commons.collections.list.AbstractListDecorator)v5).lastIndexOf(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = -3;
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).remove((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v5).iterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v8));
    Object v10 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v13 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v11).contains(((java.lang.Object)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v6).set((((java.lang.Integer)v7).intValue()),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v6).retainAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v6).replaceAll(((java.util.function.UnaryOperator)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = ((java.util.List)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v7));
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v8));
    Object v10 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v11 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v10));
    Object v12 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v9),((java.util.Set)v11));
    Object v13 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v14 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.list.AbstractListDecorator)v12).lastIndexOf(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.list.SetUniqueList)v6).remove(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v6));
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v8));
    Object v10 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v9).isEmpty();
    Object v11 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v4));
    Object v6 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v7));
    Object v9 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).add(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(32), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = 8;
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v7));
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v8));
    Object v10 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v9).removeIf(((java.util.function.Predicate)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v5).set((((java.lang.Integer)v6).intValue()),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v0));
    Object v2 = ((java.util.Collection)v1).parallelStream();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 0;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    Object v10 = ((java.util.Collection)v9).stream();
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v6).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v3).replaceAll(((java.util.function.UnaryOperator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).subList((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = -1;
    Object v10 = null;
    Object v11 = java.util.Comparator.nullsLast(((java.util.Comparator)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v5).set((((java.lang.Integer)v9).intValue()),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 33;
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v6 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v5));
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6));
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v7),((java.util.Set)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = 22;
    Object v13 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v14 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v11).addAll((((java.lang.Integer)v12).intValue()),((java.util.Collection)v14));
    ((org.apache.commons.collections.list.SetUniqueList)v3).add((((java.lang.Integer)v4).intValue()),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((java.util.List)v8).listIterator();
    Object v10 = null;
    Object v11 = java.util.Comparator.nullsLast(((java.util.Comparator)v10));
    ((java.util.List)v8).sort(((java.util.Comparator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v0));
    Object v2 = ((java.util.Collection)v1).stream();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v10 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v8).retainAll(((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((java.util.Collection)v6).stream();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = null;
    Object v7 = java.util.Comparator.nullsLast(((java.util.Comparator)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).contains(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = null;
    Object v10 = java.util.Comparator.nullsLast(((java.util.Comparator)v9));
    ((java.util.List)v8).sort(((java.util.Comparator)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = -20;
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).remove((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v6).iterator();
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).removeAll(((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v10 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v8).addAll(((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v7));
    Object v9 = ((java.util.Collection)v8).iterator();
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).removeAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = 1;
    Object v7 = -3;
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).subList((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = 21;
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).set((((java.lang.Integer)v6).intValue()),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v0));
    Object v2 = null;
    ((java.lang.Iterable)v1).forEach(((java.util.function.Consumer)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 0;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v8));
    Object v10 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9));
    Object v11 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v12 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v11));
    Object v13 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v12));
    Object v14 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v13));
    Object v15 = new java.lang.Object[]{};
    Object v16 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v14).toArray(((java.lang.Object[])v15));
    Object v17 = ((org.apache.commons.collections.list.SetUniqueList)v6).set((((java.lang.Integer)v7).intValue()),((java.lang.Object)v16));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).toArray();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v10 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v9));
    Object v11 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10));
    Object v12 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v13 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v12));
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v14).iterator();
    Object v16 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).add(((java.lang.Object)v15));
    Object v17 = null;
    Object v18 = java.util.Comparator.nullsLast(((java.util.Comparator)v17));
    Object v19 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 24;
    Object v8 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).get((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v7));
    Object v9 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).removeAll(((java.util.Collection)v8));
    Object v10 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v11 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v10));
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v15 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v14));
    Object v16 = ((org.apache.commons.collections.list.SetUniqueList)v13).add(((java.lang.Object)v15));
    Object v17 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).lastIndexOf(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(-1), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = -8;
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).listIterator((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v0));
    Object v2 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v3 = java.util.function.Predicate.isEqual(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = ((java.util.Collection)v5).stream();
    Object v7 = ((java.util.function.Predicate)v3).test(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 2;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = null;
    Object v10 = java.util.Comparator.nullsLast(((java.util.Comparator)v9));
    Object v11 = ((java.util.Comparator)v10).reversed();
    ((java.util.List)v8).sort(((java.util.Comparator)v10));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).hashCode();
    Object v10 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v11 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v8).add(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v7));
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v10).isEmpty();
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v6).add(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(true), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v7 = 33;
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v8));
    Object v10 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = new java.lang.Object[]{null};
    Object v13 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toArray(((java.lang.Object[])v12));
    Object v14 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v15 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v14));
    Object v16 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v15));
    Object v17 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v16));
    Object v18 = 0;
    Object v19 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v20 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v17).addAll((((java.lang.Integer)v18).intValue()),((java.util.Collection)v20));
    Object v22 = ((org.apache.commons.collections.list.SetUniqueList)v11).add(((java.lang.Object)v21));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v22));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = null;
    Object v8 = java.util.Comparator.nullsLast(((java.util.Comparator)v7));
    ((java.util.List)v6).sort(((java.util.Comparator)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).toString();
    Object v8 = 1;
    Object v9 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v10 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v9));
    Object v11 = ((java.util.Collection)v10).parallelStream();
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v6).addAll((((java.lang.Integer)v8).intValue()),((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new java.lang.Object[]{null};
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).toArray(((java.lang.Object[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).toArray();
    Object v10 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v11 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v10));
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v11));
    Object v13 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v14 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v13));
    Object v15 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v12),((java.util.Set)v14));
    Object v16 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v15));
    Object v17 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v18 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v17));
    Object v19 = ((java.util.Collection)v18).iterator();
    Object v20 = ((org.apache.commons.collections.list.SetUniqueList)v16).removeAll(((java.util.Collection)v18));
    Object v21 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).equals(((java.lang.Object)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v7 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((java.util.Collection)v8).stream();
    Object v10 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v4 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = -1;
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v7));
    Object v9 = ((java.util.Collection)v8).stream();
    ((org.apache.commons.collections.list.SetUniqueList)v5).add((((java.lang.Integer)v6).intValue()),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v6 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v5));
    Object v7 = ((org.apache.commons.collections.list.AbstractListDecorator)v4).indexOf(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v5 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v1 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v0));
    Object v2 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v6 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v5));
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6));
    Object v8 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v9 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v7),((java.util.Set)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v12 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v13 = org.apache.commons.collections.set.MapBackedSet.decorate(((java.util.Map)v12));
    Object v14 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).removeAll(((java.util.Collection)v13));
    Object v15 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v16 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v15));
    Object v17 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v16));
    Object v18 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v17));
    Object v19 = new org.apache.commons.collections.map.StaticBucketMap();
    Object v20 = new org.apache.commons.collections.iterators.EntrySetMapIterator(((java.util.Map)v19));
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v18).add(((java.lang.Object)v20));
    Object v22 = ((org.apache.commons.collections.list.AbstractListDecorator)v11).lastIndexOf(((java.lang.Object)v21));
    Object v23 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).equals(((java.lang.Object)v22));
    org.junit.Assert.assertEquals((Object)(false), v23);
  }
}
