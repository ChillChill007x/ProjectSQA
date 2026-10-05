package org.apache.commons.collections;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.CollectionUtils.maxSize(((java.util.Collection)v1));
    org.junit.Assert.assertEquals((Object)(-1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.CollectionUtils.exists(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = ((java.util.Collection)v1).equals(((java.lang.Object)v2));
    Object v4 = new java.lang.Object[]{null,null};
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v1),((java.lang.Object[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v5));
    Object v7 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v2),((org.apache.commons.collections.Transformer)v6));
    Object v8 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v7));
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v1),((java.util.Enumeration)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.CollectionUtils.size(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = -12;
    Object v2 = org.apache.commons.collections.CollectionUtils.get(((java.lang.Object)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.CollectionUtils.isEmpty(((java.util.Collection)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v4),((java.util.Collection)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(((java.util.Collection)v1),((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty(((java.lang.Object)v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.CollectionUtils.isFull(((java.util.Collection)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v5));
    Object v7 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v2),((org.apache.commons.collections.Transformer)v6));
    Object v8 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v7));
    Object v9 = ((java.util.Collection)v1).equals(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.isEmpty(((java.util.Collection)v1));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v4));
    org.apache.commons.collections.CollectionUtils.transform(((java.util.Collection)v1),((org.apache.commons.collections.Transformer)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.CollectionUtils.countMatches(((java.util.Collection)v7),((org.apache.commons.collections.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = ((java.util.Collection)v7).addAll(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(((java.util.Collection)v7));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null};
    org.apache.commons.collections.CollectionUtils.reverseArray(((java.lang.Object[])v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v7),((org.apache.commons.collections.Transformer)v11));
    Object v13 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v12));
    Object v14 = ((java.util.Collection)v6).add(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(((java.util.Collection)v4),((java.util.Collection)v6));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v8 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v6),((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v4),((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v2),((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v5),((org.apache.commons.collections.Transformer)v9));
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v4),((java.util.Iterator)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).iterator();
    Object v3 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v1));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = new java.lang.Object[]{null,null,null};
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v4),((java.lang.Object[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).iterator();
    Object v3 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v1));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v8 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v7));
    org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v3),((org.apache.commons.collections.Predicate)v6),((java.util.Collection)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v1),((org.apache.commons.collections.Transformer)v5),((java.util.Collection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v7),((java.util.Collection)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v1),((org.apache.commons.collections.Transformer)v5),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v10 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v17 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v16));
    Object v18 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v15),((java.util.Collection)v17));
    Object v19 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v13),((java.util.Collection)v18));
    Object v20 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v21 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v20));
    Object v22 = ((java.util.Collection)v19).addAll(((java.util.Collection)v21));
    Object v23 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(((java.util.Collection)v19));
    Object v24 = ((org.apache.commons.collections.Predicate)v11).evaluate(((java.lang.Object)v23));
    org.apache.commons.collections.CollectionUtils.filter(((java.util.Collection)v8),((org.apache.commons.collections.Predicate)v11));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = ((java.util.Collection)v3).equals(((java.lang.Object)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.isEqualCollection(((java.util.Collection)v1),((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v5));
    Object v7 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v8 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v9));
    org.apache.commons.collections.CollectionUtils.transform(((java.util.Collection)v6),((org.apache.commons.collections.Transformer)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.CollectionUtils.find(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v9),((org.apache.commons.collections.Transformer)v13),((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v18 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v17));
    Object v19 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v20 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v19));
    Object v21 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v22 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v21));
    Object v23 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v20),((java.util.Collection)v22));
    Object v24 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v18),((java.util.Collection)v23));
    Object v25 = ((java.util.Collection)v16).contains(((java.lang.Object)v24));
    Object v26 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v7),((java.util.Collection)v16));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).iterator();
    Object v3 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v1));
    Object v4 = ((java.util.Collection)v3).parallelStream();
    Object v5 = org.apache.commons.collections.CollectionUtils.getCardinalityMap(((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.CollectionUtils.countMatches(((java.util.Collection)v7),((org.apache.commons.collections.Predicate)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections.CollectionUtils.index(((java.lang.Object)v11),((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(0), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v5),((org.apache.commons.collections.Transformer)v9));
    Object v11 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v10));
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v4),((java.util.Enumeration)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v1),((org.apache.commons.collections.Transformer)v5),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v10 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v9));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v8).removeIf(((java.util.function.Predicate)v11));
    Object v13 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v14 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v13));
    Object v15 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v8),((java.util.Collection)v14));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v7),((org.apache.commons.collections.Transformer)v11));
    Object v13 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v12));
    Object v14 = ((java.util.Collection)v6).add(((java.lang.Object)v13));
    Object v15 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(((java.util.Collection)v4),((java.util.Collection)v6));
    Object v16 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty(((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v2),((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    ((java.util.Collection)v1).clear();
    Object v2 = null;
    Object v3 = org.apache.commons.collections.CollectionUtils.maxSize(((java.util.Collection)v1));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = new java.lang.Object[]{null};
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v4),((java.lang.Object[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = ((java.util.Collection)v3).spliterator();
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v3),((org.apache.commons.collections.Predicate)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    org.apache.commons.collections.CollectionUtils.selectRejected(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v4),((java.util.Collection)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v1),((org.apache.commons.collections.Transformer)v5),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v10 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.CollectionUtils.find(((java.util.Collection)v8),((org.apache.commons.collections.Predicate)v11));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v5),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v3),((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(((java.util.Collection)v1),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = ((java.util.Collection)v15).spliterator();
    Object v17 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v18 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v17));
    Object v19 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v18));
    Object v20 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v15),((org.apache.commons.collections.Predicate)v19));
    Object v21 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v13),((java.util.Collection)v20));
    Object v22 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v7),((org.apache.commons.collections.Transformer)v11),((java.util.Collection)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v1),((org.apache.commons.collections.Transformer)v5),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.isFull(((java.util.Collection)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = ((java.util.Collection)v3).spliterator();
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v3),((org.apache.commons.collections.Predicate)v7));
    Object v9 = ((java.util.Collection)v1).removeAll(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v13));
    Object v15 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v10),((org.apache.commons.collections.Transformer)v14));
    Object v16 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v15));
    Object v17 = ((org.apache.commons.collections.Transformer)v9).transform(((java.lang.Object)v16));
    Object v18 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v19 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v18));
    Object v20 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v21 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v20));
    Object v22 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v23 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v21),((java.util.Collection)v23));
    Object v25 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v19),((java.util.Collection)v24));
    Object v26 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v13));
    Object v15 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v10),((org.apache.commons.collections.Transformer)v14));
    Object v16 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v15));
    Object v17 = ((org.apache.commons.collections.Transformer)v9).transform(((java.lang.Object)v16));
    Object v18 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v19 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v18));
    Object v20 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v21 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v20));
    Object v22 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v23 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v21),((java.util.Collection)v23));
    Object v25 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v19),((java.util.Collection)v24));
    Object v26 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v25));
    Object v27 = org.apache.commons.collections.CollectionUtils.getCardinalityMap(((java.util.Collection)v26));
    org.junit.Assert.assertNotNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v4),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(((java.util.Collection)v1),((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v7),((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v17 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v16));
    Object v18 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v15),((java.util.Collection)v17));
    org.apache.commons.collections.CollectionUtils.selectRejected(((java.util.Collection)v10),((org.apache.commons.collections.Predicate)v13),((java.util.Collection)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = new java.lang.Object[]{null};
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v1),((java.lang.Object[])v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = ((java.util.Collection)v3).spliterator();
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v3),((org.apache.commons.collections.Predicate)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.isNotEmpty(((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = ((java.util.Collection)v4).iterator();
    Object v6 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v4));
    Object v7 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v2),((java.util.Collection)v6));
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.CollectionUtils.isNotEmpty(((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v4),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = ((java.util.Collection)v7).contains(((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v7));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v11),((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v9),((java.util.Collection)v14));
    org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v4),((org.apache.commons.collections.Predicate)v7),((java.util.Collection)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v14 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v13));
    Object v15 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v14));
    org.apache.commons.collections.CollectionUtils.forAllDo(((java.util.Collection)v12),((org.apache.commons.collections.Closure)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = ((java.util.Collection)v15).spliterator();
    Object v17 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v18 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v17));
    Object v19 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v18));
    Object v20 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v15),((org.apache.commons.collections.Predicate)v19));
    Object v21 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v13),((java.util.Collection)v20));
    Object v22 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v7),((org.apache.commons.collections.Transformer)v11),((java.util.Collection)v21));
    Object v23 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v24 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v23));
    Object v25 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v24));
    org.apache.commons.collections.CollectionUtils.forAllDo(((java.util.Collection)v22),((org.apache.commons.collections.Closure)v25));
    Object v26 = null;
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v5),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v3),((java.util.Collection)v8));
    Object v10 = ((java.util.Collection)v9).iterator();
    Object v11 = org.apache.commons.collections.CollectionUtils.containsAny(((java.util.Collection)v1),((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v6));
    ((java.util.Collection)v7).clear();
    Object v8 = null;
    Object v9 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v12));
    Object v14 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v9),((org.apache.commons.collections.Transformer)v13));
    Object v15 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v14));
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v7),((java.util.Enumeration)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v5));
    Object v7 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v2),((org.apache.commons.collections.Transformer)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v7),((org.apache.commons.collections.Transformer)v11),((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections.CollectionUtils.isSubCollection(((java.util.Collection)v1),((java.util.Collection)v14));
    org.junit.Assert.assertEquals((Object)(true), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v11));
    Object v13 = ((java.util.Collection)v12).iterator();
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v16 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v15));
    Object v17 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v16));
    Object v18 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v17));
    Object v19 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v14),((org.apache.commons.collections.Transformer)v18));
    Object v20 = ((java.util.Iterator)v19).next();
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v12),((java.util.Iterator)v19));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).iterator();
    Object v3 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v1));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.find(((java.util.Collection)v3),((org.apache.commons.collections.Predicate)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v11));
    Object v13 = new java.lang.Object[]{null,null,null};
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v12),((java.lang.Object[])v13));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v2),((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    ((java.util.Collection)v7).clear();
    Object v8 = null;
    Object v9 = org.apache.commons.collections.CollectionUtils.maxSize(((java.util.Collection)v7));
    Object v10 = org.apache.commons.collections.CollectionUtils.index(((java.lang.Object)v5),((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(0), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = ((java.util.Collection)v6).iterator();
    Object v8 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v6));
    Object v9 = ((java.util.Collection)v8).parallelStream();
    Object v10 = org.apache.commons.collections.CollectionUtils.getCardinalityMap(((java.util.Collection)v8));
    Object v11 = ((java.util.Collection)v4).equals(((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v17 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v16));
    Object v18 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v15),((java.util.Collection)v17));
    Object v19 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v13),((java.util.Collection)v18));
    Object v20 = org.apache.commons.collections.CollectionUtils.isSubCollection(((java.util.Collection)v4),((java.util.Collection)v19));
    org.junit.Assert.assertEquals((Object)(true), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v4),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = ((java.util.Collection)v7).contains(((java.lang.Object)v11));
    Object v13 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v7));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v16));
    Object v18 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v19 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v18));
    Object v20 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v21 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v20));
    Object v22 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v23 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v21),((java.util.Collection)v23));
    Object v25 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v19),((java.util.Collection)v24));
    Object v26 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v13),((org.apache.commons.collections.Transformer)v17),((java.util.Collection)v25));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = ((java.util.Collection)v7).addAll(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.CollectionUtils.synchronizedCollection(((java.util.Collection)v7));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = ((java.util.Collection)v15).spliterator();
    Object v17 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v18 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v17));
    Object v19 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v18));
    Object v20 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v15),((org.apache.commons.collections.Predicate)v19));
    Object v21 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v13),((java.util.Collection)v20));
    Object v22 = org.apache.commons.collections.CollectionUtils.containsAny(((java.util.Collection)v11),((java.util.Collection)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.CollectionUtils.isNotEmpty(((java.util.Collection)v4));
    Object v6 = 1;
    Object v7 = org.apache.commons.collections.CollectionUtils.get(((java.lang.Object)v5),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v5));
    Object v7 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v8 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v7));
    Object v9 = ((java.util.Collection)v8).spliterator();
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v8),((org.apache.commons.collections.Predicate)v12));
    Object v14 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v6),((java.util.Collection)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).iterator();
    Object v3 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v1));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v8 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v7));
    Object v9 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v5),((org.apache.commons.collections.Predicate)v9));
    Object v11 = org.apache.commons.collections.CollectionUtils.isProperSubCollection(((java.util.Collection)v3),((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v5),((org.apache.commons.collections.Transformer)v9));
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v13));
    Object v15 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v16 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v15));
    Object v17 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v10),((org.apache.commons.collections.Transformer)v14),((java.util.Collection)v16));
    Object v18 = org.apache.commons.collections.CollectionUtils.containsAny(((java.util.Collection)v4),((java.util.Collection)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v3),((org.apache.commons.collections.Transformer)v7),((java.util.Collection)v9));
    Object v11 = ((java.util.Collection)v1).retainAll(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v14 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v13));
    Object v15 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v14));
    Object v16 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v15));
    Object v17 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v12),((org.apache.commons.collections.Transformer)v16));
    Object v18 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v19 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v18));
    Object v20 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v19));
    Object v21 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v20));
    Object v22 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v23 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v17),((org.apache.commons.collections.Transformer)v21),((java.util.Collection)v23));
    Object v25 = org.apache.commons.collections.CollectionUtils.disjunction(((java.util.Collection)v1),((java.util.Collection)v24));
    org.junit.Assert.assertNotNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    org.apache.commons.collections.CollectionUtils.reverseArray(((java.lang.Object[])v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.CollectionUtils();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = ((java.util.Collection)v3).spliterator();
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v3),((org.apache.commons.collections.Predicate)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.disjunction(((java.util.Collection)v1),((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.CollectionUtils.size(((java.lang.Object)v0));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v13),((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v11),((java.util.Collection)v16));
    Object v18 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v19 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v18));
    Object v20 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v17),((java.util.Collection)v19));
    Object v21 = ((org.apache.commons.collections.Transformer)v9).transform(((java.lang.Object)v20));
    Object v22 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v23 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v22));
    Object v24 = ((java.util.Collection)v23).size();
    Object v25 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v26 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v25));
    Object v27 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v28 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v27));
    Object v29 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v26),((java.util.Collection)v28));
    Object v30 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v31 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v30));
    Object v32 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v31));
    Object v33 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v32));
    Object v34 = ((java.util.Collection)v29).contains(((java.lang.Object)v33));
    Object v35 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v23),((java.util.Collection)v29));
    Object v36 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v35));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v5));
    Object v7 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v2),((org.apache.commons.collections.Transformer)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v14 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v13));
    Object v15 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v14));
    Object v16 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v15));
    Object v17 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v12),((org.apache.commons.collections.Transformer)v16));
    Object v18 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v17));
    Object v19 = ((org.apache.commons.collections.Transformer)v11).transform(((java.lang.Object)v18));
    Object v20 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v21 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v20));
    Object v22 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v23 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v22));
    Object v24 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v25 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v24));
    Object v26 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v23),((java.util.Collection)v25));
    Object v27 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v21),((java.util.Collection)v26));
    Object v28 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v7),((org.apache.commons.collections.Transformer)v11),((java.util.Collection)v27));
    Object v29 = ((java.util.Collection)v1).addAll(((java.util.Collection)v28));
    Object v30 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v31 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v30));
    Object v32 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v31));
    org.apache.commons.collections.CollectionUtils.forAllDo(((java.util.Collection)v1),((org.apache.commons.collections.Closure)v32));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    ((java.util.Collection)v1).clear();
    Object v2 = null;
    Object v3 = org.apache.commons.collections.CollectionUtils.maxSize(((java.util.Collection)v1));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = ((java.util.Collection)v5).iterator();
    Object v7 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v5));
    Object v8 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v3),((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.CollectionUtils.isNotEmpty(((java.util.Collection)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.lang.Object[]{};
    org.apache.commons.collections.CollectionUtils.reverseArray(((java.lang.Object[])v0));
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = ((java.util.Collection)v3).spliterator();
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v3),((org.apache.commons.collections.Predicate)v7));
    Object v9 = org.apache.commons.collections.CollectionUtils.disjunction(((java.util.Collection)v1),((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v15 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v14));
    Object v16 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v13),((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v11),((java.util.Collection)v16));
    Object v18 = ((java.util.Collection)v17).iterator();
    Object v19 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v9),((java.util.Collection)v17));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Collection)v1),((org.apache.commons.collections.Transformer)v5),((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v10 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v9));
    Object v11 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v8),((java.util.Collection)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v1),((org.apache.commons.collections.Predicate)v5));
    Object v7 = new org.apache.commons.collections.CollectionUtils();
    Object v8 = ((java.util.Collection)v6).equals(((java.lang.Object)v7));
    Object v9 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v12));
    Object v14 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v9),((org.apache.commons.collections.Transformer)v13));
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v6),((java.util.Iterator)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = ((java.util.Collection)v4).iterator();
    Object v6 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v4));
    Object v7 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v2),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty(((java.lang.Object)v7));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = ((java.util.Collection)v1).iterator();
    Object v3 = org.apache.commons.collections.CollectionUtils.unmodifiableCollection(((java.util.Collection)v1));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v6 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v5));
    Object v7 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v7));
    Object v9 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v4),((org.apache.commons.collections.Transformer)v8));
    Object v10 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v9));
    org.apache.commons.collections.CollectionUtils.addAll(((java.util.Collection)v3),((java.util.Enumeration)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v1));
    Object v3 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v4 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v3));
    Object v5 = org.apache.commons.collections.CollectionUtils.cardinality(((java.lang.Object)v2),((java.util.Collection)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.sizeIsEmpty(((java.lang.Object)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = org.apache.commons.collections.CollectionUtils.addIgnoreNull(((java.util.Collection)v1),((java.lang.Object)v6));
    Object v8 = 0;
    Object v9 = org.apache.commons.collections.CollectionUtils.get(((java.lang.Object)v7),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v13));
    Object v15 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v10),((org.apache.commons.collections.Transformer)v14));
    Object v16 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v17 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v16));
    Object v18 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v17));
    Object v19 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v18));
    Object v20 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v21 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v20));
    Object v22 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v15),((org.apache.commons.collections.Transformer)v19),((java.util.Collection)v21));
    Object v23 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v24 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v23));
    Object v25 = java.util.function.Predicate.isEqual(((java.lang.Object)v24));
    Object v26 = ((java.util.Collection)v22).removeIf(((java.util.function.Predicate)v25));
    Object v27 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v22));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v13));
    Object v15 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v10),((org.apache.commons.collections.Transformer)v14));
    Object v16 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v17 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v16));
    Object v18 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v17));
    Object v19 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v18));
    Object v20 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v21 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v20));
    Object v22 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v15),((org.apache.commons.collections.Transformer)v19),((java.util.Collection)v21));
    Object v23 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v22));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v11));
    Object v13 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v14 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v13));
    Object v15 = ((java.util.Collection)v14).spliterator();
    Object v16 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v17 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v16));
    Object v18 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v17));
    Object v19 = org.apache.commons.collections.CollectionUtils.select(((java.util.Collection)v14),((org.apache.commons.collections.Predicate)v18));
    Object v20 = org.apache.commons.collections.CollectionUtils.subtract(((java.util.Collection)v12),((java.util.Collection)v19));
    org.apache.commons.collections.CollectionUtils.selectRejected(((java.util.Collection)v7),((org.apache.commons.collections.Predicate)v10),((java.util.Collection)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v0));
    Object v2 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v3 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v2));
    Object v4 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v5 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v4));
    Object v6 = org.apache.commons.collections.CollectionUtils.intersection(((java.util.Collection)v3),((java.util.Collection)v5));
    Object v7 = org.apache.commons.collections.CollectionUtils.union(((java.util.Collection)v1),((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v9 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v8));
    Object v10 = org.apache.commons.collections.functors.NonePredicate.getInstance(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v12 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v13 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v12));
    Object v14 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v14));
    Object v16 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v11),((org.apache.commons.collections.Transformer)v15));
    Object v17 = new org.apache.commons.collections.iterators.IteratorEnumeration(((java.util.Iterator)v16));
    Object v18 = ((org.apache.commons.collections.Predicate)v10).evaluate(((java.lang.Object)v17));
    Object v19 = org.apache.commons.collections.CollectionUtils.find(((java.util.Collection)v7),((org.apache.commons.collections.Predicate)v10));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v1 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v2 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v1));
    Object v3 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v2));
    Object v4 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v3));
    Object v5 = org.apache.commons.collections.IteratorUtils.objectGraphIterator(((java.lang.Object)v0),((org.apache.commons.collections.Transformer)v4));
    Object v6 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v7 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v6));
    Object v8 = org.apache.commons.collections.ClosureUtils.chainedClosure(((java.util.Collection)v7));
    Object v9 = org.apache.commons.collections.TransformerUtils.asTransformer(((org.apache.commons.collections.Closure)v8));
    Object v10 = org.apache.commons.collections.comparators.BooleanComparator.getFalseFirstComparator();
    Object v11 = new org.apache.commons.collections.BinaryHeap(((java.util.Comparator)v10));
    Object v12 = org.apache.commons.collections.CollectionUtils.collect(((java.util.Iterator)v5),((org.apache.commons.collections.Transformer)v9),((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections.CollectionUtils.getCardinalityMap(((java.util.Collection)v12));
    org.junit.Assert.assertNotNull(v13);
  }
}
