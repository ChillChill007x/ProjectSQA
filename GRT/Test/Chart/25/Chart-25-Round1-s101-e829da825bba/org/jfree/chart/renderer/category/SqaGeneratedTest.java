package org.jfree.chart.renderer.category;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getDrawingSupplier();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v2 = ((org.jfree.chart.renderer.category.StatisticalBarRenderer)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    ((org.jfree.chart.renderer.category.BarRenderer)v1).setIncludeBaseInRange((((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemCreateEntity((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1));
    Object v2 = null;
    Object v3 = "y";
    Object v4 = 1;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 1.0F;
    Object v2 = 19.173693F;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = -46.998804159614544D;
    Object v8 = 1.0D;
    Object v9 = 8.901660730577028D;
    Object v10 = new java.awt.geom.AffineTransform((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 42.65391351117582D;
    Object v12 = ((java.awt.Shape)v3).getPathIterator(((java.awt.geom.AffineTransform)v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseShape(((java.awt.Shape)v3),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = ((org.jfree.chart.labels.ItemLabelPosition)v1).equals(((java.lang.Object)v2));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = -28;
    Object v5 = false;
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesCreateEntities((((java.lang.Integer)v4).intValue()),((java.lang.Boolean)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 45;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisibleInLegend((((java.lang.Integer)v1).intValue()));
    Object v3 = 56;
    Object v4 = "y";
    Object v5 = 1;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPaint((((java.lang.Integer)v3).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v4 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v5 = 1.0D;
    Object v6 = 0.0D;
    Object v7 = 0.0D;
    Object v8 = -46.998804159614544D;
    Object v9 = 1.0D;
    Object v10 = 8.901660730577028D;
    Object v11 = new java.awt.geom.AffineTransform((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 1.0D;
    Object v13 = 0.0D;
    Object v14 = 0.0D;
    Object v15 = -46.998804159614544D;
    Object v16 = 1.0D;
    Object v17 = 8.901660730577028D;
    Object v18 = new java.awt.geom.AffineTransform((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = "y";
    Object v20 = 1;
    Object v21 = java.awt.Color.getColor(((java.lang.String)v19),(((java.lang.Integer)v20).intValue()));
    Object v22 = "y";
    Object v23 = 1;
    Object v24 = java.awt.Color.getColor(((java.lang.String)v22),(((java.lang.Integer)v23).intValue()));
    Object v25 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v26 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v25).clone();
    Object v27 = java.io.InputStream.nullInputStream();
    Object v28 = java.util.Map.of(((java.lang.Object)v3),((java.lang.Object)v4),((java.lang.Object)v11),((java.lang.Object)v18),((java.lang.Object)v21),((java.lang.Object)v24),((java.lang.Object)v26),((java.lang.Object)v27));
    Object v29 = java.awt.Font.getFont(((java.util.Map)v28));
    Object v30 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelFont((((java.lang.Integer)v2).intValue()),((java.awt.Font)v29),(((java.lang.Boolean)v30).booleanValue()));
    Object v31 = null;
    org.junit.Assert.assertNull(v31);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -11;
    Object v3 = "y";
    Object v4 = 1;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.awt.Transparency)v5).getTransparency();
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelPaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
    Object v3 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.data.gantt.TaskSeriesCollection();
    Object v2 = "Null 'orientation' argument.";
    Object v3 = new org.jfree.data.general.DatasetGroup(((java.lang.String)v2));
    ((org.jfree.data.general.Dataset)v1).setGroup(((org.jfree.data.general.DatasetGroup)v3));
    Object v4 = null;
    Object v5 = ((org.jfree.chart.renderer.category.BarRenderer)v0).findRangeBounds(((org.jfree.data.category.CategoryDataset)v1));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 48;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).isSeriesItemLabelsVisible((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setPlot(((org.jfree.chart.plot.CategoryPlot)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    Object v4 = -13;
    Object v5 = false;
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesCreateEntities((((java.lang.Integer)v4).intValue()),((java.lang.Boolean)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = -21;
    Object v2 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
    Object v3 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesURLGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 50;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesPaint((((java.lang.Integer)v1).intValue()));
    Object v3 = -2;
    Object v4 = "y";
    Object v5 = 1;
    Object v6 = java.awt.Color.getColor(((java.lang.String)v4),(((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPaint((((java.lang.Integer)v3).intValue()),((java.awt.Paint)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = -17;
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemFillPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v4 = 2;
    Object v5 = 9;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelFont((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = -13;
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = "Null 'anchor' argument.";
    Object v2 = javax.swing.JComponent.getDefaultLocale();
    Object v3 = java.text.NumberFormat.getCurrencyInstance(((java.util.Locale)v2));
    Object v4 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v1),((java.text.NumberFormat)v3));
    Object v5 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = "y";
    Object v3 = 1;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlinePaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 6;
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v2).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getBaseSeriesVisible();
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).isSeriesItemLabelsVisible((((java.lang.Integer)v2).intValue()));
    Object v4 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
    Object v5 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v4));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = "y";
    Object v2 = 1;
    Object v3 = java.awt.Color.getColor(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseOutlinePaint(((java.awt.Paint)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 41;
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesNegativeItemLabelPosition((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = 2;
    Object v2 = "y";
    Object v3 = 1;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlinePaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getSeriesToolTipGenerator((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "y";
    Object v3 = 1;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseOutlinePaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.BarRenderer)v0).getBase();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesPaint((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelPaint(((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
    Object v3 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v2));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v3));
    Object v4 = null;
    Object v5 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v6 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v7 = 1.0D;
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = -46.998804159614544D;
    Object v11 = 1.0D;
    Object v12 = 8.901660730577028D;
    Object v13 = new java.awt.geom.AffineTransform((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = 1.0D;
    Object v15 = 0.0D;
    Object v16 = 0.0D;
    Object v17 = -46.998804159614544D;
    Object v18 = 1.0D;
    Object v19 = 8.901660730577028D;
    Object v20 = new java.awt.geom.AffineTransform((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    Object v21 = "y";
    Object v22 = 1;
    Object v23 = java.awt.Color.getColor(((java.lang.String)v21),(((java.lang.Integer)v22).intValue()));
    Object v24 = "y";
    Object v25 = 1;
    Object v26 = java.awt.Color.getColor(((java.lang.String)v24),(((java.lang.Integer)v25).intValue()));
    Object v27 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v28 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v27).clone();
    Object v29 = java.io.InputStream.nullInputStream();
    Object v30 = java.util.Map.of(((java.lang.Object)v5),((java.lang.Object)v6),((java.lang.Object)v13),((java.lang.Object)v20),((java.lang.Object)v23),((java.lang.Object)v26),((java.lang.Object)v28),((java.lang.Object)v29));
    Object v31 = java.awt.Font.getFont(((java.util.Map)v30));
    Object v32 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelFont(((java.awt.Font)v31),(((java.lang.Boolean)v32).booleanValue()));
    Object v33 = null;
    org.junit.Assert.assertNull(v33);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesNegativeItemLabelPosition((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 1.0F;
    Object v2 = 19.173693F;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()));
    Object v4 = 1.0D;
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = -46.998804159614544D;
    Object v8 = 1.0D;
    Object v9 = 8.901660730577028D;
    Object v10 = new java.awt.geom.AffineTransform((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((java.awt.Shape)v3).getPathIterator(((java.awt.geom.AffineTransform)v10));
    Object v12 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseShape(((java.awt.Shape)v3),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = "y";
    Object v2 = 1;
    Object v3 = java.awt.Color.getColor(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePaint(((java.awt.Paint)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getLegendItems();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "Null 'anchor' argument.";
    Object v3 = javax.swing.JComponent.getDefaultLocale();
    Object v4 = java.text.NumberFormat.getCurrencyInstance(((java.util.Locale)v3));
    Object v5 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v2),((java.text.NumberFormat)v4));
    Object v6 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getURLGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesVisibleInLegend((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v2 = -17;
    Object v3 = 0;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemFillPaint((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 2;
    Object v6 = 9;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemLabelFont((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelFont(((java.awt.Font)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = -12;
    Object v3 = 1.0F;
    Object v4 = 19.173693F;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesShape((((java.lang.Integer)v2).intValue()),((java.awt.Shape)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = false;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisible((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setPlot(((org.jfree.chart.plot.CategoryPlot)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = "y";
    Object v2 = 1;
    Object v3 = java.awt.Color.getColor(((java.lang.String)v1),(((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.awt.Transparency)v3).getTransparency();
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseFillPaint(((java.awt.Paint)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = "y";
    Object v4 = 1;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesPaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = -5;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v1).isSeriesVisibleInLegend((((java.lang.Integer)v8).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = -2;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesFillPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v3 = -2;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesFillPaint((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = true;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisible((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 1;
    Object v2 = "Polar Auto Range";
    Object v3 = javax.swing.JComponent.getDefaultLocale();
    Object v4 = java.text.NumberFormat.getCurrencyInstance(((java.util.Locale)v3));
    Object v5 = new org.jfree.chart.labels.IntervalCategoryToolTipGenerator(((java.lang.String)v2),((java.text.NumberFormat)v4));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v2 = -2;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesFillPaint((((java.lang.Integer)v2).intValue()));
    Object v4 = ((java.awt.Transparency)v3).getTransparency();
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseFillPaint(((java.awt.Paint)v3),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v2));
    Object v3 = null;
    Object v4 = -27;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesStroke((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).clone();
    Object v3 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v2).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v3));
    Object v4 = null;
    Object v5 = -27;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesStroke((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseStroke(((java.awt.Stroke)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = -34;
    Object v10 = "Null 'anchor' argument.";
    Object v11 = javax.swing.JComponent.getDefaultLocale();
    Object v12 = java.text.NumberFormat.getCurrencyInstance(((java.util.Locale)v11));
    Object v13 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v10),((java.text.NumberFormat)v12));
    Object v14 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesItemLabelGenerator((((java.lang.Integer)v9).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v15 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getURLGenerator((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getAutoPopulateSeriesOutlineStroke();
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesFillPaint((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
    Object v4 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v3));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).notifyListeners(((org.jfree.chart.event.RendererChangeEvent)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = -18;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getPositiveItemLabelPosition((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = true;
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelsVisible((((java.lang.Integer)v2).intValue()),((java.lang.Boolean)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = true;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseSeriesVisible((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseCreateEntities((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = -28;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesShape((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = "y";
    Object v4 = 1;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = ((java.awt.Transparency)v5).getTransparency();
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesOutlinePaint((((java.lang.Integer)v2).intValue()),((java.awt.Paint)v5),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesOutlineStroke((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = -15;
    Object v2 = 0;
    Object v3 = -44;
    Object v4 = new java.awt.Point((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = new java.awt.Rectangle(((java.awt.Point)v4));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesShape((((java.lang.Integer)v1).intValue()),((java.awt.Shape)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getDrawingSupplier();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getLegendItems();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).getPassCount();
    org.junit.Assert.assertEquals((Object)(1), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 2;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesStroke((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = true;
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesVisibleInLegend((((java.lang.Integer)v3).intValue()),((java.lang.Boolean)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 10;
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelFont((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesItemLabelsVisible((((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = 0;
    Object v6 = -44;
    Object v7 = new java.awt.Point((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = new java.awt.Rectangle(((java.awt.Point)v7));
    Object v9 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseShape(((java.awt.Shape)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseOutlineStroke(((java.awt.Stroke)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 2;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesShape((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = false;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseStroke(((java.awt.Stroke)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = false;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseCreateEntities((((java.lang.Boolean)v2).booleanValue()),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesPaint((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelPaint(((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    Object v7 = 0;
    Object v8 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v9 = 1;
    Object v10 = ((org.jfree.chart.renderer.AbstractRenderer)v8).lookupSeriesPaint((((java.lang.Integer)v9).intValue()));
    Object v11 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesFillPaint((((java.lang.Integer)v7).intValue()),((java.awt.Paint)v10),(((java.lang.Boolean)v11).booleanValue()));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = true;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelsVisible((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseOutlineStroke(((java.awt.Stroke)v3));
    Object v4 = null;
    Object v5 = -35;
    Object v6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v7 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v6).clone();
    Object v8 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v7).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v8));
    Object v9 = null;
    Object v10 = -27;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v7).lookupSeriesStroke((((java.lang.Integer)v10).intValue()));
    Object v12 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesStroke((((java.lang.Integer)v5).intValue()),((java.awt.Stroke)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 48;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()));
    Object v3 = 20;
    Object v4 = 24;
    Object v5 = ((org.jfree.chart.renderer.category.BarRenderer)v0).getLegendItem((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v3 = 10;
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemLabelFont((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelFont((((java.lang.Integer)v1).intValue()),((java.awt.Font)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlinePaint((((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 1;
    Object v3 = 0;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v1).getItemLabelPaint((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()));
    Object v5 = 1;
    Object v6 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesNegativeItemLabelPosition((((java.lang.Integer)v5).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = 0;
    Object v3 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v4 = 1;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v3).lookupSeriesOutlineStroke((((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setSeriesStroke((((java.lang.Integer)v2).intValue()),((java.awt.Stroke)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = ((org.jfree.chart.renderer.category.BarRenderer)v1).getPositiveItemLabelPositionFallback();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = "y";
    Object v3 = 1;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelPaint(((java.awt.Paint)v4));
    Object v5 = null;
    Object v6 = new org.jfree.chart.urls.StandardCategoryURLGenerator();
    Object v7 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v1).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 6;
    Object v2 = "Null 'anchor' argument.";
    Object v3 = javax.swing.JComponent.getDefaultLocale();
    Object v4 = java.text.NumberFormat.getCurrencyInstance(((java.util.Locale)v3));
    Object v5 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v2),((java.text.NumberFormat)v4));
    Object v6 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesItemLabelGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = null;
    Object v2 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    Object v3 = "Null 'font' a,gument.";
    Object v4 = new java.lang.String[]{"8","CategoryDataset","m"};
    Object v5 = new org.jfree.chart.axis.SymbolAxis(((java.lang.String)v3),((java.lang.String[])v4));
    Object v6 = 0;
    Object v7 = -44;
    Object v8 = new java.awt.Point((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()));
    Object v9 = new java.awt.Rectangle(((java.awt.Point)v8));
    Object v10 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v11 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v12 = 1.0D;
    Object v13 = 0.0D;
    Object v14 = 0.0D;
    Object v15 = -46.998804159614544D;
    Object v16 = 1.0D;
    Object v17 = 8.901660730577028D;
    Object v18 = new java.awt.geom.AffineTransform((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = 1.0D;
    Object v20 = 0.0D;
    Object v21 = 0.0D;
    Object v22 = -46.998804159614544D;
    Object v23 = 1.0D;
    Object v24 = 8.901660730577028D;
    Object v25 = new java.awt.geom.AffineTransform((((java.lang.Double)v19).doubleValue()),(((java.lang.Double)v20).doubleValue()),(((java.lang.Double)v21).doubleValue()),(((java.lang.Double)v22).doubleValue()),(((java.lang.Double)v23).doubleValue()),(((java.lang.Double)v24).doubleValue()));
    Object v26 = "y";
    Object v27 = 1;
    Object v28 = java.awt.Color.getColor(((java.lang.String)v26),(((java.lang.Integer)v27).intValue()));
    Object v29 = "y";
    Object v30 = 1;
    Object v31 = java.awt.Color.getColor(((java.lang.String)v29),(((java.lang.Integer)v30).intValue()));
    Object v32 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v33 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v32).clone();
    Object v34 = java.io.InputStream.nullInputStream();
    Object v35 = java.util.Map.of(((java.lang.Object)v10),((java.lang.Object)v11),((java.lang.Object)v18),((java.lang.Object)v25),((java.lang.Object)v28),((java.lang.Object)v31),((java.lang.Object)v33),((java.lang.Object)v34));
    Object v36 = ((java.awt.geom.Rectangle2D)v9).equals(((java.lang.Object)v35));
    Object v37 = 1.9176142058488233D;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).drawRangeGridline(((java.awt.Graphics2D)v1),((org.jfree.chart.plot.CategoryPlot)v2),((org.jfree.chart.axis.ValueAxis)v5),((java.awt.geom.Rectangle2D)v9),(((java.lang.Double)v37).doubleValue()));
    Object v38 = null;
    org.junit.Assert.assertNull(v38);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 0;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesVisibleInLegend((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = new org.jfree.chart.util.Size2D((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.labels.ItemLabelPosition)v1).equals(((java.lang.Object)v4));
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v2 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v3 = 10;
    Object v4 = 0;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemLabelFont((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()));
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v1).setBaseItemLabelFont(((java.awt.Font)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    Object v8 = new org.jfree.chart.plot.CombinedRangeCategoryPlot();
    ((org.jfree.chart.renderer.AbstractRenderer)v1).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getAutoPopulateSeriesStroke();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = "UnitType.ABSOLUTE";
    Object v2 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator(((java.lang.String)v1));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setLegendItemLabelGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setAutoPopulateSeriesStroke((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = "y";
    Object v4 = 1;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePaint(((java.awt.Paint)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = 10;
    Object v2 = "y";
    Object v3 = 1;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v4));
    Object v5 = null;
    Object v6 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v7 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v6).clone();
    Object v8 = 1;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v7).lookupSeriesOutlineStroke((((java.lang.Integer)v8).intValue()));
    Object v10 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseOutlineStroke(((java.awt.Stroke)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.StatisticalBarRenderer();
    Object v1 = ((org.jfree.chart.renderer.category.BarRenderer)v0).getUpperClip();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }
}
