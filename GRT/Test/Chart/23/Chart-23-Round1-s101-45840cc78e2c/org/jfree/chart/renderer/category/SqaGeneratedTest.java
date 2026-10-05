package org.jfree.chart.renderer.category;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = -1;
    Object v2 = -29;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getItemLabelGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v0).setDrawLines((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = true;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = -33;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesOutlineStroke((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = true;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseCreateEntities((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 0;
    Object v2 = -22;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemFillPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = "Null 'stroke' argument.";
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = new java.awt.Font(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelFont(((java.awt.Font)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 1;
    Object v2 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v3 = -33;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesOutlineStroke((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlineStroke((((java.lang.Integer)v1).intValue()),((java.awt.Stroke)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = 11;
    Object v2 = "7";
    Object v3 = "NIull 'paint' argument.";
    Object v4 = "Null 'stroke' argument.";
    Object v5 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesURLGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = -3;
    Object v2 = "Null 'pint' argument.";
    Object v3 = java.text.DateFormat.getDateTimeInstance();
    Object v4 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v2),((java.text.DateFormat)v3));
    Object v5 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesItemLabelGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "7";
    Object v2 = "NIull 'paint' argument.";
    Object v3 = "Null 'stroke' argument.";
    Object v4 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = -32;
    Object v5 = 1;
    Object v6 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getToolTipGenerator((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesNegativeItemLabelPosition((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "kDialog";
    Object v2 = "Null 'type' argument.";
    Object v3 = -76;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.awt.Color.getColor(((java.lang.String)v1),((java.awt.Color)v4));
    ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v0).setGroupPaint(((java.awt.Paint)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = -16;
    Object v2 = "Null 'type' argument.";
    Object v3 = -76;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.awt.image.ColorModel.getRGBdefault();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.awt.Point((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new java.awt.Dimension();
    Object v10 = new java.awt.Rectangle(((java.awt.Point)v8),((java.awt.Dimension)v9));
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new java.awt.Point((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.awt.Dimension();
    Object v15 = new java.awt.Rectangle(((java.awt.Point)v13),((java.awt.Dimension)v14));
    Object v16 = -66.71195593595303D;
    Object v17 = 23.481449566337417D;
    Object v18 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = new java.util.HashMap();
    Object v20 = new java.awt.RenderingHints(((java.util.Map)v19));
    Object v21 = ((java.awt.Paint)v4).createContext(((java.awt.image.ColorModel)v5),((java.awt.Rectangle)v10),((java.awt.geom.Rectangle2D)v15),((java.awt.geom.AffineTransform)v18),((java.awt.RenderingHints)v20));
    Object v22 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v22).booleanValue()));
    Object v23 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 10;
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = new java.awt.Point((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new java.awt.Dimension();
    Object v6 = new java.awt.Rectangle(((java.awt.Point)v4),((java.awt.Dimension)v5));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesShape((((java.lang.Integer)v1).intValue()),((java.awt.Shape)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = "Null 'type' argument.";
    Object v10 = -76;
    Object v11 = java.awt.Color.getColor(((java.lang.String)v9),(((java.lang.Integer)v10).intValue()));
    Object v12 = java.awt.image.ColorModel.getRGBdefault();
    Object v13 = 1;
    Object v14 = 0;
    Object v15 = new java.awt.Point((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = new java.awt.Dimension();
    Object v17 = new java.awt.Rectangle(((java.awt.Point)v15),((java.awt.Dimension)v16));
    Object v18 = 1;
    Object v19 = 0;
    Object v20 = new java.awt.Point((((java.lang.Integer)v18).intValue()),(((java.lang.Integer)v19).intValue()));
    Object v21 = new java.awt.Dimension();
    Object v22 = new java.awt.Rectangle(((java.awt.Point)v20),((java.awt.Dimension)v21));
    Object v23 = -66.71195593595303D;
    Object v24 = 23.481449566337417D;
    Object v25 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()));
    Object v26 = new java.util.HashMap();
    Object v27 = new java.awt.RenderingHints(((java.util.Map)v26));
    Object v28 = ((java.awt.Paint)v11).createContext(((java.awt.image.ColorModel)v12),((java.awt.Rectangle)v17),((java.awt.geom.Rectangle2D)v22),((java.awt.geom.AffineTransform)v25),((java.awt.RenderingHints)v27));
    Object v29 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v11),(((java.lang.Boolean)v29).booleanValue()));
    Object v30 = null;
    org.junit.Assert.assertNull(v30);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "Null 'stroke' argument.";
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = new java.awt.Font(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelFont(((java.awt.Font)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "kDialog";
    Object v2 = "Null 'type' argument.";
    Object v3 = -76;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = java.awt.Color.getColor(((java.lang.String)v1),((java.awt.Color)v4));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseOutlinePaint(((java.awt.Paint)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 0;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2));
    Object v3 = null;
    Object v4 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "Null 'type' argument.";
    Object v2 = -76;
    Object v3 = java.awt.Color.getColor(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v0).setGroupPaint(((java.awt.Paint)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = 0;
    Object v2 = "Null 'type' argument.";
    Object v3 = -76;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "Null 'type' argument.";
    Object v2 = -76;
    Object v3 = java.awt.Color.getColor(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 1;
    Object v2 = -21;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getURLGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = -9;
    Object v2 = "Null 'type' argument.";
    Object v3 = -76;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesFillPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesFillPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 0;
    Object v2 = -12;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getToolTipGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = -43;
    Object v2 = "Null 'pint' argument.";
    Object v3 = java.text.DateFormat.getDateTimeInstance();
    Object v4 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v2),((java.text.DateFormat)v3));
    Object v5 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesItemLabelGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemCreateEntity((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisible((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItems();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getAutoPopulateSeriesStroke();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItem((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = null;
    Object v6 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    Object v7 = 1.0D;
    Object v8 = "Null 'paint' argument.";
    Object v9 = new org.jfree.chart.axis.CyclicNumberAxis((((java.lang.Double)v7).doubleValue()),((java.lang.String)v8));
    Object v10 = 1;
    Object v11 = 0;
    Object v12 = new java.awt.Point((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    Object v13 = new java.awt.Dimension();
    Object v14 = new java.awt.Rectangle(((java.awt.Point)v12),((java.awt.Dimension)v13));
    Object v15 = 1.0D;
    Object v16 = 25.665031792811792D;
    Object v17 = -18.51634707114956D;
    Object v18 = 40.26088527110488D;
    ((java.awt.geom.Rectangle2D)v14).setRect((((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()));
    Object v19 = null;
    Object v20 = 35.93271410135373D;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).drawRangeGridline(((java.awt.Graphics2D)v5),((org.jfree.chart.plot.CategoryPlot)v6),((org.jfree.chart.axis.ValueAxis)v9),((java.awt.geom.Rectangle2D)v14),(((java.lang.Double)v20).doubleValue()));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 17;
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItem((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = "Null 'type' argument.";
    Object v4 = -76;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 1;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Null 'type' argument.";
    Object v3 = -76;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseFillPaint(((java.awt.Paint)v4));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = "Null 'type' argument.";
    Object v8 = -76;
    Object v9 = java.awt.Color.getColor(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPaint((((java.lang.Integer)v6).intValue()),((java.awt.Paint)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Null 'type' argument.";
    Object v3 = -76;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelPaint(((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisible((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = false;
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesCreateEntities((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v3 = -33;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesOutlineStroke((((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = new java.awt.Point((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.awt.Dimension();
    Object v9 = new java.awt.Rectangle(((java.awt.Point)v7),((java.awt.Dimension)v8));
    Object v10 = ((java.awt.Stroke)v4).createStrokedShape(((java.awt.Shape)v9));
    Object v11 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseStroke(((java.awt.Stroke)v4),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseCreateEntities((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = 48;
    Object v6 = "kDialog";
    Object v7 = "Null 'type' argument.";
    Object v8 = -76;
    Object v9 = java.awt.Color.getColor(((java.lang.String)v7),(((java.lang.Integer)v8).intValue()));
    Object v10 = java.awt.Color.getColor(((java.lang.String)v6),((java.awt.Color)v9));
    Object v11 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesFillPaint((((java.lang.Integer)v5).intValue()),((java.awt.Paint)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = true;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesNegativeItemLabelPosition((((java.lang.Integer)v2).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).hashCode();
    Object v3 = -31;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesStroke((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelsVisible((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = 0;
    Object v2 = 39;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getURLGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new java.awt.Point((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = new java.awt.Dimension();
    Object v7 = new java.awt.Rectangle(((java.awt.Point)v5),((java.awt.Dimension)v6));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesShape((((java.lang.Integer)v2).intValue()),((java.awt.Shape)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = true;
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesVisible((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "7";
    Object v2 = "NIull 'paint' argument.";
    Object v3 = "Null 'stroke' argument.";
    Object v4 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v1),((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = 15;
    Object v4 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesNegativeItemLabelPosition((((java.lang.Integer)v3).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v1).getGroupPaint();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -27;
    Object v3 = true;
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesCreateEntities((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).removeAnnotations();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemPaint((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = "Null 'stroke' argument.";
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new java.awt.Font(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelFont((((java.lang.Integer)v2).intValue()),((java.awt.Font)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = false;
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelsVisible((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v2).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    Object v2 = "Null 'paint' argument.";
    Object v3 = "Temperature";
    Object v4 = new java.util.Locale(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v4));
    ((org.jfree.chart.event.RendererChangeListener)v1).rendererChanged(((org.jfree.chart.event.RendererChangeEvent)v5));
    Object v6 = null;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v1));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = "kDialog";
    Object v4 = "Null 'type' argument.";
    Object v5 = -76;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = java.awt.Color.getColor(((java.lang.String)v3),((java.awt.Color)v6));
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesFillPaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = false;
    Object v11 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelsVisible((((java.lang.Boolean)v10).booleanValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "7";
    Object v3 = "NIull 'paint' argument.";
    Object v4 = "Null 'stroke' argument.";
    Object v5 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v2),((java.lang.String)v3),((java.lang.String)v4));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v5));
    Object v6 = null;
    Object v7 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getDrawingSupplier();
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v1).getMaxIcon();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getRowCount();
    org.junit.Assert.assertEquals((Object)(0), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -22;
    Object v3 = true;
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelsVisible((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Null 'stroke' argument.";
    Object v3 = 1;
    Object v4 = 0;
    Object v5 = new java.awt.Font(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelFont(((java.awt.Font)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 54;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = -2;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setPlot(((org.jfree.chart.plot.CategoryPlot)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    Object v3 = "Null 'paint' argument.";
    Object v4 = "Temperature";
    Object v5 = new java.util.Locale(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v5));
    ((org.jfree.chart.event.RendererChangeListener)v2).rendererChanged(((org.jfree.chart.event.RendererChangeEvent)v6));
    Object v7 = null;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v2));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = "Null 'stroke' argument.";
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.awt.Font(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseItemLabelFont(((java.awt.Font)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = "Null 'pint' argument.";
    Object v2 = java.text.DateFormat.getDateTimeInstance();
    Object v3 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v1),((java.text.DateFormat)v2));
    Object v4 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v6 = -33;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).lookupSeriesOutlineStroke((((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseStroke(((java.awt.Stroke)v7));
    Object v8 = null;
    Object v9 = "kDialog";
    Object v10 = "Null 'type' argument.";
    Object v11 = -76;
    Object v12 = java.awt.Color.getColor(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()));
    Object v13 = java.awt.Color.getColor(((java.lang.String)v9),((java.awt.Color)v12));
    Object v14 = java.awt.image.ColorModel.getRGBdefault();
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new java.awt.Point((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.awt.Dimension();
    Object v19 = new java.awt.Rectangle(((java.awt.Point)v17),((java.awt.Dimension)v18));
    Object v20 = 1;
    Object v21 = 0;
    Object v22 = new java.awt.Point((((java.lang.Integer)v20).intValue()),(((java.lang.Integer)v21).intValue()));
    Object v23 = new java.awt.Dimension();
    Object v24 = new java.awt.Rectangle(((java.awt.Point)v22),((java.awt.Dimension)v23));
    Object v25 = -66.71195593595303D;
    Object v26 = 23.481449566337417D;
    Object v27 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v25).doubleValue()),(((java.lang.Double)v26).doubleValue()));
    Object v28 = new java.util.HashMap();
    Object v29 = new java.awt.RenderingHints(((java.util.Map)v28));
    Object v30 = ((java.awt.Paint)v13).createContext(((java.awt.image.ColorModel)v14),((java.awt.Rectangle)v19),((java.awt.geom.Rectangle2D)v24),((java.awt.geom.AffineTransform)v27),((java.awt.RenderingHints)v29));
    Object v31 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseItemLabelPaint(((java.awt.Paint)v13),(((java.lang.Boolean)v31).booleanValue()));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = new java.awt.Point((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new java.awt.Dimension();
    Object v6 = new java.awt.Rectangle(((java.awt.Point)v4),((java.awt.Dimension)v5));
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = new java.awt.Point((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new java.awt.Dimension();
    Object v11 = new java.awt.Rectangle(((java.awt.Point)v9),((java.awt.Dimension)v10));
    Object v12 = ((java.awt.Shape)v6).contains(((java.awt.geom.Rectangle2D)v11));
    Object v13 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseShape(((java.awt.Shape)v6),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = 14;
    Object v6 = 0;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemLabelFont((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = -86;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesFillPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Not y[et implemented.";
    Object v3 = java.text.DateFormat.getDateTimeInstance();
    Object v4 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator(((java.lang.String)v2),((java.text.DateFormat)v3));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 2;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getSeriesPositiveItemLabelPosition((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -7;
    Object v3 = "Null 'stroke' argument.";
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = new java.awt.Font(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelFont((((java.lang.Integer)v2).intValue()),((java.awt.Font)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.plot.CombinedDomainCategoryPlot();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = "7";
    Object v6 = "NIull 'paint' argument.";
    Object v7 = "Null 'stroke' argument.";
    Object v8 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v5),((java.lang.String)v6),((java.lang.String)v7));
    Object v9 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v6 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).clone();
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v6).hashCode();
    Object v8 = -31;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v6).lookupSeriesStroke((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseOutlineStroke(((java.awt.Stroke)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -5;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    Object v4 = 0;
    Object v5 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v6 = -33;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).lookupSeriesOutlineStroke((((java.lang.Integer)v6).intValue()));
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesStroke((((java.lang.Integer)v4).intValue()),((java.awt.Stroke)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v4 = "Null 'paint' argument.";
    Object v5 = "Temperature";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.labels.ItemLabelPosition)v3).equals(((java.lang.Object)v7));
    Object v9 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v2).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v3),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 15;
    Object v2 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v2).clone();
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v3).hashCode();
    Object v5 = -31;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesStroke((((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesStroke((((java.lang.Integer)v1).intValue()),((java.awt.Stroke)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = -41;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemLabelFont((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = -42;
    Object v2 = "Not y[et implemented.";
    Object v3 = java.text.DateFormat.getDateTimeInstance();
    Object v4 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator(((java.lang.String)v2),((java.text.DateFormat)v3));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = 24;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getSeriesItemLabelFont((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseItemLabelsVisible((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).getLegendItems();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = 15;
    Object v6 = -43;
    Object v7 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).getItemLabelGenerator((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = "Null 'stroke' argument.";
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.awt.Font(((java.lang.String)v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v4).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Not y[et implemented.";
    Object v3 = java.text.DateFormat.getDateTimeInstance();
    Object v4 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator(((java.lang.String)v2),((java.text.DateFormat)v3));
    Object v5 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = true;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelsVisible((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setAutoPopulateSeriesOutlineStroke((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -9;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v5 = "Null 'position' argument.";
    Object v6 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v7 = "7";
    Object v8 = "NIull 'paint' argument.";
    Object v9 = "Null 'stroke' argument.";
    Object v10 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v7),((java.lang.String)v8),((java.lang.String)v9));
    Object v11 = ((org.jfree.chart.renderer.category.MinMaxCategoryRenderer)v6).equals(((java.lang.Object)v10));
    Object v12 = 34.38161212029391D;
    Object v13 = 0.0D;
    Object v14 = new org.jfree.chart.annotations.CategoryPointerAnnotation(((java.lang.String)v5),((java.lang.Comparable)v11),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getSeriesOutlinePaint((((java.lang.Integer)v2).intValue()));
    Object v4 = "Null 'paint' argument.";
    Object v5 = "Temperature";
    Object v6 = new java.util.Locale(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v6));
    Object v8 = ((java.util.EventObject)v7).toString();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v7));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 49;
    Object v3 = true;
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesVisible((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = 1;
    Object v7 = 17;
    Object v8 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItem((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v1 = 53;
    Object v2 = new org.jfree.chart.renderer.category.MinMaxCategoryRenderer();
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v2).clone();
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v3).hashCode();
    Object v5 = -31;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesStroke((((java.lang.Integer)v5).intValue()));
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = new java.awt.Point((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new java.awt.Dimension();
    Object v11 = new java.awt.Rectangle(((java.awt.Point)v9),((java.awt.Dimension)v10));
    Object v12 = ((java.awt.Stroke)v6).createStrokedShape(((java.awt.Shape)v11));
    Object v13 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlineStroke((((java.lang.Integer)v1).intValue()),((java.awt.Stroke)v6),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }
}
