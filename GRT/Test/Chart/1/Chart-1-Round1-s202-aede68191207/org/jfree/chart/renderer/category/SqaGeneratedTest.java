package org.jfree.chart.renderer.category;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = -12;
    Object v3 = "Null 'paint' argument.";
    Object v4 = -16;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),((java.lang.Integer)v4));
    Object v6 = ((java.awt.Transparency)v5).getTransparency();
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPaint(((java.lang.Integer)v2),((java.awt.Paint)v5),((java.lang.Boolean)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).isSeriesItemLabelsVisible(((java.lang.Integer)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).clearSeriesPaints(((java.lang.Boolean)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItems();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 1;
    Object v3 = false;
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesVisible(((java.lang.Integer)v2),((java.lang.Boolean)v3),((java.lang.Boolean)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesShape(((java.lang.Integer)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = -19;
    Object v3 = "Null 'paint' argument.";
    Object v4 = -16;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),((java.lang.Integer)v4));
    Object v6 = java.awt.image.ColorModel.getRGBdefault();
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = -23;
    Object v10 = -4;
    Object v11 = new java.awt.Rectangle(((java.lang.Integer)v7),((java.lang.Integer)v8),((java.lang.Integer)v9),((java.lang.Integer)v10));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = -23;
    Object v15 = -4;
    Object v16 = new java.awt.Rectangle(((java.lang.Integer)v12),((java.lang.Integer)v13),((java.lang.Integer)v14),((java.lang.Integer)v15));
    Object v17 = 12.604697111169918D;
    Object v18 = 0.0D;
    Object v19 = -61.83149778822393D;
    Object v20 = 0.0D;
    Object v21 = 1.9316181263806622D;
    Object v22 = 3.66775103171553D;
    Object v23 = new java.awt.geom.AffineTransform(((java.lang.Double)v17),((java.lang.Double)v18),((java.lang.Double)v19),((java.lang.Double)v20),((java.lang.Double)v21),((java.lang.Double)v22));
    Object v24 = java.util.Map.of();
    Object v25 = new java.awt.RenderingHints(((java.util.Map)v24));
    Object v26 = ((java.awt.Paint)v5).createContext(((java.awt.image.ColorModel)v6),((java.awt.Rectangle)v11),((java.awt.geom.Rectangle2D)v16),((java.awt.geom.AffineTransform)v23),((java.awt.RenderingHints)v25));
    Object v27 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesFillPaint(((java.lang.Integer)v2),((java.awt.Paint)v5),((java.lang.Boolean)v27));
    Object v28 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getDrawingSupplier();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = new org.jfree.data.xy.DefaultTableXYDataset();
    Object v3 = "Null 'position' argument.";
    Object v4 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v3));
    Object v5 = "Null 'position' argument.";
    Object v6 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v5));
    Object v7 = -29;
    Object v8 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v9 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v10 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v7),((org.jfree.chart.labels.XYToolTipGenerator)v8),((org.jfree.chart.urls.XYURLGenerator)v9));
    Object v11 = new org.jfree.chart.plot.XYPlot(((org.jfree.data.xy.XYDataset)v2),((org.jfree.chart.axis.ValueAxis)v4),((org.jfree.chart.axis.ValueAxis)v6),((org.jfree.chart.renderer.xy.XYItemRenderer)v10));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getSeriesShape(((java.lang.Integer)v4));
    Object v6 = -22;
    Object v7 = false;
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesItemLabelsVisible(((java.lang.Integer)v6),((java.lang.Boolean)v7),((java.lang.Boolean)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupLegendTextFont(((java.lang.Integer)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = true;
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelsVisible(((java.lang.Boolean)v4),((java.lang.Boolean)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 24;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemOutlineStroke(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    Object v8 = -22;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getSeriesNegativeItemLabelPosition(((java.lang.Integer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = -29;
    Object v6 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v7 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v8 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v5),((org.jfree.chart.labels.XYToolTipGenerator)v6),((org.jfree.chart.urls.XYURLGenerator)v7));
    Object v9 = 24;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = ((org.jfree.chart.renderer.AbstractRenderer)v8).getItemOutlineStroke(((java.lang.Integer)v9),((java.lang.Integer)v10),((java.lang.Boolean)v11));
    Object v13 = -22;
    Object v14 = ((org.jfree.chart.renderer.AbstractRenderer)v8).getSeriesNegativeItemLabelPosition(((java.lang.Integer)v13));
    Object v15 = java.util.Map.of();
    Object v16 = ((org.jfree.chart.labels.ItemLabelPosition)v14).equals(((java.lang.Object)v15));
    Object v17 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesPositiveItemLabelPosition(((java.lang.Integer)v4),((org.jfree.chart.labels.ItemLabelPosition)v14),((java.lang.Boolean)v17));
    Object v18 = null;
    org.junit.Assert.assertNull(v18);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = -16;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelPaint(((java.awt.Paint)v6),((java.lang.Boolean)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = "-";
    Object v3 = "Null 'paint' a";
    Object v4 = "Null 'paint' argument.";
    Object v5 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v5),((java.lang.Boolean)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesOutlineStroke(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 25;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesFillPaint(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setAutoPopulateSeriesOutlineStroke(((java.lang.Boolean)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 49;
    Object v5 = false;
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesVisibleInLegend(((java.lang.Integer)v4),((java.lang.Boolean)v5),((java.lang.Boolean)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesOutlinePaint(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -23;
    Object v5 = "Null 'paint' argument.";
    Object v6 = -16;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),((java.lang.Integer)v6));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesItemLabelPaint(((java.lang.Integer)v4),((java.awt.Paint)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getSeriesStroke(((java.lang.Integer)v4));
    Object v6 = 0;
    Object v7 = -29;
    Object v8 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v9 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v10 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v7),((org.jfree.chart.labels.XYToolTipGenerator)v8),((org.jfree.chart.urls.XYURLGenerator)v9));
    Object v11 = 0;
    Object v12 = ((org.jfree.chart.renderer.AbstractRenderer)v10).lookupSeriesOutlineStroke(((java.lang.Integer)v11));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesStroke(((java.lang.Integer)v6),((java.awt.Stroke)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).isSeriesVisible(((java.lang.Integer)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesStroke(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 18;
    Object v5 = "Null 'paint' argument.";
    Object v6 = -16;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),((java.lang.Integer)v6));
    Object v8 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesItemLabelPaint(((java.lang.Integer)v4),((java.awt.Paint)v7),((java.lang.Boolean)v8));
    Object v9 = null;
    Object v10 = 1;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesShape(((java.lang.Integer)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getDrawingSupplier();
    Object v5 = 0;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupLegendTextPaint(((java.lang.Integer)v5));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = java.awt.Font.decode(((java.lang.String)v4));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelFont(((java.awt.Font)v5));
    Object v6 = null;
    Object v7 = -3;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesOutlinePaint(((java.lang.Integer)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = -16;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),((java.lang.Integer)v5));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBasePaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getSeriesFillPaint(((java.lang.Integer)v2));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getURLGenerator(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 10;
    Object v5 = -74;
    Object v6 = false;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getPositiveItemLabelPosition(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    try {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -29;
    Object v5 = -29;
    Object v6 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v7 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v8 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v5),((org.jfree.chart.labels.XYToolTipGenerator)v6),((org.jfree.chart.urls.XYURLGenerator)v7));
    Object v9 = 1;
    Object v10 = ((org.jfree.chart.renderer.AbstractRenderer)v8).lookupSeriesStroke(((java.lang.Integer)v9));
    Object v11 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesStroke(((java.lang.Integer)v4),((java.awt.Stroke)v10),((java.lang.Boolean)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = false;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemCreateEntity(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = -26;
    Object v3 = "-";
    Object v4 = "Null 'paint' a";
    Object v5 = "Null 'paint' argument.";
    Object v6 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v3),((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesURLGenerator(((java.lang.Integer)v2),((org.jfree.chart.urls.CategoryURLGenerator)v6),((java.lang.Boolean)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getBaseItemLabelGenerator();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).clearSeriesStrokes(((java.lang.Boolean)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = -11;
    Object v3 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    Object v4 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesToolTipGenerator(((java.lang.Integer)v2),((org.jfree.chart.labels.CategoryToolTipGenerator)v3),((java.lang.Boolean)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -2;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesStroke(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 1;
    Object v3 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    Object v4 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesItemLabelGenerator(((java.lang.Integer)v2),((org.jfree.chart.labels.CategoryItemLabelGenerator)v3),((java.lang.Boolean)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = null;
    Object v3 = 0;
    Object v4 = 1;
    Object v5 = -23;
    Object v6 = -4;
    Object v7 = new java.awt.Rectangle(((java.lang.Integer)v3),((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Integer)v6));
    Object v8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v9 = new org.jfree.chart.axis.CategoryAxis3D();
    Object v10 = "Null 'position' argument.";
    Object v11 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v10));
    Object v12 = true;
    Object v13 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v12));
    Object v14 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)v8),((org.jfree.chart.axis.CategoryAxis)v9),((org.jfree.chart.axis.ValueAxis)v11),((org.jfree.chart.renderer.category.CategoryItemRenderer)v13));
    Object v15 = ((org.jfree.chart.plot.CategoryPlot)v14).getDataset();
    Object v16 = new org.jfree.chart.axis.CategoryAxis3D();
    Object v17 = "Null 'position' argument.";
    Object v18 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v17));
    Object v19 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v20 = 1;
    Object v21 = 12;
    Object v22 = false;
    Object v23 = new org.jfree.chart.entity.StandardEntityCollection();
    Object v24 = new org.jfree.chart.ChartRenderingInfo(((org.jfree.chart.entity.EntityCollection)v23));
    Object v25 = new org.jfree.chart.plot.PlotRenderingInfo(((org.jfree.chart.ChartRenderingInfo)v24));
    Object v26 = new org.jfree.chart.renderer.category.CategoryItemRendererState(((org.jfree.chart.plot.PlotRenderingInfo)v25));
    Object v27 = 0;
    Object v28 = 1;
    Object v29 = -23;
    Object v30 = -4;
    Object v31 = new java.awt.Rectangle(((java.lang.Integer)v27),((java.lang.Integer)v28),((java.lang.Integer)v29),((java.lang.Integer)v30));
    Object v32 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).createHotSpotBounds(((java.awt.Graphics2D)v2),((java.awt.geom.Rectangle2D)v7),((org.jfree.chart.plot.CategoryPlot)v14),((org.jfree.chart.axis.CategoryAxis)v16),((org.jfree.chart.axis.ValueAxis)v18),((org.jfree.data.category.CategoryDataset)v19),((java.lang.Integer)v20),((java.lang.Integer)v21),((java.lang.Boolean)v22),((org.jfree.chart.renderer.category.CategoryItemRendererState)v26),((java.awt.geom.Rectangle2D)v31));
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 9;
    Object v5 = 0;
    Object v6 = false;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemPaint(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    Object v8 = 0;
    Object v9 = -8;
    Object v10 = false;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemOutlinePaint(((java.lang.Integer)v8),((java.lang.Integer)v9),((java.lang.Boolean)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = -16;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelPaint(((java.awt.Paint)v6),((java.lang.Boolean)v7));
    Object v8 = null;
    Object v9 = false;
    Object v10 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseCreateEntities(((java.lang.Boolean)v9),((java.lang.Boolean)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = false;
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getItemLabelGenerator(((java.lang.Integer)v2),((java.lang.Integer)v3),((java.lang.Boolean)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = -29;
    Object v6 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v7 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v8 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v5),((org.jfree.chart.labels.XYToolTipGenerator)v6),((org.jfree.chart.urls.XYURLGenerator)v7));
    Object v9 = 24;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = ((org.jfree.chart.renderer.AbstractRenderer)v8).getItemOutlineStroke(((java.lang.Integer)v9),((java.lang.Integer)v10),((java.lang.Boolean)v11));
    Object v13 = -22;
    Object v14 = ((org.jfree.chart.renderer.AbstractRenderer)v8).getSeriesNegativeItemLabelPosition(((java.lang.Integer)v13));
    Object v15 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesPositiveItemLabelPosition(((java.lang.Integer)v4),((org.jfree.chart.labels.ItemLabelPosition)v14),((java.lang.Boolean)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 16;
    Object v5 = 0;
    Object v6 = false;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemLabelFont(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItemLabelGenerator();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = -11;
    Object v3 = 0;
    Object v4 = true;
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getURLGenerator(((java.lang.Integer)v2),((java.lang.Integer)v3),((java.lang.Boolean)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getBaseURLGenerator();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = -16;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),((java.lang.Integer)v5));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelPaint(((java.awt.Paint)v6));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getSeriesNegativeItemLabelPosition(((java.lang.Integer)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v3 = ((org.jfree.data.Values2D)v2).getRowCount();
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).findRangeBounds(((org.jfree.data.category.CategoryDataset)v2));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -11;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupLegendTextFont(((java.lang.Integer)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 11;
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesCreateEntities(((java.lang.Integer)v4),((java.lang.Boolean)v5));
    Object v6 = null;
    Object v7 = 7;
    Object v8 = "Null 'paint' argument.";
    Object v9 = -16;
    Object v10 = java.awt.Color.getColor(((java.lang.String)v8),((java.lang.Integer)v9));
    Object v11 = ((java.awt.Transparency)v10).getTransparency();
    Object v12 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesOutlinePaint(((java.lang.Integer)v7),((java.awt.Paint)v10),((java.lang.Boolean)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = java.awt.Font.decode(((java.lang.String)v4));
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelFont(((java.awt.Font)v5),((java.lang.Boolean)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesPaint(((java.lang.Integer)v4));
    Object v6 = "Null 'paint' argument.";
    Object v7 = java.awt.Font.decode(((java.lang.String)v6));
    Object v8 = java.util.Locale.getDefault();
    Object v9 = ((java.awt.Font)v7).getFontName(((java.util.Locale)v8));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseLegendTextFont(((java.awt.Font)v7));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 10;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).isSeriesItemLabelsVisible(((java.lang.Integer)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -7;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupLegendShape(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 0;
    Object v3 = -41;
    Object v4 = false;
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getToolTipGenerator(((java.lang.Integer)v2),((java.lang.Integer)v3),((java.lang.Boolean)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = 1;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getPositiveItemLabelPosition(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 12.604697111169918D;
    Object v3 = 0.0D;
    Object v4 = -61.83149778822393D;
    Object v5 = 0.0D;
    Object v6 = 1.9316181263806622D;
    Object v7 = 3.66775103171553D;
    Object v8 = new java.awt.geom.AffineTransform(((java.lang.Double)v2),((java.lang.Double)v3),((java.lang.Double)v4),((java.lang.Double)v5),((java.lang.Double)v6),((java.lang.Double)v7));
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = -16;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),((java.lang.Integer)v5));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseFillPaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupLegendTextPaint(((java.lang.Integer)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemLabelPaint(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    Object v8 = -1;
    Object v9 = -29;
    Object v10 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v11 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v12 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v9),((org.jfree.chart.labels.XYToolTipGenerator)v10),((org.jfree.chart.urls.XYURLGenerator)v11));
    Object v13 = 1;
    Object v14 = ((org.jfree.chart.renderer.AbstractRenderer)v12).lookupSeriesStroke(((java.lang.Integer)v13));
    Object v15 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesOutlineStroke(((java.lang.Integer)v8),((java.awt.Stroke)v14),((java.lang.Boolean)v15));
    Object v16 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 16;
    Object v3 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    Object v4 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesItemLabelGenerator(((java.lang.Integer)v2),((org.jfree.chart.labels.CategoryItemLabelGenerator)v3),((java.lang.Boolean)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -29;
    Object v5 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v6 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v7 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v4),((org.jfree.chart.labels.XYToolTipGenerator)v5),((org.jfree.chart.urls.XYURLGenerator)v6));
    Object v8 = 1;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v7).lookupSeriesOutlinePaint(((java.lang.Integer)v8));
    Object v10 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseOutlinePaint(((java.awt.Paint)v9),((java.lang.Boolean)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesPaint(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 8;
    Object v5 = 30;
    Object v6 = false;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemOutlineStroke(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = -12;
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItem(((java.lang.Integer)v2),((java.lang.Integer)v3));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = ")";
    Object v3 = true;
    Object v4 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v3));
    Object v5 = 12.604697111169918D;
    Object v6 = 0.0D;
    Object v7 = -61.83149778822393D;
    Object v8 = 0.0D;
    Object v9 = 1.9316181263806622D;
    Object v10 = 3.66775103171553D;
    Object v11 = new java.awt.geom.AffineTransform(((java.lang.Double)v5),((java.lang.Double)v6),((java.lang.Double)v7),((java.lang.Double)v8),((java.lang.Double)v9),((java.lang.Double)v10));
    Object v12 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).equals(((java.lang.Object)v11));
    Object v13 = 0.0D;
    Object v14 = 24.35084273353005D;
    Object v15 = new org.jfree.chart.annotations.CategoryPointerAnnotation(((java.lang.String)v2),((java.lang.Comparable)v12),((java.lang.Double)v13),((java.lang.Double)v14));
    Object v16 = -29;
    Object v17 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v18 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v19 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v16),((org.jfree.chart.labels.XYToolTipGenerator)v17),((org.jfree.chart.urls.XYURLGenerator)v18));
    ((org.jfree.chart.annotations.Annotation)v15).removeChangeListener(((org.jfree.chart.event.AnnotationChangeListener)v19));
    Object v20 = null;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).addAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v15));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = -1;
    Object v6 = false;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemLabelPaint(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -29;
    Object v5 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v6 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v7 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v4),((org.jfree.chart.labels.XYToolTipGenerator)v5),((org.jfree.chart.urls.XYURLGenerator)v6));
    Object v8 = 1;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v7).lookupSeriesPaint(((java.lang.Integer)v8));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBasePaint(((java.awt.Paint)v9));
    Object v10 = null;
    Object v11 = "Null 'paint' argument.";
    Object v12 = -16;
    Object v13 = java.awt.Color.getColor(((java.lang.String)v11),((java.lang.Integer)v12));
    Object v14 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelPaint(((java.awt.Paint)v13),((java.lang.Boolean)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -39;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesFillPaint(((java.lang.Integer)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = "Null 'paint' argument.";
    Object v5 = -16;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),((java.lang.Integer)v5));
    Object v7 = ((java.awt.Transparency)v6).getTransparency();
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelPaint(((java.awt.Paint)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).isSeriesVisibleInLegend(((java.lang.Integer)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 54;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).isSeriesVisibleInLegend(((java.lang.Integer)v4));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 15;
    Object v5 = "Null 'paint' argument.";
    Object v6 = -16;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),((java.lang.Integer)v6));
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesFillPaint(((java.lang.Integer)v4),((java.awt.Paint)v7),((java.lang.Boolean)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    Object v5 = true;
    Object v6 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v4),((java.lang.Boolean)v5));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setAutoPopulateSeriesPaint(((java.lang.Boolean)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItemURLGenerator();
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v3 = new org.jfree.chart.axis.CategoryAxis3D();
    Object v4 = "Null 'position' argument.";
    Object v5 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v4));
    Object v6 = true;
    Object v7 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v6));
    Object v8 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)v2),((org.jfree.chart.axis.CategoryAxis)v3),((org.jfree.chart.axis.ValueAxis)v5),((org.jfree.chart.renderer.category.CategoryItemRenderer)v7));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setPlot(((org.jfree.chart.plot.CategoryPlot)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -29;
    Object v5 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v6 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v7 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v4),((org.jfree.chart.labels.XYToolTipGenerator)v5),((org.jfree.chart.urls.XYURLGenerator)v6));
    Object v8 = 0;
    Object v9 = 1;
    Object v10 = true;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getPositiveItemLabelPosition(((java.lang.Integer)v8),((java.lang.Integer)v9),((java.lang.Boolean)v10));
    Object v12 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v11),((java.lang.Boolean)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemLabelFont(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = "Null 'paint' argument.";
    Object v6 = -16;
    Object v7 = java.awt.Color.getColor(((java.lang.String)v5),((java.lang.Integer)v6));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesItemLabelPaint(((java.lang.Integer)v4),((java.awt.Paint)v7));
    Object v8 = null;
    Object v9 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setAutoPopulateSeriesPaint(((java.lang.Boolean)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = true;
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesVisible(((java.lang.Integer)v4),((java.lang.Boolean)v5),((java.lang.Boolean)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = -7;
    Object v3 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    Object v4 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesToolTipGenerator(((java.lang.Integer)v2),((org.jfree.chart.labels.CategoryToolTipGenerator)v3),((java.lang.Boolean)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getPassCount();
    org.junit.Assert.assertEquals((Object)(3), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = false;
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseSeriesVisibleInLegend(((java.lang.Boolean)v4),((java.lang.Boolean)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = "-";
    Object v3 = "Null 'paint' a";
    Object v4 = "Null 'paint' argument.";
    Object v5 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -29;
    Object v5 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v6 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v7 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v4),((org.jfree.chart.labels.XYToolTipGenerator)v5),((org.jfree.chart.urls.XYURLGenerator)v6));
    Object v8 = 16;
    Object v9 = 0;
    Object v10 = false;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getItemLabelFont(((java.lang.Integer)v8),((java.lang.Integer)v9),((java.lang.Boolean)v10));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseItemLabelFont(((java.awt.Font)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 21;
    Object v5 = 1;
    Object v6 = false;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemShape(((java.lang.Integer)v4),((java.lang.Integer)v5),((java.lang.Boolean)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 47;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getSeriesItemLabelsVisible(((java.lang.Integer)v4));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 0;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelsVisible(((java.lang.Integer)v2),((java.lang.Boolean)v3));
    Object v4 = null;
    Object v5 = -29;
    Object v6 = true;
    Object v7 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v6));
    Object v8 = 0;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v7).lookupSeriesShape(((java.lang.Integer)v8));
    Object v10 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesShape(((java.lang.Integer)v5),((java.awt.Shape)v9),((java.lang.Boolean)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getSeriesVisible(((java.lang.Integer)v4));
    Object v6 = 0;
    Object v7 = true;
    Object v8 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesCreateEntities(((java.lang.Integer)v6),((java.lang.Boolean)v7),((java.lang.Boolean)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v5 = new org.jfree.chart.axis.CategoryAxis3D();
    Object v6 = "Null 'position' argument.";
    Object v7 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v8));
    Object v10 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)v4),((org.jfree.chart.axis.CategoryAxis)v5),((org.jfree.chart.axis.ValueAxis)v7),((org.jfree.chart.renderer.category.CategoryItemRenderer)v9));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v5 = new org.jfree.chart.axis.CategoryAxis3D();
    Object v6 = "Null 'position' argument.";
    Object v7 = new org.jfree.chart.axis.DateAxis(((java.lang.String)v6));
    Object v8 = true;
    Object v9 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v8));
    Object v10 = new org.jfree.chart.plot.CategoryPlot(((org.jfree.data.category.CategoryDataset)v4),((org.jfree.chart.axis.CategoryAxis)v5),((org.jfree.chart.axis.ValueAxis)v7),((org.jfree.chart.renderer.category.CategoryItemRenderer)v9));
    Object v11 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    Object v12 = true;
    Object v13 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v11),((java.lang.Boolean)v12));
    ((org.jfree.chart.event.RendererChangeListener)v10).rendererChanged(((org.jfree.chart.event.RendererChangeEvent)v13));
    Object v14 = null;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v10));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getSeriesVisible(((java.lang.Integer)v4));
    Object v6 = 9;
    Object v7 = "Null 'paint' argument.";
    Object v8 = -16;
    Object v9 = java.awt.Color.getColor(((java.lang.String)v7),((java.lang.Integer)v8));
    Object v10 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesPaint(((java.lang.Integer)v6),((java.awt.Paint)v9),((java.lang.Boolean)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = 1;
    Object v3 = "Null 'paint' argument.";
    Object v4 = -16;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),((java.lang.Integer)v4));
    Object v6 = java.awt.image.ColorModel.getRGBdefault();
    Object v7 = 0;
    Object v8 = 1;
    Object v9 = -23;
    Object v10 = -4;
    Object v11 = new java.awt.Rectangle(((java.lang.Integer)v7),((java.lang.Integer)v8),((java.lang.Integer)v9),((java.lang.Integer)v10));
    Object v12 = 0;
    Object v13 = 1;
    Object v14 = -23;
    Object v15 = -4;
    Object v16 = new java.awt.Rectangle(((java.lang.Integer)v12),((java.lang.Integer)v13),((java.lang.Integer)v14),((java.lang.Integer)v15));
    Object v17 = 12.604697111169918D;
    Object v18 = 0.0D;
    Object v19 = -61.83149778822393D;
    Object v20 = 0.0D;
    Object v21 = 1.9316181263806622D;
    Object v22 = 3.66775103171553D;
    Object v23 = new java.awt.geom.AffineTransform(((java.lang.Double)v17),((java.lang.Double)v18),((java.lang.Double)v19),((java.lang.Double)v20),((java.lang.Double)v21),((java.lang.Double)v22));
    Object v24 = java.util.Map.of();
    Object v25 = new java.awt.RenderingHints(((java.util.Map)v24));
    Object v26 = ((java.awt.Paint)v5).createContext(((java.awt.image.ColorModel)v6),((java.awt.Rectangle)v11),((java.awt.geom.Rectangle2D)v16),((java.awt.geom.AffineTransform)v23),((java.awt.RenderingHints)v25));
    Object v27 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelPaint(((java.lang.Integer)v2),((java.awt.Paint)v5),((java.lang.Boolean)v27));
    Object v28 = null;
    org.junit.Assert.assertNull(v28);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = true;
    Object v1 = new org.jfree.chart.renderer.category.StackedBarRenderer(((java.lang.Boolean)v0));
    Object v2 = false;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisibleInLegend(((java.lang.Boolean)v2),((java.lang.Boolean)v3));
    Object v4 = null;
    Object v5 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    Object v6 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v5),((java.lang.Boolean)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = 0;
    Object v5 = true;
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesItemLabelsVisible(((java.lang.Integer)v4),((java.lang.Boolean)v5),((java.lang.Boolean)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -29;
    Object v5 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v6 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v7 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v4),((org.jfree.chart.labels.XYToolTipGenerator)v5),((org.jfree.chart.urls.XYURLGenerator)v6));
    Object v8 = 8;
    Object v9 = 30;
    Object v10 = false;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getItemOutlineStroke(((java.lang.Integer)v8),((java.lang.Integer)v9),((java.lang.Boolean)v10));
    Object v12 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseOutlineStroke(((java.awt.Stroke)v11),((java.lang.Boolean)v12));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupLegendTextPaint(((java.lang.Integer)v14));
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -29;
    Object v5 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v6 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v7 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v4),((org.jfree.chart.labels.XYToolTipGenerator)v5),((org.jfree.chart.urls.XYURLGenerator)v6));
    Object v8 = 8;
    Object v9 = 30;
    Object v10 = false;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getItemOutlineStroke(((java.lang.Integer)v8),((java.lang.Integer)v9),((java.lang.Boolean)v10));
    Object v12 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setBaseStroke(((java.awt.Stroke)v11),((java.lang.Boolean)v12));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = -29;
    Object v1 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v2 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v3 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v0),((org.jfree.chart.labels.XYToolTipGenerator)v1),((org.jfree.chart.urls.XYURLGenerator)v2));
    Object v4 = -45;
    Object v5 = -29;
    Object v6 = new org.jfree.chart.labels.StandardXYToolTipGenerator();
    Object v7 = new org.jfree.chart.urls.CustomXYURLGenerator();
    Object v8 = new org.jfree.chart.renderer.xy.XYAreaRenderer(((java.lang.Integer)v5),((org.jfree.chart.labels.XYToolTipGenerator)v6),((org.jfree.chart.urls.XYURLGenerator)v7));
    Object v9 = 8;
    Object v10 = 30;
    Object v11 = false;
    Object v12 = ((org.jfree.chart.renderer.AbstractRenderer)v8).getItemOutlineStroke(((java.lang.Integer)v9),((java.lang.Integer)v10),((java.lang.Boolean)v11));
    ((org.jfree.chart.renderer.AbstractRenderer)v3).setSeriesOutlineStroke(((java.lang.Integer)v4),((java.awt.Stroke)v12));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }
}
