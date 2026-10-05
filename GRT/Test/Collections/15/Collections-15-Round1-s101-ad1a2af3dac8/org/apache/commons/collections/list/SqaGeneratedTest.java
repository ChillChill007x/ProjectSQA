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
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = ((org.apache.commons.collections.list.AbstractListDecorator)v3).lastIndexOf(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v2).replaceAll(((java.util.function.UnaryOperator)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = ((java.util.List)v2).spliterator();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v7 = java.util.BitSet.valueOf(((byte[])v6));
    Object v8 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v5),((java.util.BitSet)v7));
    ((java.util.List)v2).sort(((java.util.Comparator)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 0;
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = ((java.util.Collection)v5).iterator();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v11).listIterator();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new java.util.TreeSet(((java.util.Collection)v0));
    Object v2 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v3 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v2));
    Object v4 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v1),((org.apache.commons.collections.Predicate)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = java.util.function.Predicate.isEqual(((java.lang.Object)v5));
    Object v7 = ((java.util.Collection)v4).removeIf(((java.util.function.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = 0;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = ((org.apache.commons.collections.list.SetUniqueList)v5).set((((java.lang.Integer)v6).intValue()),((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = -27;
    Object v7 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v8 = java.util.BitSet.valueOf(((byte[])v7));
    ((org.apache.commons.collections.list.SetUniqueList)v5).add((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v5).replaceAll(((java.util.function.UnaryOperator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = ((java.util.List)v5).spliterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v11).add(((java.lang.Object)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = ((java.util.List)v3).add(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v5).remove(((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v10 = java.util.BitSet.valueOf(((byte[])v9));
    Object v11 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v8),((java.util.BitSet)v10));
    ((java.util.List)v5).sort(((java.util.Comparator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new java.util.TreeSet(((java.util.Collection)v0));
    Object v2 = new org.apache.commons.collections.HashBag();
    Object v3 = java.util.function.Predicate.isEqual(((java.lang.Object)v2));
    Object v4 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v5 = java.util.BitSet.valueOf(((byte[])v4));
    Object v6 = ((java.util.function.Predicate)v3).test(((java.lang.Object)v5));
    Object v7 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new java.util.TreeSet(((java.util.Collection)v0));
    Object v2 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v3 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v2));
    Object v4 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v1),((org.apache.commons.collections.Predicate)v3));
    Object v5 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).toArray();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new org.apache.commons.collections.HashBag();
    Object v2 = new java.util.TreeSet(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v6 = java.util.BitSet.valueOf(((byte[])v5));
    Object v7 = ((java.util.function.Predicate)v4).test(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v2).removeIf(((java.util.function.Predicate)v4));
    Object v9 = ((java.util.Collection)v0).remove(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v0).parallelStream();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new java.util.TreeSet(((java.util.Collection)v0));
    Object v2 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v3 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v2));
    Object v4 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v1),((org.apache.commons.collections.Predicate)v3));
    Object v5 = ((java.util.Collection)v4).stream();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = 21;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.UnaryOperator.identity();
    Object v10 = ((java.util.Collection)v8).remove(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v7).addAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v6).iterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = ((java.util.Collection)v11).stream();
    Object v13 = -5;
    Object v14 = new org.apache.commons.collections.HashBag();
    Object v15 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v14));
    Object v16 = new java.util.ArrayList(((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v16));
    Object v18 = ((java.util.List)v17).listIterator();
    Object v19 = new org.apache.commons.collections.HashBag();
    Object v20 = new java.util.TreeSet(((java.util.Collection)v19));
    Object v21 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v17),((java.util.Set)v20));
    ((org.apache.commons.collections.list.SetUniqueList)v11).add((((java.lang.Integer)v13).intValue()),((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v8));
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v12 = java.util.BitSet.valueOf(((byte[])v11));
    Object v13 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v10),((java.util.BitSet)v12));
    ((java.util.List)v7).sort(((java.util.Comparator)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = 18;
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = new java.util.TreeSet(((java.util.Collection)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = ((org.apache.commons.collections.list.AbstractListDecorator)v10).lastIndexOf(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = 0;
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v7).set((((java.lang.Integer)v8).intValue()),((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v9 = java.util.BitSet.valueOf(((byte[])v8));
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v7).add(((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).indexOf(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v11).listIterator();
    Object v13 = 10;
    Object v14 = new org.apache.commons.collections.HashBag();
    Object v15 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v14));
    ((org.apache.commons.collections.list.SetUniqueList)v11).add((((java.lang.Integer)v13).intValue()),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = ((java.util.Collection)v6).parallelStream();
    Object v8 = -52;
    Object v9 = new org.apache.commons.collections.HashBag();
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v8).intValue()),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = ((java.util.Set)v4).addAll(((java.util.Collection)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v10 = java.util.BitSet.valueOf(((byte[])v9));
    Object v11 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v8),((java.util.BitSet)v10));
    ((java.util.List)v5).sort(((java.util.Comparator)v11));
    Object v12 = null;
    Object v13 = 25;
    Object v14 = new org.apache.commons.collections.HashBag();
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v5).set((((java.lang.Integer)v13).intValue()),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = 0;
    Object v9 = 11;
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v7).subList((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = 1;
    Object v13 = new org.apache.commons.collections.HashBag();
    Object v14 = new java.util.TreeSet(((java.util.Collection)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v11).addAll((((java.lang.Integer)v12).intValue()),((java.util.Collection)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new java.util.TreeSet(((java.util.Collection)v0));
    Object v2 = new org.apache.commons.collections.HashBag();
    Object v3 = java.util.function.Predicate.isEqual(((java.lang.Object)v2));
    Object v4 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = ((java.util.Set)v4).addAll(((java.util.Collection)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v9 = 87;
    Object v10 = new org.apache.commons.collections.HashBag();
    Object v11 = new java.util.TreeSet(((java.util.Collection)v10));
    Object v12 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v13 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v12));
    Object v14 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v11),((org.apache.commons.collections.Predicate)v13));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v8).addAll((((java.lang.Integer)v9).intValue()),((java.util.Collection)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = ((java.util.Collection)v2).stream();
    Object v4 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v2).replaceAll(((java.util.function.UnaryOperator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = 0;
    Object v13 = new org.apache.commons.collections.HashBag();
    Object v14 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = new org.apache.commons.collections.HashBag();
    Object v17 = new java.util.TreeSet(((java.util.Collection)v16));
    Object v18 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v15),((java.util.Set)v17));
    Object v19 = ((org.apache.commons.collections.list.SetUniqueList)v11).addAll((((java.lang.Integer)v12).intValue()),((java.util.Collection)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new org.apache.commons.collections.HashBag();
    Object v3 = java.util.function.Predicate.isEqual(((java.lang.Object)v2));
    Object v4 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v11 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v7 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v6).replaceAll(((java.util.function.UnaryOperator)v7));
    Object v8 = null;
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v6).asSet();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = ((java.util.List)v9).subList((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v14 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v13).replaceAll(((java.util.function.UnaryOperator)v14));
    Object v15 = null;
    Object v16 = ((org.apache.commons.collections.list.SetUniqueList)v13).asSet();
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
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
  public void test53() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = 1;
    Object v8 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).get((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = ((java.util.List)v3).add(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v7 = ((java.util.List)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v6).add(((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v11 = java.util.BitSet.valueOf(((byte[])v10));
    Object v12 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v9),((java.util.BitSet)v11));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v6).contains(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = new java.util.TreeSet(((java.util.Collection)v7));
    Object v9 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v10 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v9));
    Object v11 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v8),((org.apache.commons.collections.Predicate)v10));
    Object v12 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v4));
    Object v6 = new java.util.ArrayList(((java.util.Collection)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v8 = java.util.BitSet.valueOf(((byte[])v7));
    Object v9 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v6),((java.util.BitSet)v8));
    ((java.util.List)v3).sort(((java.util.Comparator)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = ((java.util.List)v9).subList((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v14 = ((org.apache.commons.collections.list.SetUniqueList)v6).add(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(true), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v6).iterator();
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = ((org.apache.commons.collections.list.SetUniqueList)v6).removeAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v15 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v14));
    Object v16 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v13),((org.apache.commons.collections.Predicate)v15));
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v16));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v6).asSet();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v15 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v14));
    Object v16 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v13),((org.apache.commons.collections.Predicate)v15));
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v16));
    Object v18 = -13;
    Object v19 = new org.apache.commons.collections.HashBag();
    Object v20 = ((org.apache.commons.collections.list.SetUniqueList)v17).set((((java.lang.Integer)v18).intValue()),((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v3).isEmpty();
    Object v5 = -3;
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = new java.util.TreeSet(((java.util.Collection)v6));
    ((org.apache.commons.collections.list.SetUniqueList)v3).add((((java.lang.Integer)v5).intValue()),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v11 = 0;
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v10).addAll((((java.lang.Integer)v11).intValue()),((java.util.Collection)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = 21;
    Object v13 = new org.apache.commons.collections.HashBag();
    Object v14 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v15));
    Object v17 = ((org.apache.commons.collections.list.SetUniqueList)v11).addAll((((java.lang.Integer)v12).intValue()),((java.util.Collection)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v5).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v15 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v14));
    Object v16 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v13),((org.apache.commons.collections.Predicate)v15));
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v16));
    Object v18 = new org.apache.commons.collections.HashBag();
    Object v19 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v18));
    Object v20 = new java.util.ArrayList(((java.util.Collection)v19));
    Object v21 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v22 = java.util.BitSet.valueOf(((byte[])v21));
    Object v23 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v20),((java.util.BitSet)v22));
    ((java.util.List)v17).sort(((java.util.Comparator)v23));
    Object v24 = null;
    org.junit.Assert.assertNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = ((java.util.List)v7).spliterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new java.util.TreeSet(((java.util.Collection)v0));
    Object v2 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v3 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v2));
    Object v4 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v1),((org.apache.commons.collections.Predicate)v3));
    Object v5 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new org.apache.commons.collections.HashBag();
    Object v2 = java.util.function.Predicate.isEqual(((java.lang.Object)v1));
    Object v3 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    Object v11 = ((java.util.Set)v10).toArray();
    Object v12 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v10));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v12).asSet();
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = new java.util.TreeSet(((java.util.Collection)v12));
    Object v14 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v15 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v14));
    Object v16 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v13),((org.apache.commons.collections.Predicate)v15));
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v11),((java.util.Set)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v17).listIterator();
    Object v19 = new org.apache.commons.collections.HashBag();
    Object v20 = new java.util.TreeSet(((java.util.Collection)v19));
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v17).containsAll(((java.util.Collection)v20));
    org.junit.Assert.assertEquals((Object)(true), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = ((java.util.List)v9).subList((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v9));
    Object v14 = new org.apache.commons.collections.HashBag();
    Object v15 = new java.util.TreeSet(((java.util.Collection)v14));
    Object v16 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v17 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v16));
    Object v18 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v15),((org.apache.commons.collections.Predicate)v17));
    Object v19 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v13).equals(((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.collections.list.AbstractListDecorator)v6).indexOf(((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections.HashBag();
    Object v22 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v21));
    Object v23 = new java.util.ArrayList(((java.util.Collection)v22));
    Object v24 = 0;
    Object v25 = 0;
    Object v26 = ((java.util.List)v23).subList((((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()));
    Object v27 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v23));
    Object v28 = ((org.apache.commons.collections.list.SetUniqueList)v6).contains(((java.lang.Object)v27));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v6).toArray(((java.lang.Object[])v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    ((org.apache.commons.collections.list.SetUniqueList)v6).clear();
    Object v7 = null;
    Object v8 = 0;
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v8).intValue()),((java.lang.Object)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = new org.apache.commons.collections.HashBag();
    Object v2 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v1));
    Object v3 = new java.util.ArrayList(((java.util.Collection)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = new java.util.TreeSet(((java.util.Collection)v4));
    Object v6 = ((java.util.Set)v5).toArray();
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v5));
    Object v8 = ((java.util.Collection)v0).remove(((java.lang.Object)v7));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v0).removeIf(((java.util.function.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = ((java.util.Set)v4).addAll(((java.util.Collection)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    ((org.apache.commons.collections.list.SetUniqueList)v8).clear();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = 0;
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = ((org.apache.commons.collections.list.SetUniqueList)v3).set((((java.lang.Integer)v4).intValue()),((java.lang.Object)v6));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = new java.util.TreeSet(((java.util.Collection)v11));
    Object v13 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v14 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v13));
    Object v15 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v12),((org.apache.commons.collections.Predicate)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = ((java.util.Set)v4).addAll(((java.util.Collection)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v9 = 0;
    Object v10 = ((org.apache.commons.collections.list.AbstractListDecorator)v8).get((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = new java.util.TreeSet(((java.util.Collection)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = ((org.apache.commons.collections.list.SetUniqueList)v5).add(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    Object v11 = ((java.util.Set)v10).toArray();
    Object v12 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v10));
    Object v13 = ((org.apache.commons.collections.list.SetUniqueList)v12).asSet();
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v13));
    Object v15 = 1;
    Object v16 = new org.apache.commons.collections.HashBag();
    Object v17 = new java.util.TreeSet(((java.util.Collection)v16));
    ((org.apache.commons.collections.list.SetUniqueList)v14).add((((java.lang.Integer)v15).intValue()),((java.lang.Object)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = ((java.util.Set)v4).toArray();
    Object v6 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v8));
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = new java.util.TreeSet(((java.util.Collection)v11));
    Object v13 = new org.apache.commons.collections.HashBag();
    Object v14 = new java.util.TreeSet(((java.util.Collection)v13));
    Object v15 = ((java.util.Set)v12).addAll(((java.util.Collection)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v12));
    ((org.apache.commons.collections.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = ((java.util.Set)v4).addAll(((java.util.Collection)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v8).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = new org.apache.commons.collections.HashBag();
    Object v5 = ((java.util.List)v3).add(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v3));
    Object v7 = ((java.util.List)v6).listIterator();
    Object v8 = java.util.function.UnaryOperator.identity();
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = java.util.function.Predicate.isEqual(((java.lang.Object)v11));
    Object v13 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v14 = java.util.BitSet.valueOf(((byte[])v13));
    Object v15 = ((java.util.function.Predicate)v12).test(((java.lang.Object)v14));
    Object v16 = ((java.util.Collection)v10).removeIf(((java.util.function.Predicate)v12));
    Object v17 = ((java.util.function.Function)v8).apply(((java.lang.Object)v16));
    ((java.util.List)v6).replaceAll(((java.util.function.UnaryOperator)v8));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = 38;
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v7).addAll((((java.lang.Integer)v8).intValue()),((java.util.Collection)v9));
    Object v11 = -67;
    Object v12 = new org.apache.commons.collections.HashBag();
    Object v13 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v12));
    Object v14 = new java.util.ArrayList(((java.util.Collection)v13));
    Object v15 = 0;
    Object v16 = 0;
    Object v17 = ((java.util.List)v14).subList((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v14));
    Object v19 = ((org.apache.commons.collections.list.SetUniqueList)v7).addAll((((java.lang.Integer)v11).intValue()),((java.util.Collection)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    Object v11 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v12 = 28;
    Object v13 = new org.apache.commons.collections.HashBag();
    Object v14 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = 0;
    Object v17 = 0;
    Object v18 = ((java.util.List)v15).subList((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v15));
    ((org.apache.commons.collections.list.SetUniqueList)v11).add((((java.lang.Integer)v12).intValue()),((java.lang.Object)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v6 = new org.apache.commons.collections.HashBag();
    Object v7 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = new org.apache.commons.collections.HashBag();
    Object v10 = new java.util.TreeSet(((java.util.Collection)v9));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = new java.util.TreeSet(((java.util.Collection)v11));
    Object v13 = ((java.util.Set)v10).addAll(((java.util.Collection)v12));
    Object v14 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v8),((java.util.Set)v10));
    Object v15 = 87;
    Object v16 = new org.apache.commons.collections.HashBag();
    Object v17 = new java.util.TreeSet(((java.util.Collection)v16));
    Object v18 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v19 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v18));
    Object v20 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v17),((org.apache.commons.collections.Predicate)v19));
    Object v21 = ((org.apache.commons.collections.list.SetUniqueList)v14).addAll((((java.lang.Integer)v15).intValue()),((java.util.Collection)v20));
    Object v22 = ((org.apache.commons.collections.list.SetUniqueList)v5).add(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(true), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = new java.util.TreeSet(((java.util.Collection)v11));
    Object v13 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v14 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v13));
    Object v15 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v12),((org.apache.commons.collections.Predicate)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v15));
    Object v17 = new org.apache.commons.collections.HashBag();
    Object v18 = new java.util.TreeSet(((java.util.Collection)v17));
    Object v19 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v20 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v19));
    Object v21 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v18),((org.apache.commons.collections.Predicate)v20));
    Object v22 = ((org.apache.commons.collections.list.SetUniqueList)v16).retainAll(((java.util.Collection)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = new java.util.TreeSet(((java.util.Collection)v11));
    Object v13 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v14 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v13));
    Object v15 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v12),((org.apache.commons.collections.Predicate)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v15));
    Object v17 = ((java.util.List)v16).size();
    Object v18 = ((java.util.List)v16).spliterator();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = new java.util.TreeSet(((java.util.Collection)v11));
    Object v13 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v14 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v13));
    Object v15 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v12),((org.apache.commons.collections.Predicate)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v15));
    Object v17 = 0;
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v16).listIterator((((java.lang.Integer)v17).intValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = ((java.util.List)v5).subList((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v5));
    Object v10 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v9).replaceAll(((java.util.function.UnaryOperator)v10));
    Object v11 = null;
    Object v12 = ((org.apache.commons.collections.list.SetUniqueList)v9).asSet();
    Object v13 = ((java.util.List)v2).equals(((java.lang.Object)v12));
    Object v14 = new org.apache.commons.collections.HashBag();
    Object v15 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v14));
    Object v16 = new java.util.ArrayList(((java.util.Collection)v15));
    Object v17 = new byte[]{Byte.valueOf((byte)19),Byte.valueOf((byte)0)};
    Object v18 = java.util.BitSet.valueOf(((byte[])v17));
    Object v19 = new org.apache.commons.collections.comparators.ComparatorChain(((java.util.List)v16),((java.util.BitSet)v18));
    ((java.util.List)v2).sort(((java.util.Comparator)v19));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v6 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v5));
    Object v7 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v4),((org.apache.commons.collections.Predicate)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((java.util.Set)v7).toArray(((java.lang.Object[])v8));
    Object v10 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v7));
    Object v11 = new org.apache.commons.collections.HashBag();
    Object v12 = new java.util.TreeSet(((java.util.Collection)v11));
    Object v13 = " Please check that your keys are immutable, and that you have used synchronization properly. If so, then pleaseSreport this to dev@commons.apache.org as a bug.";
    Object v14 = org.apache.commons.collections.PredicateUtils.invokerPredicate(((java.lang.String)v13));
    Object v15 = org.apache.commons.collections.set.PredicatedSortedSet.decorate(((java.util.SortedSet)v12),((org.apache.commons.collections.Predicate)v14));
    Object v16 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v15));
    Object v17 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v16).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((java.util.List)v2).subList((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v7 = new org.apache.commons.collections.HashBag();
    Object v8 = new java.util.TreeSet(((java.util.Collection)v7));
    Object v9 = ((java.util.List)v6).remove(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = new org.apache.commons.collections.HashBag();
    Object v9 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v8));
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = ((java.util.List)v10).subList((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v10));
    Object v15 = ((org.apache.commons.collections.list.SetUniqueList)v7).retainAll(((java.util.Collection)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = new org.apache.commons.collections.HashBag();
    Object v4 = new java.util.TreeSet(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = ((java.util.Set)v4).addAll(((java.util.Collection)v6));
    Object v8 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v2),((java.util.Set)v4));
    Object v9 = 0;
    Object v10 = new org.apache.commons.collections.HashBag();
    Object v11 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v12));
    Object v14 = ((java.util.List)v13).listIterator();
    Object v15 = new org.apache.commons.collections.HashBag();
    Object v16 = new java.util.TreeSet(((java.util.Collection)v15));
    Object v17 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v13),((java.util.Set)v16));
    Object v18 = ((org.apache.commons.collections.list.SetUniqueList)v8).set((((java.lang.Integer)v9).intValue()),((java.lang.Object)v17));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.HashBag();
    Object v1 = org.apache.commons.collections.bag.SynchronizedBag.decorate(((org.apache.commons.collections.Bag)v0));
    Object v2 = new java.util.ArrayList(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.list.SetUniqueList.decorate(((java.util.List)v2));
    Object v4 = ((java.util.List)v3).listIterator();
    Object v5 = new org.apache.commons.collections.HashBag();
    Object v6 = new java.util.TreeSet(((java.util.Collection)v5));
    Object v7 = new org.apache.commons.collections.list.SetUniqueList(((java.util.List)v3),((java.util.Set)v6));
    Object v8 = ((org.apache.commons.collections.collection.AbstractCollectionDecorator)v7).toString();
    Object v9 = -51;
    Object v10 = ((org.apache.commons.collections.list.SetUniqueList)v7).listIterator((((java.lang.Integer)v9).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
