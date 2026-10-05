package org.apache.commons.collections.buffer;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 31;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 31;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    ((java.util.AbstractCollection)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).spliterator();
    ((java.util.AbstractCollection)v1).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 31;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.Object[]{};
    Object v3 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 31;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = new java.lang.Object[]{};
    Object v5 = ((java.util.AbstractCollection)v3).toArray(((java.lang.Object[])v4));
    Object v6 = ((java.util.AbstractCollection)v1).remove(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).toArray();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = java.util.function.Predicate.isEqual(((java.lang.Object)v4));
    Object v6 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    ((java.util.AbstractCollection)v1).clear();
    Object v2 = null;
    Object v3 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).get();
      org.junit.Assert.fail("Expected org.apache.commons.collections.BufferUnderflowException");
    } catch (org.apache.commons.collections.BufferUnderflowException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v4).intValue()));
    ((java.util.AbstractCollection)v5).clear();
    Object v6 = null;
    Object v7 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v5).size();
    Object v8 = ((java.util.Collection)v3).remove(((java.lang.Object)v7));
    Object v9 = ((java.util.AbstractCollection)v1).removeAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).isEmpty();
    Object v3 = 12;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.AbstractCollection)v1).retainAll(((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).toArray();
    Object v3 = ((java.util.AbstractCollection)v1).toArray();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v3));
    Object v5 = 12;
    Object v6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.AbstractCollection)v1).containsAll(((java.util.Collection)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).retainAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).size();
    ((java.util.AbstractCollection)v1).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.AbstractCollection)v3).addAll(((java.util.Collection)v5));
    Object v7 = 12;
    Object v8 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v7).intValue()));
    Object v9 = ((java.util.AbstractCollection)v3).containsAll(((java.util.Collection)v8));
    Object v10 = ((java.util.AbstractCollection)v1).contains(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).toArray();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.AbstractCollection)v4).addAll(((java.util.Collection)v6));
    Object v8 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).removeAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).removeAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.AbstractCollection)v1).containsAll(((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    ((java.util.AbstractCollection)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v3).toArray();
    Object v5 = ((java.util.AbstractCollection)v1).remove(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).contains(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).get();
      org.junit.Assert.fail("Expected org.apache.commons.collections.BufferUnderflowException");
    } catch (org.apache.commons.collections.BufferUnderflowException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v3).toString();
    Object v5 = ((java.util.AbstractCollection)v1).contains(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).remove(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).size();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = 12;
    Object v6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.AbstractCollection)v4).retainAll(((java.util.Collection)v6));
    Object v8 = ((java.util.AbstractCollection)v1).remove(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = 1;
    Object v5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.AbstractCollection)v3).removeAll(((java.util.Collection)v5));
    Object v7 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).remove();
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v3).isEmpty();
    Object v5 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v2));
    Object v4 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).size();
    Object v3 = 13;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).removeAll(((java.util.Collection)v3));
    Object v5 = ((java.util.AbstractCollection)v1).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).remove(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).remove();
      org.junit.Assert.fail("Expected org.apache.commons.collections.BufferUnderflowException");
    } catch (org.apache.commons.collections.BufferUnderflowException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).removeAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).remove();
      org.junit.Assert.fail("Expected org.apache.commons.collections.BufferUnderflowException");
    } catch (org.apache.commons.collections.BufferUnderflowException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.Object[]{null};
    Object v3 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = 13;
    Object v5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.AbstractCollection)v3).remove(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).contains(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    ((java.util.AbstractCollection)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).retainAll(((java.util.Collection)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.AbstractCollection)v1).remove(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).iterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).toString();
    Object v3 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v3).iterator();
    Object v5 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).containsAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = 13;
    Object v5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v5).iterator();
    Object v7 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v3).add(((java.lang.Object)v6));
    Object v8 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    ((java.util.AbstractCollection)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.Object[]{};
    Object v3 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).stream();
    Object v3 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    ((java.util.AbstractCollection)v1).clear();
    Object v2 = null;
    Object v3 = 13;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Collection)v4).spliterator();
    Object v6 = ((java.util.AbstractCollection)v1).containsAll(((java.util.Collection)v4));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 12;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).retainAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = java.util.function.Predicate.isEqual(((java.lang.Object)v3));
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.function.Predicate)v4).or(((java.util.function.Predicate)v7));
    Object v9 = ((java.util.Collection)v1).removeIf(((java.util.function.Predicate)v4));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    ((java.util.Collection)v1).clear();
    Object v2 = null;
    Object v3 = ((java.util.Collection)v1).stream();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).size();
    Object v3 = ((java.util.Collection)v1).parallelStream();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    ((java.util.AbstractCollection)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = null;
    ((java.lang.Iterable)v1).forEach(((java.util.function.Consumer)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).iterator();
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).removeAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v1 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).iterator();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = new java.lang.Object[]{null};
    Object v6 = ((java.util.AbstractCollection)v4).toArray(((java.lang.Object[])v5));
    Object v7 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v4).isEmpty();
    Object v8 = ((java.util.AbstractCollection)v1).contains(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.Collection)v3).toArray();
    Object v5 = 1;
    Object v6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = java.util.function.Predicate.isEqual(((java.lang.Object)v6));
    Object v8 = ((java.util.Collection)v3).removeIf(((java.util.function.Predicate)v7));
    Object v9 = ((java.util.AbstractCollection)v1).contains(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = 0;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).iterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).size();
    Object v3 = new java.lang.Object[]{null,null,null};
    Object v4 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 5;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.AbstractCollection)v2).removeAll(((java.util.Collection)v4));
    Object v6 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v0).add(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(true), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v1 = 1;
    Object v2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v1).intValue()));
    Object v3 = ((java.util.Collection)v2).stream();
    Object v4 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v2).isEmpty();
    Object v5 = ((java.util.AbstractCollection)v0).remove(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 13;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    ((java.util.AbstractCollection)v3).clear();
    Object v4 = null;
    Object v5 = 13;
    Object v6 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.util.Collection)v6).spliterator();
    Object v8 = ((java.util.AbstractCollection)v3).containsAll(((java.util.Collection)v6));
    Object v9 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v1 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v0).remove();
      org.junit.Assert.fail("Expected org.apache.commons.collections.BufferUnderflowException");
    } catch (org.apache.commons.collections.BufferUnderflowException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 5;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).spliterator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.Object[]{null,null};
    Object v3 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v1 = ((java.util.AbstractCollection)v0).toArray();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = 12;
    Object v5 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.util.AbstractCollection)v3).retainAll(((java.util.Collection)v5));
    Object v7 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 5;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 5;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).spliterator();
    Object v3 = 1;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.util.Collection)v4).stream();
    Object v6 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v4).isEmpty();
    Object v7 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).add(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = new java.lang.Object[]{null,null,null};
    Object v3 = ((java.util.AbstractCollection)v1).toArray(((java.lang.Object[])v2));
    Object v4 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).retainAll(((java.util.Collection)v3));
    Object v5 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).iterator();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v1).size();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 13;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 5;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).retainAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v1 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v0).get();
      org.junit.Assert.fail("Expected org.apache.commons.collections.BufferUnderflowException");
    } catch (org.apache.commons.collections.BufferUnderflowException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 12;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = 1;
    Object v3 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.util.AbstractCollection)v1).addAll(((java.util.Collection)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = 21;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 1;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v3 = ((java.util.AbstractCollection)v1).containsAll(((java.util.Collection)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 5;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.Collection)v1).parallelStream();
    Object v3 = 13;
    Object v4 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.apache.commons.collections.buffer.UnboundedFifoBuffer)v4).iterator();
    Object v6 = ((java.util.AbstractCollection)v1).contains(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer();
    Object v1 = new java.lang.Object[]{};
    Object v2 = ((java.util.AbstractCollection)v0).toArray(((java.lang.Object[])v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 21;
    Object v1 = new org.apache.commons.collections.buffer.UnboundedFifoBuffer((((java.lang.Integer)v0).intValue()));
    Object v2 = ((java.util.AbstractCollection)v1).toString();
    org.junit.Assert.assertEquals((Object)("[]"), v2);
  }
}
