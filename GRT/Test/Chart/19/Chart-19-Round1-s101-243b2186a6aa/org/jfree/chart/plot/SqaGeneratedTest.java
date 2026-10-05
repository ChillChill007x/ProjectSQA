package org.jfree.chart.plot;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 7;
    Object v6 = new org.jfree.chart.ChartColor((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.plot.CategoryPlot)v2).setRangeGridlinePaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = new org.jfree.chart.renderer.category.CategoryItemRenderer[]{null};
    ((org.jfree.chart.plot.CategoryPlot)v2).setRenderers(((org.jfree.chart.renderer.category.CategoryItemRenderer[])v3));
    Object v4 = null;
    Object v5 = false;
    ((org.jfree.chart.plot.CategoryPlot)v2).setRangeCrosshairVisible((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = 23;
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v2).getDataset((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = 0.0D;
    Object v4 = -14.412796736662697D;
    Object v5 = 1.0D;
    Object v6 = 87.64519729051794D;
    Object v7 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = true;
    ((org.jfree.chart.plot.Plot)v2).setInsets(((org.jfree.chart.util.RectangleInsets)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = 1;
    Object v4 = 0;
    ((org.jfree.chart.plot.CategoryPlot)v2).mapDatasetToDomainAxis((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v2).getDomainAxisForDataset((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    ((org.jfree.chart.plot.CategoryPlot)v2).clearRangeMarkers();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = false;
    ((org.jfree.chart.plot.CategoryPlot)v2).setRangeGridlinesVisible((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    ((org.jfree.chart.plot.CategoryPlot)v2).clearDomainAxes();
    Object v3 = null;
    Object v4 = 0.0D;
    ((org.jfree.chart.plot.CategoryPlot)v2).setAnchorValue((((java.lang.Double)v4).doubleValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    ((org.jfree.chart.plot.CategoryPlot)v2).configureDomainAxes();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v2).getDomainAxis((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getForegroundAlpha();
    org.junit.Assert.assertEquals((Object)(1.0F), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 3;
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v3).getRangeAxis((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0.0D;
    Object v5 = true;
    ((org.jfree.chart.plot.CategoryPlot)v3).setRangeCrosshairValue((((java.lang.Double)v4).doubleValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.data.gantt.TaskSeriesCollection();
    Object v5 = ((org.jfree.data.Values2D)v4).getColumnCount();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v3).getRendererForDataset(((org.jfree.data.category.CategoryDataset)v4));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = null;
    ((org.jfree.chart.plot.CategoryPlot)v3).setRowRenderingOrder(((org.jfree.chart.util.SortOrder)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.chart.plot.DefaultDrawingSupplier();
    ((org.jfree.chart.plot.Plot)v3).setDrawingSupplier(((org.jfree.chart.plot.DrawingSupplier)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 7;
    Object v7 = new org.jfree.chart.ChartColor((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v7));
    Object v9 = "Not implemented.";
    Object v10 = new org.jfree.data.gantt.TaskSeriesCollection();
    Object v11 = "Null 'paint' argume_t.";
    Object v12 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v11));
    Object v13 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v12));
    Object v14 = ((org.jfree.chart.plot.Plot)v13).getRootPlot();
    Object v15 = ((org.jfree.chart.plot.Plot)v14).getForegroundAlpha();
    Object v16 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(((org.jfree.data.category.CategoryDataset)v10),((java.lang.Comparable)v15));
    Object v17 = new org.jfree.data.gantt.TaskSeriesCollection();
    Object v18 = "Null 'paint' argume_t.";
    Object v19 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v18));
    Object v20 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v19));
    Object v21 = ((org.jfree.chart.plot.Plot)v20).getRootPlot();
    Object v22 = ((org.jfree.chart.plot.Plot)v21).getForegroundAlpha();
    Object v23 = org.jfree.data.general.DatasetUtilities.createPieDatasetForRow(((org.jfree.data.category.CategoryDataset)v17),((java.lang.Comparable)v22));
    Object v24 = 0;
    Object v25 = false;
    Object v26 = true;
    Object v27 = true;
    Object v28 = "\"";
    Object v29 = "Null 'zone' argument.";
    Object v30 = "{0}: ({1}, {2}, {3})";
    Object v31 = new java.util.Locale(((java.lang.String)v28),((java.lang.String)v29),((java.lang.String)v30));
    Object v32 = false;
    Object v33 = true;
    Object v34 = org.jfree.chart.ChartFactory.createPieChart(((java.lang.String)v9),((org.jfree.data.general.PieDataset)v16),((org.jfree.data.general.PieDataset)v23),(((java.lang.Integer)v24).intValue()),(((java.lang.Boolean)v25).booleanValue()),(((java.lang.Boolean)v26).booleanValue()),(((java.lang.Boolean)v27).booleanValue()),((java.util.Locale)v31),(((java.lang.Boolean)v32).booleanValue()),(((java.lang.Boolean)v33).booleanValue()));
    ((org.jfree.chart.event.ChartChangeEvent)v8).setChart(((org.jfree.chart.JFreeChart)v34));
    Object v35 = null;
    ((org.jfree.chart.plot.CategoryPlot)v3).rendererChanged(((org.jfree.chart.event.RendererChangeEvent)v8));
    Object v36 = null;
    org.junit.Assert.assertNull(v36);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argume_t.";
    Object v5 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v4));
    Object v6 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).getRootPlot();
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getForegroundAlpha();
    Object v9 = ((org.jfree.chart.plot.CategoryPlot)v3).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argument.";
    Object v5 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v4));
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v3).getDataRange(((org.jfree.chart.axis.ValueAxis)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).getCategories();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0.0D;
    Object v5 = -14.412796736662697D;
    Object v6 = 1.0D;
    Object v7 = 87.64519729051794D;
    Object v8 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.jfree.chart.util.RectangleInsets)v8).hashCode();
    Object v10 = false;
    ((org.jfree.chart.plot.Plot)v3).setInsets(((org.jfree.chart.util.RectangleInsets)v8),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = -19;
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v3).getDomainAxisEdge((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0.0F;
    ((org.jfree.chart.plot.Plot)v3).setBackgroundImageAlpha((((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).getDomainAxisCount();
    org.junit.Assert.assertEquals((Object)(1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    ((org.jfree.chart.plot.CategoryPlot)v3).clearDomainMarkers();
    Object v4 = null;
    Object v5 = 0;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v3).getRenderer((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 7;
    Object v7 = new org.jfree.chart.ChartColor((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.Plot)v3).setOutlinePaint(((java.awt.Paint)v7));
    Object v8 = null;
    ((org.jfree.chart.plot.CategoryPlot)v3).clearDomainMarkers();
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    Object v5 = 0.0D;
    Object v6 = -14.412796736662697D;
    Object v7 = 1.0D;
    Object v8 = 87.64519729051794D;
    Object v9 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    ((org.jfree.chart.plot.Plot)v4).setInsets(((org.jfree.chart.util.RectangleInsets)v9));
    Object v10 = null;
    Object v11 = 0.0F;
    ((org.jfree.chart.plot.Plot)v4).setForegroundAlpha((((java.lang.Float)v11).floatValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainGridlineStroke();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argume_t.";
    Object v5 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v4));
    Object v6 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).getRootPlot();
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v7).clone();
    Object v9 = ((org.jfree.chart.plot.CategoryPlot)v8).getDomainGridlineStroke();
    ((org.jfree.chart.plot.CategoryPlot)v3).setRangeGridlineStroke(((java.awt.Stroke)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 53;
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v3).getDomainAxisForDataset((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    ((org.jfree.chart.plot.CategoryPlot)v3).configureRangeAxes();
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0.0D;
    Object v5 = -14.412796736662697D;
    Object v6 = 1.0D;
    Object v7 = 87.64519729051794D;
    Object v8 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    ((org.jfree.chart.plot.CategoryPlot)v3).setAxisOffset(((org.jfree.chart.util.RectangleInsets)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 7;
    Object v8 = new org.jfree.chart.ChartColor((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeCrosshairPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = 7;
    Object v7 = new org.jfree.chart.ChartColor((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.plot.CategoryPlot)v3).setRangeCrosshairPaint(((java.awt.Paint)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.chart.axis.CategoryAxis[]{null};
    ((org.jfree.chart.plot.CategoryPlot)v3).setDomainAxes(((org.jfree.chart.axis.CategoryAxis[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    Object v5 = -12;
    ((org.jfree.chart.plot.CategoryPlot)v4).clearRangeMarkers((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).getDrawSharedDomainAxis();
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = -2;
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v3).getDomainAxisEdge((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 9.89303F;
    ((org.jfree.chart.plot.Plot)v3).setForegroundAlpha((((java.lang.Float)v4).floatValue()));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = false;
    ((org.jfree.chart.plot.CategoryPlot)v3).setAnchorValue((((java.lang.Double)v6).doubleValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).getLegendItems();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0;
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v9 = 53;
    Object v10 = ((org.jfree.chart.plot.CategoryPlot)v8).getDomainAxisForDataset((((java.lang.Integer)v9).intValue()));
    Object v11 = true;
    ((org.jfree.chart.plot.CategoryPlot)v3).setDomainAxis((((java.lang.Integer)v4).intValue()),((org.jfree.chart.axis.CategoryAxis)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).getRangeCrosshairPaint();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 7;
    Object v6 = new org.jfree.chart.ChartColor((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.plot.Plot)v2).setOutlinePaint(((java.awt.Paint)v6));
    Object v7 = null;
    ((org.jfree.chart.plot.CategoryPlot)v2).clearDomainMarkers();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v9 = ((org.jfree.chart.plot.Plot)v8).getDrawingSupplier();
    Object v10 = ((org.jfree.chart.plot.CategoryPlot)v4).equals(((java.lang.Object)v9));
    Object v11 = -55;
    Object v12 = ((org.jfree.chart.plot.CategoryPlot)v4).getRenderer((((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = 7;
    Object v8 = new org.jfree.chart.ChartColor((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.CategoryPlot)v3).setRangeGridlinePaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setRangeCrosshairVisible((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = false;
    ((org.jfree.chart.plot.CategoryPlot)v0).setRangeCrosshairVisible((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 7;
    Object v6 = new org.jfree.chart.ChartColor((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.plot.CategoryPlot)v0).setRangeGridlinePaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    ((org.jfree.chart.plot.CategoryPlot)v4).clearDomainMarkers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = new org.jfree.chart.plot.DefaultDrawingSupplier();
    Object v2 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    Object v3 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v1),((org.jfree.data.general.Dataset)v2));
    ((org.jfree.chart.plot.CategoryPlot)v0).datasetChanged(((org.jfree.data.general.DatasetChangeEvent)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0;
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v9 = 53;
    Object v10 = ((org.jfree.chart.plot.CategoryPlot)v8).getDomainAxisForDataset((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((org.jfree.chart.plot.CategoryPlot)v3).setDomainAxis((((java.lang.Integer)v4).intValue()),((org.jfree.chart.axis.CategoryAxis)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    ((org.jfree.chart.plot.CategoryPlot)v0).clearRangeMarkers();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = false;
    ((org.jfree.chart.plot.CategoryPlot)v3).setRangeCrosshairLockedOnData((((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 8;
    ((org.jfree.chart.plot.CategoryPlot)v0).clearRangeMarkers((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = ((org.jfree.chart.plot.CategoryPlot)v0).getCategories();
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = 7;
    Object v4 = new org.jfree.chart.ChartColor((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.plot.Plot)v0).setNoDataMessagePaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = ((org.jfree.chart.plot.Plot)v0).getPlotType();
    Object v2 = "Null 'paint' argument.";
    Object v3 = 0;
    Object v4 = -13;
    Object v5 = new java.awt.Font(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.plot.Plot)v0).setNoDataMessageFont(((java.awt.Font)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 18.834366426694157D;
    ((org.jfree.chart.plot.CategoryPlot)v0).zoom((((java.lang.Double)v1).doubleValue()));
    Object v2 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 0;
    Object v2 = "Null 'paint' argument.";
    Object v3 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v2));
    Object v4 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setRangeAxis((((java.lang.Integer)v1).intValue()),((org.jfree.chart.axis.ValueAxis)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v3).getRangeAxisLocation((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 4.46732192790685D;
    Object v2 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setAnchorValue((((java.lang.Double)v1).doubleValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 22;
    ((org.jfree.chart.plot.Plot)v0).setBackgroundImageAlignment((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = 5;
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v3).getRangeAxis((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = "Null 'paint' argume_t.";
    Object v2 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v1));
    Object v3 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v2));
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v5).getDomainGridlineStroke();
    ((org.jfree.chart.plot.CategoryPlot)v0).setRangeGridlineStroke(((java.awt.Stroke)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = new org.jfree.chart.renderer.category.CategoryItemRenderer[]{null,null,null};
    ((org.jfree.chart.plot.CategoryPlot)v3).setRenderers(((org.jfree.chart.renderer.category.CategoryItemRenderer[])v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = "Null 'paint' argume_t.";
    Object v2 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v1));
    Object v3 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v2));
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v5).getDomainGridlineStroke();
    ((org.jfree.chart.plot.Plot)v0).setOutlineStroke(((java.awt.Stroke)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argume_t.";
    Object v5 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v4));
    Object v6 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).getRootPlot();
    Object v8 = 0;
    Object v9 = ((org.jfree.chart.plot.CategoryPlot)v7).getRangeAxisLocation((((java.lang.Integer)v8).intValue()));
    ((org.jfree.chart.plot.CategoryPlot)v3).setDomainAxisLocation(((org.jfree.chart.axis.AxisLocation)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxis();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = "Null 'paint' argument.";
    Object v2 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v1));
    Object v3 = 0;
    Object v4 = 0;
    Object v5 = 7;
    Object v6 = new org.jfree.chart.ChartColor((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.axis.Axis)v2).setTickLabelPaint(((java.awt.Paint)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v0).getDataRange(((org.jfree.chart.axis.ValueAxis)v2));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = new org.jfree.chart.renderer.category.CategoryItemRenderer[]{null,null};
    ((org.jfree.chart.plot.CategoryPlot)v0).setRenderers(((org.jfree.chart.renderer.category.CategoryItemRenderer[])v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Null 'paint' argume_t.";
    Object v5 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v4));
    Object v6 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v5));
    Object v7 = ((org.jfree.chart.plot.Plot)v6).getRootPlot();
    Object v8 = 53;
    Object v9 = ((org.jfree.chart.plot.CategoryPlot)v7).getDomainAxisForDataset((((java.lang.Integer)v8).intValue()));
    Object v10 = ((org.jfree.chart.plot.CategoryPlot)v3).getDomainAxisIndex(((org.jfree.chart.axis.CategoryAxis)v9));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    ((org.jfree.chart.plot.CategoryPlot)v4).configureDomainAxes();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = -84;
    Object v2 = ((org.jfree.chart.plot.CategoryPlot)v0).getDomainAxisLocation((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setDomainGridlinesVisible((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 1;
    Object v2 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    Object v3 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setRenderer((((java.lang.Integer)v1).intValue()),((org.jfree.chart.renderer.category.CategoryItemRenderer)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 0.0D;
    Object v2 = -14.412796736662697D;
    Object v3 = 1.0D;
    Object v4 = 87.64519729051794D;
    Object v5 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.jfree.chart.plot.CategoryPlot)v0).setAxisOffset(((org.jfree.chart.util.RectangleInsets)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = new org.jfree.data.gantt.TaskSeriesCollection();
    Object v6 = ((org.jfree.data.Values2D)v5).getRowCount();
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v4).getRendererForDataset(((org.jfree.data.category.CategoryDataset)v5));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 0;
    Object v2 = "Null 'paint' argume_t.";
    Object v3 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v2));
    Object v4 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v3));
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = 53;
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v5).getDomainAxisForDataset((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setDomainAxis((((java.lang.Integer)v1).intValue()),((org.jfree.chart.axis.CategoryAxis)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 0.0F;
    ((org.jfree.chart.plot.Plot)v0).setBackgroundImageAlpha((((java.lang.Float)v1).floatValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = 3;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxis((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = "Null 'paint' argument.";
    Object v6 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v5));
    Object v7 = false;
    ((org.jfree.chart.axis.Axis)v6).setTickLabelsVisible((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.plot.CategoryPlot)v4).getDataRange(((org.jfree.chart.axis.ValueAxis)v6));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = 0.0D;
    Object v6 = true;
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeCrosshairValue((((java.lang.Double)v5).doubleValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = "Null 'paint' argument.";
    Object v6 = 0;
    Object v7 = -13;
    Object v8 = new java.awt.Font(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.Plot)v4).setNoDataMessageFont(((java.awt.Font)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 0;
    ((org.jfree.chart.plot.CategoryPlot)v0).clearDomainMarkers((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = 1;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getRangeAxisLocation((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v3).clone();
    Object v5 = 0;
    Object v6 = new org.jfree.chart.renderer.category.StatisticalLineAndShapeRenderer();
    ((org.jfree.chart.plot.CategoryPlot)v4).setRenderer((((java.lang.Integer)v5).intValue()),((org.jfree.chart.renderer.category.CategoryItemRenderer)v6));
    Object v7 = null;
    Object v8 = false;
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeGridlinesVisible((((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 1;
    ((org.jfree.chart.plot.CategoryPlot)v0).setWeight((((java.lang.Integer)v1).intValue()));
    Object v2 = null;
    Object v3 = -35.90558878285268D;
    ((org.jfree.chart.plot.CategoryPlot)v0).zoom((((java.lang.Double)v3).doubleValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    ((org.jfree.chart.plot.CategoryPlot)v0).clearDomainAxes();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = new org.jfree.chart.axis.CategoryAxis[]{null,null,null};
    ((org.jfree.chart.plot.CategoryPlot)v4).setDomainAxes(((org.jfree.chart.axis.CategoryAxis[])v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 1;
    Object v2 = "Null 'paint' argume_t.";
    Object v3 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v2));
    Object v4 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v3));
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = 0;
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v5).getRangeAxisLocation((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setRangeAxisLocation((((java.lang.Integer)v1).intValue()),((org.jfree.chart.axis.AxisLocation)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 1.0D;
    Object v2 = false;
    ((org.jfree.chart.plot.CategoryPlot)v0).setAnchorValue((((java.lang.Double)v1).doubleValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = -39;
    Object v2 = "Null 'paint' argume_t.";
    Object v3 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v2));
    Object v4 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v3));
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getRootPlot();
    Object v6 = 0;
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v5).getRangeAxisLocation((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.chart.plot.DefaultDrawingSupplier();
    Object v9 = new org.jfree.data.xy.XYIntervalSeriesCollection();
    Object v10 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v8),((org.jfree.data.general.Dataset)v9));
    Object v11 = ((org.jfree.chart.axis.AxisLocation)v7).equals(((java.lang.Object)v10));
    Object v12 = true;
    ((org.jfree.chart.plot.CategoryPlot)v0).setDomainAxisLocation((((java.lang.Integer)v1).intValue()),((org.jfree.chart.axis.AxisLocation)v7),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = 1;
    ((org.jfree.chart.plot.CategoryPlot)v4).clearRangeMarkers((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = "Null 'paint' argume_t.";
    Object v2 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v1));
    Object v3 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v2));
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = 53;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisForDataset((((java.lang.Integer)v5).intValue()));
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v0).getDomainAxisIndex(((org.jfree.chart.axis.CategoryAxis)v6));
    org.junit.Assert.assertEquals((Object)(-1), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = ((org.jfree.chart.plot.Plot)v3).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).isRangeZoomable();
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.plot.CategoryPlot)v0).getRenderer((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.chart.plot.CategoryPlot();
    Object v1 = -84;
    Object v2 = ((org.jfree.chart.plot.CategoryPlot)v0).getRangeAxisLocation((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }
}
