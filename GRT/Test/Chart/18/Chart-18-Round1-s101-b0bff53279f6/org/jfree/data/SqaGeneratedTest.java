package org.jfree.data;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 29;
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = new org.jfree.data.time.Minute(((java.util.Date)v3));
    Object v5 = new org.jfree.data.time.Second((((java.lang.Integer)v1).intValue()),((org.jfree.data.time.Minute)v4));
    Object v6 = 0;
    ((org.jfree.data.DefaultKeyedValues)v0).setValue(((java.lang.Comparable)v5),((java.lang.Number)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    ((org.jfree.data.DefaultKeyedValues)v0).removeValue(((java.lang.Comparable)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((java.lang.Comparable)v2).compareTo(((java.lang.Object)v4));
    ((org.jfree.data.DefaultKeyedValues)v0).removeValue(((java.lang.Comparable)v2));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v0).getValue(((java.lang.Comparable)v2));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 54;
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 0;
    ((org.jfree.data.DefaultKeyedValues)v0).insertValue((((java.lang.Integer)v1).intValue()),((java.lang.Comparable)v3),((java.lang.Number)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v0).getIndex(((java.lang.Comparable)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 29;
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = new org.jfree.data.time.Minute(((java.util.Date)v3));
    Object v5 = new org.jfree.data.time.Second((((java.lang.Integer)v1).intValue()),((org.jfree.data.time.Minute)v4));
    Object v6 = new org.jfree.data.DefaultKeyedValues();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v6).equals(((java.lang.Object)v8));
    Object v10 = ((java.lang.Comparable)v5).compareTo(((java.lang.Object)v9));
    Object v11 = 30.25164404567416D;
    ((org.jfree.data.DefaultKeyedValues)v0).setValue(((java.lang.Comparable)v5),((java.lang.Number)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 83;
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 0;
    ((org.jfree.data.DefaultKeyedValues)v0).insertValue((((java.lang.Integer)v1).intValue()),((java.lang.Comparable)v3),((java.lang.Number)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 41.67554857559526D;
    ((org.jfree.data.DefaultKeyedValues)v1).addValue(((java.lang.Comparable)v3),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = new org.jfree.data.DefaultKeyedValues();
    Object v8 = 1L;
    Object v9 = new java.util.Date((((java.lang.Long)v8).longValue()));
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v7).equals(((java.lang.Object)v9));
    Object v11 = 0;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v6).intValue()),((java.lang.Comparable)v10),((java.lang.Number)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 1.0D;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v3),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    Object v6 = -21;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v1).getKey((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = null;
    ((org.jfree.data.DefaultKeyedValues)v1).sortByValues(((org.jfree.chart.util.SortOrder)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).hashCode();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = new org.jfree.data.time.Minute(((java.util.Date)v3));
    Object v5 = 0.0D;
    ((org.jfree.data.DefaultKeyedValues)v1).addValue(((java.lang.Comparable)v4),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = new org.jfree.data.DefaultKeyedValues();
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v7).clone();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v8).hashCode();
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v9));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1;
    ((org.jfree.data.DefaultKeyedValues)v0).removeValue((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = -29;
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = 5.986485427952595D;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v4),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).equals(((java.lang.Object)v4));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v0).equals(((java.lang.Object)v3));
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = 0;
    ((org.jfree.data.DefaultKeyedValues)v0).setValue(((java.lang.Comparable)v6),((java.lang.Number)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = new org.jfree.data.time.Minute(((java.util.Date)v5));
    Object v7 = 0.0D;
    ((org.jfree.data.DefaultKeyedValues)v3).addValue(((java.lang.Comparable)v6),(((java.lang.Double)v7).doubleValue()));
    Object v8 = null;
    Object v9 = new org.jfree.data.DefaultKeyedValues();
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v9).clone();
    Object v11 = ((org.jfree.data.DefaultKeyedValues)v10).hashCode();
    Object v12 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v11));
    Object v13 = ((org.jfree.data.DefaultKeyedValues)v1).getValue(((java.lang.Comparable)v12));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = new org.jfree.data.DefaultKeyedValues();
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v5).clone();
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v6).hashCode();
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v4).getIndex(((java.lang.Comparable)v7));
    Object v9 = -3.922982158660167D;
    ((org.jfree.data.DefaultKeyedValues)v2).addValue(((java.lang.Comparable)v8),((java.lang.Number)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = -70;
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = -11.993828786318156D;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).getIndex(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    ((org.jfree.data.DefaultKeyedValues)v1).clear();
    Object v2 = null;
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).hashCode();
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v5));
    org.junit.Assert.assertEquals((Object)(-1), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v5));
    Object v7 = 30.95595645121545D;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v6),((java.lang.Number)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).getIndex(((java.lang.Comparable)v4));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v1).getValue(((java.lang.Comparable)v5));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = 0;
    ((org.jfree.data.DefaultKeyedValues)v0).setValue(((java.lang.Comparable)v2),((java.lang.Number)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v5));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 0;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v3),((java.lang.Number)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).hashCode();
    org.junit.Assert.assertEquals((Object)(1), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v5));
    Object v7 = 14.916034641489244D;
    ((org.jfree.data.DefaultKeyedValues)v1).addValue(((java.lang.Comparable)v6),((java.lang.Number)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = 8.4681543646081946E18D;
    ((org.jfree.data.DefaultKeyedValues)v1).addValue(((java.lang.Comparable)v3),((java.lang.Number)v4));
    Object v5 = null;
    Object v6 = new org.jfree.data.DefaultKeyedValues();
    Object v7 = 1L;
    Object v8 = new java.util.Date((((java.lang.Long)v7).longValue()));
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v6).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v9));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = 0;
    ((org.jfree.data.DefaultKeyedValues)v0).setValue(((java.lang.Comparable)v3),((java.lang.Number)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 74;
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).hashCode();
    Object v6 = 0;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v5),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v5).hashCode();
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v6));
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 0;
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v1).getValue((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).hashCode();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v5));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = -25;
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue((((java.lang.Integer)v2).intValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = 82.6857359358446D;
    ((org.jfree.data.DefaultKeyedValues)v1).addValue(((java.lang.Comparable)v3),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = new org.jfree.data.time.Minute(((java.util.Date)v3));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).getIndex(((java.lang.Comparable)v4));
    Object v6 = -47.670147786744636D;
    ((org.jfree.data.DefaultKeyedValues)v1).addValue(((java.lang.Comparable)v5),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v1).getItemCount();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).getValue(((java.lang.Comparable)v3));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).getIndex(((java.lang.Comparable)v4));
    Object v6 = 0;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v5),((java.lang.Number)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).equals(((java.lang.Object)v4));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 29;
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = new org.jfree.data.time.Minute(((java.util.Date)v3));
    Object v5 = new org.jfree.data.time.Second((((java.lang.Integer)v1).intValue()),((org.jfree.data.time.Minute)v4));
    ((org.jfree.data.DefaultKeyedValues)v0).removeValue(((java.lang.Comparable)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v4).getIndex(((java.lang.Comparable)v6));
    Object v8 = -47.670147786744636D;
    ((org.jfree.data.DefaultKeyedValues)v3).addValue(((java.lang.Comparable)v7),(((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v3).getItemCount();
    Object v11 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v10));
    org.junit.Assert.assertEquals((Object)(-1), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = -52;
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v1).getKey((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    ((org.jfree.data.DefaultKeyedValues)v1).clear();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 0;
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = new org.jfree.data.DefaultKeyedValues();
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v5).clone();
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v6).hashCode();
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v4).getIndex(((java.lang.Comparable)v7));
    Object v9 = 25.302439385295685D;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v8),((java.lang.Number)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = -42;
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).hashCode();
    Object v5 = -29.50590304025685D;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v4),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).getIndex(((java.lang.Comparable)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v3));
    Object v5 = -27.24924824376209D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = new org.jfree.data.DefaultKeyedValues();
    Object v8 = new org.jfree.data.DefaultKeyedValues();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v8).hashCode();
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v7).equals(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.DefaultKeyedValues)v0).getValue(((java.lang.Comparable)v10));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v5));
    ((org.jfree.data.DefaultKeyedValues)v0).removeValue(((java.lang.Comparable)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).hashCode();
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = -14;
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v4).getIndex(((java.lang.Comparable)v6));
    Object v8 = -22.611547311966802D;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v7),((java.lang.Number)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = -1.3388190822816715D;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v3),(((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = 1L;
    Object v2 = new java.util.Date((((java.lang.Long)v1).longValue()));
    Object v3 = -48.17449184240025D;
    ((org.jfree.data.DefaultKeyedValues)v0).setValue(((java.lang.Comparable)v2),((java.lang.Number)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = 1.917839439756077D;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v3),((java.lang.Number)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    Object v6 = new org.jfree.data.DefaultKeyedValues();
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v6).clone();
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v7).hashCode();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v5).getIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v9));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v5).hashCode();
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v6));
    Object v8 = 0;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v7),((java.lang.Number)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = new org.jfree.data.DefaultKeyedValues();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v8).clone();
    Object v10 = new org.jfree.data.DefaultKeyedValues();
    Object v11 = 1L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.jfree.data.DefaultKeyedValues)v10).equals(((java.lang.Object)v12));
    Object v14 = ((org.jfree.data.DefaultKeyedValues)v9).equals(((java.lang.Object)v13));
    ((org.jfree.data.DefaultKeyedValues)v7).removeValue(((java.lang.Comparable)v14));
    Object v15 = null;
    Object v16 = ((org.jfree.data.DefaultKeyedValues)v7).getItemCount();
    org.junit.Assert.assertEquals((Object)(0), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v2).equals(((java.lang.Object)v4));
    Object v6 = -32.58579342657123D;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v5),((java.lang.Number)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v1).getIndex(((java.lang.Comparable)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = -30;
    ((org.jfree.data.DefaultKeyedValues)v7).removeValue((((java.lang.Integer)v8).intValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v5).getIndex(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v8));
    Object v10 = 1;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v9),((java.lang.Number)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = 32;
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v7).getValue((((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v5).getIndex(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v8));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v5).getIndex(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v8));
    Object v10 = new org.jfree.data.DefaultKeyedValues();
    Object v11 = ((org.jfree.data.DefaultKeyedValues)v10).clone();
    ((org.jfree.data.DefaultKeyedValues)v11).clear();
    Object v12 = null;
    Object v13 = new org.jfree.data.DefaultKeyedValues();
    Object v14 = ((org.jfree.data.DefaultKeyedValues)v13).clone();
    Object v15 = ((org.jfree.data.DefaultKeyedValues)v14).hashCode();
    Object v16 = ((org.jfree.data.DefaultKeyedValues)v11).getIndex(((java.lang.Comparable)v15));
    Object v17 = ((java.lang.Comparable)v9).compareTo(((java.lang.Object)v16));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v9));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 1L;
    Object v3 = new java.util.Date((((java.lang.Long)v2).longValue()));
    Object v4 = -26.01514521073098D;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v3),((java.lang.Number)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v5));
    Object v7 = 2.0D;
    ((org.jfree.data.DefaultKeyedValues)v1).setValue(((java.lang.Comparable)v6),((java.lang.Number)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = 0;
    ((org.jfree.data.DefaultKeyedValues)v2).removeValue((((java.lang.Integer)v3).intValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v4).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v3).equals(((java.lang.Object)v7));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    Object v6 = 1L;
    Object v7 = new java.util.Date((((java.lang.Long)v6).longValue()));
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v5).getIndex(((java.lang.Comparable)v7));
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v2).getValue(((java.lang.Comparable)v8));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    ((org.jfree.data.DefaultKeyedValues)v1).clear();
    Object v2 = null;
    Object v3 = 8;
    Object v4 = new org.jfree.data.DefaultKeyedValues();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).clone();
    ((org.jfree.data.DefaultKeyedValues)v5).clear();
    Object v6 = null;
    Object v7 = new org.jfree.data.DefaultKeyedValues();
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v7).clone();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v8).hashCode();
    Object v10 = ((org.jfree.data.DefaultKeyedValues)v5).getIndex(((java.lang.Comparable)v9));
    Object v11 = new org.jfree.data.DefaultKeyedValues();
    Object v12 = ((org.jfree.data.DefaultKeyedValues)v11).clone();
    ((org.jfree.data.DefaultKeyedValues)v12).clear();
    Object v13 = null;
    Object v14 = new org.jfree.data.DefaultKeyedValues();
    Object v15 = ((org.jfree.data.DefaultKeyedValues)v14).clone();
    Object v16 = ((org.jfree.data.DefaultKeyedValues)v15).hashCode();
    Object v17 = ((org.jfree.data.DefaultKeyedValues)v12).getIndex(((java.lang.Comparable)v16));
    Object v18 = ((java.lang.Comparable)v10).compareTo(((java.lang.Object)v17));
    Object v19 = 1;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v3).intValue()),((java.lang.Comparable)v10),((java.lang.Number)v19));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v4).hashCode();
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v2).getIndex(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).getValue(((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v4).getIndex(((java.lang.Comparable)v6));
    Object v8 = new org.jfree.data.DefaultKeyedValues();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v8).clone();
    Object v10 = new org.jfree.data.DefaultKeyedValues();
    Object v11 = 1L;
    Object v12 = new java.util.Date((((java.lang.Long)v11).longValue()));
    Object v13 = ((org.jfree.data.DefaultKeyedValues)v10).getIndex(((java.lang.Comparable)v12));
    Object v14 = -47.670147786744636D;
    ((org.jfree.data.DefaultKeyedValues)v9).addValue(((java.lang.Comparable)v13),(((java.lang.Double)v14).doubleValue()));
    Object v15 = null;
    Object v16 = ((org.jfree.data.DefaultKeyedValues)v9).getItemCount();
    Object v17 = ((java.lang.Comparable)v7).compareTo(((java.lang.Object)v16));
    ((org.jfree.data.DefaultKeyedValues)v1).removeValue(((java.lang.Comparable)v7));
    Object v18 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = new org.jfree.data.DefaultKeyedValues();
    Object v9 = 1L;
    Object v10 = new java.util.Date((((java.lang.Long)v9).longValue()));
    Object v11 = ((org.jfree.data.DefaultKeyedValues)v8).equals(((java.lang.Object)v10));
    Object v12 = ((org.jfree.data.DefaultKeyedValues)v7).getValue(((java.lang.Comparable)v11));
    org.junit.Assert.assertEquals((Object)(-56.853291451078015D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    ((org.jfree.data.DefaultKeyedValues)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = ((org.jfree.data.DefaultKeyedValues)v7).getItemCount();
    org.junit.Assert.assertEquals((Object)(1), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = 0;
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v7).getValue((((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.data.DefaultKeyedValues();
    Object v11 = ((org.jfree.data.DefaultKeyedValues)v10).clone();
    Object v12 = ((org.jfree.data.DefaultKeyedValues)v11).clone();
    Object v13 = 1L;
    Object v14 = new java.util.Date((((java.lang.Long)v13).longValue()));
    Object v15 = ((org.jfree.data.DefaultKeyedValues)v12).getIndex(((java.lang.Comparable)v14));
    ((org.jfree.data.DefaultKeyedValues)v7).removeValue(((java.lang.Comparable)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = ((org.jfree.data.DefaultKeyedValues)v1).clone();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).getKeys();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = ((org.jfree.data.DefaultKeyedValues)v0).getValue(((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = 51;
    Object v3 = 1L;
    Object v4 = new java.util.Date((((java.lang.Long)v3).longValue()));
    Object v5 = new org.jfree.data.time.Minute(((java.util.Date)v4));
    Object v6 = 1;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v5),((java.lang.Number)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).clone();
    Object v4 = 1L;
    Object v5 = new java.util.Date((((java.lang.Long)v4).longValue()));
    Object v6 = ((org.jfree.data.DefaultKeyedValues)v3).getIndex(((java.lang.Comparable)v5));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v1).getValue(((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = new org.jfree.data.DefaultKeyedValues();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v8).clone();
    Object v10 = 1L;
    Object v11 = new java.util.Date((((java.lang.Long)v10).longValue()));
    Object v12 = ((org.jfree.data.DefaultKeyedValues)v9).getIndex(((java.lang.Comparable)v11));
    Object v13 = 0;
    ((org.jfree.data.DefaultKeyedValues)v7).setValue(((java.lang.Comparable)v12),((java.lang.Number)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = new org.jfree.data.DefaultKeyedValues();
    Object v2 = new org.jfree.data.DefaultKeyedValues();
    Object v3 = ((org.jfree.data.DefaultKeyedValues)v2).hashCode();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v1).equals(((java.lang.Object)v3));
    Object v5 = -56.853291451078015D;
    ((org.jfree.data.DefaultKeyedValues)v0).addValue(((java.lang.Comparable)v4),((java.lang.Number)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v8 = new org.jfree.data.DefaultKeyedValues();
    Object v9 = ((org.jfree.data.DefaultKeyedValues)v8).clone();
    Object v10 = new org.jfree.data.DefaultKeyedValues();
    Object v11 = ((org.jfree.data.DefaultKeyedValues)v10).clone();
    Object v12 = 1L;
    Object v13 = new java.util.Date((((java.lang.Long)v12).longValue()));
    Object v14 = ((org.jfree.data.DefaultKeyedValues)v11).equals(((java.lang.Object)v13));
    Object v15 = ((org.jfree.data.DefaultKeyedValues)v9).equals(((java.lang.Object)v14));
    ((org.jfree.data.DefaultKeyedValues)v7).removeValue(((java.lang.Comparable)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jfree.data.DefaultKeyedValues();
    Object v1 = ((org.jfree.data.DefaultKeyedValues)v0).clone();
    Object v2 = -17;
    Object v3 = new org.jfree.data.DefaultKeyedValues();
    Object v4 = ((org.jfree.data.DefaultKeyedValues)v3).clone();
    Object v5 = 1L;
    Object v6 = new java.util.Date((((java.lang.Long)v5).longValue()));
    Object v7 = ((org.jfree.data.DefaultKeyedValues)v4).getIndex(((java.lang.Comparable)v6));
    Object v8 = 0;
    ((org.jfree.data.DefaultKeyedValues)v1).insertValue((((java.lang.Integer)v2).intValue()),((java.lang.Comparable)v7),((java.lang.Number)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
