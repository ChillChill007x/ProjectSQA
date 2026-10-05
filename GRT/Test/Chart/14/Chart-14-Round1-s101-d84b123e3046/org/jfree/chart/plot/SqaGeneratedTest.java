package org.jfree.chart.plot;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = false;
    ((org.jfree.chart.plot.CategoryPlot)v2).setRangeCrosshairVisible((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = true;
    ((org.jfree.chart.plot.CategoryPlot)v2).setRangeGridlinesVisible((((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = "Null 'paint' argume_t.";
    Object v4 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v3));
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v2).getDomainAxisIndex(((org.jfree.chart.axis.CategoryAxis)v4));
    org.junit.Assert.assertEquals((Object)(-1), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = "Null 'paint' argume_t.";
    Object v4 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v3));
    Object v5 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v4));
    Object v6 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v5));
    ((org.jfree.chart.plot.Plot)v2).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    ((org.jfree.chart.plot.CategoryPlot)v2).clearDomainAxes();
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
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
    Object v3 = 1.0F;
    Object v4 = -15.452557F;
    Object v5 = 43.93786F;
    Object v6 = java.awt.Color.getHSBColor((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    ((org.jfree.chart.plot.Plot)v2).setOutlinePaint(((java.awt.Paint)v6));
    Object v7 = null;
    Object v8 = 0.0F;
    ((org.jfree.chart.plot.Plot)v2).setForegroundAlpha((((java.lang.Float)v8).floatValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = new org.jfree.chart.renderer.category.BarRenderer3D();
    ((org.jfree.chart.plot.CategoryPlot)v2).setRenderer(((org.jfree.chart.renderer.category.CategoryItemRenderer)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = "Null 'paint' argume_t.";
    Object v4 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v3));
    ((org.jfree.chart.plot.CategoryPlot)v2).setDomainAxis(((org.jfree.chart.axis.CategoryAxis)v4));
    Object v5 = null;
    Object v6 = new org.jfree.chart.axis.CategoryAxis[]{null,null,null};
    ((org.jfree.chart.plot.CategoryPlot)v2).setDomainAxes(((org.jfree.chart.axis.CategoryAxis[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = 33.44157F;
    ((org.jfree.chart.plot.Plot)v2).setForegroundAlpha((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
    Object v5 = "Dialo2g";
    Object v6 = java.awt.Font.decode(((java.lang.String)v5));
    ((org.jfree.chart.plot.Plot)v2).setNoDataMessageFont(((java.awt.Font)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = new org.jfree.chart.axis.NumberAxis();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v2).getRangeAxisIndex(((org.jfree.chart.axis.ValueAxis)v3));
    org.junit.Assert.assertEquals((Object)(-1), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1.0F;
    Object v6 = -15.452557F;
    Object v7 = 43.93786F;
    Object v8 = java.awt.Color.getHSBColor((((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    ((org.jfree.chart.plot.CategoryPlot)v4).setDomainGridlinePaint(((java.awt.Paint)v8));
    Object v9 = null;
    Object v10 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v11 = ((org.jfree.chart.plot.CategoryPlot)v4).getRendererForDataset(((org.jfree.data.category.CategoryDataset)v10));
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1.0F;
    Object v6 = -15.452557F;
    Object v7 = 43.93786F;
    Object v8 = java.awt.Color.getHSBColor((((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    ((org.jfree.chart.plot.Plot)v4).setNoDataMessagePaint(((java.awt.Paint)v8));
    Object v9 = null;
    Object v10 = -23;
    ((org.jfree.chart.plot.CategoryPlot)v4).clearRangeMarkers((((java.lang.Integer)v10).intValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).getLegendItems();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v6 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v7 = new org.jfree.data.general.DatasetChangeEvent(((java.lang.Object)v5),((org.jfree.data.general.Dataset)v6));
    ((org.jfree.chart.plot.CategoryPlot)v4).datasetChanged(((org.jfree.data.general.DatasetChangeEvent)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 38;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDataset((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v6));
    Object v8 = new org.jfree.chart.event.PlotChangeEvent(((org.jfree.chart.plot.Plot)v7));
    Object v9 = ((java.util.EventObject)v8).toString();
    ((org.jfree.chart.plot.Plot)v4).notifyListeners(((org.jfree.chart.event.PlotChangeEvent)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = -28.662048F;
    ((org.jfree.chart.plot.Plot)v4).setForegroundAlpha((((java.lang.Float)v5).floatValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = true;
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeCrosshairLockedOnData((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 0;
    ((org.jfree.chart.plot.CategoryPlot)v4).clearDomainMarkers((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "";
    Object v6 = "Null 'ancor' argument.";
    Object v7 = "Null 'paint' argument.";
    Object v8 = new java.io.File(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = -31.726370844484077D;
    Object v10 = new org.jfree.chart.annotations.CategoryTextAnnotation(((java.lang.String)v5),((java.lang.Comparable)v8),(((java.lang.Double)v9).doubleValue()));
    ((org.jfree.chart.plot.CategoryPlot)v4).addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v10));
    Object v11 = null;
    Object v12 = "Null 'ancor' argument.";
    Object v13 = "Null 'paint' argument.";
    Object v14 = new java.io.File(((java.lang.String)v12),((java.lang.String)v13));
    Object v15 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)v14));
    Object v16 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v15));
    ((org.jfree.chart.plot.CategoryPlot)v4).rendererChanged(((org.jfree.chart.event.RendererChangeEvent)v16));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxis((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1;
    Object v6 = new org.jfree.data.category.DefaultCategoryDataset();
    ((org.jfree.chart.plot.CategoryPlot)v4).setDataset((((java.lang.Integer)v5).intValue()),((org.jfree.data.category.CategoryDataset)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).isRangeCrosshairVisible();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getRangeAxis((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = -24.200823369026516D;
    Object v6 = 2.0D;
    Object v7 = new org.jfree.chart.util.Size2D((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v4).equals(((java.lang.Object)v7));
    Object v9 = 0;
    ((org.jfree.chart.plot.CategoryPlot)v4).clearDomainMarkers((((java.lang.Integer)v9).intValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 0;
    Object v6 = "Null 'paint' argume_t.";
    Object v7 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v6));
    Object v8 = true;
    ((org.jfree.chart.plot.CategoryPlot)v4).setDomainAxis((((java.lang.Integer)v5).intValue()),((org.jfree.chart.axis.CategoryAxis)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v5).getLegendItems();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = null;
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeGridlineStroke(((java.awt.Stroke)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 38;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getRangeAxisForDataset((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = "Null 'paint' argume_t.";
    Object v7 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v6));
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v5).getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v4 = ((org.jfree.chart.plot.CategoryPlot)v2).getRendererForDataset(((org.jfree.data.category.CategoryDataset)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v5).getDomainGridlinePosition();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    ((org.jfree.chart.plot.CategoryPlot)v4).configureRangeAxes();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = new org.jfree.chart.util.RectangleInsets();
    Object v6 = ((org.jfree.chart.util.RectangleInsets)v5).toString();
    ((org.jfree.chart.plot.CategoryPlot)v4).setAxisOffset(((org.jfree.chart.util.RectangleInsets)v5));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 26;
    ((org.jfree.chart.plot.Plot)v4).setBackgroundImageAlignment((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = true;
    ((org.jfree.chart.plot.CategoryPlot)v5).setDomainGridlinesVisible((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1.0F;
    Object v6 = -15.452557F;
    Object v7 = 43.93786F;
    Object v8 = java.awt.Color.getHSBColor((((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    ((org.jfree.chart.plot.Plot)v4).setBackgroundPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = "Dialo2g";
    Object v8 = java.awt.Font.decode(((java.lang.String)v7));
    ((org.jfree.chart.axis.Axis)v6).setLabelFont(((java.awt.Font)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisIndex(((org.jfree.chart.axis.CategoryAxis)v6));
    org.junit.Assert.assertEquals((Object)(-1), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = true;
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeCrosshairVisible((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisEdge((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = -12;
    Object v7 = "Null 'paint' argume_t.";
    Object v8 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v7));
    Object v9 = false;
    ((org.jfree.chart.plot.CategoryPlot)v5).setDomainAxis((((java.lang.Integer)v6).intValue()),((org.jfree.chart.axis.CategoryAxis)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = new org.jfree.chart.util.RectangleInsets();
    Object v6 = true;
    ((org.jfree.chart.plot.Plot)v4).setInsets(((org.jfree.chart.util.RectangleInsets)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 1.0F;
    Object v9 = -15.452557F;
    Object v10 = 43.93786F;
    Object v11 = java.awt.Color.getHSBColor((((java.lang.Float)v8).floatValue()),(((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()));
    ((org.jfree.chart.plot.Plot)v4).setOutlinePaint(((java.awt.Paint)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = "";
    Object v7 = "Null 'ancor' argument.";
    Object v8 = "Null 'paint' argument.";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = -31.726370844484077D;
    Object v11 = new org.jfree.chart.annotations.CategoryTextAnnotation(((java.lang.String)v6),((java.lang.Comparable)v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = true;
    ((org.jfree.chart.plot.CategoryPlot)v5).addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 0;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisEdge((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = null;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getRangeMarkers(((org.jfree.chart.util.Layer)v5));
    Object v7 = new org.jfree.chart.axis.ValueAxis[]{null,null};
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeAxes(((org.jfree.chart.axis.ValueAxis[])v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = new org.jfree.chart.axis.NumberAxis();
    Object v6 = false;
    ((org.jfree.chart.axis.Axis)v5).setVisible((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v4).getDataRange(((org.jfree.chart.axis.ValueAxis)v5));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = new org.jfree.chart.renderer.category.CategoryItemRenderer[]{};
    ((org.jfree.chart.plot.CategoryPlot)v5).setRenderers(((org.jfree.chart.renderer.category.CategoryItemRenderer[])v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    ((org.jfree.chart.plot.CategoryPlot)v4).clearDomainAxes();
    Object v5 = null;
    Object v6 = 11;
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisForDataset((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 0;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getRangeAxisLocation((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "Dialo2g";
    Object v6 = java.awt.Font.decode(((java.lang.String)v5));
    ((org.jfree.chart.plot.Plot)v4).setNoDataMessageFont(((java.awt.Font)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v5).clone();
    Object v7 = 0.0D;
    Object v8 = true;
    ((org.jfree.chart.plot.CategoryPlot)v5).setRangeCrosshairValue((((java.lang.Double)v7).doubleValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getDrawingSupplier();
    Object v6 = 0;
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisForDataset((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = new org.jfree.chart.util.RectangleInsets();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = "Null 'paint' argume_t.";
    Object v7 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v6));
    Object v8 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v7));
    Object v9 = ((org.jfree.chart.plot.Plot)v8).getPlotType();
    Object v10 = ((org.jfree.chart.plot.Plot)v8).getRootPlot();
    Object v11 = ((org.jfree.chart.plot.CategoryPlot)v10).clone();
    Object v12 = ((org.jfree.chart.plot.CategoryPlot)v11).getDomainGridlinePosition();
    ((org.jfree.chart.plot.CategoryPlot)v5).setDomainGridlinePosition(((org.jfree.chart.axis.CategoryAnchor)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = "Null 'paint' argume_t.";
    Object v7 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v6));
    Object v8 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v7));
    Object v9 = ((org.jfree.chart.plot.Plot)v8).getPlotType();
    Object v10 = ((org.jfree.chart.plot.Plot)v8).getRootPlot();
    Object v11 = ((org.jfree.chart.plot.Plot)v10).getDrawingSupplier();
    Object v12 = 0;
    Object v13 = ((org.jfree.chart.plot.CategoryPlot)v10).getDomainAxisForDataset((((java.lang.Integer)v12).intValue()));
    Object v14 = ((org.jfree.chart.plot.CategoryPlot)v5).getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = "";
    Object v7 = "Null 'ancor' argument.";
    Object v8 = "Null 'paint' argument.";
    Object v9 = new java.io.File(((java.lang.String)v7),((java.lang.String)v8));
    Object v10 = -31.726370844484077D;
    Object v11 = new org.jfree.chart.annotations.CategoryTextAnnotation(((java.lang.String)v6),((java.lang.Comparable)v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = false;
    Object v13 = ((org.jfree.chart.plot.CategoryPlot)v5).removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v11),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = true;
    ((org.jfree.chart.plot.CategoryPlot)v5).setRangeCrosshairLockedOnData((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = -16;
    Object v7 = 5;
    Object v8 = new org.jfree.chart.ChartRenderingInfo();
    Object v9 = new org.jfree.chart.plot.PlotRenderingInfo(((org.jfree.chart.ChartRenderingInfo)v8));
    ((org.jfree.chart.plot.CategoryPlot)v5).handleClick((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((org.jfree.chart.plot.PlotRenderingInfo)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 3.5059084642153637D;
    Object v6 = false;
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeCrosshairValue((((java.lang.Double)v5).doubleValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getPlotType();
    Object v9 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v10 = ((org.jfree.chart.plot.Plot)v9).getDrawingSupplier();
    Object v11 = 0;
    Object v12 = ((org.jfree.chart.plot.CategoryPlot)v9).getDomainAxisForDataset((((java.lang.Integer)v11).intValue()));
    Object v13 = ((org.jfree.chart.plot.CategoryPlot)v4).getCategoriesForAxis(((org.jfree.chart.axis.CategoryAxis)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    ((org.jfree.chart.plot.CategoryPlot)v4).clearDomainAxes();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getPlotType();
    Object v9 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    Object v10 = ((org.jfree.chart.plot.CategoryPlot)v9).clone();
    Object v11 = ((org.jfree.chart.plot.CategoryPlot)v10).getDomainGridlinePosition();
    ((org.jfree.chart.plot.CategoryPlot)v4).setDomainGridlinePosition(((org.jfree.chart.axis.CategoryAnchor)v11));
    Object v12 = null;
    Object v13 = 4;
    Object v14 = ((org.jfree.chart.plot.CategoryPlot)v4).getRangeAxisEdge((((java.lang.Integer)v13).intValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = "Null 'paint' argume_t.";
    Object v4 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v3));
    Object v5 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v4));
    Object v6 = ((org.jfree.chart.plot.Plot)v5).getPlotType();
    Object v7 = ((org.jfree.chart.plot.Plot)v5).getRootPlot();
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v7).clone();
    Object v9 = ((org.jfree.chart.plot.CategoryPlot)v8).getDomainGridlinePosition();
    ((org.jfree.chart.plot.CategoryPlot)v2).setDomainGridlinePosition(((org.jfree.chart.axis.CategoryAnchor)v9));
    Object v10 = null;
    Object v11 = -1;
    Object v12 = "Null 'paint' argume_t.";
    Object v13 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v12));
    Object v14 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v13));
    Object v15 = ((org.jfree.chart.plot.Plot)v14).getPlotType();
    Object v16 = ((org.jfree.chart.plot.Plot)v14).getRootPlot();
    Object v17 = 0;
    Object v18 = ((org.jfree.chart.plot.CategoryPlot)v16).getRangeAxisLocation((((java.lang.Integer)v17).intValue()));
    Object v19 = false;
    ((org.jfree.chart.plot.CategoryPlot)v2).setRangeAxisLocation((((java.lang.Integer)v11).intValue()),((org.jfree.chart.axis.AxisLocation)v18),(((java.lang.Boolean)v19).booleanValue()));
    Object v20 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 0;
    ((org.jfree.chart.plot.Plot)v4).setBackgroundImageAlignment((((java.lang.Integer)v5).intValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1.0D;
    ((org.jfree.chart.plot.CategoryPlot)v4).zoom((((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = true;
    ((org.jfree.chart.plot.CategoryPlot)v4).setDomainGridlinesVisible((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    ((org.jfree.chart.plot.CategoryPlot)v5).configureRangeAxes();
    Object v6 = null;
    Object v7 = 6;
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v5).getRenderer((((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = 1;
    Object v7 = ((org.jfree.chart.plot.CategoryPlot)v5).getRangeAxis((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v1 = "Null 'paint' argume_t.";
    Object v2 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v1));
    Object v3 = new org.jfree.chart.axis.NumberAxis();
    Object v4 = new org.jfree.chart.renderer.category.BarRenderer3D();
    Object v5 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)v0),((org.jfree.chart.axis.CategoryAxis)v2),((org.jfree.chart.axis.ValueAxis)v3),((org.jfree.chart.renderer.category.CategoryItemRenderer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = -7;
    Object v6 = new org.jfree.data.category.DefaultCategoryDataset();
    ((org.jfree.chart.plot.CategoryPlot)v4).setDataset((((java.lang.Integer)v5).intValue()),((org.jfree.data.category.CategoryDataset)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1.0D;
    Object v6 = false;
    ((org.jfree.chart.plot.CategoryPlot)v4).setAnchorValue((((java.lang.Double)v5).doubleValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 1.0D;
    ((org.jfree.chart.plot.CategoryPlot)v4).zoom((((java.lang.Double)v8).doubleValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getBackgroundImageAlpha();
    org.junit.Assert.assertEquals((Object)(0.5F), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "Null 'paint' argume_t.";
    Object v6 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v5));
    Object v7 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v6));
    Object v8 = ((org.jfree.chart.plot.Plot)v7).getPlotType();
    Object v9 = ((org.jfree.chart.plot.Plot)v7).getRootPlot();
    ((org.jfree.chart.plot.Plot)v4).setParent(((org.jfree.chart.plot.Plot)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = new org.jfree.chart.axis.AxisSpace();
    Object v7 = false;
    ((org.jfree.chart.plot.CategoryPlot)v5).setFixedRangeAxisSpace(((org.jfree.chart.axis.AxisSpace)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1.0F;
    Object v6 = -15.452557F;
    Object v7 = 43.93786F;
    Object v8 = java.awt.Color.getHSBColor((((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = ((java.awt.Transparency)v8).getTransparency();
    ((org.jfree.chart.plot.CategoryPlot)v4).setDomainGridlinePaint(((java.awt.Paint)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = new org.jfree.chart.renderer.category.BarRenderer3D();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = -30;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxis((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1.0F;
    Object v6 = -15.452557F;
    Object v7 = 43.93786F;
    Object v8 = java.awt.Color.getHSBColor((((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    ((org.jfree.chart.plot.CategoryPlot)v4).setRangeGridlinePaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).getCategories();
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getOrientation();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = new org.jfree.chart.axis.AxisSpace();
    Object v6 = false;
    ((org.jfree.chart.plot.CategoryPlot)v4).setFixedDomainAxisSpace(((org.jfree.chart.axis.AxisSpace)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 4;
    Object v6 = new org.jfree.chart.renderer.category.BarRenderer3D();
    ((org.jfree.chart.plot.CategoryPlot)v4).setRenderer((((java.lang.Integer)v5).intValue()),((org.jfree.chart.renderer.category.CategoryItemRenderer)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainGridlinePosition();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = 1.0F;
    Object v7 = -15.452557F;
    Object v8 = 43.93786F;
    Object v9 = java.awt.Color.getHSBColor((((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()));
    ((org.jfree.chart.plot.Plot)v5).setNoDataMessagePaint(((java.awt.Paint)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.Plot)v4).getDrawingSupplier();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v4 = "Dialo2g";
    Object v5 = java.awt.Font.decode(((java.lang.String)v4));
    ((org.jfree.chart.plot.Plot)v2).setNoDataMessageFont(((java.awt.Font)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = new org.jfree.chart.util.RectangleInsets();
    Object v7 = false;
    ((org.jfree.chart.plot.Plot)v5).setInsets(((org.jfree.chart.util.RectangleInsets)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 11.674361F;
    ((org.jfree.chart.plot.Plot)v4).setBackgroundAlpha((((java.lang.Float)v5).floatValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = -62;
    Object v7 = 8;
    Object v8 = new org.jfree.chart.ChartRenderingInfo();
    Object v9 = new org.jfree.chart.plot.PlotRenderingInfo(((org.jfree.chart.ChartRenderingInfo)v8));
    ((org.jfree.chart.plot.CategoryPlot)v5).handleClick((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),((org.jfree.chart.plot.PlotRenderingInfo)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = "Null 'paint' argume_t.";
    Object v7 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v6));
    Object v8 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v7));
    Object v9 = ((org.jfree.chart.plot.Plot)v8).getPlotType();
    Object v10 = ((org.jfree.chart.plot.Plot)v8).getRootPlot();
    Object v11 = ((org.jfree.chart.plot.Plot)v10).getDrawingSupplier();
    Object v12 = 0;
    Object v13 = ((org.jfree.chart.plot.CategoryPlot)v10).getDomainAxisForDataset((((java.lang.Integer)v12).intValue()));
    ((org.jfree.chart.plot.CategoryPlot)v5).setDomainAxis(((org.jfree.chart.axis.CategoryAxis)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = "Null 'ancor' argument.";
    Object v7 = "Null 'paint' argument.";
    Object v8 = new java.io.File(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = new org.jfree.chart.plot.CategoryMarker(((java.lang.Comparable)v8));
    Object v10 = ((org.jfree.chart.plot.Plot)v5).equals(((java.lang.Object)v9));
    Object v11 = 1.0F;
    Object v12 = -15.452557F;
    Object v13 = 43.93786F;
    Object v14 = java.awt.Color.getHSBColor((((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()),(((java.lang.Float)v13).floatValue()));
    ((org.jfree.chart.plot.Plot)v5).setOutlinePaint(((java.awt.Paint)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = "";
    Object v6 = "Null 'ancor' argument.";
    Object v7 = "Null 'paint' argument.";
    Object v8 = new java.io.File(((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = -31.726370844484077D;
    Object v10 = new org.jfree.chart.annotations.CategoryTextAnnotation(((java.lang.String)v5),((java.lang.Comparable)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = false;
    Object v12 = ((org.jfree.chart.plot.CategoryPlot)v4).removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v10),(((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.CategoryPlot)v2).getCategories();
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 51;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getRenderer((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisLocation((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = ((org.jfree.chart.plot.CategoryPlot)v4).clone();
    Object v6 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.plot.CategoryPlot)v5).setAxisOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = new org.jfree.chart.renderer.category.CategoryItemRenderer[]{null,null,null};
    ((org.jfree.chart.plot.CategoryPlot)v5).setRenderers(((org.jfree.chart.renderer.category.CategoryItemRenderer[])v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    ((org.jfree.chart.plot.CategoryPlot)v4).clearRangeMarkers();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = 1;
    Object v6 = ((org.jfree.chart.plot.CategoryPlot)v4).getDomainAxisLocation((((java.lang.Integer)v5).intValue()));
    Object v7 = "Null 'paint' argume_t.";
    Object v8 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v7));
    Object v9 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v8));
    Object v10 = ((org.jfree.chart.plot.Plot)v9).getPlotType();
    Object v11 = ((org.jfree.chart.plot.Plot)v9).getRootPlot();
    Object v12 = ((org.jfree.chart.plot.CategoryPlot)v11).getCategories();
    Object v13 = ((org.jfree.chart.plot.CategoryPlot)v11).getOrientation();
    Object v14 = ((org.jfree.chart.plot.PlotOrientation)v13).hashCode();
    Object v15 = org.jfree.chart.plot.Plot.resolveRangeAxisLocation(((org.jfree.chart.axis.AxisLocation)v6),((org.jfree.chart.plot.PlotOrientation)v13));
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    try {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = -29.932951F;
    ((org.jfree.chart.plot.Plot)v4).setBackgroundImageAlpha((((java.lang.Float)v5).floatValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = "Null 'paint' argume_t.";
    Object v1 = new org.jfree.chart.axis.CategoryAxis(((java.lang.String)v0));
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot(((org.jfree.chart.axis.CategoryAxis)v1));
    Object v3 = ((org.jfree.chart.plot.Plot)v2).getPlotType();
    Object v4 = ((org.jfree.chart.plot.Plot)v2).getRootPlot();
    Object v5 = false;
    ((org.jfree.chart.plot.CategoryPlot)v4).setDomainGridlinesVisible((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }
}
