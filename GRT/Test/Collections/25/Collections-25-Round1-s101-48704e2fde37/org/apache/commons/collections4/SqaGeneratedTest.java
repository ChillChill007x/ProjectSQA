package org.apache.commons.collections4;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.chainedIterator(((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = new java.util.Iterator[]{null,null};
    Object v2 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v0),((java.util.Iterator[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = -3;
    Object v2 = org.apache.commons.collections4.IteratorUtils.get(((java.util.Iterator)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.getIterator(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = ((java.util.Iterator)v0).hasNext();
    Object v2 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v3 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v4 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v2),((org.apache.commons.collections4.Equator)v3));
    Object v5 = org.apache.commons.collections4.IteratorUtils.matchesAll(((java.util.Iterator)v0),((org.apache.commons.collections4.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = new java.util.Iterator[]{null,null,null};
    Object v2 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v0),((java.util.Iterator[])v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v3 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections4.Equator)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.matchesAny(((java.util.Iterator)v0),((org.apache.commons.collections4.Predicate)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.getIterator(((java.lang.Object)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v2 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v3 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v2));
    Object v4 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v1),((org.apache.commons.collections4.Transformer)v3));
    Object v5 = ((java.util.Collection)v4).isEmpty();
    Object v6 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v0),((java.util.Collection)v4));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.size(((java.util.Iterator)v0));
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asIterable(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = java.util.function.Function.identity();
    Object v2 = ((java.util.Comparator)v0).thenComparing(((java.util.function.Function)v1));
    Object v3 = new java.util.Iterator[]{null};
    Object v4 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v0),((java.util.Iterator[])v3));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = ((java.util.Iterator)v0).hasNext();
    Object v2 = org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v2),((org.apache.commons.collections4.Transformer)v4));
    Object v6 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1),((java.util.Collection)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v5 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v3),((org.apache.commons.collections4.Equator)v4));
    Object v6 = org.apache.commons.collections4.IteratorUtils.filteredListIterator(((java.util.ListIterator)v2),((org.apache.commons.collections4.Predicate)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(((java.util.Iterator)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.arrayIterator(((java.lang.Object)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = ((java.util.Iterator)v0).hasNext();
    Object v2 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Iterator)v2).hasNext();
    Object v4 = org.apache.commons.collections4.IteratorUtils.toArray(((java.util.Iterator)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.singletonIterator(((java.lang.Object)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{};
    Object v1 = -11;
    Object v2 = org.apache.commons.collections4.IteratorUtils.arrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.peekingIterator(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = new java.lang.Object[]{null,null,null};
    Object v2 = 0;
    Object v3 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = new java.lang.Object[]{null,null,null};
    Object v5 = 0;
    Object v6 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v0),((java.util.Iterator)v3),((java.util.Iterator)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = 0;
    Object v2 = org.apache.commons.collections4.IteratorUtils.get(((java.util.Iterator)v0),(((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.getIterator(((java.lang.Object)v0));
    Object v2 = ((java.util.Iterator)v1).next();
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.ClosureUtils.asClosure(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    ((org.apache.commons.collections4.Closure)v5).execute(((java.lang.Object)v6));
    Object v7 = null;
    org.apache.commons.collections4.IteratorUtils.apply(((java.util.Iterator)v1),((org.apache.commons.collections4.Closure)v5));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = ((java.util.Iterator)v0).hasNext();
    Object v2 = org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(((java.util.Iterator)v0));
    Object v3 = new org.apache.commons.collections4.Predicate[]{null};
    Object v4 = org.apache.commons.collections4.CollectionUtils.partition(((java.lang.Iterable)v2),((org.apache.commons.collections4.Predicate[])v3));
    Object v5 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1));
    Object v3 = org.apache.commons.collections4.IteratorUtils.toListIterator(((java.util.Iterator)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.peekingIterator(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.isEmpty(((java.util.Iterator)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.singletonIterator(((java.lang.Object)v3));
    Object v5 = 1L;
    Object v6 = org.apache.commons.collections4.IteratorUtils.boundedIterator(((java.util.Iterator)v4),(((java.lang.Long)v5).longValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1));
    Object v3 = org.apache.commons.collections4.IteratorUtils.toListIterator(((java.util.Iterator)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.isEmpty(((java.util.Iterator)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v5 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v3),((org.apache.commons.collections4.Equator)v4));
    Object v6 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v7 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v8 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v9 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v8));
    Object v10 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v7),((org.apache.commons.collections4.Transformer)v9));
    Object v11 = ((java.util.Collection)v10).isEmpty();
    Object v12 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v6),((java.util.Collection)v10));
    Object v13 = ((org.apache.commons.collections4.Predicate)v5).evaluate(((java.lang.Object)v12));
    Object v14 = org.apache.commons.collections4.IteratorUtils.filteredListIterator(((java.util.ListIterator)v2),((org.apache.commons.collections4.Predicate)v5));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.IteratorUtils.transformedIterator(((java.util.Iterator)v0),((org.apache.commons.collections4.Transformer)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = ((java.util.Iterator)v0).hasNext();
    Object v2 = org.apache.commons.collections4.IteratorUtils.toListIterator(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v3 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v1),((org.apache.commons.collections4.Equator)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.filteredIterator(((java.util.Iterator)v0),((org.apache.commons.collections4.Predicate)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1));
    Object v3 = org.apache.commons.collections4.IteratorUtils.toListIterator(((java.util.Iterator)v2));
    Object v4 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v5 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v6 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v4),((org.apache.commons.collections4.Equator)v5));
    Object v7 = org.apache.commons.collections4.IteratorUtils.matchesAll(((java.util.Iterator)v3),((org.apache.commons.collections4.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.IteratorUtils.unmodifiableListIterator(((java.util.ListIterator)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.loopingIterator(((java.util.Collection)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new java.util.Iterator[]{null};
    Object v1 = org.apache.commons.collections4.IteratorUtils.zippingIterator(((java.util.Iterator[])v0));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.unmodifiableIterator(((java.util.Iterator)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.loopingIterator(((java.util.Collection)v3));
    Object v5 = ((java.util.Iterator)v4).hasNext();
    Object v6 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v7 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v6));
    Object v8 = "Iterator must not be null";
    Object v9 = "K";
    Object v10 = "";
    Object v11 = org.apache.commons.collections4.IteratorUtils.toString(((java.util.Iterator)v4),((org.apache.commons.collections4.Transformer)v7),((java.lang.String)v8),((java.lang.String)v9),((java.lang.String)v10));
    org.junit.Assert.assertEquals((Object)("K"), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.peekingIterator(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.toArray(((java.util.Iterator)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.ClosureUtils.asClosure(((org.apache.commons.collections4.Transformer)v4));
    Object v6 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v7 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v6));
    Object v8 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v9 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v10 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v8),((org.apache.commons.collections4.Transformer)v10));
    Object v12 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v7),((java.util.Collection)v11));
    ((org.apache.commons.collections4.Closure)v5).execute(((java.lang.Object)v12));
    Object v13 = null;
    org.apache.commons.collections4.IteratorUtils.apply(((java.util.Iterator)v2),((org.apache.commons.collections4.Closure)v5));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(((java.util.Iterator)v2));
    Object v4 = 12;
    Object v5 = 0;
    Object v6 = org.apache.commons.collections4.IteratorUtils.arrayIterator(((java.lang.Object)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.IteratorUtils.size(((java.util.Iterator)v2));
    org.junit.Assert.assertEquals((Object)(3), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.apache.commons.collections4.IteratorUtils.toList(((java.util.Iterator)v2),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.singletonIterator(((java.lang.Object)v3));
    Object v5 = 1L;
    Object v6 = org.apache.commons.collections4.IteratorUtils.boundedIterator(((java.util.Iterator)v4),(((java.lang.Long)v5).longValue()));
    Object v7 = ((java.util.Iterator)v6).hasNext();
    Object v8 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v9 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v10 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v8),((org.apache.commons.collections4.Equator)v9));
    Object v11 = org.apache.commons.collections4.IteratorUtils.matchesAll(((java.util.Iterator)v6),((org.apache.commons.collections4.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v5 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v3),((org.apache.commons.collections4.Equator)v4));
    Object v6 = org.apache.commons.collections4.IteratorUtils.find(((java.util.Iterator)v2),((org.apache.commons.collections4.Predicate)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.IteratorUtils.transformedIterator(((java.util.Iterator)v2),((org.apache.commons.collections4.Transformer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v5 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v3),((org.apache.commons.collections4.Equator)v4));
    Object v6 = org.apache.commons.collections4.IteratorUtils.filteredIterator(((java.util.Iterator)v2),((org.apache.commons.collections4.Predicate)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v2 = org.apache.commons.collections4.IteratorUtils.getIterator(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v0),((java.util.Iterator)v2),((java.util.Iterator)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v2 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v0),((org.apache.commons.collections4.Equator)v1));
    Object v3 = org.apache.commons.collections4.IteratorUtils.getIterator(((java.lang.Object)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1));
    Object v3 = org.apache.commons.collections4.IteratorUtils.toListIterator(((java.util.Iterator)v2));
    Object v4 = ((java.util.Iterator)v3).hasNext();
    Object v5 = 1;
    Object v6 = org.apache.commons.collections4.IteratorUtils.get(((java.util.Iterator)v3),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = ((java.util.Iterator)v0).hasNext();
    Object v2 = 1L;
    Object v3 = org.apache.commons.collections4.IteratorUtils.skippingIterator(((java.util.Iterator)v0),(((java.lang.Long)v2).longValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.getIterator(((java.lang.Object)v0));
    Object v2 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v3 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v2));
    Object v4 = "Map must not be n";
    Object v5 = "Iterat_or getKey() can only be called after next() and before remove()";
    Object v6 = "Predicate must not be null";
    Object v7 = org.apache.commons.collections4.IteratorUtils.toString(((java.util.Iterator)v1),((org.apache.commons.collections4.Transformer)v3),((java.lang.String)v4),((java.lang.String)v5),((java.lang.String)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.ComparatorUtils.naturalComparator();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = ((java.util.Iterator)v1).hasNext();
    Object v3 = org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(((java.util.Iterator)v1));
    Object v4 = new org.apache.commons.collections4.Predicate[]{null};
    Object v5 = org.apache.commons.collections4.CollectionUtils.partition(((java.lang.Iterable)v3),((org.apache.commons.collections4.Predicate[])v4));
    Object v6 = org.apache.commons.collections4.IteratorUtils.collatedIterator(((java.util.Comparator)v0),((java.util.Collection)v5));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v2 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v1));
    Object v3 = org.apache.commons.collections4.queue.TransformedQueue.transformingQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Transformer)v2));
    Object v4 = org.apache.commons.collections4.IteratorUtils.singletonIterator(((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.IteratorUtils.asIterable(((java.util.Iterator)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v3 = ((java.util.Iterator)v2).hasNext();
    Object v4 = org.apache.commons.collections4.IteratorUtils.asMultipleUseIterable(((java.util.Iterator)v2));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null};
    Object v6 = org.apache.commons.collections4.CollectionUtils.partition(((java.lang.Iterable)v4),((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new java.lang.Object[]{null,null,null};
    Object v8 = 0;
    Object v9 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.util.Collection)v6).equals(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1),((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.apache.commons.collections4.IteratorUtils.toList(((java.util.Iterator)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.apache.commons.collections4.IteratorUtils.loopingListIterator(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v1 = org.apache.commons.collections4.IteratorUtils.asEnumeration(((java.util.Iterator)v0));
    Object v2 = org.apache.commons.collections4.IteratorUtils.asIterator(((java.util.Enumeration)v1));
    Object v3 = org.apache.commons.collections4.IteratorUtils.toListIterator(((java.util.Iterator)v2));
    Object v4 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v5 = org.apache.commons.collections4.functors.DefaultEquator.defaultEquator();
    Object v6 = new org.apache.commons.collections4.functors.EqualPredicate(((java.lang.Object)v4),((org.apache.commons.collections4.Equator)v5));
    Object v7 = org.apache.commons.collections4.IteratorUtils.find(((java.util.Iterator)v3),((org.apache.commons.collections4.Predicate)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = org.apache.commons.collections4.IteratorUtils.toList(((java.util.Iterator)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = org.apache.commons.collections4.IteratorUtils.loopingIterator(((java.util.Collection)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new java.lang.Object[]{null,null,null};
    Object v1 = 0;
    Object v2 = new org.apache.commons.collections4.iterators.ObjectArrayListIterator(((java.lang.Object[])v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = org.apache.commons.collections4.iterators.EmptyIterator.emptyIterator();
    Object v4 = org.apache.commons.collections4.TransformerUtils.constantTransformer(((java.lang.Object)v3));
    Object v5 = "Iterator getValue() can only be called after next() and before remove()";
    Object v6 = "Predicate must not b;e null";
    Object v7 = "predicate must not be null.";
    Object v8 = org.apache.commons.collections4.IteratorUtils.toString(((java.util.Iterator)v2),((org.apache.commons.collections4.Transformer)v4),((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
