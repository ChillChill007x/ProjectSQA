package org.apache.commons.collections4.list;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v6),((org.apache.commons.collections4.Predicate)v8));
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v5).removeIf(((java.util.function.Predicate)v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = ((org.apache.commons.collections4.list.SetUniqueList)v5).remove(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = 1;
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = ((org.apache.commons.collections4.list.SetUniqueList)v5).set((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v12 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v11),((org.apache.commons.collections4.Predicate)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = ((org.apache.commons.collections4.list.SetUniqueList)v5).createSetBasedOnList(((java.util.Set)v10),((java.util.List)v15));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = 0;
    Object v7 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v8 = ((org.apache.commons.collections4.list.SetUniqueList)v5).addAll((((java.lang.Integer)v6).intValue()),((java.util.Collection)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = -22;
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = ((org.apache.commons.collections4.list.SetUniqueList)v5).set((((java.lang.Integer)v6).intValue()),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = ((org.apache.commons.collections4.list.SetUniqueList)v5).remove(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = ((java.util.List)v4).spliterator();
    Object v6 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v6),((org.apache.commons.collections4.Predicate)v8));
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = ((org.apache.commons.collections4.list.SetUniqueList)v5).add(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v5),((org.apache.commons.collections4.Predicate)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v12 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v11),((org.apache.commons.collections4.Predicate)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = java.util.function.Predicate.isEqual(((java.lang.Object)v15));
    Object v17 = ((java.util.Collection)v10).removeIf(((java.util.function.Predicate)v16));
    Object v18 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v19 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v18));
    Object v20 = ((org.apache.commons.collections4.list.SetUniqueList)v10).remove(((java.lang.Object)v19));
    Object v21 = ((java.util.List)v4).add(((java.lang.Object)v20));
    Object v22 = ((java.util.List)v4).spliterator();
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v14 = ((java.util.Collection)v13).isEmpty();
    Object v15 = ((org.apache.commons.collections4.list.SetUniqueList)v12).retainAll(((java.util.Collection)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v14 = ((org.apache.commons.collections4.list.AbstractListDecorator)v12).lastIndexOf(((java.lang.Object)v13));
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = ((org.apache.commons.collections4.list.SetUniqueList)v12).removeAll(((java.util.Collection)v19));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 0;
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = ((org.apache.commons.collections4.list.SetUniqueList)v6).set((((java.lang.Integer)v7).intValue()),((java.lang.Object)v9));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = 0;
    Object v14 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v14),((org.apache.commons.collections4.Predicate)v16));
    Object v18 = new java.util.ArrayList(((java.util.Collection)v17));
    ((org.apache.commons.collections4.list.SetUniqueList)v12).add((((java.lang.Integer)v13).intValue()),((java.lang.Object)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.collections4.list.SetUniqueList)v6).listIterator((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v5),((org.apache.commons.collections4.Predicate)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v4).removeIf(((java.util.function.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = ((java.util.List)v6).spliterator();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v4 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v3));
    Object v5 = java.util.Set.of(((java.lang.Object)v2),((java.lang.Object)v4));
    Object v6 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v12));
    Object v14 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v14));
    Object v16 = java.util.Set.of(((java.lang.Object)v13),((java.lang.Object)v15));
    Object v17 = ((java.util.Collection)v11).equals(((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections4.list.SetUniqueList)v6).removeAll(((java.util.Collection)v11));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections4.list.SetUniqueList)v13).iterator();
    Object v15 = 0;
    Object v16 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v16));
    Object v18 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v19 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v18));
    Object v20 = java.util.Set.of(((java.lang.Object)v17),((java.lang.Object)v19));
    ((org.apache.commons.collections4.list.SetUniqueList)v13).add((((java.lang.Integer)v15).intValue()),((java.lang.Object)v20));
    Object v21 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = 1;
    Object v15 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v16 = ((org.apache.commons.collections4.list.SetUniqueList)v13).set((((java.lang.Integer)v14).intValue()),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v7),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = java.util.function.Predicate.isEqual(((java.lang.Object)v11));
    Object v13 = ((java.util.Collection)v6).removeIf(((java.util.function.Predicate)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v14 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v14));
    Object v16 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v13),((org.apache.commons.collections4.Predicate)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = ((org.apache.commons.collections4.list.AbstractListDecorator)v12).lastIndexOf(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(-1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v5),((org.apache.commons.collections4.Predicate)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v12 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v11),((org.apache.commons.collections4.Predicate)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = java.util.function.Predicate.isEqual(((java.lang.Object)v15));
    Object v17 = ((java.util.function.Predicate)v10).or(((java.util.function.Predicate)v16));
    Object v18 = ((java.util.Collection)v4).removeIf(((java.util.function.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = ((java.util.Collection)v3).parallelStream();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = -998372832;
    Object v8 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v8),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v13));
    Object v15 = ((org.apache.commons.collections4.list.SetUniqueList)v6).set((((java.lang.Integer)v7).intValue()),((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v14 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v14));
    Object v16 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v13),((org.apache.commons.collections4.Predicate)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v17));
    Object v19 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v18));
    Object v20 = ((org.apache.commons.collections4.list.SetUniqueList)v12).add(((java.lang.Object)v19));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v14));
    Object v16 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v16));
    Object v18 = java.util.Set.of(((java.lang.Object)v15),((java.lang.Object)v17));
    Object v19 = ((org.apache.commons.collections4.list.SetUniqueList)v13).removeAll(((java.util.Collection)v18));
    Object v20 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v21 = ((org.apache.commons.collections4.list.SetUniqueList)v13).retainAll(((java.util.Collection)v20));
    org.junit.Assert.assertEquals((Object)(false), v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = ((org.apache.commons.collections4.list.SetUniqueList)v12).add(((java.lang.Object)v14));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = ((java.util.List)v4).spliterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v7),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = ((java.util.Collection)v17).stream();
    Object v19 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v12),((java.util.Set)v17));
    Object v20 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v19));
    Object v21 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v22 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v21));
    Object v23 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v24 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v23));
    Object v25 = java.util.Set.of(((java.lang.Object)v22),((java.lang.Object)v24));
    Object v26 = ((org.apache.commons.collections4.list.SetUniqueList)v20).removeAll(((java.util.Collection)v25));
    Object v27 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v28 = ((org.apache.commons.collections4.list.SetUniqueList)v20).retainAll(((java.util.Collection)v27));
    Object v29 = ((org.apache.commons.collections4.list.SetUniqueList)v6).add(((java.lang.Object)v28));
    org.junit.Assert.assertEquals((Object)(true), v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 19;
    Object v8 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v8),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v13));
    Object v15 = ((java.util.List)v14).spliterator();
    ((org.apache.commons.collections4.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v13).isEmpty();
    Object v15 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v16 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v16));
    Object v18 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v15),((org.apache.commons.collections4.Predicate)v17));
    Object v19 = new java.util.ArrayList(((java.util.Collection)v18));
    Object v20 = ((org.apache.commons.collections4.list.SetUniqueList)v13).retainAll(((java.util.Collection)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v5 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v4));
    Object v6 = ((java.util.Collection)v3).contains(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v7),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = java.util.function.Predicate.isEqual(((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = ((java.util.function.Predicate)v12).test(((java.lang.Object)v14));
    Object v16 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v12));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = ((org.apache.commons.collections4.list.SetUniqueList)v5).add(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 3;
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v11 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v10));
    Object v12 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11));
    ((org.apache.commons.collections4.list.SetUniqueList)v6).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = -7;
    Object v14 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v14));
    Object v16 = ((org.apache.commons.collections4.list.SetUniqueList)v12).set((((java.lang.Integer)v13).intValue()),((java.lang.Object)v15));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = ((org.apache.commons.collections4.list.SetUniqueList)v6).contains(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections4.list.SetUniqueList)v6).listIterator();
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v11 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v10));
    Object v12 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections4.list.SetUniqueList)v6).removeAll(((java.util.Collection)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = ((org.apache.commons.collections4.list.SetUniqueList)v12).listIterator();
    Object v14 = 51;
    Object v15 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v16 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v16));
    Object v18 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v15),((org.apache.commons.collections4.Predicate)v17));
    Object v19 = new java.util.ArrayList(((java.util.Collection)v18));
    Object v20 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v21 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v20));
    Object v22 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v23 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v22));
    Object v24 = java.util.Set.of(((java.lang.Object)v21),((java.lang.Object)v23));
    Object v25 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v19),((java.util.Set)v24));
    Object v26 = ((org.apache.commons.collections4.list.SetUniqueList)v12).addAll((((java.lang.Integer)v14).intValue()),((java.util.Collection)v25));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v14 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v15 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v14));
    Object v16 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v13),((org.apache.commons.collections4.Predicate)v15));
    Object v17 = new java.util.ArrayList(((java.util.Collection)v16));
    Object v18 = java.util.function.Predicate.isEqual(((java.lang.Object)v17));
    Object v19 = ((java.util.Collection)v12).removeIf(((java.util.function.Predicate)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections4.list.SetUniqueList)v10).containsAll(((java.util.Collection)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    ((java.util.List)v4).sort(((java.util.Comparator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    Object v6 = java.util.function.UnaryOperator.identity();
    Object v7 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    Object v8 = ((java.util.Comparator)v5).thenComparing(((java.util.function.Function)v6),((java.util.Comparator)v7));
    ((java.util.List)v4).sort(((java.util.Comparator)v5));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v17 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v17));
    Object v19 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v16),((org.apache.commons.collections4.Predicate)v18));
    Object v20 = new java.util.ArrayList(((java.util.Collection)v19));
    Object v21 = ((org.apache.commons.collections4.list.SetUniqueList)v10).createSetBasedOnList(((java.util.Set)v15),((java.util.List)v20));
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    Object v8 = ((org.apache.commons.collections4.list.SetUniqueList)v6).remove(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = ((org.apache.commons.collections4.list.SetUniqueList)v6).asSet();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = ((org.apache.commons.collections4.list.SetUniqueList)v12).iterator();
    Object v14 = 8;
    Object v15 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v16 = ((org.apache.commons.collections4.list.SetUniqueList)v12).addAll((((java.lang.Integer)v14).intValue()),((java.util.Collection)v15));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v1 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v0));
    Object v2 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v3 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v2));
    Object v4 = java.util.Set.of(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v5 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v5),((org.apache.commons.collections4.Predicate)v7));
    Object v9 = new java.util.ArrayList(((java.util.Collection)v8));
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v4).removeIf(((java.util.function.Predicate)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v10).replaceAll(((java.util.function.UnaryOperator)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v0).toArray();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = ((org.apache.commons.collections4.list.SetUniqueList)v10).removeAll(((java.util.Collection)v15));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v12),((org.apache.commons.collections4.Predicate)v14));
    Object v16 = new java.util.ArrayList(((java.util.Collection)v15));
    Object v17 = ((java.util.List)v16).spliterator();
    Object v18 = ((org.apache.commons.collections4.list.SetUniqueList)v6).createSetBasedOnList(((java.util.Set)v11),((java.util.List)v16));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = 0;
    Object v7 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    ((org.apache.commons.collections4.list.SetUniqueList)v5).add((((java.lang.Integer)v6).intValue()),((java.lang.Object)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v0).toArray();
    Object v2 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v3 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v2).toArray();
    Object v4 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v14),((org.apache.commons.collections4.Predicate)v16));
    Object v18 = new java.util.ArrayList(((java.util.Collection)v17));
    Object v19 = ((org.apache.commons.collections4.list.SetUniqueList)v13).removeAll(((java.util.Collection)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v14),((org.apache.commons.collections4.Predicate)v16));
    Object v18 = new java.util.ArrayList(((java.util.Collection)v17));
    Object v19 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v18));
    Object v20 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v21 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v20));
    Object v22 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v23 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v22));
    Object v24 = java.util.Set.of(((java.lang.Object)v21),((java.lang.Object)v23));
    Object v25 = ((java.util.Collection)v24).stream();
    Object v26 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v19),((java.util.Set)v24));
    Object v27 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v26));
    Object v28 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v29 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v30 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v29));
    Object v31 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v28),((org.apache.commons.collections4.Predicate)v30));
    Object v32 = new java.util.ArrayList(((java.util.Collection)v31));
    Object v33 = ((org.apache.commons.collections4.list.SetUniqueList)v27).removeAll(((java.util.Collection)v32));
    Object v34 = ((org.apache.commons.collections4.list.AbstractListDecorator)v13).indexOf(((java.lang.Object)v33));
    org.junit.Assert.assertEquals((Object)(-1), v34);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v5 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v4).toArray();
    Object v6 = ((java.util.Collection)v3).equals(((java.lang.Object)v5));
    Object v7 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v7),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = java.util.function.Predicate.isEqual(((java.lang.Object)v11));
    Object v13 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 0;
    Object v8 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v8),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v13));
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v21 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v22 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v21));
    Object v23 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v20),((org.apache.commons.collections4.Predicate)v22));
    Object v24 = new java.util.ArrayList(((java.util.Collection)v23));
    Object v25 = ((java.util.List)v24).spliterator();
    Object v26 = ((org.apache.commons.collections4.list.SetUniqueList)v14).createSetBasedOnList(((java.util.Set)v19),((java.util.List)v24));
    Object v27 = ((java.util.Collection)v26).hashCode();
    Object v28 = ((org.apache.commons.collections4.list.SetUniqueList)v6).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v26));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections4.list.SetUniqueList)v12).removeAll(((java.util.Collection)v17));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v17 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v17));
    Object v19 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v16),((org.apache.commons.collections4.Predicate)v18));
    Object v20 = new java.util.ArrayList(((java.util.Collection)v19));
    Object v21 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v22 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v23 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v22));
    Object v24 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v21),((org.apache.commons.collections4.Predicate)v23));
    Object v25 = new java.util.ArrayList(((java.util.Collection)v24));
    Object v26 = java.util.function.Predicate.isEqual(((java.lang.Object)v25));
    Object v27 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v28 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v29 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v28));
    Object v30 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v27),((org.apache.commons.collections4.Predicate)v29));
    Object v31 = new java.util.ArrayList(((java.util.Collection)v30));
    Object v32 = java.util.function.Predicate.isEqual(((java.lang.Object)v31));
    Object v33 = ((java.util.function.Predicate)v26).or(((java.util.function.Predicate)v32));
    Object v34 = ((java.util.Collection)v20).removeIf(((java.util.function.Predicate)v26));
    Object v35 = ((java.util.Set)v15).contains(((java.lang.Object)v34));
    Object v36 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v15));
    org.junit.Assert.assertNotNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    ((java.util.List)v4).clear();
    Object v5 = null;
    Object v6 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = ((org.apache.commons.collections4.list.SetUniqueList)v10).iterator();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = ((org.apache.commons.collections4.list.SetUniqueList)v12).contains(((java.lang.Object)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).isEmpty();
    Object v7 = -3;
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v11 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v10));
    Object v12 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = ((org.apache.commons.collections4.list.SetUniqueList)v5).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v12));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v12),((org.apache.commons.collections4.Predicate)v14));
    Object v16 = new java.util.ArrayList(((java.util.Collection)v15));
    Object v17 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v16));
    Object v18 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v17));
    Object v19 = ((org.apache.commons.collections4.list.SetUniqueList)v6).createSetBasedOnList(((java.util.Set)v11),((java.util.List)v18));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v12 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v11),((org.apache.commons.collections4.Predicate)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v15));
    Object v17 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v16));
    Object v18 = ((org.apache.commons.collections4.list.SetUniqueList)v17).asSet();
    Object v19 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v20 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v21 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v20));
    Object v22 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v19),((org.apache.commons.collections4.Predicate)v21));
    Object v23 = new java.util.ArrayList(((java.util.Collection)v22));
    Object v24 = ((org.apache.commons.collections4.list.SetUniqueList)v10).createSetBasedOnList(((java.util.Set)v18),((java.util.List)v23));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = java.util.Set.of(((java.lang.Object)v14),((java.lang.Object)v16));
    Object v18 = ((org.apache.commons.collections4.list.SetUniqueList)v12).retainAll(((java.util.Collection)v17));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 21;
    Object v8 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v8),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v13));
    Object v15 = ((java.util.Collection)v14).stream();
    Object v16 = ((org.apache.commons.collections4.list.SetUniqueList)v6).addAll((((java.lang.Integer)v7).intValue()),((java.util.Collection)v14));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    Object v14 = ((org.apache.commons.collections4.list.SetUniqueList)v12).add(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v13).size();
    Object v15 = 0;
    Object v16 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v17 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v17));
    Object v19 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v16),((org.apache.commons.collections4.Predicate)v18));
    Object v20 = new java.util.ArrayList(((java.util.Collection)v19));
    Object v21 = ((java.util.List)v20).spliterator();
    Object v22 = ((org.apache.commons.collections4.list.SetUniqueList)v13).set((((java.lang.Integer)v15).intValue()),((java.lang.Object)v21));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v2 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v3 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v2));
    Object v4 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v1),((org.apache.commons.collections4.Predicate)v3));
    Object v5 = new java.util.ArrayList(((java.util.Collection)v4));
    Object v6 = ((java.util.Collection)v0).containsAll(((java.util.Collection)v5));
    Object v7 = ((java.util.Collection)v0).parallelStream();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v14),((org.apache.commons.collections4.Predicate)v16));
    Object v18 = new java.util.ArrayList(((java.util.Collection)v17));
    Object v19 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v18));
    Object v20 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v19));
    Object v21 = ((org.apache.commons.collections4.list.SetUniqueList)v13).add(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v12).replaceAll(((java.util.function.UnaryOperator)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = 0;
    Object v14 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    ((org.apache.commons.collections4.list.SetUniqueList)v12).add((((java.lang.Integer)v13).intValue()),((java.lang.Object)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = java.util.Set.of(((java.lang.Object)v8),((java.lang.Object)v10));
    Object v12 = ((org.apache.commons.collections4.list.SetUniqueList)v6).retainAll(((java.util.Collection)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).isEmpty();
    Object v7 = -25;
    Object v8 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    ((org.apache.commons.collections4.list.SetUniqueList)v5).add((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = 21;
    Object v12 = ((org.apache.commons.collections4.list.SetUniqueList)v10).remove((((java.lang.Integer)v11).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 1;
    Object v8 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    Object v9 = ((org.apache.commons.collections4.list.SetUniqueList)v6).set((((java.lang.Integer)v7).intValue()),((java.lang.Object)v8));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = 69;
    Object v15 = new org.apache.commons.collections4.trie.ByteKeyAnalyzer();
    ((org.apache.commons.collections4.list.SetUniqueList)v13).add((((java.lang.Integer)v14).intValue()),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v12 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v13 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v11),((org.apache.commons.collections4.Predicate)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v17 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v16));
    Object v18 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v19 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v18));
    Object v20 = java.util.Set.of(((java.lang.Object)v17),((java.lang.Object)v19));
    Object v21 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v15),((java.util.Set)v20));
    Object v22 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v23 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v22));
    Object v24 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v25 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v24));
    Object v26 = java.util.Set.of(((java.lang.Object)v23),((java.lang.Object)v25));
    Object v27 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v28 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v29 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v28));
    Object v30 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v27),((org.apache.commons.collections4.Predicate)v29));
    Object v31 = new java.util.ArrayList(((java.util.Collection)v30));
    Object v32 = ((org.apache.commons.collections4.list.SetUniqueList)v21).createSetBasedOnList(((java.util.Set)v26),((java.util.List)v31));
    Object v33 = ((org.apache.commons.collections4.list.SetUniqueList)v10).addAll(((java.util.Collection)v32));
    org.junit.Assert.assertEquals((Object)(false), v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections4.list.SetUniqueList)v5).iterator();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v6));
    Object v8 = 0;
    Object v9 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v10 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v11 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v11));
    Object v13 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v10),((org.apache.commons.collections4.Predicate)v12));
    Object v14 = new java.util.ArrayList(((java.util.Collection)v13));
    Object v15 = ((java.util.Collection)v9).containsAll(((java.util.Collection)v14));
    Object v16 = ((java.util.Collection)v9).parallelStream();
    ((org.apache.commons.collections4.list.SetUniqueList)v7).add((((java.lang.Integer)v8).intValue()),((java.lang.Object)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v4).replaceAll(((java.util.function.UnaryOperator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    ((java.util.List)v6).clear();
    Object v7 = null;
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v11 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v10));
    Object v12 = java.util.Set.of(((java.lang.Object)v9),((java.lang.Object)v11));
    Object v13 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v6),((java.util.Set)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = 0;
    Object v8 = ((org.apache.commons.collections4.list.AbstractListDecorator)v6).get((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = 0;
    Object v12 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v12).equals(((java.lang.Object)v14));
    ((org.apache.commons.collections4.list.SetUniqueList)v10).add((((java.lang.Integer)v11).intValue()),((java.lang.Object)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = ((java.util.Collection)v6).stream();
    Object v8 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v6).replaceAll(((java.util.function.UnaryOperator)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v6 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v5));
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = java.util.Set.of(((java.lang.Object)v6),((java.lang.Object)v8));
    Object v10 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v4),((java.util.Set)v9));
    Object v11 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v12 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v11));
    Object v13 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v14 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v13));
    Object v15 = java.util.Set.of(((java.lang.Object)v12),((java.lang.Object)v14));
    Object v16 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v17 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v17));
    Object v19 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v16),((org.apache.commons.collections4.Predicate)v18));
    Object v20 = new java.util.ArrayList(((java.util.Collection)v19));
    Object v21 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v22 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v23 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v22));
    Object v24 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v21),((org.apache.commons.collections4.Predicate)v23));
    Object v25 = new java.util.ArrayList(((java.util.Collection)v24));
    Object v26 = java.util.function.Predicate.isEqual(((java.lang.Object)v25));
    Object v27 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v28 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v29 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v28));
    Object v30 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v27),((org.apache.commons.collections4.Predicate)v29));
    Object v31 = new java.util.ArrayList(((java.util.Collection)v30));
    Object v32 = java.util.function.Predicate.isEqual(((java.lang.Object)v31));
    Object v33 = ((java.util.function.Predicate)v26).or(((java.util.function.Predicate)v32));
    Object v34 = ((java.util.Collection)v20).removeIf(((java.util.function.Predicate)v26));
    Object v35 = ((java.util.Set)v15).contains(((java.lang.Object)v34));
    Object v36 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v10),((java.util.Set)v15));
    Object v37 = 29;
    Object v38 = 1;
    Object v39 = ((org.apache.commons.collections4.list.SetUniqueList)v36).subList((((java.lang.Integer)v37).intValue()),(((java.lang.Integer)v38).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v7 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v6));
    Object v8 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v9 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v8));
    Object v10 = java.util.Set.of(((java.lang.Object)v7),((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v10).stream();
    Object v12 = new org.apache.commons.collections4.list.SetUniqueList(((java.util.List)v5),((java.util.Set)v10));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v14),((org.apache.commons.collections4.Predicate)v16));
    Object v18 = ((java.util.Collection)v17).parallelStream();
    Object v19 = ((org.apache.commons.collections4.list.SetUniqueList)v13).remove(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = java.util.function.UnaryOperator.identity();
    ((java.util.List)v6).replaceAll(((java.util.function.UnaryOperator)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v1 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v2 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v1));
    Object v3 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v0),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v5));
    Object v7 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v6));
    Object v8 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v9 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v10 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v9));
    Object v11 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v8),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v12));
    Object v14 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v13));
    Object v15 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v16 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v15));
    Object v17 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v18 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v17));
    Object v19 = java.util.Set.of(((java.lang.Object)v16),((java.lang.Object)v18));
    Object v20 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v21 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v22 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v21));
    Object v23 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v20),((org.apache.commons.collections4.Predicate)v22));
    Object v24 = new java.util.ArrayList(((java.util.Collection)v23));
    Object v25 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v24));
    Object v26 = org.apache.commons.collections4.list.SetUniqueList.setUniqueList(((java.util.List)v25));
    Object v27 = ((org.apache.commons.collections4.list.SetUniqueList)v14).createSetBasedOnList(((java.util.Set)v19),((java.util.List)v26));
    Object v28 = ((org.apache.commons.collections4.list.SetUniqueList)v7).retainAll(((java.util.Collection)v27));
    org.junit.Assert.assertEquals((Object)(false), v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v1 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v0));
    Object v2 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v3 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v2));
    Object v4 = java.util.Set.of(((java.lang.Object)v1),((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v4).parallelStream();
    Object v6 = org.apache.commons.collections4.QueueUtils.emptyQueue();
    Object v7 = new org.apache.commons.collections4.Predicate[]{null,null};
    Object v8 = new org.apache.commons.collections4.functors.OnePredicate(((org.apache.commons.collections4.Predicate[])v7));
    Object v9 = org.apache.commons.collections4.QueueUtils.predicatedQueue(((java.util.Queue)v6),((org.apache.commons.collections4.Predicate)v8));
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v4).removeIf(((java.util.function.Predicate)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }
}
