package org.apache.commons.collections4.collection;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new java.util.HashSet((((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).stream();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v3).toArray();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v5 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    ((java.util.Collection)v3).clear();
    Object v4 = null;
    Object v5 = ((java.util.Collection)v3).stream();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).parallelStream();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).toArray();
    Object v8 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).contains(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = 1;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v9 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v7),((org.apache.commons.collections4.Predicate)v8));
    Object v10 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).containsAll(((java.util.Collection)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v4));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).maxSize();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).isFull();
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v3).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).toString();
    Object v10 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v8).decorated();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).toString();
    Object v10 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v8).decorated();
    Object v11 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v10).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = 1;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v6).intValue()));
    Object v8 = java.util.function.Predicate.isEqual(((java.lang.Object)v7));
    Object v9 = ((java.util.Collection)v5).removeIf(((java.util.function.Predicate)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).stream();
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v5).removeIf(((java.util.function.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v8).clear();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v12 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v10),((org.apache.commons.collections4.Predicate)v11));
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    Object v14 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v8).add(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = 1;
    Object v5 = new java.util.HashSet((((java.lang.Integer)v4).intValue()));
    Object v6 = java.util.function.Predicate.isEqual(((java.lang.Object)v5));
    Object v7 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).parallelStream();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = 1;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v9 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v7),((org.apache.commons.collections4.Predicate)v8));
    Object v10 = ((java.util.Collection)v5).contains(((java.lang.Object)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = java.util.function.Predicate.isEqual(((java.lang.Object)v12));
    Object v14 = ((java.util.Collection)v5).removeIf(((java.util.function.Predicate)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).parallelStream();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).decorated();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = ((java.util.Collection)v7).hashCode();
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v10 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v8),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).removeAll(((java.util.Collection)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).isEmpty();
    ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).clear();
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new java.util.HashSet((((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.function.Predicate)v4).negate();
    Object v6 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new java.util.HashSet((((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = 1;
    Object v6 = new java.util.HashSet((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.function.Predicate)v4).and(((java.util.function.Predicate)v7));
    Object v9 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v10 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v8),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).add(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).parallelStream();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v11 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v9),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v12));
    Object v14 = new java.lang.Object[]{null,null};
    Object v15 = ((java.util.Collection)v13).toArray(((java.lang.Object[])v14));
    Object v16 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v13));
    Object v17 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).addAll(((java.util.Collection)v16));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((java.util.Collection)v6).size();
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((java.util.Collection)v6).size();
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).containsAll(((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).hashCode();
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).decorated();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).hashCode();
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).decorated();
    Object v9 = new java.lang.Object[]{null,null};
    Object v10 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).toArray(((java.lang.Object[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = java.util.function.Predicate.isEqual(((java.lang.Object)v11));
    Object v13 = ((java.util.Collection)v9).removeIf(((java.util.function.Predicate)v12));
    Object v14 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v9).size();
    org.junit.Assert.assertEquals((Object)(0), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v11 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v9),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).contains(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v10 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v8),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v11));
    Object v13 = new java.lang.Object[]{null,null};
    Object v14 = ((java.util.Collection)v12).toArray(((java.lang.Object[])v13));
    Object v15 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v12));
    Object v16 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v15));
    Object v17 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).removeAll(((java.util.Collection)v16));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = 1;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v9 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v7),((org.apache.commons.collections4.Predicate)v8));
    Object v10 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v9).isEmpty();
    Object v11 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v8 = new java.lang.Object[]{};
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).toArray(((java.lang.Object[])v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).retainAll(((java.util.Collection)v9));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).isEmpty();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).parallelStream();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = ((java.util.Collection)v7).stream();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).size();
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v10 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v8),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).containsAll(((java.util.Collection)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = 1;
    Object v5 = new java.util.HashSet((((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v7 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v5),((org.apache.commons.collections4.Predicate)v6));
    Object v8 = new java.util.ArrayList(((java.util.Collection)v7));
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v3).contains(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v9));
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v14 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v12),((org.apache.commons.collections4.Predicate)v13));
    Object v15 = new java.util.ArrayList(((java.util.Collection)v14));
    Object v16 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v15));
    Object v17 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v16));
    Object v18 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v17).toArray();
    Object v19 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v20 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v17).contains(((java.lang.Object)v19));
    Object v21 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v10).remove(((java.lang.Object)v20));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v8).remove(((java.lang.Object)v10));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((java.util.Collection)v6).size();
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).size();
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v13 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v11),((org.apache.commons.collections4.Predicate)v12));
    Object v14 = new java.util.ArrayList(((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v14));
    Object v16 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v15).size();
    Object v17 = 1;
    Object v18 = new java.util.HashSet((((java.lang.Integer)v17).intValue()));
    Object v19 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v20 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v18),((org.apache.commons.collections4.Predicate)v19));
    Object v21 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v15).containsAll(((java.util.Collection)v20));
    Object v22 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).equals(((java.lang.Object)v21));
    org.junit.Assert.assertEquals((Object)(false), v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    Object v10 = 1;
    Object v11 = new java.util.HashSet((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v9).removeAll(((java.util.Collection)v11));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.Collection)v8).parallelStream();
    Object v10 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v8).removeIf(((java.util.function.Predicate)v11));
    Object v13 = ((java.util.Collection)v8).stream();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = 1;
    Object v5 = new java.util.HashSet((((java.lang.Integer)v4).intValue()));
    Object v6 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v7 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v5),((org.apache.commons.collections4.Predicate)v6));
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).isEmpty();
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).spliterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((java.util.Collection)v6).size();
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = 1;
    Object v7 = new java.util.HashSet((((java.lang.Integer)v6).intValue()));
    Object v8 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v9 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v7),((org.apache.commons.collections4.Predicate)v8));
    Object v10 = new java.util.ArrayList(((java.util.Collection)v9));
    Object v11 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v10));
    Object v12 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v11));
    Object v13 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v12).hashCode();
    Object v14 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v12).decorated();
    Object v15 = new java.lang.Object[]{null,null};
    Object v16 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v14).toArray(((java.lang.Object[])v15));
    Object v17 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).equals(((java.lang.Object)v16));
    org.junit.Assert.assertEquals((Object)(false), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = 1;
    Object v6 = new java.util.HashSet((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v4).removeIf(((java.util.function.Predicate)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).toArray();
    Object v7 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).contains(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).parallelStream();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = java.util.function.Predicate.isEqual(((java.lang.Object)v9));
    Object v11 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v8).iterator();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = ((java.util.Collection)v8).spliterator();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).hashCode();
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).decorated();
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v12 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v10),((org.apache.commons.collections4.Predicate)v11));
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v13));
    Object v15 = new java.lang.Object[]{null,null};
    Object v16 = ((java.util.Collection)v14).toArray(((java.lang.Object[])v15));
    Object v17 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v14));
    Object v18 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v17).iterator();
    Object v19 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    Object v10 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v9).iterator();
    Object v11 = 1;
    Object v12 = new java.util.HashSet((((java.lang.Integer)v11).intValue()));
    Object v13 = ((java.util.Collection)v12).stream();
    Object v14 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v9).add(((java.lang.Object)v13));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v9));
    Object v11 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v12 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v10).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).isEmpty();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).maxSize();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).maxSize();
    org.junit.Assert.assertEquals((Object)(0), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).isEmpty();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).size();
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v6));
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).toArray();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = java.util.function.Predicate.isEqual(((java.lang.Object)v8));
    Object v10 = ((java.util.Collection)v6).removeIf(((java.util.function.Predicate)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v12 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v10),((org.apache.commons.collections4.Predicate)v11));
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    Object v14 = 1;
    Object v15 = new java.util.HashSet((((java.lang.Integer)v14).intValue()));
    Object v16 = java.util.function.Predicate.isEqual(((java.lang.Object)v15));
    Object v17 = ((java.util.Collection)v13).removeIf(((java.util.function.Predicate)v16));
    Object v18 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).equals(((java.lang.Object)v17));
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v10 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v8),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v11));
    Object v13 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v12));
    Object v14 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v13));
    Object v15 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v14));
    Object v16 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v6).retainAll(((java.util.Collection)v15));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).isEmpty();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v8 = ((java.util.Collection)v7).toArray();
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v7).removeIf(((java.util.function.Predicate)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).isEmpty();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).isEmpty();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v8));
    Object v10 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v9));
    Object v11 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v10).isFull();
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v7 = new java.lang.Object[]{null,null};
    Object v8 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).toArray(((java.lang.Object[])v7));
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).size();
    org.junit.Assert.assertEquals((Object)(0), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v7 = 1;
    Object v8 = new java.util.HashSet((((java.lang.Integer)v7).intValue()));
    Object v9 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v10 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v8),((org.apache.commons.collections4.Predicate)v9));
    Object v11 = new java.util.ArrayList(((java.util.Collection)v10));
    Object v12 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v11));
    Object v13 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v12 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v10),((org.apache.commons.collections4.Predicate)v11));
    Object v13 = new java.util.ArrayList(((java.util.Collection)v12));
    Object v14 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v13));
    Object v15 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v14));
    Object v16 = ((java.util.Collection)v15).size();
    Object v17 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v15));
    Object v18 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v17));
    Object v19 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v8).addAll(((java.util.Collection)v18));
      org.junit.Assert.fail("Expected java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v8).removeIf(((java.util.function.Predicate)v11));
    Object v13 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v8));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).toArray(((java.lang.Object[])v6));
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v11 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v9),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).equals(((java.lang.Object)v12));
    org.junit.Assert.assertEquals((Object)(true), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    Object v9 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).parallelStream();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).decorated();
    Object v9 = new java.lang.Object[]{null,null,null};
    Object v10 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v8).toArray(((java.lang.Object[])v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((java.util.Collection)v5));
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v6).size();
    org.junit.Assert.assertEquals((Object)(0), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v8).removeIf(((java.util.function.Predicate)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v8 = ((org.apache.commons.collections4.collection.UnmodifiableBoundedCollection)v7).iterator();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).isEmpty();
    Object v7 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v5).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = new java.lang.Object[]{null,null};
    Object v7 = ((java.util.Collection)v5).toArray(((java.lang.Object[])v6));
    Object v8 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v9 = 1;
    Object v10 = new java.util.HashSet((((java.lang.Integer)v9).intValue()));
    Object v11 = java.util.function.Predicate.isEqual(((java.lang.Object)v10));
    Object v12 = ((java.util.Collection)v8).removeIf(((java.util.function.Predicate)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 1;
    Object v1 = new java.util.HashSet((((java.lang.Integer)v0).intValue()));
    Object v2 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v3 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v1),((org.apache.commons.collections4.Predicate)v2));
    Object v4 = new java.util.ArrayList(((java.util.Collection)v3));
    Object v5 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v4));
    Object v6 = ((java.util.Collection)v5).spliterator();
    Object v7 = org.apache.commons.collections4.collection.UnmodifiableBoundedCollection.unmodifiableBoundedCollection(((org.apache.commons.collections4.BoundedCollection)v5));
    Object v8 = 1;
    Object v9 = new java.util.HashSet((((java.lang.Integer)v8).intValue()));
    Object v10 = org.apache.commons.collections4.PredicateUtils.truePredicate();
    Object v11 = org.apache.commons.collections4.collection.PredicatedCollection.predicatedCollection(((java.util.Collection)v9),((org.apache.commons.collections4.Predicate)v10));
    Object v12 = new java.util.ArrayList(((java.util.Collection)v11));
    Object v13 = org.apache.commons.collections4.list.FixedSizeList.fixedSizeList(((java.util.List)v12));
    Object v14 = ((java.util.Collection)v13).stream();
    Object v15 = 1;
    Object v16 = new java.util.HashSet((((java.lang.Integer)v15).intValue()));
    Object v17 = java.util.function.Predicate.isEqual(((java.lang.Object)v16));
    Object v18 = ((java.util.Collection)v13).removeIf(((java.util.function.Predicate)v17));
    Object v19 = ((org.apache.commons.collections4.collection.AbstractCollectionDecorator)v7).equals(((java.lang.Object)v18));
    org.junit.Assert.assertEquals((Object)(false), v19);
  }
}
