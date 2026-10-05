package org.apache.commons.collections.list;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).remove(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = 31;
    Object v5 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v6 = ((java.util.Collection)v5).toArray();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v5));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = -14;
    Object v5 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).set((((java.lang.Integer)v4).intValue()),((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).size();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v6 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v4),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v7).size();
    Object v9 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v2).replaceAll(((java.util.function.UnaryOperator)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v4 = org.apache.commons.collections.ComparatorUtils.chainedComparator(((java.util.Collection)v3));
    Object v5 = java.util.function.UnaryOperator.identity();
    Object v6 = ((java.util.Comparator)v4).thenComparing(((java.util.function.Function)v5));
    ((java.util.List)v2).sort(((java.util.Comparator)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v3),((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).remove(((java.lang.Object)v7));
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v6),((java.util.Collection)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v3).createSetBasedOnList(((java.util.Set)v5),((java.util.List)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v0));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v1).toArray(((java.lang.Object[])v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v1).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v3 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v1),((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v4).remove(((java.lang.Object)v5));
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).removeAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v2 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v6).asSet();
    Object v8 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v9),((java.util.Collection)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v6).createSetBasedOnList(((java.util.Set)v8),((java.util.List)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = 10;
    Object v5 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v6 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v7 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v5),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v3).set((((java.lang.Integer)v4).intValue()),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = 5;
    Object v8 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v9 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v8));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).add(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v7));
    Object v9 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).lastIndexOf(((java.lang.Object)v8));
    Object v10 = 0;
    Object v11 = -30;
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v6).subList((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v0));
    Object v2 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v3 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v4 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v2),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v5).remove(((java.lang.Object)v6));
    Object v8 = java.util.function.Predicate.isEqual(((java.lang.Object)v7));
    Object v9 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).toString();
    Object v8 = -34;
    Object v9 = -24;
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).subList((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v6).retainAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).retainAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v6).replaceAll(((java.util.function.UnaryOperator)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = ((java.util.List)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).add(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = java.util.function.UnaryOperator.identity();
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).remove(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v9 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v8));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).removeAll(((java.util.Collection)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = -31;
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).remove((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v3 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v1),((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v4).remove(((java.lang.Object)v5));
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v8),((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v10));
    Object v12 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v11).remove(((java.lang.Object)v12));
    Object v14 = java.util.function.Predicate.isEqual(((java.lang.Object)v13));
    Object v15 = ((java.util.function.Predicate)v7).or(((java.util.function.Predicate)v14));
    Object v16 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v7));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).containsAll(((java.util.Collection)v7));
    Object v9 = -26;
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v6).addAll((((java.lang.Integer)v9).intValue()),((java.util.Collection)v10));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = 81;
    Object v8 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v9 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v9));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v0));
    Object v2 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v1).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    ((org.apache.commons.collections.list.SetUniqueList)v6).clear();
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = ((java.util.List)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.list.SetUniqueList)v3).listIterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    Object v9 = ((java.util.List)v8).spliterator();
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = org.apache.commons.collections.ComparatorUtils.chainedComparator(((java.util.Collection)v10));
    Object v12 = ((org.apache.commons.collections.list.AbstractListDecorator)v8).lastIndexOf(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(-1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v3 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v1),((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v3));
    Object v5 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v4).remove(((java.lang.Object)v5));
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v3).add(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v0));
    Object v2 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v1).size();
    Object v3 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v8).retainAll(((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = java.util.function.UnaryOperator.identity();
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = org.apache.commons.collections.ComparatorUtils.chainedComparator(((java.util.Collection)v4));
    Object v6 = ((java.util.function.Function)v3).apply(((java.lang.Object)v5));
    ((java.util.List)v2).replaceAll(((java.util.function.UnaryOperator)v3));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = ((java.util.List)v6).equals(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = ((java.util.List)v6).equals(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v9));
    ((org.apache.commons.collections.list.SetUniqueList)v10).clear();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v0));
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v3),((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).remove(((java.lang.Object)v7));
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = ((java.util.Collection)v0).stream();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = org.apache.commons.collections.ComparatorUtils.chainedComparator(((java.util.Collection)v7));
    ((java.util.List)v6).sort(((java.util.Comparator)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v7));
    Object v9 = ((org.apache.commons.collections.list.AbstractListDecorator)v5).indexOf(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v2 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v1));
    Object v3 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v8).add(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = ((java.util.Collection)v7).stream();
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v5).removeAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v0));
    Object v2 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = 14;
    Object v8 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).get((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).toArray();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v7));
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v9),((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v12),((java.util.Set)v13));
    Object v15 = new java.lang.Object[]{};
    Object v16 = ((java.util.List)v14).toArray(((java.lang.Object[])v15));
    Object v17 = ((org.apache.commons.collections.list.SetUniqueList)v6).createSetBasedOnList(((java.util.Set)v8),((java.util.List)v14));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v8),((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v10));
    Object v12 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v13 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v12));
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v5).createSetBasedOnList(((java.util.Set)v7),((java.util.List)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = ((java.util.Collection)v0).parallelStream();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v8).iterator();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = ((org.apache.commons.collections.list.SetUniqueList)v5).iterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v1 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v0));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v3),((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v6).remove(((java.lang.Object)v7));
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = ((java.util.Collection)v0).toArray();
    Object v2 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v3 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v4 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v2),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v5).remove(((java.lang.Object)v6));
    Object v8 = java.util.function.Predicate.isEqual(((java.lang.Object)v7));
    Object v9 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v5 = ((org.apache.commons.collections.list.SetUniqueList)v3).containsAll(((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v3 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v1),((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v3));
    Object v5 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).toArray();
    Object v6 = ((java.util.Collection)v0).equals(((java.lang.Object)v5));
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v9 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v7),((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v9));
    Object v11 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v10).remove(((java.lang.Object)v11));
    Object v13 = java.util.function.Predicate.isEqual(((java.lang.Object)v12));
    Object v14 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = 0;
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = ((java.util.Collection)v7).hashCode();
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v6));
    Object v8 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v9 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v8));
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v12 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v10),((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v13).remove(((java.lang.Object)v14));
    Object v16 = java.util.function.Predicate.isEqual(((java.lang.Object)v15));
    Object v17 = ((java.util.Collection)v9).removeIf(((java.util.function.Predicate)v16));
    Object v18 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v7),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    Object v9 = ((java.util.Collection)v8).stream();
    Object v10 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).toArray();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).retainAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v9),((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v11));
    Object v13 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v12),((java.util.Set)v13));
    Object v15 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v16 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v15));
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v14),((java.util.Set)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v17).iterator();
    Object v19 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).equals(((java.lang.Object)v18));
    Object v20 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v21 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v22 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v20),((java.util.Collection)v21));
    Object v23 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v22));
    Object v24 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v25 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v23),((java.util.Set)v24));
    Object v26 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v27 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v26));
    Object v28 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v25),((java.util.Set)v27));
    Object v29 = ((java.util.Collection)v28).stream();
    Object v30 = ((org.apache.commons.collections.list.SetUniqueList)v8).retainAll(((java.util.Collection)v28));
    org.junit.Assert.assertEquals((Object)(false), v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = org.apache.commons.collections.ComparatorUtils.chainedComparator(((java.util.Collection)v10));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v8).set((((java.lang.Integer)v9).intValue()),((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v11 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v10));
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toArray(((java.lang.Object[])v12));
    Object v14 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toString();
    Object v15 = ((java.util.Set)v9).contains(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    Object v9 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v8).replaceAll(((java.util.function.UnaryOperator)v9));
    Object v10 = null;
    Object v11 = 0;
    Object v12 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v13 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v14 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v12),((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v14));
    Object v16 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v15),((java.util.Set)v16));
    Object v18 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v19 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v17),((java.util.Set)v18));
    Object v20 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v21 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v20));
    Object v22 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v23 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v24 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v22),((java.util.Collection)v23));
    Object v25 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v24));
    Object v26 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v27 = ((org.apache.commons.collections.list.SetUniqueList)v25).remove(((java.lang.Object)v26));
    Object v28 = java.util.function.Predicate.isEqual(((java.lang.Object)v27));
    Object v29 = ((java.util.Collection)v21).removeIf(((java.util.function.Predicate)v28));
    Object v30 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v19),((java.util.Set)v21));
    Object v31 = ((java.util.Collection)v30).isEmpty();
    Object v32 = ((org.apache.commons.collections.list.SetUniqueList)v8).addAll((((java.lang.Integer)v11).intValue()),((java.util.Collection)v30));
    org.junit.Assert.assertEquals((Object)(false), v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v11 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v10));
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toArray(((java.lang.Object[])v12));
    Object v14 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toString();
    Object v15 = ((java.util.Set)v9).contains(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v9));
    Object v17 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v18 = org.apache.commons.collections.ComparatorUtils.chainedComparator(((java.util.Collection)v17));
    ((java.util.List)v16).sort(((java.util.Comparator)v18));
    Object v19 = null;
    Object v20 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v16));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = ((java.util.List)v5).spliterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v7 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v8 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v6),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v9),((java.util.Set)v10));
    Object v12 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v13 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v12));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v5).removeAll(((java.util.Collection)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v11 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v10));
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toArray(((java.lang.Object[])v12));
    Object v14 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toString();
    Object v15 = ((java.util.Set)v9).contains(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v9));
    Object v17 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v16).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v12 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v10),((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v15 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v13),((java.util.Set)v14));
    Object v16 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v17 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v18 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v16).equals(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.list.AbstractListDecorator)v15).indexOf(((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.collections.list.SetUniqueList)v8).set((((java.lang.Integer)v9).intValue()),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v8));
    Object v10 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v9).replaceAll(((java.util.function.UnaryOperator)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v9).add(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v6));
    Object v8 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v8),((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v10));
    Object v12 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v13 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v12));
    Object v14 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v15 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v13),((java.util.Set)v15));
    Object v17 = ((org.apache.commons.collections.list.AbstractListDecorator)v7).indexOf(((java.lang.Object)v16));
    Object v18 = 0;
    Object v19 = ((org.apache.commons.collections.list.SetUniqueList)v7).remove((((java.lang.Integer)v18).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v7));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v12 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v10),((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v15 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v13),((java.util.Set)v14));
    Object v16 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v17 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v18 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v16).equals(((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections.list.AbstractListDecorator)v15).indexOf(((java.lang.Object)v18));
    ((org.apache.commons.collections.list.SetUniqueList)v8).add((((java.lang.Integer)v9).intValue()),((java.lang.Object)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v8));
    Object v10 = 0;
    Object v11 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v12 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v9).set((((java.lang.Integer)v10).intValue()),((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).removeAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v4));
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v7 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).isEmpty();
    Object v8 = -30;
    Object v9 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v10 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v11 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v12 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v10),((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v13).remove(((java.lang.Object)v14));
    Object v16 = java.util.function.Predicate.isEqual(((java.lang.Object)v15));
    Object v17 = ((java.util.Collection)v9).removeIf(((java.util.function.Predicate)v16));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v8).intValue()),((java.lang.Object)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v9 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v6).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v9));
    Object v11 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v12 = org.apache.commons.collections.ComparatorUtils.chainedComparator(((java.util.Collection)v11));
    ((java.util.List)v10).sort(((java.util.Comparator)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v9));
    Object v11 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v10).toString();
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v8).add(((java.lang.Object)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v10));
    Object v12 = 0;
    Object v13 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v14 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v13));
    ((org.apache.commons.collections.list.SetUniqueList)v11).add((((java.lang.Integer)v12).intValue()),((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v1 = new org.apache.commons.collections.collection.CompositeCollection();
    Object v2 = org.apache.commons.collections.ListUtils.removeAll(((java.util.Collection)v0),((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.setUniqueList(((java.util.List)v2));
    Object v4 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v4));
    Object v6 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v7 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v7));
    Object v9 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v10 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v11 = org.apache.commons.collections.set.UnmodifiableSortedSet.unmodifiableSortedSet(((java.util.SortedSet)v10));
    Object v12 = new java.lang.Object[]{null,null};
    Object v13 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toArray(((java.lang.Object[])v12));
    Object v14 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v11).toString();
    Object v15 = ((java.util.Set)v9).contains(((java.lang.Object)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v9));
    Object v17 = org.apache.commons.collections.SetUtils.emptySortedSet();
    Object v18 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v16),((java.util.Set)v17));
    org.junit.Assert.assertNotNull(v18);
  }
}
