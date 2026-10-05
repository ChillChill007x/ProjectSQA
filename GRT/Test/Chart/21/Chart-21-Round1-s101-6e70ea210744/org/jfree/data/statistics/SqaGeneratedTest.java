package org.jfree.data.statistics;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 11;
    Object v2 = -29;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getOutliers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.time.Millisecond();
    Object v2 = new org.jfree.data.time.Millisecond();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMedianValue(((java.lang.Comparable)v1),((java.lang.Comparable)v2));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 1;
    Object v2 = 3;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 1;
    Object v2 = -20;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMedianValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 1;
    Object v2 = -19;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinRegularValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.time.Millisecond();
    Object v2 = new org.jfree.data.time.Millisecond();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxRegularValue(((java.lang.Comparable)v1),((java.lang.Comparable)v2));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.time.Millisecond();
    Object v2 = new org.jfree.data.time.Millisecond();
    Object v3 = "Null 'p\\int' argument.";
    Object v4 = java.util.TimeZone.getTimeZone(((java.lang.String)v3));
    Object v5 = ((java.lang.Comparable)v2).compareTo(((java.lang.Object)v4));
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getOutliers(((java.lang.Comparable)v1),((java.lang.Comparable)v2));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.time.Millisecond();
    Object v2 = new org.jfree.data.time.Millisecond();
    Object v3 = new org.jfree.data.time.Millisecond();
    Object v4 = ((java.lang.Comparable)v2).compareTo(((java.lang.Object)v3));
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinOutlier(((java.lang.Comparable)v1),((java.lang.Comparable)v2));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 27;
    Object v2 = 1;
    Object v3 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -61;
    Object v5 = 0;
    Object v6 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v4),((java.lang.Integer)v5));
    Object v7 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v3),((org.jfree.chart.renderer.WaferMapRenderer)v6));
    Object v8 = ((org.jfree.data.general.AbstractDataset)v0).hasListener(((java.util.EventListener)v7));
    Object v9 = 3.091613420670612D;
    Object v10 = 0;
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = -1;
    Object v16 = -4.933345717647248D;
    Object v17 = 1;
    Object v18 = new java.util.ArrayList((((java.lang.Integer)v17).intValue()));
    Object v19 = new org.jfree.data.statistics.BoxAndWhiskerItem(((java.lang.Number)v9),((java.lang.Number)v10),((java.lang.Number)v11),((java.lang.Number)v12),((java.lang.Number)v13),((java.lang.Number)v14),((java.lang.Number)v15),((java.lang.Number)v16),((java.util.List)v18));
    Object v20 = new org.jfree.data.time.Millisecond();
    Object v21 = new org.jfree.data.time.Millisecond();
    Object v22 = 3.091613420670612D;
    Object v23 = 0;
    Object v24 = 1;
    Object v25 = 0;
    Object v26 = 0;
    Object v27 = 0;
    Object v28 = -1;
    Object v29 = -4.933345717647248D;
    Object v30 = 1;
    Object v31 = new java.util.ArrayList((((java.lang.Integer)v30).intValue()));
    Object v32 = new org.jfree.data.statistics.BoxAndWhiskerItem(((java.lang.Number)v22),((java.lang.Number)v23),((java.lang.Number)v24),((java.lang.Number)v25),((java.lang.Number)v26),((java.lang.Number)v27),((java.lang.Number)v28),((java.lang.Number)v29),((java.util.List)v31));
    Object v33 = ((java.lang.Comparable)v21).compareTo(((java.lang.Object)v32));
    ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).add(((org.jfree.data.statistics.BoxAndWhiskerItem)v19),((java.lang.Comparable)v20),((java.lang.Comparable)v21));
    Object v34 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowKeys();
    Object v2 = -32;
    Object v3 = -36;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinOutlier((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 10;
    Object v2 = 29;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowKeys();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.data.general.DatasetGroup();
    Object v4 = ((org.jfree.data.general.DatasetGroup)v3).clone();
    ((org.jfree.data.general.AbstractDataset)v2).setGroup(((org.jfree.data.general.DatasetGroup)v3));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 10;
    Object v2 = -2;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = -9;
    Object v2 = -37;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getOutliers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowKeys();
    Object v2 = new org.jfree.data.time.Millisecond();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowIndex(((java.lang.Comparable)v2));
    org.junit.Assert.assertEquals((Object)(-1), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowCount();
    org.junit.Assert.assertEquals((Object)(0), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowKeys();
    Object v3 = new org.jfree.data.time.Millisecond();
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowIndex(((java.lang.Comparable)v3));
    Object v5 = new org.jfree.data.time.Millisecond();
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value(((java.lang.Comparable)v4),((java.lang.Comparable)v5));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowCount();
    Object v3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v3).getRowCount();
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxOutlier(((java.lang.Comparable)v2),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 27;
    Object v2 = 1;
    Object v3 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -61;
    Object v5 = 0;
    Object v6 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v4),((java.lang.Integer)v5));
    Object v7 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v3),((org.jfree.chart.renderer.WaferMapRenderer)v6));
    ((org.jfree.data.general.AbstractDataset)v0).removeChangeListener(((org.jfree.data.general.DatasetChangeListener)v7));
    Object v8 = null;
    Object v9 = -32;
    Object v10 = 67;
    Object v11 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxOutlier((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxOutlier((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = -5;
    Object v2 = 1;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinRegularValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = false;
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRangeLowerBound((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 27;
    Object v2 = 1;
    Object v3 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -61;
    Object v5 = 0;
    Object v6 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v4),((java.lang.Integer)v5));
    Object v7 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v3),((org.jfree.chart.renderer.WaferMapRenderer)v6));
    ((org.jfree.data.general.AbstractDataset)v0).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v7));
    Object v8 = null;
    Object v9 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v10 = false;
    Object v11 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v9).getRangeLowerBound((((java.lang.Boolean)v10).booleanValue()));
    Object v12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v13 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v12).getRowCount();
    Object v14 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMedianValue(((java.lang.Comparable)v11),((java.lang.Comparable)v13));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = -28;
    Object v2 = 26;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinRegularValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = -10;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxRegularValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 5;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = 1;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowKey((((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMedianValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 8;
    Object v2 = -17;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.general.DatasetGroup();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = new org.jfree.data.general.DatasetGroup();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).equals(((java.lang.Object)v2));
    Object v4 = new org.jfree.data.time.Millisecond();
    Object v5 = 3.091613420670612D;
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = 0;
    Object v11 = -1;
    Object v12 = -4.933345717647248D;
    Object v13 = 1;
    Object v14 = new java.util.ArrayList((((java.lang.Integer)v13).intValue()));
    Object v15 = new org.jfree.data.statistics.BoxAndWhiskerItem(((java.lang.Number)v5),((java.lang.Number)v6),((java.lang.Number)v7),((java.lang.Number)v8),((java.lang.Number)v9),((java.lang.Number)v10),((java.lang.Number)v11),((java.lang.Number)v12),((java.util.List)v14));
    Object v16 = ((java.lang.Comparable)v4).compareTo(((java.lang.Object)v15));
    Object v17 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value(((java.lang.Comparable)v3),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowCount();
    Object v3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v4 = false;
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v3).getRangeLowerBound((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getOutliers(((java.lang.Comparable)v2),((java.lang.Comparable)v5));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 3.091613420670612D;
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = -4.933345717647248D;
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.statistics.BoxAndWhiskerItem(((java.lang.Number)v1),((java.lang.Number)v2),((java.lang.Number)v3),((java.lang.Number)v4),((java.lang.Number)v5),((java.lang.Number)v6),((java.lang.Number)v7),((java.lang.Number)v8),((java.util.List)v10));
    Object v12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v13 = new org.jfree.data.general.DatasetGroup();
    Object v14 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v12).equals(((java.lang.Object)v13));
    Object v15 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v16 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v15).getRowKeys();
    Object v17 = new org.jfree.data.time.Millisecond();
    Object v18 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v15).getRowIndex(((java.lang.Comparable)v17));
    ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).add(((org.jfree.data.statistics.BoxAndWhiskerItem)v11),((java.lang.Comparable)v14),((java.lang.Comparable)v18));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 0;
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getColumnKey((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRangeLowerBound((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jfree.data.time.Millisecond();
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value(((java.lang.Comparable)v3),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRangeLowerBound((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = false;
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRangeLowerBound((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue(((java.lang.Comparable)v3),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowCount();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getColumnIndex(((java.lang.Comparable)v2));
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinRegularValue((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 3.091613420670612D;
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = -4.933345717647248D;
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.statistics.BoxAndWhiskerItem(((java.lang.Number)v1),((java.lang.Number)v2),((java.lang.Number)v3),((java.lang.Number)v4),((java.lang.Number)v5),((java.lang.Number)v6),((java.lang.Number)v7),((java.lang.Number)v8),((java.util.List)v10));
    Object v12 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v13 = false;
    Object v14 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v12).getRangeLowerBound((((java.lang.Boolean)v13).booleanValue()));
    Object v15 = new org.jfree.data.time.Millisecond();
    ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).add(((org.jfree.data.statistics.BoxAndWhiskerItem)v11),((java.lang.Comparable)v14),((java.lang.Comparable)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRangeLowerBound((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = new org.jfree.data.general.DatasetGroup();
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinRegularValue(((java.lang.Comparable)v3),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRangeLowerBound((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRowCount();
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value(((java.lang.Comparable)v3),((java.lang.Comparable)v5));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getColumnKeys();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.data.general.DatasetGroup();
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRowKeys();
    Object v6 = ((org.jfree.data.general.DatasetGroup)v3).equals(((java.lang.Object)v5));
    ((org.jfree.data.general.AbstractDataset)v2).setGroup(((org.jfree.data.general.DatasetGroup)v3));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowCount();
    Object v3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v3).getRowCount();
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value(((java.lang.Comparable)v2),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = true;
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRangeBounds((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getColumnKeys();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = false;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).getRangeLowerBound((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v5).getRowCount();
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue(((java.lang.Comparable)v4),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.general.AbstractDataset)v2).getGroup();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.time.Millisecond();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = false;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).getRangeLowerBound((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinOutlier(((java.lang.Comparable)v1),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.time.Millisecond();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = false;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).getRangeLowerBound((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue(((java.lang.Comparable)v1),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getColumnKeys();
    Object v2 = 43;
    Object v3 = 31;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = new org.jfree.data.general.DatasetGroup();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).equals(((java.lang.Object)v2));
    Object v4 = new org.jfree.data.time.Millisecond();
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value(((java.lang.Comparable)v3),((java.lang.Comparable)v4));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 30;
    Object v2 = 11;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getOutliers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 6;
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowKey((((java.lang.Integer)v1).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 53;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = -9;
    Object v2 = -12;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowKeys();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 27;
    Object v2 = 1;
    Object v3 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = -61;
    Object v5 = 0;
    Object v6 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v4),((java.lang.Integer)v5));
    Object v7 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v3),((org.jfree.chart.renderer.WaferMapRenderer)v6));
    ((org.jfree.data.general.AbstractDataset)v0).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v7));
    Object v8 = null;
    Object v9 = new org.jfree.data.general.DatasetGroup();
    Object v10 = new org.jfree.data.general.DatasetGroup();
    Object v11 = ((org.jfree.data.general.DatasetGroup)v9).equals(((java.lang.Object)v10));
    ((org.jfree.data.general.AbstractDataset)v0).setGroup(((org.jfree.data.general.DatasetGroup)v9));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getColumnCount();
    Object v2 = 39;
    Object v3 = 1;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 27;
    Object v4 = 1;
    Object v5 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -61;
    Object v7 = 0;
    Object v8 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v6),((java.lang.Integer)v7));
    Object v9 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v5),((org.jfree.chart.renderer.WaferMapRenderer)v8));
    Object v10 = new org.jfree.data.general.DatasetGroup();
    Object v11 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v12 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v10),((org.jfree.data.general.Dataset)v11));
    ((org.jfree.data.general.DatasetChangeListener)v9).datasetChanged(((org.jfree.data.general.DatasetChangeEvent)v12));
    Object v13 = null;
    ((org.jfree.data.general.AbstractDataset)v2).removeChangeListener(((org.jfree.data.general.DatasetChangeListener)v9));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 3;
    Object v2 = -23;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 24;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 27;
    Object v4 = 1;
    Object v5 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -61;
    Object v7 = 0;
    Object v8 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v6),((java.lang.Integer)v7));
    Object v9 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v5),((org.jfree.chart.renderer.WaferMapRenderer)v8));
    Object v10 = ((org.jfree.data.general.AbstractDataset)v2).hasListener(((java.util.EventListener)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ3Value((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinOutlier((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 45;
    Object v2 = 0;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxRegularValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 0;
    Object v2 = 17;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinOutlier((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    ((org.jfree.data.general.AbstractDataset)v2).validateObject();
    Object v3 = null;
    Object v4 = 27;
    Object v5 = 1;
    Object v6 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -61;
    Object v8 = 0;
    Object v9 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v7),((java.lang.Integer)v8));
    Object v10 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v6),((org.jfree.chart.renderer.WaferMapRenderer)v9));
    ((org.jfree.data.general.AbstractDataset)v2).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = -6;
    Object v2 = 2;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getOutliers((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    ((org.jfree.data.general.AbstractDataset)v0).validateObject();
    Object v1 = null;
    Object v2 = 42;
    Object v3 = 0;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMedianValue((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowCount();
    Object v3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v4 = false;
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v3).getRangeLowerBound((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMinRegularValue(((java.lang.Comparable)v2),((java.lang.Comparable)v5));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRangeLowerBound((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = false;
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRangeLowerBound((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxRegularValue(((java.lang.Comparable)v3),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowCount();
    Object v3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v4 = false;
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v3).getRangeLowerBound((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value(((java.lang.Comparable)v2),((java.lang.Comparable)v5));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = -2;
    Object v2 = -12;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMedianValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 3.091613420670612D;
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = -1;
    Object v8 = -4.933345717647248D;
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.statistics.BoxAndWhiskerItem(((java.lang.Number)v1),((java.lang.Number)v2),((java.lang.Number)v3),((java.lang.Number)v4),((java.lang.Number)v5),((java.lang.Number)v6),((java.lang.Number)v7),((java.lang.Number)v8),((java.util.List)v10));
    Object v12 = ((org.jfree.data.statistics.BoxAndWhiskerItem)v11).toString();
    Object v13 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v14 = false;
    Object v15 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v13).getRangeLowerBound((((java.lang.Boolean)v14).booleanValue()));
    Object v16 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v17 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v16).getRowCount();
    ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).add(((org.jfree.data.statistics.BoxAndWhiskerItem)v11),((java.lang.Comparable)v15),((java.lang.Comparable)v17));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRangeLowerBound((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = false;
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRangeLowerBound((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMedianValue(((java.lang.Comparable)v3),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 1;
    Object v2 = new java.util.ArrayList((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getRowCount();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).getRowCount();
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = false;
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRangeLowerBound((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMaxRegularValue(((java.lang.Comparable)v3),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = new org.jfree.data.general.DatasetGroup();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).equals(((java.lang.Object)v2));
    Object v4 = 27;
    Object v5 = 1;
    Object v6 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = 27;
    Object v8 = 1;
    Object v9 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = -61;
    Object v11 = 0;
    Object v12 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v10),((java.lang.Integer)v11));
    Object v13 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v9),((org.jfree.chart.renderer.WaferMapRenderer)v12));
    Object v14 = ((org.jfree.data.general.AbstractDataset)v6).hasListener(((java.util.EventListener)v13));
    Object v15 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getMeanValue(((java.lang.Comparable)v3),((java.lang.Comparable)v14));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = 3;
    Object v3 = 0;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMinRegularValue((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = 0;
    Object v3 = -37;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getQ3Value((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    ((org.jfree.data.general.AbstractDataset)v1).validateObject();
    Object v2 = null;
    Object v3 = 1;
    Object v4 = new java.util.ArrayList((((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v6 = false;
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v5).getRangeLowerBound((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = new org.jfree.data.time.Millisecond();
    Object v9 = 1;
    Object v10 = new java.util.ArrayList((((java.lang.Integer)v9).intValue()));
    Object v11 = ((java.lang.Comparable)v8).compareTo(((java.lang.Object)v10));
    ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).add(((java.util.List)v4),((java.lang.Comparable)v7),((java.lang.Comparable)v8));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = 1;
    Object v3 = new java.util.ArrayList((((java.lang.Integer)v2).intValue()));
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).equals(((java.lang.Object)v3));
    Object v5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v6 = false;
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v5).getRangeLowerBound((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value(((java.lang.Comparable)v4),((java.lang.Comparable)v7));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = false;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).getRangeLowerBound((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v5).getRowCount();
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getValue(((java.lang.Comparable)v4),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = 1;
    Object v4 = new java.util.ArrayList((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).equals(((java.lang.Object)v4));
    Object v6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v7 = false;
    Object v8 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v6).getRangeLowerBound((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMeanValue(((java.lang.Comparable)v5),((java.lang.Comparable)v8));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowKeys();
    Object v3 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v4 = false;
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v3).getRangeLowerBound((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v6).getRowCount();
    Object v8 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v9 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v8).getRowCount();
    Object v10 = ((java.lang.Comparable)v7).compareTo(((java.lang.Object)v9));
    Object v11 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMaxOutlier(((java.lang.Comparable)v5),((java.lang.Comparable)v7));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = 1;
    Object v4 = new java.util.ArrayList((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).equals(((java.lang.Object)v4));
    Object v6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v6).getRowKeys();
    Object v8 = new org.jfree.data.time.Millisecond();
    Object v9 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v6).getRowIndex(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMinOutlier(((java.lang.Comparable)v5),((java.lang.Comparable)v9));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    ((org.jfree.data.general.AbstractDataset)v1).validateObject();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = 71;
    Object v3 = 0;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getItem((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = false;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).getRangeLowerBound((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v6 = false;
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v5).getRangeLowerBound((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMinRegularValue(((java.lang.Comparable)v4),((java.lang.Comparable)v7));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMinRegularValue((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    Object v3 = 27;
    Object v4 = 1;
    Object v5 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = -61;
    Object v7 = 0;
    Object v8 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v6),((java.lang.Integer)v7));
    Object v9 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v5),((org.jfree.chart.renderer.WaferMapRenderer)v8));
    ((org.jfree.data.general.AbstractDataset)v2).addChangeListener(((org.jfree.data.general.DatasetChangeListener)v9));
    Object v10 = null;
    Object v11 = 27;
    Object v12 = 1;
    Object v13 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = -61;
    Object v15 = 0;
    Object v16 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v14),((java.lang.Integer)v15));
    Object v17 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v13),((org.jfree.chart.renderer.WaferMapRenderer)v16));
    Object v18 = ((org.jfree.data.general.AbstractDataset)v2).hasListener(((java.util.EventListener)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 27;
    Object v1 = 1;
    Object v2 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()));
    ((org.jfree.data.general.AbstractDataset)v2).validateObject();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRangeLowerBound((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = false;
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRangeLowerBound((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).getQ1Value(((java.lang.Comparable)v3),((java.lang.Comparable)v6));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = 27;
    Object v3 = 1;
    Object v4 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = -61;
    Object v6 = 0;
    Object v7 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v5),((java.lang.Integer)v6));
    Object v8 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v4),((org.jfree.chart.renderer.WaferMapRenderer)v7));
    Object v9 = ((org.jfree.data.general.AbstractDataset)v1).hasListener(((java.util.EventListener)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = 1;
    Object v4 = new java.util.ArrayList((((java.lang.Integer)v3).intValue()));
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).equals(((java.lang.Object)v4));
    Object v6 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v7 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v6).getRowCount();
    Object v8 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMedianValue(((java.lang.Comparable)v5),((java.lang.Comparable)v7));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = 1;
    Object v3 = new java.util.ArrayList((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v5 = false;
    Object v6 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v4).getRangeLowerBound((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v8 = false;
    Object v9 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v7).getRangeLowerBound((((java.lang.Boolean)v8).booleanValue()));
    ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).add(((java.util.List)v3),((java.lang.Comparable)v6),((java.lang.Comparable)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v3 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v2).clone();
    Object v4 = 27;
    Object v5 = 1;
    Object v6 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -61;
    Object v8 = 0;
    Object v9 = new org.jfree.chart.renderer.WaferMapRenderer(((java.lang.Integer)v7),((java.lang.Integer)v8));
    Object v10 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v6),((org.jfree.chart.renderer.WaferMapRenderer)v9));
    Object v11 = ((org.jfree.data.general.AbstractDataset)v3).hasListener(((java.util.EventListener)v10));
    Object v12 = new org.jfree.data.time.Millisecond();
    Object v13 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getMaxOutlier(((java.lang.Comparable)v11),((java.lang.Comparable)v12));
      org.junit.Assert.fail("Expected org.jfree.data.UnknownKeyException");
    } catch (org.jfree.data.UnknownKeyException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset();
    Object v1 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v0).clone();
    Object v2 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getRowKeys();
    Object v3 = -39;
    Object v4 = 1;
    Object v5 = ((org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset)v1).getQ1Value((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }
}
