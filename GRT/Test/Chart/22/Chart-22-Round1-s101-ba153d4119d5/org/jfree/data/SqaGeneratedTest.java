package org.jfree.data;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 29;
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = new org.jfree.data.time.Minute(((java.util.Date)v3));
    Object v5 = new org.jfree.data.time.Second((((java.lang.Integer)v1).intValue()),((org.jfree.data.time.Minute)v4));
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = 1L;
    Object v9 = new java.util.Date((((java.lang.Long)v8).longValue()));
    Object v10 = ((java.lang.Comparable)v7).compareTo(((java.lang.Object)v9));
    ((org.jfree.data.KeyedObjects2D)v0).removeObject(((java.lang.Comparable)v5),((java.lang.Comparable)v7));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    ((org.jfree.data.KeyedObjects2D)v0).setObject(((java.lang.Object)v2),((java.lang.Comparable)v4),((java.lang.Comparable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.KeyedObjects2D)v0).getObject((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.jfree.data.KeyedObjects2D)v0).getColumnIndex(((java.lang.Comparable)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.KeyedObjects2D)v0).getObject(((java.lang.Comparable)v2),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 53;
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).getRowKey((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.jfree.data.KeyedObjects2D)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((java.lang.Comparable)v2).compareTo(((java.lang.Object)v4));
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).getColumnIndex(((java.lang.Comparable)v8));
    ((org.jfree.data.KeyedObjects2D)v0).removeObject(((java.lang.Comparable)v2),((java.lang.Comparable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = new org.jfree.data.time.Minute(((java.util.Date)v4));
    ((org.jfree.data.KeyedObjects2D)v0).removeObject(((java.lang.Comparable)v2),((java.lang.Comparable)v5));
    Object v6 = null;
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((org.jfree.data.KeyedObjects2D)v0).removeRow(((java.lang.Comparable)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = -18;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.KeyedObjects2D)v0).getObject((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v5));
    ((org.jfree.data.KeyedObjects2D)v0).removeObject(((java.lang.Comparable)v2),((java.lang.Comparable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.jfree.data.KeyedObjects2D)v2).getRowCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v5).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v5).getRowCount();
    Object v9 = ((org.jfree.data.KeyedObjects2D)v2).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = 1L;
    Object v11 = new java.util.Date((((java.lang.Long)v10).longValue()));
    ((org.jfree.data.KeyedObjects2D)v2).removeRow(((java.lang.Comparable)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).getColumnIndex(((java.lang.Comparable)v5));
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = 29;
    Object v10 = 1L;
    Object v11 = new java.util.Date((((java.lang.Long)v10).longValue()));
    Object v12 = new org.jfree.data.time.Minute(((java.util.Date)v11));
    Object v13 = new org.jfree.data.time.Second((((java.lang.Integer)v9).intValue()),((org.jfree.data.time.Minute)v12));
    Object v14 = ((org.jfree.data.KeyedObjects2D)v3).getObject(((java.lang.Comparable)v8),((java.lang.Comparable)v13));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = new org.jfree.data.KeyedObjects2D();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v2).removeObject(((java.lang.Comparable)v4),((java.lang.Comparable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnKeys();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getRowKeys();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = -17;
    Object v5 = 1;
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).getObject((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).getColumnCount();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v7 = new org.jfree.data.KeyedObjects2D();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v6).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).getRowCount();
    Object v10 = new org.jfree.data.KeyedObjects2D();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v3).removeObject(((java.lang.Comparable)v9),((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).getRowIndex(((java.lang.Comparable)v5));
    Object v7 = new org.jfree.data.KeyedObjects2D();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).getColumnCount();
    Object v9 = 1L;
    Object v10 = new java.util.Date((((java.lang.Long)v9).longValue()));
    ((org.jfree.data.KeyedObjects2D)v3).removeObject(((java.lang.Comparable)v8),((java.lang.Comparable)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.KeyedObjects2D)v2).getRowIndex(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getColumnCount();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).getColumnCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).getColumnCount();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v6).clone();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v3).removeObject(((java.lang.Comparable)v5),((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = new org.jfree.data.KeyedObjects2D();
    Object v9 = 1L;
    Object v10 = new java.util.Date((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.jfree.data.KeyedObjects2D)v8).getColumnIndex(((java.lang.Comparable)v10));
    ((org.jfree.data.KeyedObjects2D)v3).setObject(((java.lang.Object)v5),((java.lang.Comparable)v7),((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v6).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v1).setObject(((java.lang.Object)v3),((java.lang.Comparable)v5),((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v2).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getColumnCount();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v1).getRowIndex(((java.lang.Comparable)v3));
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getObject(((java.lang.Comparable)v6),((java.lang.Comparable)v8));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = -39;
    Object v3 = 0;
    Object v4 = ((org.jfree.data.KeyedObjects2D)v1).getObject((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 2;
    ((org.jfree.data.KeyedObjects2D)v1).removeColumn((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 29;
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = new org.jfree.data.time.Minute(((java.util.Date)v4));
    Object v6 = new org.jfree.data.time.Second((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.Minute)v5));
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    ((org.jfree.data.KeyedObjects2D)v1).removeObject(((java.lang.Comparable)v6),((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = -13;
    ((org.jfree.data.KeyedObjects2D)v1).removeRow((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((java.lang.Comparable)v3).compareTo(((java.lang.Object)v5));
    ((org.jfree.data.KeyedObjects2D)v1).removeRow(((java.lang.Comparable)v3));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.KeyedObjects2D)v2).equals(((java.lang.Object)v4));
    Object v6 = 29;
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = new org.jfree.data.time.Minute(((java.util.Date)v8));
    Object v10 = new org.jfree.data.time.Second((((java.lang.Integer)v6).intValue()),((org.jfree.data.time.Minute)v9));
    Object v11 = 1L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    ((org.jfree.data.KeyedObjects2D)v1).setObject(((java.lang.Object)v5),((java.lang.Comparable)v10),((java.lang.Comparable)v12));
    Object v13 = null;
    Object v14 = 1L;
    Object v15 = new java.util.Date((((java.lang.Long)v14).longValue()));
    Object v16 = ((org.jfree.data.KeyedObjects2D)v1).equals(((java.lang.Object)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(871), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.KeyedObjects2D)v2).equals(((java.lang.Object)v4));
    Object v6 = ((org.jfree.data.KeyedObjects2D)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v5).getRowIndex(((java.lang.Comparable)v7));
    Object v9 = new org.jfree.data.KeyedObjects2D();
    Object v10 = ((org.jfree.data.KeyedObjects2D)v9).clone();
    Object v11 = new org.jfree.data.KeyedObjects2D();
    Object v12 = 1L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.jfree.data.KeyedObjects2D)v11).equals(((java.lang.Object)v13));
    Object v15 = ((org.jfree.data.KeyedObjects2D)v10).equals(((java.lang.Object)v14));
    Object v16 = new org.jfree.data.KeyedObjects2D();
    Object v17 = ((org.jfree.data.KeyedObjects2D)v16).getColumnCount();
    Object v18 = ((org.jfree.data.KeyedObjects2D)v16).clone();
    Object v19 = new org.jfree.data.KeyedObjects2D();
    Object v20 = ((org.jfree.data.KeyedObjects2D)v19).getColumnCount();
    Object v21 = ((org.jfree.data.KeyedObjects2D)v18).equals(((java.lang.Object)v20));
    ((org.jfree.data.KeyedObjects2D)v2).setObject(((java.lang.Object)v8),((java.lang.Comparable)v15),((java.lang.Comparable)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getColumnCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 29;
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = new org.jfree.data.time.Minute(((java.util.Date)v4));
    Object v6 = new org.jfree.data.time.Second((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.Minute)v5));
    ((org.jfree.data.KeyedObjects2D)v1).removeRow(((java.lang.Comparable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).getColumnCount();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v7 = new org.jfree.data.KeyedObjects2D();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).getColumnCount();
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).equals(((java.lang.Object)v8));
    ((org.jfree.data.KeyedObjects2D)v3).removeColumn(((java.lang.Comparable)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    ((org.jfree.data.KeyedObjects2D)v1).removeObject(((java.lang.Comparable)v3),((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = -6;
    Object v3 = ((org.jfree.data.KeyedObjects2D)v1).getColumnKey((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 29;
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = new org.jfree.data.time.Minute(((java.util.Date)v6));
    Object v8 = new org.jfree.data.time.Second((((java.lang.Integer)v4).intValue()),((org.jfree.data.time.Minute)v7));
    Object v9 = new org.jfree.data.KeyedObjects2D();
    Object v10 = ((org.jfree.data.KeyedObjects2D)v9).clone();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v1).setObject(((java.lang.Object)v3),((java.lang.Comparable)v8),((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.KeyedObjects2D)v2).getColumnIndex(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.KeyedObjects2D)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).getColumnCount();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v2).getColumnIndex(((java.lang.Comparable)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 29;
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = new org.jfree.data.time.Minute(((java.util.Date)v4));
    Object v6 = new org.jfree.data.time.Second((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.Minute)v5));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    ((org.jfree.data.KeyedObjects2D)v2).removeColumn(((java.lang.Comparable)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).hashCode();
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((org.jfree.data.KeyedObjects2D)v1).getObject((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).hashCode();
    org.junit.Assert.assertEquals((Object)(871), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 25;
    Object v3 = -4;
    Object v4 = ((org.jfree.data.KeyedObjects2D)v1).getObject((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).getColumnIndex(((java.lang.Comparable)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v7));
    Object v9 = new org.jfree.data.KeyedObjects2D();
    Object v10 = ((org.jfree.data.KeyedObjects2D)v9).getColumnCount();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v9).clone();
    Object v12 = 1L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.jfree.data.KeyedObjects2D)v11).getRowIndex(((java.lang.Comparable)v13));
    Object v15 = ((org.jfree.data.KeyedObjects2D)v1).getObject(((java.lang.Comparable)v8),((java.lang.Comparable)v14));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 1;
    ((org.jfree.data.KeyedObjects2D)v1).removeColumn((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = new org.jfree.data.KeyedObjects2D();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).getColumnCount();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).getColumnCount();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v5));
    Object v7 = new org.jfree.data.KeyedObjects2D();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).clone();
    Object v9 = new org.jfree.data.KeyedObjects2D();
    Object v10 = 1L;
    Object v11 = new java.util.Date((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.jfree.data.KeyedObjects2D)v9).getColumnIndex(((java.lang.Comparable)v11));
    Object v13 = ((org.jfree.data.KeyedObjects2D)v8).equals(((java.lang.Object)v12));
    Object v14 = ((java.lang.Comparable)v6).compareTo(((java.lang.Object)v13));
    Object v15 = new org.jfree.data.KeyedObjects2D();
    Object v16 = ((org.jfree.data.KeyedObjects2D)v15).clone();
    Object v17 = new org.jfree.data.KeyedObjects2D();
    Object v18 = 1L;
    Object v19 = new java.util.Date((((java.lang.Long)v18).longValue()));
    Object v20 = ((org.jfree.data.KeyedObjects2D)v17).equals(((java.lang.Object)v19));
    Object v21 = ((org.jfree.data.KeyedObjects2D)v16).equals(((java.lang.Object)v20));
    ((org.jfree.data.KeyedObjects2D)v0).removeObject(((java.lang.Comparable)v6),((java.lang.Comparable)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getRowKeys();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v1).getColumnIndex(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.KeyedObjects2D)v1).getRowKeys();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).getRowCount();
    Object v12 = new org.jfree.data.KeyedObjects2D();
    Object v13 = ((org.jfree.data.KeyedObjects2D)v12).clone();
    Object v14 = 29;
    Object v15 = 1L;
    Object v16 = new java.util.Date((((java.lang.Long)v15).longValue()));
    Object v17 = new org.jfree.data.time.Minute(((java.util.Date)v16));
    Object v18 = new org.jfree.data.time.Second((((java.lang.Integer)v14).intValue()),((org.jfree.data.time.Minute)v17));
    Object v19 = ((org.jfree.data.KeyedObjects2D)v13).equals(((java.lang.Object)v18));
    Object v20 = 1L;
    Object v21 = new java.util.Date((((java.lang.Long)v20).longValue()));
    ((org.jfree.data.KeyedObjects2D)v10).removeObject(((java.lang.Comparable)v19),((java.lang.Comparable)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = new org.jfree.data.KeyedObjects2D();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).getColumnCount();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v5).clone();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v2).removeObject(((java.lang.Comparable)v4),((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    ((org.jfree.data.KeyedObjects2D)v2).removeRow(((java.lang.Comparable)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).getRowCount();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v5));
    Object v7 = new org.jfree.data.KeyedObjects2D();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).getColumnCount();
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getObject(((java.lang.Comparable)v6),((java.lang.Comparable)v8));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).getColumnKeys();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = 0;
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).getColumnKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getColumnCount();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v5).equals(((java.lang.Object)v9));
    Object v11 = 1L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    ((org.jfree.data.KeyedObjects2D)v2).removeObject(((java.lang.Comparable)v10),((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v2).removeRow(((java.lang.Comparable)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getColumnCount();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v6));
    ((org.jfree.data.KeyedObjects2D)v1).removeObject(((java.lang.Comparable)v3),((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = 29;
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = new org.jfree.data.time.Minute(((java.util.Date)v7));
    Object v9 = new org.jfree.data.time.Second((((java.lang.Integer)v5).intValue()),((org.jfree.data.time.Minute)v8));
    Object v10 = new org.jfree.data.KeyedObjects2D();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v2).setObject(((java.lang.Object)v4),((java.lang.Comparable)v9),((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).hashCode();
    ((org.jfree.data.KeyedObjects2D)v3).removeColumn(((java.lang.Comparable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = 1;
    Object v5 = -42;
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).getObject((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).getColumnCount();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v6).clone();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).hashCode();
    Object v9 = ((org.jfree.data.KeyedObjects2D)v3).getRowIndex(((java.lang.Comparable)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v5).equals(((java.lang.Object)v9));
    ((org.jfree.data.KeyedObjects2D)v3).removeRow(((java.lang.Comparable)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = 0;
    Object v3 = -29;
    Object v4 = ((org.jfree.data.KeyedObjects2D)v1).getObject((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getColumnCount();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).hashCode();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getObject(((java.lang.Comparable)v6),((java.lang.Comparable)v8));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).hashCode();
    Object v7 = new org.jfree.data.KeyedObjects2D();
    Object v8 = ((org.jfree.data.KeyedObjects2D)v7).getColumnCount();
    Object v9 = ((org.jfree.data.KeyedObjects2D)v7).clone();
    Object v10 = 1L;
    Object v11 = new java.util.Date((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.jfree.data.KeyedObjects2D)v9).getRowIndex(((java.lang.Comparable)v11));
    Object v13 = ((java.lang.Comparable)v6).compareTo(((java.lang.Object)v12));
    ((org.jfree.data.KeyedObjects2D)v3).removeRow(((java.lang.Comparable)v6));
    Object v14 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = -19;
    Object v3 = 0;
    Object v4 = ((org.jfree.data.KeyedObjects2D)v1).getObject((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v5).equals(((java.lang.Object)v9));
    Object v11 = 1L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    ((org.jfree.data.KeyedObjects2D)v3).removeObject(((java.lang.Comparable)v10),((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = 53;
    Object v5 = -61;
    Object v6 = ((org.jfree.data.KeyedObjects2D)v3).getObject((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v2).removeColumn(((java.lang.Comparable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v5 = new org.jfree.data.KeyedObjects2D();
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v5).getColumnIndex(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v8));
    ((org.jfree.data.KeyedObjects2D)v2).removeColumn(((java.lang.Comparable)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).clone();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).getRowCount();
    org.junit.Assert.assertEquals((Object)(0), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = -37;
    Object v3 = 2;
    Object v4 = ((org.jfree.data.KeyedObjects2D)v1).getObject((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v5).equals(((java.lang.Object)v9));
    Object v11 = new org.jfree.data.KeyedObjects2D();
    Object v12 = ((org.jfree.data.KeyedObjects2D)v11).clone();
    Object v13 = ((org.jfree.data.KeyedObjects2D)v12).hashCode();
    Object v14 = new org.jfree.data.KeyedObjects2D();
    Object v15 = ((org.jfree.data.KeyedObjects2D)v14).getColumnCount();
    Object v16 = ((org.jfree.data.KeyedObjects2D)v14).clone();
    Object v17 = new org.jfree.data.KeyedObjects2D();
    Object v18 = ((org.jfree.data.KeyedObjects2D)v17).getColumnCount();
    Object v19 = ((org.jfree.data.KeyedObjects2D)v16).equals(((java.lang.Object)v18));
    ((org.jfree.data.KeyedObjects2D)v3).addObject(((java.lang.Object)v10),((java.lang.Comparable)v13),((java.lang.Comparable)v19));
    Object v20 = null;
    Object v21 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    org.junit.Assert.assertNotNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v4).clone();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v6).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v5).equals(((java.lang.Object)v9));
    Object v11 = new org.jfree.data.KeyedObjects2D();
    Object v12 = ((org.jfree.data.KeyedObjects2D)v11).clone();
    Object v13 = ((org.jfree.data.KeyedObjects2D)v12).hashCode();
    Object v14 = new org.jfree.data.KeyedObjects2D();
    Object v15 = ((org.jfree.data.KeyedObjects2D)v14).getColumnCount();
    Object v16 = ((org.jfree.data.KeyedObjects2D)v14).clone();
    Object v17 = new org.jfree.data.KeyedObjects2D();
    Object v18 = ((org.jfree.data.KeyedObjects2D)v17).getColumnCount();
    Object v19 = ((org.jfree.data.KeyedObjects2D)v16).equals(((java.lang.Object)v18));
    ((org.jfree.data.KeyedObjects2D)v3).addObject(((java.lang.Object)v10),((java.lang.Comparable)v13),((java.lang.Comparable)v19));
    Object v20 = null;
    Object v21 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v22 = 1L;
    Object v23 = new java.util.Date((((java.lang.Long)v22).longValue()));
    ((org.jfree.data.KeyedObjects2D)v21).removeRow(((java.lang.Comparable)v23));
    Object v24 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = new org.jfree.data.KeyedObjects2D();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).clone();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v6).hashCode();
    ((org.jfree.data.KeyedObjects2D)v1).removeObject(((java.lang.Comparable)v4),((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.KeyedObjects2D)v1).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v11 = 0;
    Object v12 = 25;
    Object v13 = ((org.jfree.data.KeyedObjects2D)v10).getObject((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).getColumnCount();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).getRowIndex(((java.lang.Comparable)v6));
    ((org.jfree.data.KeyedObjects2D)v1).removeColumn(((java.lang.Comparable)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = new org.jfree.data.KeyedObjects2D();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = new org.jfree.data.KeyedObjects2D();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.KeyedObjects2D)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v3).equals(((java.lang.Object)v7));
    Object v9 = new org.jfree.data.KeyedObjects2D();
    Object v10 = 1L;
    Object v11 = new java.util.Date((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.jfree.data.KeyedObjects2D)v9).equals(((java.lang.Object)v11));
    ((org.jfree.data.KeyedObjects2D)v1).removeObject(((java.lang.Comparable)v8),((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).getRowCount();
    Object v3 = new org.jfree.data.KeyedObjects2D();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v6 = new org.jfree.data.KeyedObjects2D();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v5).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.KeyedObjects2D)v5).getRowCount();
    Object v9 = new org.jfree.data.KeyedObjects2D();
    Object v10 = ((org.jfree.data.KeyedObjects2D)v9).clone();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).getColumnCount();
    Object v12 = 29;
    Object v13 = 1L;
    Object v14 = new java.util.Date((((java.lang.Long)v13).longValue()));
    Object v15 = new org.jfree.data.time.Minute(((java.util.Date)v14));
    Object v16 = new org.jfree.data.time.Second((((java.lang.Integer)v12).intValue()),((org.jfree.data.time.Minute)v15));
    ((org.jfree.data.KeyedObjects2D)v1).setObject(((java.lang.Object)v8),((java.lang.Comparable)v11),((java.lang.Comparable)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v1).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v3).getColumnCount();
    Object v5 = ((org.jfree.data.KeyedObjects2D)v3).clone();
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    ((org.jfree.data.KeyedObjects2D)v5).removeRow(((java.lang.Comparable)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.data.KeyedObjects2D();
    Object v1 = ((org.jfree.data.KeyedObjects2D)v0).getColumnCount();
    Object v2 = ((org.jfree.data.KeyedObjects2D)v0).clone();
    Object v3 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v4 = ((org.jfree.data.KeyedObjects2D)v2).clone();
    Object v5 = new org.jfree.data.KeyedObjects2D();
    Object v6 = ((org.jfree.data.KeyedObjects2D)v5).clone();
    Object v7 = ((org.jfree.data.KeyedObjects2D)v6).clone();
    Object v8 = 1L;
    Object v9 = new java.util.Date((((java.lang.Long)v8).longValue()));
    Object v10 = new org.jfree.data.KeyedObjects2D();
    Object v11 = ((org.jfree.data.KeyedObjects2D)v10).getColumnCount();
    ((org.jfree.data.KeyedObjects2D)v4).setObject(((java.lang.Object)v7),((java.lang.Comparable)v9),((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }
}
