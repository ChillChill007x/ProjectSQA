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
    Object v10 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemShape((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
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
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemShape((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = null;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseOutlineStroke(((java.awt.Stroke)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setAutoPopulateSeriesPaint((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = false;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    Object v3 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesItemLabelGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = "Taho-a";
    Object v2 = 29;
    Object v3 = -30;
    Object v4 = new java.awt.Font(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseLegendTextFont(((java.awt.Font)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    Object v2 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 2;
    Object v2 = -3;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isItemLabelVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setPlot(((org.jfree.chart.plot.CategoryPlot)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesURLGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v2));
    Object v3 = null;
    Object v4 = new org.jfree.chart.entity.StandardEntityCollection();
    Object v5 = 3.4601188F;
    Object v6 = 0.0F;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v9 = 67;
    Object v10 = -21;
    Object v11 = true;
    Object v12 = -34.00110654385528D;
    Object v13 = 2.0D;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).addEntity(((org.jfree.chart.entity.EntityCollection)v4),((java.awt.Shape)v7),((org.jfree.data.category.CategoryDataset)v8),(((java.lang.Integer)v9).intValue()),(((java.lang.Integer)v10).intValue()),(((java.lang.Boolean)v11).booleanValue()),(((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = 2;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = -29;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getItemLabelGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesPaint((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePaint(((java.awt.Paint)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -49;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getItemLabelGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = false;
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelsVisible((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesPaint((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -7;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v2 = false;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).findRangeBounds(((org.jfree.data.category.CategoryDataset)v1),(((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getBaseURLGenerator();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -9;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getRangeAxis(((org.jfree.chart.plot.CategoryPlot)v1),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v3 = 0;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesPaint((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesFillPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -24;
    Object v2 = true;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = 3.4601188F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesShape((((java.lang.Integer)v1).intValue()),((java.awt.Shape)v4));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v8 = 0;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v7).lookupSeriesPaint((((java.lang.Integer)v8).intValue()));
    Object v10 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v6).intValue()),((java.awt.Paint)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 39;
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).clearSeriesStrokes((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getAutoPopulateSeriesPaint();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesPaint((((java.lang.Integer)v1).intValue()));
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getBaseSeriesVisible();
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    Object v2 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    Object v2 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 33;
    Object v2 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    Object v3 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getDrawingSupplier();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -13;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesShape((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = false;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesCreateEntities((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesPaint((((java.lang.Integer)v2).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseLegendTextPaint(((java.awt.Paint)v3));
    Object v4 = null;
    Object v5 = 0;
    Object v6 = 0;
    Object v7 = false;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemFillPaint((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = false;
    Object v3 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v1),(((java.lang.Boolean)v2).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v3));
    Object v4 = null;
    Object v5 = 44;
    Object v6 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v7 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v8 = 0;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v7).lookupSeriesPaint((((java.lang.Integer)v8).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v6).setBaseLegendTextPaint(((java.awt.Paint)v9));
    Object v10 = null;
    Object v11 = 0;
    Object v12 = 0;
    Object v13 = false;
    Object v14 = ((org.jfree.chart.renderer.AbstractRenderer)v6).getItemFillPaint((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v15 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesFillPaint((((java.lang.Integer)v5).intValue()),((java.awt.Paint)v14),(((java.lang.Boolean)v15).booleanValue()));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 0;
    Object v2 = -11;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getNegativeItemLabelPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelAnchorOffset();
    org.junit.Assert.assertEquals((Object)(2.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -48;
    Object v2 = 6;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getURLGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = -14;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).findRangeBounds(((org.jfree.data.category.CategoryDataset)v1));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = "Taho-a";
    Object v2 = 29;
    Object v3 = -30;
    Object v4 = new java.awt.Font(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelFont(((java.awt.Font)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 32;
    Object v2 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v3 = 0;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesPaint((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlinePaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = "Null 'paint' argument.";
    Object v2 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator(((java.lang.String)v1));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setLegendItemLabelGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemCreateEntity((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisible((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = true;
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelsVisible((((java.lang.Boolean)v4).booleanValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = true;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemShape((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = 29;
    Object v7 = 9;
    Object v8 = true;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemPaint((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getAutoPopulateSeriesPaint();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "TaGhoma";
    Object v3 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v4 = 1;
    Object v5 = 2;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemVisible((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    Object v7 = -17.93538106642285D;
    Object v8 = -50.04256036875287D;
    Object v9 = new org.jfree.chart.annotations.CategoryPointerAnnotation(((java.lang.String)v2),((java.lang.Comparable)v6),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v9));
    Object v11 = 0;
    Object v12 = 32;
    Object v13 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItem((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).isSeriesVisibleInLegend((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -20;
    Object v3 = 16;
    Object v4 = true;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemPaint((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.entity.StandardEntityCollection();
    Object v3 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesOutlinePaint((((java.lang.Integer)v4).intValue()));
    Object v6 = 1;
    Object v7 = 1;
    Object v8 = false;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemShape((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v11 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.data.general.Dataset)v10).addChangeListener(((org.jfree.data.event.DatasetChangeListener)v11));
    Object v12 = null;
    Object v13 = 0;
    Object v14 = 0;
    Object v15 = false;
    Object v16 = 5.9415982892226D;
    Object v17 = 1.0D;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).addEntity(((org.jfree.chart.entity.EntityCollection)v2),((java.awt.Shape)v9),((org.jfree.data.category.CategoryDataset)v10),(((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()),(((java.lang.Boolean)v15).booleanValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v18 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = false;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemOutlineStroke((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v7 = 0;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v6).lookupSeriesPaint((((java.lang.Integer)v7).intValue()));
    Object v9 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseOutlinePaint(((java.awt.Paint)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -83;
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v2).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v3 = -13;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesShape((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseShape(((java.awt.Shape)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = -16;
    Object v8 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    Object v9 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesToolTipGenerator((((java.lang.Integer)v7).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Taho-a";
    Object v3 = 29;
    Object v4 = -30;
    Object v5 = new java.awt.Font(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelFont(((java.awt.Font)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Null 'paint' argument.";
    Object v3 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator(((java.lang.String)v2));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setLegendItemLabelGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = "Taho-a";
    Object v2 = 29;
    Object v3 = -30;
    Object v4 = new java.awt.Font(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelFont(((java.awt.Font)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseCreateEntities((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -2;
    Object v3 = 3.4601188F;
    Object v4 = 0.0F;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesShape((((java.lang.Integer)v2).intValue()),((java.awt.Shape)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getLegendTextPaint((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItems();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -35;
    Object v3 = 0;
    Object v4 = false;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemCreateEntity((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = true;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemLabelPaint((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisible((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = 36;
    Object v5 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v6 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v5).clone();
    Object v7 = 1;
    Object v8 = 0;
    Object v9 = true;
    Object v10 = ((org.jfree.chart.renderer.AbstractRenderer)v6).getItemLabelPaint((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = java.awt.image.ColorModel.getRGBdefault();
    Object v12 = 0;
    Object v13 = -17;
    Object v14 = new java.awt.Dimension((((java.lang.Integer)v12).intValue()),(((java.lang.Integer)v13).intValue()));
    Object v15 = new java.awt.Rectangle(((java.awt.Dimension)v14));
    Object v16 = 0;
    Object v17 = -17;
    Object v18 = new java.awt.Dimension((((java.lang.Integer)v16).intValue()),(((java.lang.Integer)v17).intValue()));
    Object v19 = new java.awt.Rectangle(((java.awt.Dimension)v18));
    Object v20 = 0;
    Object v21 = 25.40366832318336D;
    Object v22 = 2.0D;
    Object v23 = java.awt.geom.AffineTransform.getQuadrantRotateInstance((((java.lang.Integer)v20).intValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()));
    Object v24 = new org.jfree.chart.plot.CategoryCrosshairState();
    Object v25 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v26 = -14;
    Object v27 = ((org.jfree.chart.renderer.AbstractRenderer)v25).isSeriesVisible((((java.lang.Integer)v26).intValue()));
    Object v28 = java.util.Map.of(((java.lang.Object)v24),((java.lang.Object)v27));
    Object v29 = new java.awt.RenderingHints(((java.util.Map)v28));
    Object v30 = ((java.awt.Paint)v10).createContext(((java.awt.image.ColorModel)v11),((java.awt.Rectangle)v15),((java.awt.geom.Rectangle2D)v19),((java.awt.geom.AffineTransform)v23),((java.awt.RenderingHints)v29));
    Object v31 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPaint((((java.lang.Integer)v4).intValue()),((java.awt.Paint)v10),(((java.lang.Boolean)v31).booleanValue()));
    Object v32 = null;
    org.junit.Assert.assertNull(v32);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItemToolTipGenerator();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -1321112097;
    Object v3 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesPaint((((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesOutlinePaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -20;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesStroke((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v2).clone();
    Object v4 = 1;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemLabelPaint((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseFillPaint(((java.awt.Paint)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -49;
    Object v3 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesToolTipGenerator((((java.lang.Integer)v2).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = true;
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesVisible((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesStroke((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v3 = -22;
    Object v4 = new org.jfree.chart.urls.CustomCategoryURLGenerator();
    Object v5 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setSeriesURLGenerator((((java.lang.Integer)v3).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = true;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisible((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getAutoPopulateSeriesShape();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = 23;
    Object v4 = false;
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getURLGenerator((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = 0;
    Object v4 = false;
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getItemLabelGenerator((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),(((java.lang.Boolean)v4).booleanValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelsVisible((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = false;
    Object v4 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v2),(((java.lang.Boolean)v3).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -30;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getSeriesVisible((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -7;
    Object v3 = 17;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItem((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new org.jfree.chart.entity.StandardEntityCollection();
    Object v6 = 0;
    Object v7 = -17;
    Object v8 = new java.awt.Dimension((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new java.awt.Rectangle(((java.awt.Dimension)v8));
    Object v10 = new org.jfree.data.category.DefaultCategoryDataset();
    Object v11 = 1;
    Object v12 = 3;
    Object v13 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).addEntity(((org.jfree.chart.entity.EntityCollection)v5),((java.awt.Shape)v9),((org.jfree.data.category.CategoryDataset)v10),(((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
      org.junit.Assert.fail("Expected java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getAutoPopulateSeriesOutlineStroke();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = 30;
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 6;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesFillPaint((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.jfree.chart.labels.IntervalCategoryItemLabelGenerator();
    Object v5 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 64;
    Object v3 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v3).clone();
    Object v5 = 1;
    Object v6 = 0;
    Object v7 = true;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemLabelPaint((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelPaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v3).clone();
    Object v5 = -20;
    Object v6 = 16;
    Object v7 = true;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemPaint((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((java.awt.Transparency)v8).getTransparency();
    Object v10 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelPaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v8),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -71;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupLegendShape((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StackedAreaRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -30;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesPaint((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }
}
