package org.jfree.chart.renderer.category;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = 3.4601188F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesShape((((java.lang.Integer)v1).intValue()),((java.awt.Shape)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = true;
    Object v10 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemPaint((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesOutlinePaint((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = false;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemPaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = true;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelsVisible((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getBaseLegendTextFont();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisibleInLegend((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v3 = 0;
    Object v4 = 3.4601188F;
    Object v5 = 0.0F;
    Object v6 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v2).setSeriesShape((((java.lang.Integer)v3).intValue()),((java.awt.Shape)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = 1;
    Object v11 = true;
    Object v12 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemPaint((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlinePaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).clearSeriesPaints((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesVisibleInLegend((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = -22;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getDrawingSupplier();
    Object v2 = new org.jfree.chart.util.Size2D();
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -45;
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v4 = ((org.jfree.chart.labels.ItemLabelPosition)v2).equals(((java.lang.Object)v3));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v2),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = new java.util.HashMap();
    Object v3 = ((org.jfree.chart.labels.ItemLabelPosition)v1).equals(((java.lang.Object)v2));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v2 = 0;
    Object v3 = -22;
    Object v4 = false;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemLabelPaint((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesPositiveItemLabelPosition((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 37;
    Object v2 = -19;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelFont((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -95;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = false;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelsVisible((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = 3.4601188F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesShape((((java.lang.Integer)v1).intValue()),((java.awt.Shape)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesStroke((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 55;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 49;
    Object v2 = 41;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemCreateEntity((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -7;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupLegendTextFont((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = false;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 52;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemCreateEntity((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemFillPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 17;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesFillPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -3;
    Object v2 = new java.util.HashMap();
    Object v3 = new java.awt.Font(((java.util.Map)v2));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelFont((((java.lang.Integer)v1).intValue()),((java.awt.Font)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getBaseItemLabelFont();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getBaseItemLabelFont();
    Object v3 = true;
    Object v4 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v4));
    Object v5 = null;
    Object v6 = -21;
    Object v7 = 0;
    Object v8 = false;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemShape((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemOutlinePaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -10;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = -25;
    Object v6 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    Object v7 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesURLGenerator((((java.lang.Integer)v5).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.plot.XYPlot();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).hasListener(((java.util.EventListener)v1));
    Object v3 = "Null 'paint' ar0gument.";
    Object v4 = javax.swing.JComponent.getDefaultLocale();
    Object v5 = java.text.NumberFormat.getIntegerInstance(((java.util.Locale)v4));
    Object v6 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator(((java.lang.String)v3),((java.text.NumberFormat)v5));
    Object v7 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getBaseItemLabelFont();
    Object v3 = true;
    Object v4 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesStroke((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlineStroke((((java.lang.Integer)v1).intValue()),((java.awt.Stroke)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesStroke((((java.lang.Integer)v2).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseStroke(((java.awt.Stroke)v3));
    Object v4 = null;
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getBaseURLGenerator();
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesOutlineStroke((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 71;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v4).lookupSeriesOutlinePaint((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = -39;
    Object v7 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v8 = 0;
    Object v9 = 3.4601188F;
    Object v10 = 0.0F;
    Object v11 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()));
    Object v12 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v7).setSeriesShape((((java.lang.Integer)v8).intValue()),((java.awt.Shape)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    Object v14 = 1;
    Object v15 = 1;
    Object v16 = true;
    Object v17 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getItemPaint((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesItemLabelPaint((((java.lang.Integer)v6).intValue()),((java.awt.Paint)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 0;
    Object v6 = 4;
    Object v7 = true;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemLabelFont((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v8 = 0;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getSeriesPositiveItemLabelPosition((((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesNegativeItemLabelPosition((((java.lang.Integer)v6).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).clearSeriesPaints((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v7 = 37;
    Object v8 = -19;
    Object v9 = false;
    Object v10 = ((org.jfree.chart.renderer.AbstractRenderer)v6).getItemLabelFont((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseItemLabelFont(((java.awt.Font)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = true;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseCreateEntities((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 4;
    Object v7 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    Object v8 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).setSeriesURLGenerator((((java.lang.Integer)v6).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = -18;
    Object v6 = 30;
    Object v7 = true;
    Object v8 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).getURLGenerator((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v8 = 0;
    Object v9 = 0;
    Object v10 = false;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getItemFillPaint((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesOutlinePaint((((java.lang.Integer)v6).intValue()),((java.awt.Paint)v11));
    Object v12 = null;
    Object v13 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v14 = -95;
    Object v15 = 0;
    Object v16 = true;
    Object v17 = ((org.jfree.chart.renderer.AbstractRenderer)v13).getItemLabelPaint((((java.lang.Integer)v14).intValue()),(((java.lang.Integer)v15).intValue()),(((java.lang.Boolean)v16).booleanValue()));
    Object v18 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseFillPaint(((java.awt.Paint)v17),(((java.lang.Boolean)v18).booleanValue()));
    Object v19 = null;
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 1.0D;
    Object v6 = 1.0D;
    Object v7 = "Null 'paint' argument.";
    Object v8 = new org.jfree.chart.axis.CyclicNumberAxis((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((java.lang.String)v7));
    Object v9 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v8));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).setPlot(((org.jfree.chart.plot.CategoryPlot)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v6 = 0;
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesItemLabelsVisible((((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).clone();
    Object v10 = 71;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v9).lookupSeriesOutlinePaint((((java.lang.Integer)v10).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseItemLabelPaint(((java.awt.Paint)v11));
    Object v12 = null;
    Object v13 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getBaseShape();
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = true;
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = -29;
    Object v6 = 1;
    Object v7 = false;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemOutlinePaint((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).clearSeriesStrokes((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    Object v7 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 1.0D;
    Object v6 = 1.0D;
    Object v7 = "Null 'paint' argument.";
    Object v8 = new org.jfree.chart.axis.CyclicNumberAxis((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),((java.lang.String)v7));
    Object v9 = new org.jfree.chart.plot.CombinedRangeCategoryPlot(((org.jfree.chart.axis.ValueAxis)v8));
    ((org.jfree.chart.renderer.AbstractRenderer)v4).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v10 = 0;
    Object v11 = 0;
    Object v12 = false;
    Object v13 = ((org.jfree.chart.renderer.AbstractRenderer)v9).getItemFillPaint((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = java.awt.image.ColorModel.getRGBdefault();
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new java.awt.Dimension((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.awt.Rectangle(((java.awt.Dimension)v17));
    Object v19 = 1;
    Object v20 = 0;
    Object v21 = new java.awt.Dimension((((java.lang.Integer)v19).intValue()),(((java.lang.Integer)v20).intValue()));
    Object v22 = new java.awt.Rectangle(((java.awt.Dimension)v21));
    Object v23 = 0.688290964174658D;
    Object v24 = 0.0D;
    Object v25 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()));
    Object v26 = new java.util.HashMap();
    Object v27 = new java.awt.RenderingHints(((java.util.Map)v26));
    Object v28 = ((java.awt.Paint)v13).createContext(((java.awt.image.ColorModel)v14),((java.awt.Rectangle)v18),((java.awt.geom.Rectangle2D)v22),((java.awt.geom.AffineTransform)v25),((java.awt.RenderingHints)v27));
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setSeriesOutlinePaint((((java.lang.Integer)v8).intValue()),((java.awt.Paint)v13));
    Object v29 = null;
    org.junit.Assert.assertNull(v29);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setDataBoundsIncludesVisibleSeriesOnly((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v7).getBaseItemLabelFont();
    Object v9 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesItemLabelFont((((java.lang.Integer)v6).intValue()),((java.awt.Font)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = -28;
    Object v7 = true;
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesItemLabelsVisible((((java.lang.Integer)v6).intValue()),((java.lang.Boolean)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).setLegendItemLabelGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 1;
    Object v6 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).getSeriesToolTipGenerator((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 1;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).lookupSeriesStroke((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = true;
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesCreateEntities((((java.lang.Integer)v6).intValue()),((java.lang.Boolean)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesVisibleInLegend((((java.lang.Integer)v6).intValue()),((java.lang.Boolean)v7));
    Object v8 = null;
    Object v9 = 1;
    Object v10 = ((org.jfree.chart.renderer.AbstractRenderer)v5).isSeriesVisible((((java.lang.Integer)v9).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v5).getSelectedItemAttributes();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = -28;
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setSeriesVisibleInLegend((((java.lang.Integer)v5).intValue()),((java.lang.Boolean)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = true;
    Object v8 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesVisibleInLegend((((java.lang.Integer)v6).intValue()),((java.lang.Boolean)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator();
    Object v7 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = -1;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).lookupSeriesFillPaint((((java.lang.Integer)v6).intValue()));
    Object v8 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v8).getBaseItemLabelFont();
    Object v10 = "Null 'paint' argument.";
    Object v11 = 0;
    Object v12 = 5;
    Object v13 = 0.688290964174658D;
    Object v14 = 0.0D;
    Object v15 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()));
    Object v16 = true;
    Object v17 = false;
    Object v18 = new java.awt.font.FontRenderContext(((java.awt.geom.AffineTransform)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((java.awt.Font)v9).getLineMetrics(((java.lang.String)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),((java.awt.font.FontRenderContext)v18));
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseItemLabelFont(((java.awt.Font)v9));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v7 = 1;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v6).lookupSeriesOutlineStroke((((java.lang.Integer)v7).intValue()));
    Object v9 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseOutlineStroke(((java.awt.Stroke)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = false;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v5).getItemOutlinePaint((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = java.awt.image.ColorModel.getRGBdefault();
    Object v11 = 1;
    Object v12 = 0;
    Object v13 = new java.awt.Dimension((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = new java.awt.Rectangle(((java.awt.Dimension)v13));
    Object v15 = 1;
    Object v16 = 0;
    Object v17 = new java.awt.Dimension((((java.lang.Integer)v15).intValue()),(((java.lang.Integer)v16).intValue()));
    Object v18 = new java.awt.Rectangle(((java.awt.Dimension)v17));
    Object v19 = 0.688290964174658D;
    Object v20 = 0.0D;
    Object v21 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()));
    Object v22 = new java.util.HashMap();
    Object v23 = new java.awt.RenderingHints(((java.util.Map)v22));
    Object v24 = ((java.awt.Paint)v9).createContext(((java.awt.image.ColorModel)v10),((java.awt.Rectangle)v14),((java.awt.geom.Rectangle2D)v18),((java.awt.geom.AffineTransform)v21),((java.awt.RenderingHints)v23));
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseOutlinePaint(((java.awt.Paint)v9));
    Object v25 = null;
    org.junit.Assert.assertNull(v25);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.awt.Dimension((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new java.awt.Rectangle(((java.awt.Dimension)v8));
    Object v10 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseShape(((java.awt.Shape)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 13;
    Object v7 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v8 = 0;
    Object v9 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v7).setSeriesItemLabelsVisible((((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    Object v11 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v7).clone();
    Object v12 = 71;
    Object v13 = ((org.jfree.chart.renderer.AbstractRenderer)v11).lookupSeriesOutlinePaint((((java.lang.Integer)v12).intValue()));
    Object v14 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesPaint((((java.lang.Integer)v6).intValue()),((java.awt.Paint)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 47.221622632240994D;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setItemLabelAnchorOffset((((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = 1;
    Object v9 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v10 = 55;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v9).lookupSeriesPaint((((java.lang.Integer)v10).intValue()));
    Object v12 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesPaint((((java.lang.Integer)v8).intValue()),((java.awt.Paint)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = true;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v5).getItemOutlineStroke((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseSeriesVisible((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = 50;
    Object v8 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v9 = -95;
    Object v10 = 0;
    Object v11 = true;
    Object v12 = ((org.jfree.chart.renderer.AbstractRenderer)v8).getItemLabelPaint((((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()));
    Object v13 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setSeriesOutlinePaint((((java.lang.Integer)v7).intValue()),((java.awt.Paint)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 17;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).lookupSeriesPaint((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 37;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).lookupSeriesOutlineStroke((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).clearSeriesPaints((((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setAutoPopulateSeriesOutlinePaint((((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 1;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).getSeriesVisibleInLegend((((java.lang.Integer)v6).intValue()));
    Object v8 = 70;
    Object v9 = true;
    Object v10 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesVisible((((java.lang.Integer)v8).intValue()),((java.lang.Boolean)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = new java.awt.Dimension((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = new java.awt.Rectangle(((java.awt.Dimension)v9));
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesShape((((java.lang.Integer)v6).intValue()),((java.awt.Shape)v10));
    Object v11 = null;
    Object v12 = -12;
    Object v13 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator();
    Object v14 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).setSeriesItemLabelGenerator((((java.lang.Integer)v12).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseCreateEntities((((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = true;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemShape((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    Object v10 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setSeriesCreateEntities((((java.lang.Integer)v6).intValue()),((java.lang.Boolean)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 0;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v4).lookupLegendShape((((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v6).getBaseItemLabelFont();
    Object v8 = true;
    Object v9 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v7),(((java.lang.Boolean)v8).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v5).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v9));
    Object v10 = null;
    Object v11 = false;
    Object v12 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseItemLabelsVisible((((java.lang.Boolean)v11).booleanValue()),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = new byte[]{Byte.valueOf((byte)0)};
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v5),(((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v4).equals(((java.lang.Object)v8));
    Object v10 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v10).getBaseItemLabelFont();
    Object v12 = ((java.awt.Font)v11).getMissingGlyphCode();
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setBaseItemLabelFont(((java.awt.Font)v11));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = 3;
    Object v8 = true;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v5).getItemOutlinePaint((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).getLegendItem((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = false;
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v5).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v6).booleanValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 31;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v5).getSeriesVisible((((java.lang.Integer)v6).intValue()));
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 21;
    Object v6 = "Null 'paint' ar0gument.";
    Object v7 = javax.swing.JComponent.getDefaultLocale();
    Object v8 = java.text.NumberFormat.getIntegerInstance(((java.util.Locale)v7));
    Object v9 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator(((java.lang.String)v6),((java.text.NumberFormat)v8));
    Object v10 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).setSeriesToolTipGenerator((((java.lang.Integer)v5).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = -4;
    Object v6 = -68;
    Object v7 = false;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemFillPaint((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getAutoPopulateSeriesFillPaint();
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 1;
    Object v7 = 0;
    Object v8 = true;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).getToolTipGenerator((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = 0;
    Object v6 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v7 = 1;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v6).lookupSeriesOutlineStroke((((java.lang.Integer)v7).intValue()));
    Object v9 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v4).setSeriesStroke((((java.lang.Integer)v5).intValue()),((java.awt.Stroke)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v4).clone();
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = true;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).getItemLabelGenerator((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNull(v9);
  }
}
