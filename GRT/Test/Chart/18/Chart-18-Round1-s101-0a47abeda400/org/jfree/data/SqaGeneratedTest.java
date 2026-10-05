package org.jfree.data;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.SerialDate)v4));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.lang.Comparable)v5).compareTo(((java.lang.Object)v7));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn(((java.lang.Comparable)v5));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v4).intValue()),((org.jfree.data.time.SerialDate)v6));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v3),((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).clear();
    Object v2 = null;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = 0;
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v5).intValue()),((org.jfree.data.time.SerialDate)v7));
    Object v9 = 0;
    Object v10 = 82;
    Object v11 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v9).intValue()),((org.jfree.data.time.SerialDate)v11));
    Object v13 = ((java.lang.Comparable)v8).compareTo(((java.lang.Object)v12));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v4),((java.lang.Comparable)v8));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowCount();
    Object v3 = 0;
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).addValue(((java.lang.Number)v3),((java.lang.Comparable)v5),((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v4).intValue()),((org.jfree.data.time.SerialDate)v6));
    Object v8 = ((java.lang.Comparable)v3).compareTo(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowIndex(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnIndex(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowCount();
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.lang.Comparable)v3).compareTo(((java.lang.Object)v5));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnIndex(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowCount();
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v3).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v7));
    Object v9 = 1;
    Object v10 = 0;
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 1;
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.SerialDate)v4));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v5),((java.lang.Comparable)v7));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v6).equals(((java.lang.Object)v8));
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v2),((java.lang.Comparable)v4),((java.lang.Comparable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnIndex(((java.lang.Comparable)v3));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v6).equals(((java.lang.Object)v8));
    Object v10 = 82;
    Object v11 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v9),((java.lang.Comparable)v11));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnCount();
    ((org.jfree.data.DefaultKeyedValues2D)v1).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).clear();
    Object v2 = null;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v6).getColumnIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v4),((java.lang.Comparable)v9));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.SerialDate)v4));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnIndex(((java.lang.Comparable)v5));
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn(((java.lang.Comparable)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).clear();
    Object v2 = null;
    Object v3 = 1;
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 12;
    Object v4 = 77;
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn(((java.lang.Comparable)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 1;
    Object v3 = 6;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 1;
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v4).getColumnIndex(((java.lang.Comparable)v6));
    Object v8 = true;
    Object v9 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 82;
    Object v11 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v9).getColumnIndex(((java.lang.Comparable)v11));
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v2),((java.lang.Comparable)v7),((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeRow(((java.lang.Comparable)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v3).getColumnIndex(((java.lang.Comparable)v5));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn(((java.lang.Comparable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.SerialDate)v4));
    Object v6 = true;
    Object v7 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 82;
    Object v9 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v7).getColumnIndex(((java.lang.Comparable)v9));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v5),((java.lang.Comparable)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -41;
    Object v3 = -5;
    Object v4 = -13;
    Object v5 = 0;
    Object v6 = -1;
    Object v7 = 0;
    Object v8 = new java.util.Date((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 82;
    Object v11 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v9).intValue()),((org.jfree.data.time.SerialDate)v11));
    Object v13 = 0;
    Object v14 = 82;
    Object v15 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v14).intValue()));
    Object v16 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v13).intValue()),((org.jfree.data.time.SerialDate)v15));
    Object v17 = ((java.lang.Comparable)v12).compareTo(((java.lang.Object)v16));
    Object v18 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v8),((java.lang.Comparable)v12));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowKeys();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v3),((java.lang.Comparable)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 16;
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeRow((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnCount();
    Object v3 = 0;
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v3).intValue()),((org.jfree.data.time.SerialDate)v5));
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v8).getRowCount();
    Object v10 = 82;
    Object v11 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v8).equals(((java.lang.Object)v11));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v6),((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -36.505034035587414D;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v2),((java.lang.Comparable)v4),((java.lang.Comparable)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 11.508708411573878D;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.lang.Comparable)v8).compareTo(((java.lang.Object)v10));
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v6).getColumnIndex(((java.lang.Comparable)v8));
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v2),((java.lang.Comparable)v4),((java.lang.Comparable)v12));
    Object v13 = null;
    Object v14 = 0;
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeRow((((java.lang.Integer)v14).intValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v3).equals(((java.lang.Object)v5));
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    Object v9 = 0;
    Object v10 = 82;
    Object v11 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v9).intValue()),((org.jfree.data.time.SerialDate)v11));
    Object v13 = ((java.lang.Comparable)v8).compareTo(((java.lang.Object)v12));
    Object v14 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v6),((java.lang.Comparable)v8));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowIndex(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowCount();
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowCount();
    Object v5 = -41;
    Object v6 = -5;
    Object v7 = -13;
    Object v8 = 0;
    Object v9 = -1;
    Object v10 = 0;
    Object v11 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v4),((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues2D)v2).hashCode();
    org.junit.Assert.assertEquals((Object)(871), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v2).getValue((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = -8;
    Object v4 = -44;
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v2).getValue((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = -32;
    Object v4 = 0;
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v2).getValue((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v5).getRowCount();
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v3).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowIndex(((java.lang.Comparable)v7));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues2D)v2).clone();
    Object v4 = -13.528769031678866D;
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v6).getRowCount();
    Object v8 = 82;
    Object v9 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v6).equals(((java.lang.Object)v9));
    Object v11 = true;
    Object v12 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 82;
    Object v14 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v13).intValue()));
    Object v15 = ((org.jfree.data.DefaultKeyedValues2D)v12).equals(((java.lang.Object)v14));
    ((org.jfree.data.DefaultKeyedValues2D)v2).setValue(((java.lang.Number)v4),((java.lang.Comparable)v10),((java.lang.Comparable)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeColumn(((java.lang.Comparable)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowCount();
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v10).getRowCount();
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v8).equals(((java.lang.Object)v11));
    Object v13 = ((org.jfree.data.DefaultKeyedValues2D)v6).getRowIndex(((java.lang.Comparable)v12));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v4),((java.lang.Comparable)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v4).getColumnIndex(((java.lang.Comparable)v6));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v2).getColumnIndex(((java.lang.Comparable)v7));
    org.junit.Assert.assertEquals((Object)(-1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.lang.Comparable)v5).compareTo(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v3).getColumnIndex(((java.lang.Comparable)v5));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 1;
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    Object v7 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v7).clone();
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v8).hashCode();
    ((org.jfree.data.DefaultKeyedValues2D)v2).setValue(((java.lang.Number)v3),((java.lang.Comparable)v5),((java.lang.Comparable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    ((org.jfree.data.DefaultKeyedValues2D)v2).clear();
    Object v3 = null;
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v5).getRowCount();
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeValue(((java.lang.Comparable)v6),((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v4).getRowCount();
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeValue(((java.lang.Comparable)v5),((java.lang.Comparable)v7));
    Object v8 = null;
    Object v9 = true;
    Object v10 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v2).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v4).clone();
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v5).hashCode();
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v8).getRowCount();
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeValue(((java.lang.Comparable)v6),((java.lang.Comparable)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = 82;
    Object v9 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.lang.Comparable)v7).compareTo(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v5).getColumnIndex(((java.lang.Comparable)v7));
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v3).equals(((java.lang.Object)v11));
    Object v13 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnIndex(((java.lang.Comparable)v12));
    org.junit.Assert.assertEquals((Object)(-1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v4).getRowCount();
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v4).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v2).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v4).intValue()),((org.jfree.data.time.SerialDate)v6));
    Object v8 = true;
    Object v9 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = true;
    Object v13 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = 82;
    Object v15 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v14).intValue()));
    Object v16 = 82;
    Object v17 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v16).intValue()));
    Object v18 = ((java.lang.Comparable)v15).compareTo(((java.lang.Object)v17));
    Object v19 = ((org.jfree.data.DefaultKeyedValues2D)v13).getColumnIndex(((java.lang.Comparable)v15));
    Object v20 = ((org.jfree.data.DefaultKeyedValues2D)v11).equals(((java.lang.Object)v19));
    Object v21 = ((org.jfree.data.DefaultKeyedValues2D)v9).getColumnIndex(((java.lang.Comparable)v20));
    ((org.jfree.data.DefaultKeyedValues2D)v2).addValue(((java.lang.Number)v3),((java.lang.Comparable)v7),((java.lang.Comparable)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowKeys();
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v7).getRowCount();
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v5).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowIndex(((java.lang.Comparable)v9));
    Object v11 = true;
    Object v12 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 82;
    Object v14 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v13).intValue()));
    Object v15 = 82;
    Object v16 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v15).intValue()));
    Object v17 = ((java.lang.Comparable)v14).compareTo(((java.lang.Object)v16));
    Object v18 = ((org.jfree.data.DefaultKeyedValues2D)v12).getColumnIndex(((java.lang.Comparable)v14));
    Object v19 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v10),((java.lang.Comparable)v18));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v2).getColumnIndex(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v6).getRowCount();
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v4).equals(((java.lang.Object)v7));
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeColumn(((java.lang.Comparable)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 0;
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v3).intValue()),((org.jfree.data.time.SerialDate)v5));
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = true;
    Object v12 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = 82;
    Object v14 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v13).intValue()));
    Object v15 = 82;
    Object v16 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v15).intValue()));
    Object v17 = ((java.lang.Comparable)v14).compareTo(((java.lang.Object)v16));
    Object v18 = ((org.jfree.data.DefaultKeyedValues2D)v12).getColumnIndex(((java.lang.Comparable)v14));
    Object v19 = ((org.jfree.data.DefaultKeyedValues2D)v10).equals(((java.lang.Object)v18));
    Object v20 = ((org.jfree.data.DefaultKeyedValues2D)v8).getColumnIndex(((java.lang.Comparable)v19));
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeValue(((java.lang.Comparable)v6),((java.lang.Comparable)v20));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 0;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v2).getColumnKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v6).getRowCount();
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v2),((java.lang.Comparable)v4),((java.lang.Comparable)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 1;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v2).getRowKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v2).getRowIndex(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = -41;
    Object v4 = -5;
    Object v5 = -13;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = 0;
    Object v9 = new java.util.Date((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    Object v11 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v11).clone();
    Object v13 = true;
    Object v14 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = 82;
    Object v16 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v15).intValue()));
    Object v17 = ((org.jfree.data.DefaultKeyedValues2D)v14).getColumnIndex(((java.lang.Comparable)v16));
    Object v18 = ((org.jfree.data.DefaultKeyedValues2D)v12).getColumnIndex(((java.lang.Comparable)v17));
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeValue(((java.lang.Comparable)v9),((java.lang.Comparable)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v5).getRowKeys();
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v3).equals(((java.lang.Object)v6));
    Object v8 = true;
    Object v9 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v11).getRowKeys();
    Object v13 = ((org.jfree.data.DefaultKeyedValues2D)v9).equals(((java.lang.Object)v12));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v7),((java.lang.Comparable)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues2D)v2).getColumnKeys();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v3).equals(((java.lang.Object)v5));
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    Object v10 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v9).booleanValue()));
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v10).getRowKeys();
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v8).equals(((java.lang.Object)v11));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v6),((java.lang.Comparable)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeRow((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    ((org.jfree.data.DefaultKeyedValues2D)v2).clear();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v4).clone();
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v5).getRowIndex(((java.lang.Comparable)v7));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v2).removeValue(((java.lang.Comparable)v8),((java.lang.Comparable)v10));
    Object v11 = null;
    Object v12 = ((org.jfree.data.DefaultKeyedValues2D)v2).getColumnCount();
    org.junit.Assert.assertEquals((Object)(0), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v7).getRowCount();
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v5).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowIndex(((java.lang.Comparable)v9));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeRow(((java.lang.Comparable)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).hashCode();
    Object v3 = -21;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v3).clone();
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v6).getRowCount();
    Object v8 = 82;
    Object v9 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v8).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v4).removeValue(((java.lang.Comparable)v7),((java.lang.Comparable)v9));
    Object v10 = null;
    Object v11 = true;
    Object v12 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jfree.data.DefaultKeyedValues2D)v4).equals(((java.lang.Object)v12));
    Object v14 = true;
    Object v15 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.jfree.data.DefaultKeyedValues2D)v15).getRowCount();
    Object v17 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v13),((java.lang.Comparable)v16));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues2D)v2).getRowKeys();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v4).intValue()),((org.jfree.data.time.SerialDate)v6));
    Object v8 = true;
    Object v9 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v9).clone();
    Object v11 = true;
    Object v12 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v11).booleanValue()));
    Object v13 = ((org.jfree.data.DefaultKeyedValues2D)v12).clone();
    Object v14 = 82;
    Object v15 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.jfree.data.DefaultKeyedValues2D)v13).getRowIndex(((java.lang.Comparable)v15));
    Object v17 = 82;
    Object v18 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v17).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v10).removeValue(((java.lang.Comparable)v16),((java.lang.Comparable)v18));
    Object v19 = null;
    Object v20 = ((org.jfree.data.DefaultKeyedValues2D)v10).getColumnCount();
    ((org.jfree.data.DefaultKeyedValues2D)v2).setValue(((java.lang.Number)v3),((java.lang.Comparable)v7),((java.lang.Comparable)v20));
    Object v21 = null;
    Object v22 = 1;
    Object v23 = true;
    Object v24 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v23).booleanValue()));
    Object v25 = ((org.jfree.data.DefaultKeyedValues2D)v24).getRowCount();
    Object v26 = 82;
    Object v27 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v26).intValue()));
    Object v28 = ((org.jfree.data.DefaultKeyedValues2D)v24).equals(((java.lang.Object)v27));
    Object v29 = 82;
    Object v30 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v29).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v2).addValue(((java.lang.Number)v22),((java.lang.Comparable)v28),((java.lang.Comparable)v30));
    Object v31 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v2).getValue((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = 82;
    Object v9 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v8).intValue()));
    Object v10 = 82;
    Object v11 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v10).intValue()));
    Object v12 = ((java.lang.Comparable)v9).compareTo(((java.lang.Object)v11));
    Object v13 = ((org.jfree.data.DefaultKeyedValues2D)v7).getColumnIndex(((java.lang.Comparable)v9));
    Object v14 = ((org.jfree.data.DefaultKeyedValues2D)v5).equals(((java.lang.Object)v13));
    Object v15 = ((org.jfree.data.DefaultKeyedValues2D)v3).getColumnIndex(((java.lang.Comparable)v14));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn(((java.lang.Comparable)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues2D)v2).getColumnCount();
    org.junit.Assert.assertEquals((Object)(0), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowCount();
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v3).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.SerialDate)v4));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn(((java.lang.Comparable)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 7;
    Object v3 = 1;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 82;
    Object v3 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v2).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn(((java.lang.Comparable)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getColumnKeys();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowCount();
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue(((java.lang.Comparable)v4),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 9;
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeColumn((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).getRowCount();
    Object v3 = 14.253896366613686D;
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 82;
    Object v7 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v6).intValue()));
    Object v8 = 82;
    Object v9 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v8).intValue()));
    Object v10 = ((java.lang.Comparable)v7).compareTo(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v5).getColumnIndex(((java.lang.Comparable)v7));
    Object v12 = true;
    Object v13 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.jfree.data.DefaultKeyedValues2D)v13).getRowCount();
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v3),((java.lang.Comparable)v11),((java.lang.Comparable)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues2D();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = 82;
    Object v6 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues2D)v4).getColumnIndex(((java.lang.Comparable)v6));
    Object v8 = true;
    Object v9 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = true;
    Object v11 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 82;
    Object v13 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v12).intValue()));
    Object v14 = 82;
    Object v15 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.lang.Comparable)v13).compareTo(((java.lang.Object)v15));
    Object v17 = ((org.jfree.data.DefaultKeyedValues2D)v11).getColumnIndex(((java.lang.Comparable)v13));
    Object v18 = ((org.jfree.data.DefaultKeyedValues2D)v9).equals(((java.lang.Object)v17));
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v2),((java.lang.Comparable)v7),((java.lang.Comparable)v18));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    Object v6 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v8).getRowKeys();
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v6).equals(((java.lang.Object)v9));
    ((org.jfree.data.DefaultKeyedValues2D)v1).setValue(((java.lang.Number)v2),((java.lang.Comparable)v4),((java.lang.Comparable)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues2D();
    Object v1 = true;
    Object v2 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v1).booleanValue()));
    Object v3 = true;
    Object v4 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues2D)v4).getRowKeys();
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v2).equals(((java.lang.Object)v5));
    Object v7 = 82;
    Object v8 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v7).intValue()));
    ((org.jfree.data.DefaultKeyedValues2D)v0).removeValue(((java.lang.Comparable)v6),((java.lang.Comparable)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowIndex(((java.lang.Comparable)v5));
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v8).getRowIndex(((java.lang.Comparable)v10));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v6),((java.lang.Comparable)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 82;
    Object v4 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v3).intValue()));
    Object v5 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v2).intValue()),((org.jfree.data.time.SerialDate)v4));
    Object v6 = ((org.jfree.data.DefaultKeyedValues2D)v1).equals(((java.lang.Object)v5));
    Object v7 = -41;
    Object v8 = -5;
    Object v9 = -13;
    Object v10 = 0;
    Object v11 = -1;
    Object v12 = 0;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = 82;
    Object v17 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v16).intValue()));
    Object v18 = 82;
    Object v19 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v18).intValue()));
    Object v20 = ((java.lang.Comparable)v17).compareTo(((java.lang.Object)v19));
    Object v21 = ((org.jfree.data.DefaultKeyedValues2D)v15).getColumnIndex(((java.lang.Comparable)v17));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeValue(((java.lang.Comparable)v13),((java.lang.Comparable)v21));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 35;
    Object v3 = -22;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = ((org.jfree.data.DefaultKeyedValues2D)v1).clone();
    Object v3 = -82;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v2).getColumnKey((((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = -12.919311512085047D;
    Object v3 = 0;
    Object v4 = 82;
    Object v5 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v4).intValue()));
    Object v6 = org.jfree.data.time.SerialDate.addYears((((java.lang.Integer)v3).intValue()),((org.jfree.data.time.SerialDate)v5));
    Object v7 = true;
    Object v8 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = 82;
    Object v10 = org.jfree.data.time.SerialDate.createInstance((((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jfree.data.DefaultKeyedValues2D)v8).getRowIndex(((java.lang.Comparable)v10));
    ((org.jfree.data.DefaultKeyedValues2D)v1).addValue(((java.lang.Number)v2),((java.lang.Comparable)v6),((java.lang.Comparable)v11));
    Object v12 = null;
    Object v13 = 0;
    Object v14 = 66;
    Object v15 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((org.jfree.data.DefaultKeyedValues2D)v1).getValue((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = false;
    Object v1 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v0).booleanValue()));
    Object v2 = true;
    Object v3 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = true;
    Object v5 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = true;
    Object v7 = new org.jfree.data.DefaultKeyedValues2D((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues2D)v7).getRowCount();
    Object v9 = ((org.jfree.data.DefaultKeyedValues2D)v5).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.DefaultKeyedValues2D)v3).getRowIndex(((java.lang.Comparable)v9));
    ((org.jfree.data.DefaultKeyedValues2D)v1).removeRow(((java.lang.Comparable)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
