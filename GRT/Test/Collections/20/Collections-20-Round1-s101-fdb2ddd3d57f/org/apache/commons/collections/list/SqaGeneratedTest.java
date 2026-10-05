package org.apache.commons.collections.list;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.List)v3).retainAll(((java.util.Collection)v7));
    Object v9 = java.util.Comparator.naturalOrder();
    ((java.util.List)v3).sort(((java.util.Comparator)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = ((java.util.AbstractList)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.list.TreeList)v4).toArray();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v3).add(((java.lang.Object)v7));
    Object v9 = ((java.util.AbstractCollection)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = java.util.Comparator.naturalOrder();
    ((java.util.AbstractList)v3).add((((java.lang.Integer)v4).intValue()),((java.lang.Object)v5));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = -18;
    Object v9 = ((java.util.AbstractList)v3).subList((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v3).replaceAll(((java.util.function.UnaryOperator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.List)v3).spliterator();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = ((java.util.AbstractList)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = java.util.function.Predicate.isEqual(((java.lang.Object)v4));
    Object v6 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v8).removeIf(((java.util.function.Predicate)v10));
    Object v12 = ((org.apache.commons.collections.list.TreeList)v4).contains(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((java.util.List)v3).toArray(((java.lang.Object[])v4));
    Object v6 = java.util.Comparator.naturalOrder();
    ((java.util.List)v3).sort(((java.util.Comparator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Collection)v7).toArray();
    Object v9 = ((java.util.AbstractCollection)v3).removeAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v3).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractList)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = -27;
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.collections.list.TreeList)v4).set((((java.lang.Integer)v5).intValue()),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Collection)v7).isEmpty();
    Object v9 = ((java.util.AbstractCollection)v3).addAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v9 = ((java.util.Collection)v7).equals(((java.lang.Object)v8));
    Object v10 = ((java.util.AbstractCollection)v3).containsAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = new java.lang.Object[]{null};
    Object v6 = ((java.util.AbstractCollection)v4).toArray(((java.lang.Object[])v5));
    Object v7 = 0;
    Object v8 = java.util.Comparator.naturalOrder();
    Object v9 = ((org.apache.commons.collections.list.TreeList)v4).set((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = java.util.Comparator.naturalOrder();
    Object v6 = ((org.apache.commons.collections.list.TreeList)v4).indexOf(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v3).addAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.lang.Object[]{null,null};
    Object v5 = ((java.util.AbstractCollection)v3).toArray(((java.lang.Object[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.AbstractList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v9 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v8));
    Object v10 = ((java.util.AbstractList)v7).equals(((java.lang.Object)v9));
    Object v11 = ((java.util.AbstractList)v3).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = 1;
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.util.AbstractCollection)v9).toString();
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v5).intValue()),((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = 0;
    Object v6 = ((org.apache.commons.collections.list.TreeList)v4).get((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = ((java.util.AbstractList)v3).lastIndexOf(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.list.TreeList)v4).iterator();
    Object v6 = ((org.apache.commons.collections.list.TreeList)v4).toArray();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = java.util.function.Predicate.isEqual(((java.lang.Object)v4));
    Object v6 = ((java.util.function.Predicate)v5).negate();
    Object v7 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = java.util.function.Predicate.isEqual(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.list.TreeList)v4).indexOf(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.List)v7).spliterator();
    Object v9 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.Comparator.naturalOrder();
    Object v5 = ((java.util.AbstractCollection)v3).contains(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = ((java.util.AbstractList)v3).lastIndexOf(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.list.TreeList)v4).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v8));
    Object v10 = java.util.Comparator.naturalOrder();
    Object v11 = ((org.apache.commons.collections.list.TreeList)v9).indexOf(((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections.list.TreeList)v4).contains(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 38;
    Object v5 = 0;
    Object v6 = ((java.util.AbstractList)v3).subList((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.lang.Iterable)v3).spliterator();
    Object v5 = null;
    ((java.lang.Iterable)v3).forEach(((java.util.function.Consumer)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    ((java.util.AbstractCollection)v3).clear();
    Object v4 = null;
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.Collection)v8).spliterator();
    Object v10 = ((java.util.AbstractCollection)v3).removeAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = ((java.util.AbstractList)v3).add(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v9 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v8));
    Object v10 = 1;
    Object v11 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v13 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v12));
    Object v14 = ((java.util.AbstractList)v11).equals(((java.lang.Object)v13));
    Object v15 = ((java.util.AbstractList)v7).equals(((java.lang.Object)v14));
    Object v16 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v3).containsAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = ((java.util.List)v3).listIterator((((java.lang.Integer)v4).intValue()));
    Object v6 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v3).replaceAll(((java.util.function.UnaryOperator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = null;
    ((java.lang.Iterable)v3).forEach(((java.util.function.Consumer)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractList)v3).hashCode();
    Object v5 = java.util.Comparator.naturalOrder();
    Object v6 = ((java.util.AbstractList)v3).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v3).isEmpty();
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.AbstractCollection)v3).retainAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -10;
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.AbstractList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = ((java.util.AbstractList)v3).lastIndexOf(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = java.util.function.UnaryOperator.identity();
    Object v6 = java.util.function.UnaryOperator.identity();
    Object v7 = ((java.util.function.Function)v5).andThen(((java.util.function.Function)v6));
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.lang.Object[]{null};
    Object v5 = ((java.util.AbstractCollection)v3).toArray(((java.lang.Object[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = 22;
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v12 = java.util.function.Predicate.isEqual(((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections.list.TreeList)v10).indexOf(((java.lang.Object)v12));
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v5).intValue()),((java.lang.Object)v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.Comparator.naturalOrder();
    ((java.util.List)v3).sort(((java.util.Comparator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v3).retainAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = ((java.util.AbstractCollection)v4).toArray(((java.lang.Object[])v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.UnaryOperator.identity();
    Object v5 = java.util.function.UnaryOperator.identity();
    Object v6 = ((java.util.function.Function)v4).compose(((java.util.function.Function)v5));
    ((java.util.List)v3).replaceAll(((java.util.function.UnaryOperator)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v3).removeAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Collection)v3).parallelStream();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = new java.lang.Object[]{null,null,null};
    Object v6 = ((java.util.AbstractCollection)v4).toArray(((java.lang.Object[])v5));
    Object v7 = 60;
    Object v8 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v9 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v8));
    Object v10 = 1;
    Object v11 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.AbstractCollection)v11).toString();
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = java.util.function.Predicate.isEqual(((java.lang.Object)v4));
    Object v6 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v5));
    Object v7 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v8 = java.util.function.Predicate.isEqual(((java.lang.Object)v7));
    Object v9 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v3).toString();
    Object v5 = ((java.util.AbstractList)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.AbstractList)v3).addAll((((java.lang.Integer)v4).intValue()),((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v8 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v7));
    Object v9 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Collection)v3).spliterator();
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.AbstractCollection)v3).containsAll(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v7).isEmpty();
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v9));
    Object v11 = 1;
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.AbstractCollection)v7).retainAll(((java.util.Collection)v12));
    Object v14 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.Comparator.naturalOrder();
    Object v5 = java.util.function.UnaryOperator.identity();
    Object v6 = ((java.util.Comparator)v4).thenComparing(((java.util.function.Function)v5));
    ((java.util.List)v3).sort(((java.util.Comparator)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Collection)v3).stream();
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v9));
    Object v11 = ((java.util.AbstractList)v8).equals(((java.lang.Object)v10));
    Object v12 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v9));
    Object v11 = 1;
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.AbstractCollection)v8).removeAll(((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.collections.list.TreeList)v4).contains(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = 0;
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v5).intValue()),((java.lang.Object)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = ((java.util.AbstractList)v4).subList((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v9 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v8));
    Object v10 = 1;
    Object v11 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Collection)v11).toArray();
    Object v13 = ((java.util.AbstractCollection)v7).removeAll(((java.util.Collection)v11));
    Object v14 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = ((java.util.AbstractCollection)v3).add(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v8 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v7));
    Object v9 = 1;
    Object v10 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.util.AbstractCollection)v3).addAll(((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Collection)v7).spliterator();
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v9));
    Object v11 = 1;
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.AbstractCollection)v7).containsAll(((java.util.Collection)v12));
    Object v14 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v9));
    Object v11 = 1;
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v14 = java.util.function.Predicate.isEqual(((java.lang.Object)v13));
    Object v15 = ((java.util.Collection)v12).removeIf(((java.util.function.Predicate)v14));
    Object v16 = ((org.apache.commons.collections.list.TreeList)v8).contains(((java.lang.Object)v15));
    Object v17 = ((java.util.AbstractList)v3).equals(((java.lang.Object)v16));
    Object v18 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v19 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v18));
    Object v20 = 1;
    Object v21 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v23 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v22));
    Object v24 = 1;
    Object v25 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v23),(((java.lang.Integer)v24).intValue()));
    Object v26 = ((java.util.AbstractCollection)v21).retainAll(((java.util.Collection)v25));
    Object v27 = ((java.util.AbstractList)v3).equals(((java.lang.Object)v26));
    org.junit.Assert.assertEquals((Object)(false), v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = -1;
    Object v5 = -16;
    Object v6 = ((java.util.AbstractList)v3).subList((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.Comparator.naturalOrder();
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v9));
    Object v11 = 1;
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v14 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v13));
    Object v15 = 1;
    Object v16 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v18 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v17));
    Object v19 = ((java.util.AbstractList)v16).equals(((java.lang.Object)v18));
    Object v20 = ((java.util.AbstractList)v12).equals(((java.lang.Object)v19));
    Object v21 = ((java.util.AbstractCollection)v8).remove(((java.lang.Object)v20));
    Object v22 = ((java.util.Comparator)v4).equals(((java.lang.Object)v21));
    ((java.util.List)v3).sort(((java.util.Comparator)v4));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Collection)v3).stream();
    Object v5 = 1;
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.util.AbstractList)v3).addAll((((java.lang.Integer)v5).intValue()),((java.util.Collection)v9));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.list.TreeList)v4).listIterator();
    Object v6 = ((org.apache.commons.collections.list.TreeList)v4).toArray();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((java.util.AbstractCollection)v4).toString();
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v8 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v7));
    Object v9 = 1;
    Object v10 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v12 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v11));
    Object v13 = 1;
    Object v14 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v12),(((java.lang.Integer)v13).intValue()));
    Object v15 = ((java.util.Collection)v14).spliterator();
    Object v16 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v17 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v16));
    Object v18 = 1;
    Object v19 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v17),(((java.lang.Integer)v18).intValue()));
    Object v20 = ((java.util.AbstractCollection)v14).containsAll(((java.util.Collection)v19));
    Object v21 = ((java.util.AbstractCollection)v10).remove(((java.lang.Object)v20));
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v6).intValue()),((java.lang.Object)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = ((java.util.AbstractCollection)v3).toArray(((java.lang.Object[])v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((java.util.AbstractList)v3).subList((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = new java.lang.Object[]{null,null};
    Object v6 = ((java.util.AbstractCollection)v4).toArray(((java.lang.Object[])v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v9 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v8));
    Object v10 = 1;
    Object v11 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v13 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v12));
    Object v14 = 1;
    Object v15 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.util.AbstractCollection)v11).add(((java.lang.Object)v15));
    Object v17 = ((java.util.AbstractCollection)v11).isEmpty();
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v11 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v10));
    Object v12 = 1;
    Object v13 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v15 = java.util.function.Predicate.isEqual(((java.lang.Object)v14));
    Object v16 = ((java.util.Collection)v13).removeIf(((java.util.function.Predicate)v15));
    Object v17 = ((org.apache.commons.collections.list.TreeList)v9).contains(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections.list.TreeList)v4).contains(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.Comparator.naturalOrder();
    ((java.util.List)v3).sort(((java.util.Comparator)v4));
    Object v5 = null;
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v11 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v10));
    Object v12 = 1;
    Object v13 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.AbstractCollection)v9).removeAll(((java.util.Collection)v13));
    Object v15 = ((java.util.AbstractList)v3).lastIndexOf(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(-1), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Collection)v3).stream();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    ((org.apache.commons.collections.list.TreeList)v4).clear();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((java.util.List)v4).spliterator();
    Object v6 = -40;
    Object v7 = java.util.function.UnaryOperator.identity();
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v6).intValue()),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.AbstractCollection)v7).isEmpty();
    Object v9 = ((java.util.AbstractList)v3).lastIndexOf(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.lang.Object[]{null};
    Object v9 = ((java.util.AbstractCollection)v7).toArray(((java.lang.Object[])v8));
    Object v10 = ((java.util.AbstractList)v3).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.Collection)v3).retainAll(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.util.List)v3).addAll(((java.util.Collection)v7));
    Object v9 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v3).replaceAll(((java.util.function.UnaryOperator)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractList)v3).iterator();
    Object v5 = 1;
    Object v6 = -16;
    Object v7 = ((java.util.AbstractList)v3).subList((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = java.util.function.Predicate.isEqual(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.function.Predicate)v5).or(((java.util.function.Predicate)v7));
    Object v9 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v10 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v9));
    Object v11 = 1;
    Object v12 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.AbstractCollection)v8).removeAll(((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.collections.list.TreeList)v4).indexOf(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(-1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((java.util.AbstractCollection)v4).isEmpty();
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v11 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v10));
    Object v12 = 1;
    Object v13 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.Collection)v9).retainAll(((java.util.Collection)v13));
    Object v15 = ((java.util.AbstractCollection)v4).containsAll(((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = java.util.Comparator.naturalOrder();
    Object v6 = ((java.util.AbstractList)v4).add(((java.lang.Object)v5));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.collections.list.TreeList)v4).get((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertEquals((Object)(java.util.Comparators.NaturalOrderComparator.INSTANCE), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v5 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v9 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v8));
    Object v10 = 1;
    Object v11 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.util.Collection)v11).parallelStream();
    Object v13 = ((java.util.Collection)v7).remove(((java.lang.Object)v12));
    Object v14 = ((java.util.AbstractCollection)v3).retainAll(((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.list.TreeList)v4).iterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v6 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v5));
    Object v7 = 1;
    Object v8 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v8));
    Object v10 = ((org.apache.commons.collections.list.TreeList)v9).size();
    Object v11 = ((org.apache.commons.collections.list.TreeList)v4).contains(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.list.TreeList)v4).listIterator();
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v11 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v10));
    Object v12 = 1;
    Object v13 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = ((java.util.List)v13).spliterator();
    Object v15 = ((java.util.AbstractCollection)v9).remove(((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections.list.TreeList)v4).indexOf(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(-1), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    Object v5 = -19;
    Object v6 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v7 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v6));
    Object v8 = 1;
    Object v9 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v11 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v10));
    Object v12 = 1;
    Object v13 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v11),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.lang.Object[]{null};
    Object v15 = ((java.util.AbstractCollection)v13).toArray(((java.lang.Object[])v14));
    Object v16 = ((java.util.AbstractList)v9).equals(((java.lang.Object)v15));
    ((org.apache.commons.collections.list.TreeList)v4).add((((java.lang.Integer)v5).intValue()),((java.lang.Object)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.apache.commons.collections.iterators.EmptyMapIterator.emptyMapIterator();
    Object v1 = org.apache.commons.collections.iterators.UnmodifiableMapIterator.unmodifiableMapIterator(((org.apache.commons.collections.MapIterator)v0));
    Object v2 = 1;
    Object v3 = org.apache.commons.collections.IteratorUtils.toList(((java.util.Iterator)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.apache.commons.collections.list.TreeList(((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v4);
  }
}
