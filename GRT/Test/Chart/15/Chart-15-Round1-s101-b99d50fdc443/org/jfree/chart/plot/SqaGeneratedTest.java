package org.jfree.chart.plot;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "San4sSerif";
    Object v1 = -37;
    Object v2 = -41;
    Object v3 = -5;
    Object v4 = -13;
    Object v5 = 0;
    Object v6 = -1;
    Object v7 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -37;
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.jfree.data.time.DateRange(((java.util.Date)v7),((java.util.Date)v14));
    Object v16 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v0),((org.jfree.data.Range)v15));
    Object v17 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v16));
    Object v18 = ((org.jfree.chart.plot.Plot)v17).getBackgroundAlpha();
    org.junit.Assert.assertEquals((Object)(1.0F), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = 2;
    Object v5 = ((org.jfree.chart.plot.PiePlot)v3).getSectionKey((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(2), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).getBaseSectionOutlineStroke();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = -38;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v6));
    Object v8 = 2;
    Object v9 = ((org.jfree.chart.plot.PiePlot)v7).getSectionKey((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jfree.chart.plot.PiePlot)v3).getExplodePercent(((java.lang.Comparable)v9));
    org.junit.Assert.assertEquals((Object)(0.0D), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "San4sSerif";
    Object v1 = -37;
    Object v2 = -41;
    Object v3 = -5;
    Object v4 = -13;
    Object v5 = 0;
    Object v6 = -1;
    Object v7 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -37;
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.jfree.data.time.DateRange(((java.util.Date)v7),((java.util.Date)v14));
    Object v16 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v0),((org.jfree.data.Range)v15));
    Object v17 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v16));
    Object v18 = ((org.jfree.chart.plot.Plot)v17).isSubplot();
    org.junit.Assert.assertEquals((Object)(false), v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "Not <et implemented.";
    Object v5 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator(((java.lang.String)v4));
    ((org.jfree.chart.plot.PiePlot)v3).setLegendLabelGenerator(((org.jfree.chart.labels.PieSectionLabelGenerator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = -38;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v6));
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).getBaseSectionOutlineStroke();
    ((org.jfree.chart.plot.PiePlot)v3).setLabelOutlineStroke(((java.awt.Stroke)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "Null 'paint'";
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = new java.awt.Font(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.PiePlot)v3).setLabelFont(((java.awt.Font)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "San4sSerif";
    Object v1 = -37;
    Object v2 = -41;
    Object v3 = -5;
    Object v4 = -13;
    Object v5 = 0;
    Object v6 = -1;
    Object v7 = new java.util.Date((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = -37;
    Object v9 = -41;
    Object v10 = -5;
    Object v11 = -13;
    Object v12 = 0;
    Object v13 = -1;
    Object v14 = new java.util.Date((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new org.jfree.data.time.DateRange(((java.util.Date)v7),((java.util.Date)v14));
    Object v16 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v0),((org.jfree.data.Range)v15));
    Object v17 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v16));
    Object v18 = -36.598286F;
    ((org.jfree.chart.plot.Plot)v17).setBackgroundAlpha((((java.lang.Float)v18).floatValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = 1.0D;
    ((org.jfree.chart.plot.PiePlot)v3).setLabelGap((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).getDirection();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = 11.37173F;
    ((org.jfree.chart.plot.Plot)v4).setForegroundAlpha((((java.lang.Float)v5).floatValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = "Null 'paint' ";
    ((org.jfree.chart.plot.Plot)v4).setNoDataMessage(((java.lang.String)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = -38;
    Object v7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v7));
    Object v9 = ((org.jfree.chart.plot.PiePlot)v8).clone();
    Object v10 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v9));
    ((org.jfree.chart.plot.Plot)v4).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = -37;
    Object v5 = -41;
    Object v6 = -5;
    Object v7 = -13;
    Object v8 = 0;
    Object v9 = -1;
    Object v10 = new java.util.Date((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = ((org.jfree.chart.plot.PiePlot)v3).getExplodePercent(((java.lang.Comparable)v10));
    org.junit.Assert.assertEquals((Object)(0.0D), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = 1.0F;
    ((org.jfree.chart.plot.Plot)v3).setBackgroundImageAlpha((((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = -38;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v6));
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).getDirection();
    ((org.jfree.chart.plot.PiePlot)v3).setDirection(((org.jfree.chart.util.Rotation)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "Null '";
    Object v5 = 0;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.plot.PiePlot)v3).setLabelPaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).getLabelGap();
    org.junit.Assert.assertEquals((Object)(0.025D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "Null '";
    Object v5 = 0;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.awt.image.ColorModel.getRGBdefault();
    Object v8 = -2;
    Object v9 = 30;
    Object v10 = new java.awt.Dimension((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()));
    Object v11 = new java.awt.Rectangle(((java.awt.Dimension)v10));
    Object v12 = -2;
    Object v13 = 30;
    Object v14 = new java.awt.Dimension((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.awt.Rectangle(((java.awt.Dimension)v14));
    Object v16 = 16.527694434620074D;
    Object v17 = 0.0D;
    Object v18 = java.awt.geom.AffineTransform.getTranslateInstance((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = 16.527694434620074D;
    Object v20 = 0.0D;
    Object v21 = java.awt.geom.AffineTransform.getTranslateInstance((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = -37;
    Object v23 = -41;
    Object v24 = -5;
    Object v25 = -13;
    Object v26 = 0;
    Object v27 = -1;
    Object v28 = new java.util.Date((((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()),(((java.lang.Integer)v24).intValue()),(((java.lang.Integer)v25).intValue()),(((java.lang.Integer)v26).intValue()),(((java.lang.Integer)v27).intValue()));
    Object v29 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v30 = -2;
    Object v31 = 30;
    Object v32 = new java.awt.Dimension((((java.lang.Integer)v30).intValue()),(((java.lang.Integer)v31).intValue()));
    Object v33 = java.util.Map.of(((java.lang.Object)v21),((java.lang.Object)v28),((java.lang.Object)v29),((java.lang.Object)v32));
    Object v34 = new java.awt.RenderingHints(((java.util.Map)v33));
    Object v35 = ((java.awt.Paint)v6).createContext(((java.awt.image.ColorModel)v7),((java.awt.Rectangle)v11),((java.awt.geom.Rectangle2D)v15),((java.awt.geom.AffineTransform)v18),((java.awt.RenderingHints)v34));
    ((org.jfree.chart.plot.Plot)v3).setNoDataMessagePaint(((java.awt.Paint)v6));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = "Null 'paint'";
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new java.awt.Font(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.PiePlot)v4).setLabelFont(((java.awt.Font)v8));
    Object v9 = null;
    Object v10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v11 = -38;
    Object v12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v12));
    Object v14 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v15 = -38;
    Object v16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v16));
    Object v18 = 2;
    Object v19 = ((org.jfree.chart.plot.PiePlot)v17).getSectionKey((((java.lang.Integer)v18).intValue()));
    Object v20 = ((org.jfree.chart.plot.PiePlot)v13).getExplodePercent(((java.lang.Comparable)v19));
    Object v21 = true;
    Object v22 = ((org.jfree.chart.plot.PiePlot)v4).lookupSectionPaint(((java.lang.Comparable)v20),(((java.lang.Boolean)v21).booleanValue()));
    org.junit.Assert.assertNotNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).getLegendLabelURLGenerator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = "Null 'paint'";
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = new java.awt.Font(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.PiePlot)v4).setLabelFont(((java.awt.Font)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.plot.PiePlot)v4).setLabelPadding(((org.jfree.chart.util.RectangleInsets)v5));
    Object v6 = null;
    Object v7 = -32;
    Object v8 = new org.jfree.chart.plot.PieLabelDistributor((((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.PiePlot)v4).setLabelDistributor(((org.jfree.chart.plot.AbstractPieLabelDistributor)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.plot.PiePlot)v3).getSectionKey((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertEquals((Object)(1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = -38;
    Object v7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v7));
    Object v9 = ((org.jfree.chart.plot.PiePlot)v8).clone();
    Object v10 = "Null 'paint'";
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = new java.awt.Font(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    ((org.jfree.chart.plot.PiePlot)v9).setLabelFont(((java.awt.Font)v13));
    Object v14 = null;
    Object v15 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v16 = -38;
    Object v17 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v15),(((java.lang.Integer)v16).intValue()));
    Object v18 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v17));
    Object v19 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v20 = -38;
    Object v21 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v21));
    Object v23 = 2;
    Object v24 = ((org.jfree.chart.plot.PiePlot)v22).getSectionKey((((java.lang.Integer)v23).intValue()));
    Object v25 = ((org.jfree.chart.plot.PiePlot)v18).getExplodePercent(((java.lang.Comparable)v24));
    Object v26 = true;
    Object v27 = ((org.jfree.chart.plot.PiePlot)v9).lookupSectionPaint(((java.lang.Comparable)v25),(((java.lang.Boolean)v26).booleanValue()));
    ((org.jfree.chart.plot.Plot)v4).setOutlinePaint(((java.awt.Paint)v27));
    Object v28 = null;
    Object v29 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v30 = -38;
    Object v31 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v31));
    Object v33 = ((org.jfree.chart.plot.PiePlot)v32).clone();
    Object v34 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v33));
    Object v35 = ((java.util.EventObject)v34).toString();
    ((org.jfree.chart.plot.Plot)v4).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v34));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = -38;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v6));
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    Object v9 = "Null 'paint'";
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = new java.awt.Font(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    ((org.jfree.chart.plot.PiePlot)v8).setLabelFont(((java.awt.Font)v12));
    Object v13 = null;
    Object v14 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v15 = -38;
    Object v16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v14),(((java.lang.Integer)v15).intValue()));
    Object v17 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v16));
    Object v18 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v19 = -38;
    Object v20 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v18),(((java.lang.Integer)v19).intValue()));
    Object v21 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v20));
    Object v22 = 2;
    Object v23 = ((org.jfree.chart.plot.PiePlot)v21).getSectionKey((((java.lang.Integer)v22).intValue()));
    Object v24 = ((org.jfree.chart.plot.PiePlot)v17).getExplodePercent(((java.lang.Comparable)v23));
    Object v25 = true;
    Object v26 = ((org.jfree.chart.plot.PiePlot)v8).lookupSectionPaint(((java.lang.Comparable)v24),(((java.lang.Boolean)v25).booleanValue()));
    ((org.jfree.chart.plot.Plot)v3).setBackgroundPaint(((java.awt.Paint)v26));
    Object v27 = null;
    org.junit.Assert.assertNull(v27);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = -7.606862537231663D;
    ((org.jfree.chart.plot.PiePlot)v5).setInteriorGap((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).getLabelShadowPaint();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = 0.0F;
    ((org.jfree.chart.plot.Plot)v4).setForegroundAlpha((((java.lang.Float)v5).floatValue()));
    Object v6 = null;
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v9));
    Object v11 = 1;
    Object v12 = ((org.jfree.chart.plot.PiePlot)v10).getSectionKey((((java.lang.Integer)v11).intValue()));
    Object v13 = true;
    Object v14 = ((org.jfree.chart.plot.PiePlot)v4).lookupSectionPaint(((java.lang.Comparable)v12),(((java.lang.Boolean)v13).booleanValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = -38;
    Object v7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v5),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.PiePlot)v4).setDataset(((org.jfree.data.general.PieDataset)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.plot.Plot)v3).setInsets(((org.jfree.chart.util.RectangleInsets)v4));
    Object v5 = null;
    Object v6 = ((org.jfree.chart.plot.Plot)v3).isSubplot();
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = "Null '";
    Object v7 = 0;
    Object v8 = java.awt.Color.getColor(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.PiePlot)v5).setBaseSectionPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = 0.0D;
    ((org.jfree.chart.plot.PiePlot)v5).setInteriorGap((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "Null '";
    Object v5 = 0;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = ((java.awt.Transparency)v6).getTransparency();
    ((org.jfree.chart.plot.Plot)v3).setNoDataMessagePaint(((java.awt.Paint)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getNoDataMessagePaint();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "Null 'paint'";
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = new java.awt.Font(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.Plot)v3).setNoDataMessageFont(((java.awt.Font)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "Null '";
    Object v5 = 0;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.plot.PiePlot)v3).setLabelLinkPaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.chart.util.RectangleInsets();
    Object v5 = -2;
    Object v6 = 30;
    Object v7 = new java.awt.Dimension((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.awt.Rectangle(((java.awt.Dimension)v7));
    Object v9 = false;
    Object v10 = true;
    Object v11 = ((org.jfree.chart.util.RectangleInsets)v4).createOutsetRectangle(((java.awt.geom.Rectangle2D)v8),(((java.lang.Boolean)v9).booleanValue()),(((java.lang.Boolean)v10).booleanValue()));
    ((org.jfree.chart.plot.PiePlot)v3).setSimpleLabelOffset(((org.jfree.chart.util.RectangleInsets)v4));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v7 = -38;
    Object v8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v8));
    Object v10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v11 = -38;
    Object v12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v12));
    Object v14 = 2;
    Object v15 = ((org.jfree.chart.plot.PiePlot)v13).getSectionKey((((java.lang.Integer)v14).intValue()));
    Object v16 = ((org.jfree.chart.plot.PiePlot)v9).getExplodePercent(((java.lang.Comparable)v15));
    Object v17 = 7.301415429551739D;
    ((org.jfree.chart.plot.PiePlot)v5).setExplodePercent(((java.lang.Comparable)v16),(((java.lang.Double)v17).doubleValue()));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = false;
    ((org.jfree.chart.plot.PiePlot)v5).setIgnoreZeroValues((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = true;
    Object v9 = true;
    ((org.jfree.chart.plot.PiePlot)v5).setCircular((((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = "Null '";
    Object v7 = 0;
    Object v8 = java.awt.Color.getColor(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.Plot)v5).setOutlinePaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = -38;
    Object v7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v7));
    Object v9 = ((org.jfree.chart.plot.PiePlot)v8).getDirection();
    ((org.jfree.chart.plot.PiePlot)v4).setDirection(((org.jfree.chart.util.Rotation)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.PiePlot)v5).getSimpleLabelOffset();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = true;
    ((org.jfree.chart.plot.PiePlot)v5).setSimpleLabels((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.PiePlot)v5).getLabelFont();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = true;
    ((org.jfree.chart.plot.PiePlot)v5).setIgnoreNullValues((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = -2;
    Object v8 = 30;
    Object v9 = new java.awt.Dimension((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new java.awt.Rectangle(((java.awt.Dimension)v9));
    ((org.jfree.chart.plot.PiePlot)v6).setLegendItemShape(((java.awt.Shape)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v9));
    ((org.jfree.chart.plot.Plot)v6).setParent(((org.jfree.chart.plot.Plot)v10));
    Object v11 = null;
    Object v12 = 32.358727F;
    ((org.jfree.chart.plot.Plot)v6).setForegroundAlpha((((java.lang.Float)v12).floatValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v11 = -38;
    Object v12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v12));
    Object v14 = ((org.jfree.chart.plot.PiePlot)v13).clone();
    Object v15 = ((org.jfree.chart.plot.PiePlot)v14).clone();
    Object v16 = ((org.jfree.chart.plot.Plot)v15).getRootPlot();
    ((org.jfree.data.general.Dataset)v9).removeChangeListener(((org.jfree.data.general.DatasetChangeListener)v16));
    Object v17 = null;
    ((org.jfree.chart.plot.PiePlot)v6).setDataset(((org.jfree.data.general.PieDataset)v9));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = new org.jfree.chart.util.RectangleInsets();
    Object v7 = false;
    ((org.jfree.chart.plot.Plot)v5).setInsets(((org.jfree.chart.util.RectangleInsets)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = true;
    Object v7 = true;
    ((org.jfree.chart.plot.PiePlot)v5).setCircular((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v7 = -38;
    Object v8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v8));
    Object v10 = ((org.jfree.chart.plot.PiePlot)v9).getBaseSectionOutlineStroke();
    Object v11 = -2;
    Object v12 = 30;
    Object v13 = new java.awt.Dimension((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.awt.Rectangle(((java.awt.Dimension)v13));
    Object v15 = ((java.awt.Stroke)v10).createStrokedShape(((java.awt.Shape)v14));
    ((org.jfree.chart.plot.PiePlot)v5).setBaseSectionOutlineStroke(((java.awt.Stroke)v10));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).getInteriorGap();
    org.junit.Assert.assertEquals((Object)(0.08D), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = "San4sSerif";
    Object v7 = -37;
    Object v8 = -41;
    Object v9 = -5;
    Object v10 = -13;
    Object v11 = 0;
    Object v12 = -1;
    Object v13 = new java.util.Date((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = -37;
    Object v15 = -41;
    Object v16 = -5;
    Object v17 = -13;
    Object v18 = 0;
    Object v19 = -1;
    Object v20 = new java.util.Date((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new org.jfree.data.time.DateRange(((java.util.Date)v13),((java.util.Date)v20));
    Object v22 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v6),((org.jfree.data.Range)v21));
    Object v23 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v22));
    Object v24 = ((org.jfree.chart.plot.Plot)v23).getBackgroundAlpha();
    Object v25 = false;
    Object v26 = ((org.jfree.chart.plot.PiePlot)v5).lookupSectionPaint(((java.lang.Comparable)v24),(((java.lang.Boolean)v25).booleanValue()));
    org.junit.Assert.assertNotNull(v26);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = new org.jfree.chart.util.RectangleInsets();
    Object v7 = true;
    ((org.jfree.chart.plot.Plot)v5).setInsets(((org.jfree.chart.util.RectangleInsets)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = new org.jfree.chart.util.Size2D();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v6).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v7 = -38;
    Object v8 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v6),(((java.lang.Integer)v7).intValue()));
    Object v9 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v8));
    Object v10 = ((org.jfree.chart.plot.PiePlot)v9).getBaseSectionOutlineStroke();
    ((org.jfree.chart.plot.PiePlot)v5).setBaseSectionOutlineStroke(((java.awt.Stroke)v10));
    Object v11 = null;
    Object v12 = ((org.jfree.chart.plot.PiePlot)v5).getMaximumLabelWidth();
    org.junit.Assert.assertEquals((Object)(0.14D), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).getLegendLabelToolTipGenerator();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).getLabelOutlinePaint();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = -32;
    Object v7 = new org.jfree.chart.plot.PieLabelDistributor((((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.PiePlot)v5).setLabelDistributor(((org.jfree.chart.plot.AbstractPieLabelDistributor)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = "Null 'paint'";
    Object v7 = 0;
    Object v8 = 0;
    Object v9 = new java.awt.Font(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    ((org.jfree.chart.plot.Plot)v5).setNoDataMessageFont(((java.awt.Font)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = true;
    ((org.jfree.chart.plot.PiePlot)v6).setSectionOutlinesVisible((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v10 = -38;
    Object v11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v9),(((java.lang.Integer)v10).intValue()));
    ((org.jfree.chart.plot.PiePlot)v6).setDataset(((org.jfree.data.general.PieDataset)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = true;
    ((org.jfree.chart.plot.Plot)v6).setOutlineVisible((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.plot.Plot)v6).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v9));
    Object v11 = ((org.jfree.chart.plot.PiePlot)v10).getBaseSectionOutlineStroke();
    ((org.jfree.chart.plot.Plot)v6).setOutlineStroke(((java.awt.Stroke)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v5 = -38;
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v6));
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    Object v9 = ((org.jfree.chart.plot.PiePlot)v8).clone();
    Object v10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v11 = -38;
    Object v12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v12));
    Object v14 = ((org.jfree.chart.plot.PiePlot)v13).getBaseSectionOutlineStroke();
    ((org.jfree.chart.plot.PiePlot)v9).setBaseSectionOutlineStroke(((java.awt.Stroke)v14));
    Object v15 = null;
    Object v16 = ((org.jfree.chart.plot.PiePlot)v9).getMaximumLabelWidth();
    Object v17 = false;
    Object v18 = ((org.jfree.chart.plot.PiePlot)v3).lookupSectionOutlinePaint(((java.lang.Comparable)v16),(((java.lang.Boolean)v17).booleanValue()));
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.PiePlot)v5).getInteriorGap();
    org.junit.Assert.assertEquals((Object)(0.08D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = "Null '";
    Object v8 = 0;
    Object v9 = java.awt.Color.getColor(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    ((org.jfree.chart.plot.Plot)v6).setBackgroundPaint(((java.awt.Paint)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = false;
    ((org.jfree.chart.plot.PiePlot)v6).setLabelLinksVisible((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = 43.1909593807301D;
    Object v7 = "Null '";
    Object v8 = 0;
    Object v9 = java.awt.Color.getColor(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v11 = -38;
    Object v12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v12));
    Object v14 = ((org.jfree.chart.plot.PiePlot)v13).getBaseSectionOutlineStroke();
    Object v15 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()),((java.awt.Paint)v9),((java.awt.Stroke)v14));
    Object v16 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v15));
    ((org.jfree.chart.plot.Plot)v5).markerChanged(((org.jfree.chart.event.MarkerChangeEvent)v16));
    Object v17 = null;
    Object v18 = ((org.jfree.chart.plot.Plot)v5).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).getLegendLabelURLGenerator();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = 0.0D;
    ((org.jfree.chart.plot.PiePlot)v4).setInteriorGap((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v9));
    Object v11 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.plot.Plot)v10).setInsets(((org.jfree.chart.util.RectangleInsets)v11));
    Object v12 = null;
    Object v13 = ((org.jfree.chart.plot.Plot)v10).isSubplot();
    Object v14 = false;
    Object v15 = ((org.jfree.chart.plot.PiePlot)v6).lookupSectionOutlineStroke(((java.lang.Comparable)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v9 = -38;
    Object v10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v8),(((java.lang.Integer)v9).intValue()));
    Object v11 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v10));
    Object v12 = 1;
    Object v13 = ((org.jfree.chart.plot.PiePlot)v11).getSectionKey((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    Object v15 = ((org.jfree.chart.plot.PiePlot)v6).lookupSectionOutlinePaint(((java.lang.Comparable)v13),(((java.lang.Boolean)v14).booleanValue()));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = 0.0D;
    ((org.jfree.chart.plot.Plot)v3).zoom((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.PiePlot)v5).getLegendItems();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = 0.0D;
    ((org.jfree.chart.plot.PiePlot)v7).setMinimumArcAngleToDraw((((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = "Null '";
    Object v8 = 0;
    Object v9 = java.awt.Color.getColor(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    ((org.jfree.chart.plot.PiePlot)v6).setBaseSectionPaint(((java.awt.Paint)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = "Null '";
    Object v8 = 0;
    Object v9 = java.awt.Color.getColor(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    ((org.jfree.chart.plot.PiePlot)v6).setBaseSectionOutlinePaint(((java.awt.Paint)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    Object v9 = ((org.jfree.chart.plot.PiePlot)v8).getMaximumExplodePercent();
    org.junit.Assert.assertEquals((Object)(0.0D), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).getLabelOutlineStroke();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.PiePlot)v5).getMinimumArcAngleToDraw();
    org.junit.Assert.assertEquals((Object)(1.0E-5D), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = -32;
    Object v6 = new org.jfree.chart.plot.PieLabelDistributor((((java.lang.Integer)v5).intValue()));
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v6),((org.jfree.data.general.Dataset)v9));
    ((org.jfree.chart.plot.Plot)v4).datasetChanged(((org.jfree.data.general.DatasetChangeEvent)v10));
    Object v11 = null;
    Object v12 = new org.jfree.chart.util.RectangleInsets();
    Object v13 = -2;
    Object v14 = 30;
    Object v15 = new java.awt.Dimension((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new java.awt.Rectangle(((java.awt.Dimension)v15));
    Object v17 = ((org.jfree.chart.util.RectangleInsets)v12).createInsetRectangle(((java.awt.geom.Rectangle2D)v16));
    Object v18 = true;
    ((org.jfree.chart.plot.Plot)v4).setInsets(((org.jfree.chart.util.RectangleInsets)v12),(((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).getSimpleLabelOffset();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = "Not <et implemented.";
    Object v6 = new org.jfree.chart.labels.StandardPieSectionLabelGenerator(((java.lang.String)v5));
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = "San4sSerif";
    Object v11 = -37;
    Object v12 = -41;
    Object v13 = -5;
    Object v14 = -13;
    Object v15 = 0;
    Object v16 = -1;
    Object v17 = new java.util.Date((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = -37;
    Object v19 = -41;
    Object v20 = -5;
    Object v21 = -13;
    Object v22 = 0;
    Object v23 = -1;
    Object v24 = new java.util.Date((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()),(((java.lang.Integer)v22).intValue()),(((java.lang.Integer)v23).intValue()));
    Object v25 = new org.jfree.data.time.DateRange(((java.util.Date)v17),((java.util.Date)v24));
    Object v26 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v10),((org.jfree.data.Range)v25));
    Object v27 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v26));
    Object v28 = ((org.jfree.chart.plot.Plot)v27).getBackgroundAlpha();
    Object v29 = ((org.jfree.chart.labels.PieSectionLabelGenerator)v6).generateAttributedSectionLabel(((org.jfree.data.general.PieDataset)v9),((java.lang.Comparable)v28));
    ((org.jfree.chart.plot.PiePlot)v4).setLegendLabelGenerator(((org.jfree.chart.labels.PieSectionLabelGenerator)v6));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = "Null '";
    Object v7 = 0;
    Object v8 = java.awt.Color.getColor(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.PiePlot)v5).setLabelPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v6 = -38;
    Object v7 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v5),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v7));
    Object v9 = ((org.jfree.chart.plot.PiePlot)v8).getLabelShadowPaint();
    ((org.jfree.chart.plot.Plot)v4).setOutlinePaint(((java.awt.Paint)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    Object v9 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v10 = -38;
    Object v11 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v11));
    Object v13 = ((org.jfree.chart.plot.PiePlot)v12).clone();
    Object v14 = ((org.jfree.chart.plot.PiePlot)v13).clone();
    Object v15 = ((org.jfree.chart.plot.PiePlot)v14).getMinimumArcAngleToDraw();
    Object v16 = -17.454023611749903D;
    ((org.jfree.chart.plot.PiePlot)v8).setExplodePercent(((java.lang.Comparable)v15),(((java.lang.Double)v16).doubleValue()));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).getLegendItems();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    Object v9 = 43.1909593807301D;
    Object v10 = "Null '";
    Object v11 = 0;
    Object v12 = java.awt.Color.getColor(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v14 = -38;
    Object v15 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v13),(((java.lang.Integer)v14).intValue()));
    Object v16 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v15));
    Object v17 = ((org.jfree.chart.plot.PiePlot)v16).getBaseSectionOutlineStroke();
    Object v18 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v9).doubleValue()),((java.awt.Paint)v12),((java.awt.Stroke)v17));
    Object v19 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v18));
    ((org.jfree.chart.plot.Plot)v8).markerChanged(((org.jfree.chart.event.MarkerChangeEvent)v19));
    Object v20 = null;
    Object v21 = -32.92977F;
    ((org.jfree.chart.plot.Plot)v8).setBackgroundImageAlpha((((java.lang.Float)v21).floatValue()));
    Object v22 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    Object v9 = ((org.jfree.chart.plot.PiePlot)v8).getPlotType();
    org.junit.Assert.assertEquals((Object)("Pie Plot"), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = ((org.jfree.chart.plot.PiePlot)v6).clone();
    Object v8 = ((org.jfree.chart.plot.PiePlot)v7).clone();
    Object v9 = 44.509861705116876D;
    ((org.jfree.chart.plot.PiePlot)v8).setMaximumLabelWidth((((java.lang.Double)v9).doubleValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = ((org.jfree.chart.plot.PiePlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.PiePlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v7 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v8 = -38;
    Object v9 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v9));
    Object v11 = ((org.jfree.chart.plot.PiePlot)v10).getLabelShadowPaint();
    ((org.jfree.chart.plot.PiePlot)v6).setLabelPaint(((java.awt.Paint)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = "San4sSerif";
    Object v5 = -37;
    Object v6 = -41;
    Object v7 = -5;
    Object v8 = -13;
    Object v9 = 0;
    Object v10 = -1;
    Object v11 = new java.util.Date((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()));
    Object v12 = -37;
    Object v13 = -41;
    Object v14 = -5;
    Object v15 = -13;
    Object v16 = 0;
    Object v17 = -1;
    Object v18 = new java.util.Date((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new org.jfree.data.time.DateRange(((java.util.Date)v11),((java.util.Date)v18));
    Object v20 = new org.jfree.chart.axis.ModuloAxis(((java.lang.String)v4),((org.jfree.data.Range)v19));
    Object v21 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v20));
    ((org.jfree.chart.plot.Plot)v3).removeChangeListener(((org.jfree.chart.event.PlotChangeListener)v21));
    Object v22 = null;
    Object v23 = ((org.jfree.chart.plot.PiePlot)v3).getLabelLinkStroke();
    org.junit.Assert.assertNotNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    Object v4 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.plot.PiePlot)v3).setLabelPadding(((org.jfree.chart.util.RectangleInsets)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.data.general.DefaultKeyedValues2DDataset();
    Object v1 = -38;
    Object v2 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v0),(((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v2));
    org.junit.Assert.assertNotNull(v3);
  }
}
