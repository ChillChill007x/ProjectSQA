package org.jfree.data.general;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v3).addChangeListener(((org.jfree.data.event.DatasetChangeListener)v4));
    Object v5 = null;
    Object v6 = 7.7709953250062895D;
    Object v7 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = -24;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.Year(((java.util.Date)v7));
    Object v9 = 33.20057958496543D;
    Object v10 = 0.0D;
    Object v11 = 21.083731800906406D;
    Object v12 = 1.0D;
    Object v13 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.jfree.data.KeyToGroupMap(((java.lang.Comparable)v13));
    Object v15 = -24;
    Object v16 = 0;
    Object v17 = 1;
    Object v18 = new java.util.Date((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new org.jfree.data.time.Year(((java.util.Date)v18));
    Object v20 = 33.20057958496543D;
    Object v21 = 0.0D;
    Object v22 = 21.083731800906406D;
    Object v23 = 1.0D;
    Object v24 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v19),(((java.lang.Double)v20).doubleValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()));
    Object v25 = ((org.jfree.data.KeyToGroupMap)v14).getKeyCount(((java.lang.Comparable)v24));
    Object v26 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.category.CategoryDataset)v3),((org.jfree.data.KeyToGroupMap)v14));
    org.junit.Assert.assertNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = 24.343264599052247D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.data.function.LineFunction2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.255274788021957D;
    Object v4 = 4.6664035762577045D;
    Object v5 = 0;
    Object v6 = -24;
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = new java.util.Date((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.data.time.Year(((java.util.Date)v9));
    Object v11 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(((org.jfree.data.function.Function2D)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),((java.lang.Comparable)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = ((org.jfree.data.general.Dataset)v3).getGroup();
    Object v5 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = "Null 'paint' argument";
    Object v1 = "Null 'font' argument.";
    Object v2 = new double[][]{null,null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.Values2D)v3).getRowCount();
    Object v5 = 0;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = false;
    Object v5 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = false;
    Object v5 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = -24;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.Year(((java.util.Date)v7));
    Object v9 = 33.20057958496543D;
    Object v10 = 0.0D;
    Object v11 = 21.083731800906406D;
    Object v12 = 1.0D;
    Object v13 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.jfree.data.KeyedValues2D)v3).getRowIndex(((java.lang.Comparable)v13));
    Object v15 = true;
    Object v16 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v15).booleanValue()));
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = false;
    Object v5 = org.jfree.data.general.DatasetUtilities.findDomainBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.Values2D)v3).getRowCount();
    Object v5 = 0;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v6).removeChangeListener(((org.jfree.data.event.DatasetChangeListener)v7));
    Object v8 = null;
    Object v9 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.pie.PieDataset)v6));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = -39;
    Object v5 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = ((org.jfree.data.xy.XYDataset)v3).getDomainOrder();
    Object v5 = false;
    Object v6 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 24.343264599052247D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.data.function.LineFunction2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 3.0D;
    Object v4 = ((org.jfree.data.function.Function2D)v2).getValue((((java.lang.Double)v3).doubleValue()));
    Object v5 = -7.290613189711397D;
    Object v6 = 0.0D;
    Object v7 = 1;
    Object v8 = "Notimplemented.";
    Object v9 = "ZOOM_IN_BOTH";
    Object v10 = new java.lang.Number[][]{};
    Object v11 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v8),((java.lang.String)v9),((java.lang.Number[][])v10));
    Object v12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v11));
    Object v13 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(((org.jfree.data.function.Function2D)v2),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Integer)v7).intValue()),((java.lang.Comparable)v12));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = 10;
    Object v7 = ((org.jfree.data.Values)v5).getValue((((java.lang.Integer)v6).intValue()));
    Object v8 = -24;
    Object v9 = 0;
    Object v10 = 1;
    Object v11 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.jfree.data.time.Year(((java.util.Date)v11));
    Object v13 = 33.20057958496543D;
    Object v14 = 0.0D;
    Object v15 = 21.083731800906406D;
    Object v16 = 1.0D;
    Object v17 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v12),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()));
    Object v18 = "Notimplemented.";
    Object v19 = "ZOOM_IN_BOTH";
    Object v20 = new java.lang.Number[][]{};
    Object v21 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v18),((java.lang.String)v19),((java.lang.Number[][])v20));
    Object v22 = ((java.lang.Comparable)v17).compareTo(((java.lang.Object)v21));
    Object v23 = 0.0D;
    Object v24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(((org.jfree.data.pie.PieDataset)v5),((java.lang.Comparable)v17),(((java.lang.Double)v23).doubleValue()));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v5).removeChangeListener(((org.jfree.data.event.DatasetChangeListener)v6));
    Object v7 = null;
    Object v8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.pie.PieDataset)v5));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -24;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.jfree.data.time.Year(((java.util.Date)v3));
    Object v5 = 33.20057958496543D;
    Object v6 = 0.0D;
    Object v7 = 21.083731800906406D;
    Object v8 = 1.0D;
    Object v9 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = "Notimplemented.";
    Object v11 = "ZOOM_IN_BOTH";
    Object v12 = new java.lang.Number[][]{};
    Object v13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v10),((java.lang.String)v11),((java.lang.Number[][])v12));
    Object v14 = 1;
    Object v15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.jfree.data.Values)v15).getItemCount();
    Object v17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v9),((org.jfree.data.KeyedValues)v15));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 17.573067056804586D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = true;
    Object v5 = org.jfree.data.general.DatasetUtilities.findDomainBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = 0;
    Object v7 = ((org.jfree.data.Values)v5).getValue((((java.lang.Integer)v6).intValue()));
    Object v8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.pie.PieDataset)v5));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = "Null 'pait' argument.";
    Object v1 = "Nul 'paint' argument.";
    Object v2 = new double[][]{null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = ((org.jfree.data.general.Dataset)v3).getGroup();
    Object v5 = 9;
    Object v6 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = true;
    Object v5 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "Null 'paint'argument.";
    Object v1 = "Null 'stroke' argument.";
    Object v2 = new java.lang.Number[][]{null,null,null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.general.Dataset)v3).getGroup();
    Object v5 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null};
    Object v1 = new java.lang.Comparable[]{null,null};
    Object v2 = new double[][]{null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = 0.0D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = org.jfree.data.general.DatasetUtilities.calculatePieDatasetTotal(((org.jfree.data.pie.PieDataset)v5));
    org.junit.Assert.assertEquals((Object)(0.0D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = new org.jfree.data.general.DatasetGroup();
    ((org.jfree.data.general.Dataset)v3).setGroup(((org.jfree.data.general.DatasetGroup)v4));
    Object v5 = null;
    Object v6 = true;
    Object v7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = -11.234272004919811D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 24.343264599052247D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.data.function.LineFunction2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 0.0D;
    Object v4 = -8.256466788758798D;
    Object v5 = 0;
    Object v6 = "Notimplemented.";
    Object v7 = "ZOOM_IN_BOTH";
    Object v8 = new java.lang.Number[][]{};
    Object v9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v6),((java.lang.String)v7),((java.lang.Number[][])v8));
    Object v10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v9));
    Object v11 = "Notimplemented.";
    Object v12 = "ZOOM_IN_BOTH";
    Object v13 = new java.lang.Number[][]{};
    Object v14 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v11),((java.lang.String)v12),((java.lang.Number[][])v13));
    Object v15 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v14));
    Object v16 = ((java.lang.Comparable)v10).compareTo(((java.lang.Object)v15));
    Object v17 = org.jfree.data.general.DatasetUtilities.sampleFunction2D(((org.jfree.data.function.Function2D)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),((java.lang.Comparable)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v3).addChangeListener(((org.jfree.data.event.DatasetChangeListener)v4));
    Object v5 = null;
    Object v6 = true;
    Object v7 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = -16;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = -24;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.jfree.data.time.Year(((java.util.Date)v3));
    Object v5 = 33.20057958496543D;
    Object v6 = 0.0D;
    Object v7 = 21.083731800906406D;
    Object v8 = 1.0D;
    Object v9 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = "Notimplemented.";
    Object v11 = "ZOOM_IN_BOTH";
    Object v12 = new java.lang.Number[][]{};
    Object v13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v10),((java.lang.String)v11),((java.lang.Number[][])v12));
    Object v14 = 1;
    Object v15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.jfree.data.Values)v15).getItemCount();
    Object v17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v9),((org.jfree.data.KeyedValues)v15));
    Object v18 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v17));
    org.junit.Assert.assertEquals((Object)(true), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = ((org.jfree.data.Values2D)v3).getRowCount();
    Object v5 = 1;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = ((org.jfree.data.Values2D)v3).getRowCount();
    Object v5 = 1;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v5).intValue()));
    Object v7 = -24;
    Object v8 = 0;
    Object v9 = 1;
    Object v10 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.data.time.Year(((java.util.Date)v10));
    Object v12 = "Notimplemented.";
    Object v13 = "ZOOM_IN_BOTH";
    Object v14 = new java.lang.Number[][]{};
    Object v15 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v12),((java.lang.String)v13),((java.lang.Number[][])v14));
    Object v16 = 1;
    Object v17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = 0;
    Object v19 = ((org.jfree.data.Values)v17).getValue((((java.lang.Integer)v18).intValue()));
    Object v20 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.pie.PieDataset)v17));
    Object v21 = ((java.lang.Comparable)v11).compareTo(((java.lang.Object)v20));
    Object v22 = -3.700093880146082D;
    Object v23 = 12;
    Object v24 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(((org.jfree.data.pie.PieDataset)v6),((java.lang.Comparable)v11),(((java.lang.Double)v22).doubleValue()),(((java.lang.Integer)v23).intValue()));
    org.junit.Assert.assertNotNull(v24);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = ((org.jfree.data.xy.XYDataset)v3).getDomainOrder();
    Object v5 = true;
    Object v6 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = "L";
    Object v1 = "Equation has no solution!";
    Object v2 = new java.lang.Number[][]{null,null,null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = 2;
    Object v5 = ((org.jfree.data.xy.XYDataset)v3).getItemCount((((java.lang.Integer)v4).intValue()));
    Object v6 = 0.0D;
    Object v7 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = false;
    Object v5 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = -24;
    Object v5 = 0;
    Object v6 = 1;
    Object v7 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.data.time.Year(((java.util.Date)v7));
    Object v9 = 33.20057958496543D;
    Object v10 = 0.0D;
    Object v11 = 21.083731800906406D;
    Object v12 = 1.0D;
    Object v13 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = new org.jfree.data.KeyToGroupMap(((java.lang.Comparable)v13));
    Object v15 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.category.CategoryDataset)v3),((org.jfree.data.KeyToGroupMap)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = "Notimplemented.";
    Object v5 = "ZOOM_IN_BOTH";
    Object v6 = new java.lang.Number[][]{};
    Object v7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v4),((java.lang.String)v5),((java.lang.Number[][])v6));
    Object v8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v7));
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),((java.lang.Comparable)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = 58;
    Object v5 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = true;
    Object v5 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null,null,null};
    Object v1 = new java.lang.Comparable[]{null,null};
    Object v2 = new double[][]{null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null,null};
    Object v1 = new java.lang.Comparable[]{null,null,null};
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = ((org.jfree.data.general.Dataset)v3).getGroup();
    Object v5 = -11;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 1;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = "Null 'paint' argument.";
    Object v7 = java.util.TimeZone.getTimeZone(((java.lang.String)v6));
    Object v8 = javax.swing.JComponent.getDefaultLocale();
    Object v9 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v7),((java.util.Locale)v8));
    Object v10 = ((org.jfree.data.general.Dataset)v9).getGroup();
    Object v11 = org.jfree.data.general.DatasetUtilities.findMinimumDomainValue(((org.jfree.data.xy.XYDataset)v9));
    Object v12 = 1.0D;
    Object v13 = 6;
    Object v14 = org.jfree.data.general.DatasetUtilities.createConsolidatedPieDataset(((org.jfree.data.pie.PieDataset)v5),((java.lang.Comparable)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.general.Dataset)v3).getGroup();
    Object v5 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = true;
    Object v5 = org.jfree.data.general.DatasetUtilities.iterateDomainBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v3).removeChangeListener(((org.jfree.data.event.DatasetChangeListener)v4));
    Object v5 = null;
    Object v6 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = 4.74159507329166D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = 24.343264599052247D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.data.function.LineFunction2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 15.718679244466104D;
    Object v4 = -14.899187983691624D;
    Object v5 = 0;
    Object v6 = "Notimplemented.";
    Object v7 = "ZOOM_IN_BOTH";
    Object v8 = new java.lang.Number[][]{};
    Object v9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v6),((java.lang.String)v7),((java.lang.Number[][])v8));
    Object v10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v9));
    Object v11 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(((org.jfree.data.function.Function2D)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),((java.lang.Comparable)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    try {
    Object v0 = "Null 'source' argument.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new java.lang.Number[][]{null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = 1;
    Object v5 = org.jfree.data.general.DatasetUtilities.calculateStackTotal(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(0.0D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = false;
    Object v5 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.xy.XYDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = "Notimplemented.";
    Object v5 = "ZOOM_IN_BOTH";
    Object v6 = new java.lang.Number[][]{};
    Object v7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v4),((java.lang.String)v5),((java.lang.Number[][])v6));
    Object v8 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v7));
    Object v9 = ((org.jfree.data.KeyedValues2D)v3).getRowIndex(((java.lang.Comparable)v8));
    Object v10 = 1.0D;
    Object v11 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v3).removeChangeListener(((org.jfree.data.event.DatasetChangeListener)v4));
    Object v5 = null;
    Object v6 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = ((org.jfree.data.general.SeriesDataset)v3).getSeriesCount();
    Object v5 = org.jfree.data.general.DatasetUtilities.findMaximumDomainValue(((org.jfree.data.xy.XYDataset)v3));
    org.junit.Assert.assertEquals((Object)(Double.NaN), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMinimumRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = -24;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.jfree.data.time.Year(((java.util.Date)v3));
    Object v5 = 33.20057958496543D;
    Object v6 = 0.0D;
    Object v7 = 21.083731800906406D;
    Object v8 = 1.0D;
    Object v9 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = "Notimplemented.";
    Object v11 = "ZOOM_IN_BOTH";
    Object v12 = new java.lang.Number[][]{};
    Object v13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v10),((java.lang.String)v11),((java.lang.Number[][])v12));
    Object v14 = ((java.lang.Comparable)v9).compareTo(((java.lang.Object)v13));
    Object v15 = "Notimplemented.";
    Object v16 = "ZOOM_IN_BOTH";
    Object v17 = new java.lang.Number[][]{};
    Object v18 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v15),((java.lang.String)v16),((java.lang.Number[][])v17));
    Object v19 = ((org.jfree.data.Values2D)v18).getRowCount();
    Object v20 = 0;
    Object v21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v18),(((java.lang.Integer)v20).intValue()));
    Object v22 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v9),((org.jfree.data.KeyedValues)v21));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = ((org.jfree.data.Values2D)v3).getColumnCount();
    Object v5 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{null,null,null};
    Object v1 = new java.lang.Comparable[]{null,null};
    Object v2 = new double[][]{null,null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = true;
    Object v5 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMaximumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.KeyedValues2D)v3).getRowKeys();
    Object v5 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v3).addChangeListener(((org.jfree.data.event.DatasetChangeListener)v4));
    Object v5 = null;
    Object v6 = org.jfree.data.general.DatasetUtilities.findMaximumRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 24.343264599052247D;
    Object v1 = 0.0D;
    Object v2 = new org.jfree.data.function.LineFunction2D((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()));
    Object v3 = 1.0D;
    Object v4 = 0.0D;
    Object v5 = 0;
    Object v6 = "Null 'shape' argu\"ent.";
    Object v7 = "Null 'paint' argument.";
    Object v8 = new double[][]{};
    Object v9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v6),((java.lang.String)v7),((double[][])v8));
    Object v10 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.category.CategoryDataset)v9));
    Object v11 = org.jfree.data.general.DatasetUtilities.sampleFunction2DToSeries(((org.jfree.data.function.Function2D)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Integer)v5).intValue()),((java.lang.Comparable)v10));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findMinimumStackedRangeValue(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Null 'shape' argu\"ent.";
    Object v1 = "Null 'paint' argument.";
    Object v2 = new double[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((double[][])v2));
    Object v4 = false;
    Object v5 = org.jfree.data.general.DatasetUtilities.findRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = "Notimplemented.";
    Object v5 = "ZOOM_IN_BOTH";
    Object v6 = new java.lang.Number[][]{};
    Object v7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v4),((java.lang.String)v5),((java.lang.Number[][])v6));
    Object v8 = 1;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = 0;
    Object v11 = ((org.jfree.data.Values)v9).getValue((((java.lang.Integer)v10).intValue()));
    Object v12 = org.jfree.data.general.DatasetUtilities.isEmptyOrNull(((org.jfree.data.pie.PieDataset)v9));
    Object v13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),((java.lang.Comparable)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = false;
    Object v5 = org.jfree.data.general.DatasetUtilities.iterateRangeBounds(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = -24;
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = new java.util.Date((((java.lang.Integer)v0).intValue()),(((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = new org.jfree.data.time.Year(((java.util.Date)v3));
    Object v5 = 33.20057958496543D;
    Object v6 = 0.0D;
    Object v7 = 21.083731800906406D;
    Object v8 = 1.0D;
    Object v9 = new org.jfree.data.time.ohlc.OHLCItem(((org.jfree.data.time.RegularTimePeriod)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = "Notimplemented.";
    Object v11 = "ZOOM_IN_BOTH";
    Object v12 = new java.lang.Number[][]{};
    Object v13 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v10),((java.lang.String)v11),((java.lang.Number[][])v12));
    Object v14 = 1;
    Object v15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.jfree.data.Values)v15).getItemCount();
    Object v17 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v9),((org.jfree.data.KeyedValues)v15));
    Object v18 = -34;
    Object v19 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v17),(((java.lang.Integer)v18).intValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new java.lang.Comparable[]{};
    Object v1 = new java.lang.Comparable[]{null};
    Object v2 = new double[][]{null,null};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable[])v0),((java.lang.Comparable[])v1),((double[][])v2));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = ((org.jfree.data.Values2D)v3).getColumnCount();
    Object v5 = org.jfree.data.general.DatasetUtilities.findCumulativeRangeBounds(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = new org.jfree.data.general.DatasetGroup();
    ((org.jfree.data.general.Dataset)v3).setGroup(((org.jfree.data.general.DatasetGroup)v4));
    Object v5 = null;
    Object v6 = -8.53805151650972D;
    Object v7 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = "Notimplemented.";
    Object v1 = "ZOOM_IN_BOTH";
    Object v2 = new java.lang.Number[][]{};
    Object v3 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.String)v0),((java.lang.String)v1),((java.lang.Number[][])v2));
    Object v4 = 10;
    Object v5 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v3),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "Null 'paint' argument.";
    Object v1 = java.util.TimeZone.getTimeZone(((java.lang.String)v0));
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1),((java.util.Locale)v2));
    Object v4 = -45.9736910295879D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }
}
