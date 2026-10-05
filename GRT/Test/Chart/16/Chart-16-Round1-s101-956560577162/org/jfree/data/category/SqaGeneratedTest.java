package org.jfree.data.category;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getCategoryCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 7;
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKey((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).getCategoryCount();
    Object v10 = 1;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setEndValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryCount();
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v12).getCategoryCount();
    Object v14 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getEndValue(((java.lang.Comparable)v8),((java.lang.Comparable)v13));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = -18;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).getCategoryCount();
    Object v10 = 0;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setStartValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 20;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).getCategoryCount();
    Object v10 = 3.6397728814591948D;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setStartValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryCount();
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getCategoryIndex(((java.lang.Comparable)v8));
    org.junit.Assert.assertEquals((Object)(-1), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).getCategoryCount();
    Object v13 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryIndex(((java.lang.Comparable)v12));
    Object v14 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).equals(((java.lang.Object)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getSeriesCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    ((org.jfree.data.general.AbstractDataset)v3).validateObject();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null};
    Object v1 = new java.lang.Comparable[]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new java.lang.Number[][]{null,null};
    Object v4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((java.lang.Number[][])v2),((java.lang.Number[][])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnKeys();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getEndValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 55;
    Object v5 = 1;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 0;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).getSeriesCount();
    Object v10 = 72.53693147697471D;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setStartValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryCount();
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = new java.lang.String[]{"Null 'paint' argument."};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new java.lang.Number[][]{};
    Object v16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v13),((java.lang.Number[][])v14),((java.lang.Number[][])v15));
    Object v17 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v12).equals(((java.lang.Object)v16));
    Object v18 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue(((java.lang.Comparable)v8),((java.lang.Comparable)v17));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 0;
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnKey((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.Comparable[]{};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setCategoryKeys(((java.lang.Comparable[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    ((org.jfree.data.general.AbstractDataset)v3).validateObject();
    Object v4 = null;
    Object v5 = 6;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKey((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).getCategoryCount();
    Object v13 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryIndex(((java.lang.Comparable)v12));
    Object v14 = ((org.jfree.data.general.AbstractSeriesDataset)v3).indexOf(((java.lang.Comparable)v13));
    org.junit.Assert.assertEquals((Object)(-1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = -6;
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getSeriesKey((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    ((org.jfree.data.general.AbstractDataset)v3).validateObject();
    Object v4 = null;
    Object v5 = ((org.jfree.data.general.AbstractDataset)v3).getGroup();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).equals(((java.lang.Object)v11));
    Object v13 = ((org.jfree.data.general.AbstractSeriesDataset)v3).indexOf(((java.lang.Comparable)v12));
    org.junit.Assert.assertEquals((Object)(-1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.Comparable[]{};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setCategoryKeys(((java.lang.Comparable[])v4));
    Object v5 = null;
    Object v6 = 12;
    Object v7 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnKey((((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.Comparable[]{null,null,null};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setSeriesKeys(((java.lang.Comparable[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = 1;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).equals(((java.lang.Object)v11));
    Object v13 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnIndex(((java.lang.Comparable)v12));
    org.junit.Assert.assertEquals((Object)(-1), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 20;
    Object v5 = 0;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getSeriesCount();
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = new java.lang.String[]{"Null 'paint' argument."};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new java.lang.Number[][]{};
    Object v16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v13),((java.lang.Number[][])v14),((java.lang.Number[][])v15));
    Object v17 = new java.lang.String[]{"Null 'paint' argument."};
    Object v18 = new java.lang.Number[][]{};
    Object v19 = new java.lang.Number[][]{};
    Object v20 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v17),((java.lang.Number[][])v18),((java.lang.Number[][])v19));
    Object v21 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v16).equals(((java.lang.Object)v20));
    Object v22 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v12).getColumnIndex(((java.lang.Comparable)v21));
    Object v23 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue(((java.lang.Comparable)v8),((java.lang.Comparable)v22));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.data.general.DefaultPieDataset();
    Object v5 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v4));
    ((org.jfree.data.general.AbstractDataset)v3).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v5));
    Object v6 = null;
    Object v7 = 26;
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKey((((java.lang.Integer)v7).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null,null};
    Object v1 = new java.lang.Comparable[]{null,null,null};
    Object v2 = new java.lang.Number[][]{null,null};
    Object v3 = new java.lang.Number[][]{null};
    Object v4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((java.lang.Number[][])v2),((java.lang.Number[][])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryCount();
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = new java.lang.String[]{"Null 'paint' argument."};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new java.lang.Number[][]{};
    Object v16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v13),((java.lang.Number[][])v14),((java.lang.Number[][])v15));
    Object v17 = new java.lang.String[]{"Null 'paint' argument."};
    Object v18 = new java.lang.Number[][]{};
    Object v19 = new java.lang.Number[][]{};
    Object v20 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v17),((java.lang.Number[][])v18),((java.lang.Number[][])v19));
    Object v21 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v16).equals(((java.lang.Object)v20));
    Object v22 = ((org.jfree.data.general.AbstractSeriesDataset)v12).indexOf(((java.lang.Comparable)v21));
    Object v23 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getEndValue(((java.lang.Comparable)v8),((java.lang.Comparable)v22));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.data.general.DefaultPieDataset();
    Object v5 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v4));
    ((org.jfree.data.general.AbstractDataset)v3).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v5));
    Object v6 = null;
    Object v7 = new java.lang.String[]{"Null 'paint' argument."};
    Object v8 = new java.lang.Number[][]{};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v7),((java.lang.Number[][])v8),((java.lang.Number[][])v9));
    Object v11 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v10).getCategoryCount();
    Object v12 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getSeriesIndex(((java.lang.Comparable)v11));
    org.junit.Assert.assertEquals((Object)(-1), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).equals(((java.lang.Object)v15));
    Object v17 = ((org.jfree.data.general.AbstractSeriesDataset)v7).indexOf(((java.lang.Comparable)v16));
    Object v18 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getSeriesIndex(((java.lang.Comparable)v17));
    org.junit.Assert.assertEquals((Object)(-1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.general.AbstractDataset)v3).hasListener(((java.util.EventListener)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).equals(((java.lang.Object)v15));
    Object v17 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getColumnIndex(((java.lang.Comparable)v16));
    Object v18 = new java.lang.String[]{"Null 'paint' argument."};
    Object v19 = new java.lang.Number[][]{};
    Object v20 = new java.lang.Number[][]{};
    Object v21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v18),((java.lang.Number[][])v19),((java.lang.Number[][])v20));
    Object v22 = new java.lang.String[]{"Null 'paint' argument."};
    Object v23 = new java.lang.Number[][]{};
    Object v24 = new java.lang.Number[][]{};
    Object v25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v22),((java.lang.Number[][])v23),((java.lang.Number[][])v24));
    Object v26 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v21).equals(((java.lang.Object)v25));
    Object v27 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getValue(((java.lang.Comparable)v17),((java.lang.Comparable)v26));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.general.AbstractDataset)v3).hasListener(((java.util.EventListener)v7));
    Object v9 = -9;
    Object v10 = 50;
    Object v11 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = -18;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).getSeriesCount();
    Object v10 = 10.943084774394434D;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setEndValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultPieDataset();
    Object v1 = new java.lang.String[]{"Null 'paint' argument."};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new java.lang.Number[][]{};
    Object v4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v1),((java.lang.Number[][])v2),((java.lang.Number[][])v3));
    ((org.jfree.data.general.AbstractDataset)v4).validateObject();
    Object v5 = null;
    Object v6 = ((org.jfree.data.general.AbstractDataset)v4).getGroup();
    ((org.jfree.data.general.AbstractDataset)v0).setGroup(((org.jfree.data.general.DatasetGroup)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnKeys();
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = ((org.jfree.data.general.AbstractDataset)v8).hasListener(((java.util.EventListener)v12));
    Object v14 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnIndex(((java.lang.Comparable)v13));
    org.junit.Assert.assertEquals((Object)(-1), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.data.general.DefaultPieDataset();
    Object v5 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v4));
    ((org.jfree.data.general.AbstractDataset)v3).removeChangeListener(((org.jfree.data.general.DatasetChangeListener)v5));
    Object v6 = null;
    Object v7 = new org.jfree.data.general.DefaultPieDataset();
    Object v8 = new org.jfree.data.general.SeriesChangeEvent(((java.lang.Object)v7));
    Object v9 = ((java.util.EventObject)v8).toString();
    ((org.jfree.data.general.AbstractSeriesDataset)v3).seriesChanged(((org.jfree.data.general.SeriesChangeEvent)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 0;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).getSeriesCount();
    Object v10 = -12.902463090055681D;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setEndValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v9),((java.lang.Number)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).equals(((java.lang.Object)v15));
    Object v17 = ((org.jfree.data.general.AbstractSeriesDataset)v7).indexOf(((java.lang.Comparable)v16));
    Object v18 = new java.lang.String[]{"Null 'paint' argument."};
    Object v19 = new java.lang.Number[][]{};
    Object v20 = new java.lang.Number[][]{};
    Object v21 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v18),((java.lang.Number[][])v19),((java.lang.Number[][])v20));
    Object v22 = new java.lang.String[]{"Null 'paint' argument."};
    Object v23 = new java.lang.Number[][]{};
    Object v24 = new java.lang.Number[][]{};
    Object v25 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v22),((java.lang.Number[][])v23),((java.lang.Number[][])v24));
    Object v26 = new java.lang.String[]{"Null 'paint' argument."};
    Object v27 = new java.lang.Number[][]{};
    Object v28 = new java.lang.Number[][]{};
    Object v29 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v26),((java.lang.Number[][])v27),((java.lang.Number[][])v28));
    Object v30 = new java.lang.String[]{"Null 'paint' argument."};
    Object v31 = new java.lang.Number[][]{};
    Object v32 = new java.lang.Number[][]{};
    Object v33 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v30),((java.lang.Number[][])v31),((java.lang.Number[][])v32));
    Object v34 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v29).equals(((java.lang.Object)v33));
    Object v35 = ((org.jfree.data.general.AbstractSeriesDataset)v25).indexOf(((java.lang.Comparable)v34));
    Object v36 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v21).getSeriesIndex(((java.lang.Comparable)v35));
    Object v37 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getValue(((java.lang.Comparable)v17),((java.lang.Comparable)v36));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.general.AbstractDataset)v3).hasListener(((java.util.EventListener)v7));
    Object v9 = new org.jfree.data.general.DefaultPieDataset();
    Object v10 = new org.jfree.data.general.SeriesChangeEvent(((java.lang.Object)v9));
    ((org.jfree.data.general.AbstractSeriesDataset)v3).seriesChanged(((org.jfree.data.general.SeriesChangeEvent)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    ((org.jfree.data.general.AbstractDataset)v7).validateObject();
    Object v8 = null;
    Object v9 = ((org.jfree.data.general.AbstractDataset)v7).getGroup();
    ((org.jfree.data.general.AbstractDataset)v3).setGroup(((org.jfree.data.general.DatasetGroup)v9));
    Object v10 = null;
    Object v11 = new java.lang.Comparable[]{};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setSeriesKeys(((java.lang.Comparable[])v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnKeys();
    Object v5 = 2;
    Object v6 = new java.lang.String[]{"Null 'paint' argument."};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new java.lang.Number[][]{};
    Object v9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v6),((java.lang.Number[][])v7),((java.lang.Number[][])v8));
    Object v10 = new java.lang.String[]{"Null 'paint' argument."};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new java.lang.Number[][]{};
    Object v13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v10),((java.lang.Number[][])v11),((java.lang.Number[][])v12));
    Object v14 = ((org.jfree.data.general.AbstractDataset)v9).hasListener(((java.util.EventListener)v13));
    Object v15 = 0;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setEndValue((((java.lang.Integer)v5).intValue()),((java.lang.Comparable)v14),((java.lang.Number)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKeys();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    ((org.jfree.data.general.AbstractDataset)v7).validateObject();
    Object v8 = null;
    Object v9 = ((org.jfree.data.general.AbstractDataset)v7).getGroup();
    ((org.jfree.data.general.AbstractDataset)v3).setGroup(((org.jfree.data.general.DatasetGroup)v9));
    Object v10 = null;
    Object v11 = new java.lang.Comparable[]{null,null};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setCategoryKeys(((java.lang.Comparable[])v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.Comparable[]{null,null};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setSeriesKeys(((java.lang.Comparable[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 0;
    Object v5 = 22;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getEndValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getColumnKeys();
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = new java.lang.String[]{"Null 'paint' argument."};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new java.lang.Number[][]{};
    Object v16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v13),((java.lang.Number[][])v14),((java.lang.Number[][])v15));
    Object v17 = ((org.jfree.data.general.AbstractDataset)v12).hasListener(((java.util.EventListener)v16));
    Object v18 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getColumnIndex(((java.lang.Comparable)v17));
    Object v19 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getCategoryIndex(((java.lang.Comparable)v18));
    org.junit.Assert.assertEquals((Object)(-1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 0;
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKey((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = 1;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).getSeriesKey((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v15).getCategoryCount();
    Object v17 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).getCategoryIndex(((java.lang.Comparable)v16));
    Object v18 = ((org.jfree.data.general.AbstractSeriesDataset)v7).indexOf(((java.lang.Comparable)v17));
    Object v19 = new java.lang.String[]{"Null 'paint' argument."};
    Object v20 = new java.lang.Number[][]{};
    Object v21 = new java.lang.Number[][]{};
    Object v22 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v19),((java.lang.Number[][])v20),((java.lang.Number[][])v21));
    Object v23 = new java.lang.String[]{"Null 'paint' argument."};
    Object v24 = new java.lang.Number[][]{};
    Object v25 = new java.lang.Number[][]{};
    Object v26 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v23),((java.lang.Number[][])v24),((java.lang.Number[][])v25));
    Object v27 = new java.lang.String[]{"Null 'paint' argument."};
    Object v28 = new java.lang.Number[][]{};
    Object v29 = new java.lang.Number[][]{};
    Object v30 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v27),((java.lang.Number[][])v28),((java.lang.Number[][])v29));
    Object v31 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v26).equals(((java.lang.Object)v30));
    Object v32 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v22).getColumnIndex(((java.lang.Comparable)v31));
    Object v33 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getValue(((java.lang.Comparable)v18),((java.lang.Comparable)v32));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v15).getCategoryCount();
    Object v17 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).getCategoryIndex(((java.lang.Comparable)v16));
    Object v18 = ((org.jfree.data.general.AbstractSeriesDataset)v7).indexOf(((java.lang.Comparable)v17));
    Object v19 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getSeriesIndex(((java.lang.Comparable)v18));
    org.junit.Assert.assertEquals((Object)(-1), v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new java.lang.Number[][]{null,null};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Number[][])v0),((java.lang.Number[][])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null};
    Object v1 = new java.lang.Comparable[]{null,null,null};
    Object v2 = new java.lang.Number[][]{null,null};
    Object v3 = new java.lang.Number[][]{null,null,null};
    Object v4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((java.lang.Number[][])v2),((java.lang.Number[][])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultPieDataset();
    Object v1 = new org.jfree.data.general.DefaultPieDataset();
    Object v2 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v1));
    ((org.jfree.data.general.AbstractDataset)v0).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = ((org.jfree.data.general.AbstractDataset)v4).hasListener(((java.util.EventListener)v8));
    Object v10 = new java.lang.String[]{"Null 'paint' argument."};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new java.lang.Number[][]{};
    Object v13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v10),((java.lang.Number[][])v11),((java.lang.Number[][])v12));
    ((org.jfree.data.general.AbstractDataset)v13).validateObject();
    Object v14 = null;
    Object v15 = ((org.jfree.data.general.AbstractDataset)v13).getGroup();
    Object v16 = ((org.jfree.data.general.DatasetGroup)v15).clone();
    ((org.jfree.data.general.AbstractDataset)v4).setGroup(((org.jfree.data.general.DatasetGroup)v15));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.data.general.DefaultPieDataset();
    Object v5 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v4));
    ((org.jfree.data.general.AbstractDataset)v3).removeChangeListener(((org.jfree.data.general.DatasetChangeListener)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = 0;
    Object v6 = new java.lang.String[]{"Null 'paint' argument."};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new java.lang.Number[][]{};
    Object v9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v6),((java.lang.Number[][])v7),((java.lang.Number[][])v8));
    Object v10 = new java.lang.String[]{"Null 'paint' argument."};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new java.lang.Number[][]{};
    Object v13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v10),((java.lang.Number[][])v11),((java.lang.Number[][])v12));
    Object v14 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v13).getCategoryCount();
    Object v15 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v9).getCategoryIndex(((java.lang.Comparable)v14));
    Object v16 = 0;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setEndValue((((java.lang.Integer)v5).intValue()),((java.lang.Comparable)v15),((java.lang.Number)v16));
    Object v17 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = -23;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = new org.jfree.data.general.DefaultPieDataset();
    Object v10 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v9));
    ((org.jfree.data.general.AbstractDataset)v8).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v10));
    Object v11 = null;
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v15).getCategoryCount();
    Object v17 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).getSeriesIndex(((java.lang.Comparable)v16));
    Object v18 = 23.38882380061899D;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setStartValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v17),((java.lang.Number)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.Comparable[]{};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setCategoryKeys(((java.lang.Comparable[])v4));
    Object v5 = null;
    Object v6 = new java.lang.String[]{"Null 'paint' argument."};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new java.lang.Number[][]{};
    Object v9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v6),((java.lang.Number[][])v7),((java.lang.Number[][])v8));
    Object v10 = new java.lang.String[]{"Null 'paint' argument."};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new java.lang.Number[][]{};
    Object v13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v10),((java.lang.Number[][])v11),((java.lang.Number[][])v12));
    Object v14 = ((org.jfree.data.general.AbstractDataset)v9).hasListener(((java.util.EventListener)v13));
    Object v15 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getSeriesIndex(((java.lang.Comparable)v14));
    org.junit.Assert.assertEquals((Object)(-1), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = new java.lang.String[]{"Null 'paint' argument."};
    Object v17 = new java.lang.Number[][]{};
    Object v18 = new java.lang.Number[][]{};
    Object v19 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v16),((java.lang.Number[][])v17),((java.lang.Number[][])v18));
    Object v20 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v15).equals(((java.lang.Object)v19));
    Object v21 = ((org.jfree.data.general.AbstractSeriesDataset)v11).indexOf(((java.lang.Comparable)v20));
    Object v22 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getSeriesIndex(((java.lang.Comparable)v21));
    Object v23 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnIndex(((java.lang.Comparable)v22));
    org.junit.Assert.assertEquals((Object)(-1), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.data.general.DefaultPieDataset();
    Object v5 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v4));
    ((org.jfree.data.general.AbstractDataset)v3).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new java.lang.Number[][]{null};
    Object v1 = new java.lang.Number[][]{null,null,null};
    Object v2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Number[][])v0),((java.lang.Number[][])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 9;
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKey((((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).getRowKeys();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = new java.lang.Comparable[]{};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).setSeriesKeys(((java.lang.Comparable[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 27;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).equals(((java.lang.Object)v12));
    Object v14 = 0;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setStartValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v13),((java.lang.Number)v14));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.data.general.DefaultPieDataset();
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = new java.lang.String[]{"Null 'paint' argument."};
    Object v17 = new java.lang.Number[][]{};
    Object v18 = new java.lang.Number[][]{};
    Object v19 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v16),((java.lang.Number[][])v17),((java.lang.Number[][])v18));
    Object v20 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v15).equals(((java.lang.Object)v19));
    Object v21 = ((org.jfree.data.general.AbstractSeriesDataset)v11).indexOf(((java.lang.Comparable)v20));
    Object v22 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getSeriesIndex(((java.lang.Comparable)v21));
    Object v23 = new java.lang.String[]{"Null 'paint' argument."};
    Object v24 = new java.lang.Number[][]{};
    Object v25 = new java.lang.Number[][]{};
    Object v26 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v23),((java.lang.Number[][])v24),((java.lang.Number[][])v25));
    Object v27 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v26).getSeriesCount();
    Object v28 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue(((java.lang.Comparable)v22),((java.lang.Comparable)v27));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = -74;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).getColumnKey((((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 29;
    Object v5 = 1;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getEndValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.data.general.DefaultPieDataset();
    Object v5 = new org.jfree.chart.plot.RingPlot(((org.jfree.data.general.PieDataset)v4));
    ((org.jfree.data.general.AbstractDataset)v3).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v5));
    Object v6 = null;
    Object v7 = 37;
    Object v8 = 0;
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getEndValue((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryCount();
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new org.jfree.data.general.DefaultPieDataset();
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).equals(((java.lang.Object)v8));
    Object v10 = new java.lang.String[]{"Null 'paint' argument."};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new java.lang.Number[][]{};
    Object v13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v10),((java.lang.Number[][])v11),((java.lang.Number[][])v12));
    Object v14 = new org.jfree.data.general.DefaultPieDataset();
    Object v15 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v13).equals(((java.lang.Object)v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue(((java.lang.Comparable)v9),((java.lang.Comparable)v15));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 0;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v12).getCategoryCount();
    Object v14 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v8).equals(((java.lang.Object)v13));
    Object v15 = 1;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setStartValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v14),((java.lang.Number)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{null,null,null};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    ((org.jfree.data.general.AbstractDataset)v7).validateObject();
    Object v8 = null;
    Object v9 = ((org.jfree.data.general.AbstractDataset)v7).getGroup();
    ((org.jfree.data.general.AbstractDataset)v3).setGroup(((org.jfree.data.general.DatasetGroup)v9));
    Object v10 = null;
    Object v11 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKeys();
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).clone();
    Object v6 = new java.lang.String[]{"Null 'paint' argument."};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new java.lang.Number[][]{};
    Object v9 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v6),((java.lang.Number[][])v7),((java.lang.Number[][])v8));
    Object v10 = new java.lang.String[]{"Null 'paint' argument."};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new java.lang.Number[][]{};
    Object v13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v10),((java.lang.Number[][])v11),((java.lang.Number[][])v12));
    Object v14 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v13).getCategoryCount();
    Object v15 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v9).equals(((java.lang.Object)v14));
    Object v16 = new java.lang.String[]{"Null 'paint' argument."};
    Object v17 = new java.lang.Number[][]{};
    Object v18 = new java.lang.Number[][]{};
    Object v19 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v16),((java.lang.Number[][])v17),((java.lang.Number[][])v18));
    Object v20 = new java.lang.String[]{"Null 'paint' argument."};
    Object v21 = new java.lang.Number[][]{};
    Object v22 = new java.lang.Number[][]{};
    Object v23 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v20),((java.lang.Number[][])v21),((java.lang.Number[][])v22));
    Object v24 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v23).getCategoryCount();
    Object v25 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v19).equals(((java.lang.Object)v24));
    Object v26 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).getValue(((java.lang.Comparable)v15),((java.lang.Comparable)v25));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 30;
    Object v5 = new java.lang.String[]{"Null 'paint' argument."};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new java.lang.Number[][]{};
    Object v8 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v5),((java.lang.Number[][])v6),((java.lang.Number[][])v7));
    Object v9 = new java.lang.String[]{"Null 'paint' argument."};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v9),((java.lang.Number[][])v10),((java.lang.Number[][])v11));
    Object v13 = ((org.jfree.data.general.AbstractDataset)v8).hasListener(((java.util.EventListener)v12));
    Object v14 = new java.lang.String[]{"Null 'paint' argument."};
    Object v15 = new java.lang.Number[][]{};
    Object v16 = new java.lang.Number[][]{};
    Object v17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v14),((java.lang.Number[][])v15),((java.lang.Number[][])v16));
    Object v18 = new org.jfree.data.general.DefaultPieDataset();
    Object v19 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v17).equals(((java.lang.Object)v18));
    Object v20 = ((java.lang.Comparable)v13).compareTo(((java.lang.Object)v19));
    Object v21 = 12.558098655928937D;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setEndValue((((java.lang.Integer)v4).intValue()),((java.lang.Comparable)v13),((java.lang.Number)v21));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnCount();
    org.junit.Assert.assertEquals((Object)(0), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = -1;
    Object v6 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = ((org.jfree.data.general.AbstractDataset)v7).hasListener(((java.util.EventListener)v11));
    Object v13 = new java.lang.String[]{"Null 'paint' argument."};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new java.lang.Number[][]{};
    Object v16 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v13),((java.lang.Number[][])v14),((java.lang.Number[][])v15));
    Object v17 = new java.lang.String[]{"Null 'paint' argument."};
    Object v18 = new java.lang.Number[][]{};
    Object v19 = new java.lang.Number[][]{};
    Object v20 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v17),((java.lang.Number[][])v18),((java.lang.Number[][])v19));
    Object v21 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v20).getCategoryCount();
    Object v22 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v16).equals(((java.lang.Object)v21));
    Object v23 = ((java.lang.Comparable)v12).compareTo(((java.lang.Object)v22));
    Object v24 = new java.lang.String[]{"Null 'paint' argument."};
    Object v25 = new java.lang.Number[][]{};
    Object v26 = new java.lang.Number[][]{};
    Object v27 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v24),((java.lang.Number[][])v25),((java.lang.Number[][])v26));
    Object v28 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v27).getSeriesCount();
    Object v29 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getValue(((java.lang.Comparable)v12),((java.lang.Comparable)v28));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new java.lang.Number[][]{};
    Object v1 = new java.lang.Number[][]{null};
    Object v2 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Number[][])v0),((java.lang.Number[][])v1));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).getColumnKeys();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = -8;
    Object v6 = 0;
    Object v7 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v4).getStartValue((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).equals(((java.lang.Object)v15));
    Object v17 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getColumnIndex(((java.lang.Comparable)v16));
    Object v18 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getSeriesIndex(((java.lang.Comparable)v17));
    org.junit.Assert.assertEquals((Object)(-1), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getRowKeys();
    Object v5 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getCategoryCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getRowKeys();
    Object v9 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getCategoryCount();
    Object v10 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnIndex(((java.lang.Comparable)v9));
    Object v11 = -12;
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v15).getColumnCount();
    Object v17 = 0;
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setStartValue((((java.lang.Integer)v11).intValue()),((java.lang.Comparable)v16),((java.lang.Number)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = new java.lang.String[]{"Null 'paint' argument."};
    Object v13 = new java.lang.Number[][]{};
    Object v14 = new java.lang.Number[][]{};
    Object v15 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v12),((java.lang.Number[][])v13),((java.lang.Number[][])v14));
    Object v16 = new java.lang.String[]{"Null 'paint' argument."};
    Object v17 = new java.lang.Number[][]{};
    Object v18 = new java.lang.Number[][]{};
    Object v19 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v16),((java.lang.Number[][])v17),((java.lang.Number[][])v18));
    Object v20 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v15).equals(((java.lang.Object)v19));
    Object v21 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v11).getColumnIndex(((java.lang.Comparable)v20));
    Object v22 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getSeriesIndex(((java.lang.Comparable)v21));
    Object v23 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnIndex(((java.lang.Comparable)v22));
    org.junit.Assert.assertEquals((Object)(-1), v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.Comparable[]{null};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setSeriesKeys(((java.lang.Comparable[])v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.Comparable[]{};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).setCategoryKeys(((java.lang.Comparable[])v8));
    Object v9 = null;
    Object v10 = new java.lang.String[]{"Null 'paint' argument."};
    Object v11 = new java.lang.Number[][]{};
    Object v12 = new java.lang.Number[][]{};
    Object v13 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v10),((java.lang.Number[][])v11),((java.lang.Number[][])v12));
    Object v14 = new java.lang.String[]{"Null 'paint' argument."};
    Object v15 = new java.lang.Number[][]{};
    Object v16 = new java.lang.Number[][]{};
    Object v17 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v14),((java.lang.Number[][])v15),((java.lang.Number[][])v16));
    Object v18 = ((org.jfree.data.general.AbstractDataset)v13).hasListener(((java.util.EventListener)v17));
    Object v19 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v7).getSeriesIndex(((java.lang.Comparable)v18));
    Object v20 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getColumnIndex(((java.lang.Comparable)v19));
    Object v21 = new java.lang.String[]{"Null 'paint' argument."};
    Object v22 = new java.lang.Number[][]{};
    Object v23 = new java.lang.Number[][]{};
    Object v24 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v21),((java.lang.Number[][])v22),((java.lang.Number[][])v23));
    Object v25 = new java.lang.String[]{"Null 'paint' argument."};
    Object v26 = new java.lang.Number[][]{};
    Object v27 = new java.lang.Number[][]{};
    Object v28 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v25),((java.lang.Number[][])v26),((java.lang.Number[][])v27));
    Object v29 = ((org.jfree.data.general.AbstractDataset)v24).hasListener(((java.util.EventListener)v28));
    Object v30 = new java.lang.String[]{"Null 'paint' argument."};
    Object v31 = new java.lang.Number[][]{};
    Object v32 = new java.lang.Number[][]{};
    Object v33 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v30),((java.lang.Number[][])v31),((java.lang.Number[][])v32));
    Object v34 = new java.lang.String[]{"Null 'paint' argument."};
    Object v35 = new java.lang.Number[][]{};
    Object v36 = new java.lang.Number[][]{};
    Object v37 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v34),((java.lang.Number[][])v35),((java.lang.Number[][])v36));
    Object v38 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v33).equals(((java.lang.Object)v37));
    Object v39 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getStartValue(((java.lang.Comparable)v29),((java.lang.Comparable)v38));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.Comparable[]{};
    ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).setSeriesKeys(((java.lang.Comparable[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).clone();
    Object v5 = ((org.jfree.data.general.AbstractDataset)v4).getGroup();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null};
    Object v1 = new java.lang.Comparable[]{null,null};
    Object v2 = new java.lang.Number[][]{null,null,null};
    Object v3 = new java.lang.Number[][]{null,null};
    Object v4 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((java.lang.Number[][])v2),((java.lang.Number[][])v3));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.lang.String[]{"Null 'paint' argument."};
    Object v1 = new java.lang.Number[][]{};
    Object v2 = new java.lang.Number[][]{};
    Object v3 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v0),((java.lang.Number[][])v1),((java.lang.Number[][])v2));
    Object v4 = new java.lang.String[]{"Null 'paint' argument."};
    Object v5 = new java.lang.Number[][]{};
    Object v6 = new java.lang.Number[][]{};
    Object v7 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v4),((java.lang.Number[][])v5),((java.lang.Number[][])v6));
    Object v8 = new java.lang.String[]{"Null 'paint' argument."};
    Object v9 = new java.lang.Number[][]{};
    Object v10 = new java.lang.Number[][]{};
    Object v11 = new org.jfree.data.category.DefaultIntervalCategoryDataset(((java.lang.String[])v8),((java.lang.Number[][])v9),((java.lang.Number[][])v10));
    Object v12 = ((org.jfree.data.general.AbstractDataset)v7).hasListener(((java.util.EventListener)v11));
    Object v13 = ((org.jfree.data.category.DefaultIntervalCategoryDataset)v3).getCategoryIndex(((java.lang.Comparable)v12));
    org.junit.Assert.assertEquals((Object)(-1), v13);
  }
}
