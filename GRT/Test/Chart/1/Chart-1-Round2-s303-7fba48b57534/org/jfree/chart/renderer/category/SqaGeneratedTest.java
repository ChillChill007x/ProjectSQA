package org.jfree.chart.renderer.category;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = "Null 'font' argument.";
    Object v2 = 0.0F;
    Object v3 = 0.0F;
    Object v4 = 0.0F;
    Object v5 = java.awt.Color.getHSBColor((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = java.awt.Color.getColor(((java.lang.String)v1),((java.awt.Color)v5));
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseFillPaint(((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 35;
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.Number)v3));
    Object v5 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v6 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v4),((org.jfree.chart.renderer.WaferMapRenderer)v5));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -18;
    Object v2 = 0.0F;
    Object v3 = 0.0F;
    Object v4 = 0.0F;
    Object v5 = java.awt.Color.getHSBColor((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlinePaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 2.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v1).floatValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseLegendShape(((java.awt.Shape)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemCreateEntity((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 35;
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.Number)v3));
    Object v5 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v6 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v4),((org.jfree.chart.renderer.WaferMapRenderer)v5));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupLegendShape((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = true;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisibleInLegend((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getDrawingSupplier();
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = "Null 'pai";
    Object v2 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v1));
    Object v3 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseURLGenerator(((org.jfree.chart.urls.CategoryURLGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getColumnCount();
    org.junit.Assert.assertEquals((Object)(0), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 33;
    Object v2 = false;
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesVisibleInLegend((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 18;
    Object v2 = "Null 'font' argument.";
    Object v3 = 0.0F;
    Object v4 = 0.0F;
    Object v5 = 0.0F;
    Object v6 = java.awt.Color.getHSBColor((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = java.awt.Color.getColor(((java.lang.String)v2),((java.awt.Color)v6));
    Object v8 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesFillPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v9 = null;
    Object v10 = 0;
    Object v11 = 2.0F;
    Object v12 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v11).floatValue()));
    Object v13 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesShape((((java.lang.Integer)v10).intValue()),((java.awt.Shape)v12),(((java.lang.Boolean)v13).booleanValue()));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = 33;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemFillPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setLegendItemURLGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 37;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupLegendTextPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = 35;
    Object v3 = 1;
    Object v4 = 1;
    Object v5 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v2).intValue()),(((java.lang.Integer)v3).intValue()),((java.lang.Number)v4));
    Object v6 = ((org.jfree.chart.labels.ItemLabelPosition)v1).equals(((java.lang.Object)v5));
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getAutoPopulateSeriesOutlinePaint();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0.0F;
    Object v2 = 0.0F;
    Object v3 = 0.0F;
    Object v4 = java.awt.Color.getHSBColor((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePaint(((java.awt.Paint)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -23;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupLegendTextPaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = "Null 'vales' argument.";
    Object v2 = java.awt.Font.decode(((java.lang.String)v1));
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelFont(((java.awt.Font)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesOutlineStroke((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setDataBoundsIncludesVisibleSeriesOnly((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 1;
    Object v2 = "Null 'pai";
    Object v3 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v2));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesURLGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v3));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 1;
    Object v2 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    Object v3 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 3;
    Object v2 = -12;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getLegendShape((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -37;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemFillPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseNegativeItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = "Null 'vales' argument.";
    Object v2 = java.awt.Font.decode(((java.lang.String)v1));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelFont(((java.awt.Font)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = "Null 'pai";
    Object v3 = new org.jfree.chart.urls.StandardCategoryURLGenerator(((java.lang.String)v2));
    Object v4 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesURLGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.urls.CategoryURLGenerator)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 35;
    Object v2 = 1;
    Object v3 = 1;
    Object v4 = new org.jfree.data.general.WaferMapDataset((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),((java.lang.Number)v3));
    Object v5 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v6 = new org.jfree.chart.plot.WaferMapPlot(((org.jfree.data.general.WaferMapDataset)v4),((org.jfree.chart.renderer.WaferMapRenderer)v5));
    Object v7 = new byte[]{Byte.valueOf((byte)27),Byte.valueOf((byte)-14)};
    Object v8 = new java.io.ByteArrayInputStream(((byte[])v7));
    Object v9 = true;
    Object v10 = new org.jfree.chart.event.RendererChangeEvent(((java.lang.Object)v8),(((java.lang.Boolean)v9).booleanValue()));
    ((org.jfree.chart.event.RendererChangeListener)v6).rendererChanged(((org.jfree.chart.event.RendererChangeEvent)v10));
    Object v11 = null;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).addChangeListener(((org.jfree.chart.event.RendererChangeListener)v6));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -18;
    Object v2 = 12;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemOutlinePaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisible((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseOutlineStroke(((java.awt.Stroke)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesOutlineStroke((((java.lang.Integer)v3).intValue()));
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesStroke((((java.lang.Integer)v1).intValue()),((java.awt.Stroke)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlineStroke((((java.lang.Integer)v2).intValue()));
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseStroke(((java.awt.Stroke)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 6;
    Object v2 = "Null 'vales' argument.";
    Object v3 = java.awt.Font.decode(((java.lang.String)v2));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelFont((((java.lang.Integer)v1).intValue()),((java.awt.Font)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    Object v6 = "Series index out of bounds";
    Object v7 = java.text.NumberFormat.getInstance();
    Object v8 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v6),((java.text.NumberFormat)v7));
    Object v9 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseItemLabelGenerator(((org.jfree.chart.labels.CategoryItemLabelGenerator)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseCreateEntities((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = 0;
    Object v4 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesPositiveItemLabelPosition((((java.lang.Integer)v3).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = false;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseCreateEntities((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v2 = 0;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupLegendShape((((java.lang.Integer)v2).intValue()));
    Object v4 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseShape(((java.awt.Shape)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupLegendTextPaint((((java.lang.Integer)v1).intValue()));
    Object v3 = "Null 'font' argument.";
    Object v4 = 0.0F;
    Object v5 = 0.0F;
    Object v6 = 0.0F;
    Object v7 = java.awt.Color.getHSBColor((((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = java.awt.Color.getColor(((java.lang.String)v3),((java.awt.Color)v7));
    Object v9 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v8),(((java.lang.Boolean)v9).booleanValue()));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesVisibleInLegend((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    Object v2 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = -18;
    Object v4 = 12;
    Object v5 = true;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemOutlinePaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -14;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesStroke((((java.lang.Integer)v1).intValue()));
    Object v3 = 0;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesStroke((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = false;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelsVisible((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = 0;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelPaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setLegendItemLabelGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 6;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesNegativeItemLabelPosition((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = -5;
    Object v2 = 60;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getToolTipGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -33;
    Object v2 = 1;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelFont((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = "Null 'vales' argument.";
    Object v3 = java.awt.Font.decode(((java.lang.String)v2));
    Object v4 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelFont((((java.lang.Integer)v1).intValue()),((java.awt.Font)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -11;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesCreateEntities((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = new org.jfree.chart.plot.CategoryPlot();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setPlot(((org.jfree.chart.plot.CategoryPlot)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 1;
    Object v2 = "Series index out of bounds";
    Object v3 = java.text.NumberFormat.getInstance();
    Object v4 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v2),((java.text.NumberFormat)v3));
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesItemLabelGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v4));
    Object v5 = null;
    Object v6 = new org.jfree.chart.plot.CategoryPlot();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setPlot(((org.jfree.chart.plot.CategoryPlot)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = 1;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getLegendItem((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 27;
    Object v2 = -2;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getItemLabelGenerator((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 55;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getLegendShape((((java.lang.Integer)v1).intValue()));
    Object v3 = 1;
    Object v4 = false;
    Object v5 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesVisibleInLegend((((java.lang.Integer)v3).intValue()),((java.lang.Boolean)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = true;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelsVisible((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.plot.CategoryPlot();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).removeChangeListener(((org.jfree.chart.event.RendererChangeListener)v1));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 81;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = 0;
    Object v4 = 33;
    Object v5 = false;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemFillPaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = "Null 'paint' argument.";
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = 2.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v3).floatValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v2).setBaseLegendShape(((java.awt.Shape)v4));
    Object v5 = null;
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = true;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemCreateEntity((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1.0D;
    Object v11 = 0.0D;
    Object v12 = new org.jfree.chart.annotations.CategoryPointerAnnotation(((java.lang.String)v1),((java.lang.Comparable)v9),(((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).removeAnnotation(((org.jfree.chart.annotations.CategoryAnnotation)v12));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -2;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupLegendTextFont((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesShape((((java.lang.Integer)v1).intValue()));
    Object v3 = 14;
    Object v4 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v5 = -33;
    Object v6 = 1;
    Object v7 = false;
    Object v8 = ((org.jfree.chart.renderer.AbstractRenderer)v4).getItemLabelFont((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = -70.30104F;
    Object v10 = 10.800889F;
    Object v11 = 0.0F;
    Object v12 = 0.0F;
    Object v13 = 14.748823F;
    Object v14 = 0.0F;
    Object v15 = new java.awt.geom.AffineTransform((((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()),(((java.lang.Float)v13).floatValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = false;
    Object v17 = false;
    Object v18 = new java.awt.font.FontRenderContext(((java.awt.geom.AffineTransform)v15),(((java.lang.Boolean)v16).booleanValue()),(((java.lang.Boolean)v17).booleanValue()));
    Object v19 = ((java.awt.Font)v8).getMaxCharBounds(((java.awt.font.FontRenderContext)v18));
    Object v20 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelFont((((java.lang.Integer)v3).intValue()),((java.awt.Font)v8),(((java.lang.Boolean)v20).booleanValue()));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 5;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemLabelFont((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getDataBoundsIncludesVisibleSeriesOnly();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = -48;
    Object v2 = 7;
    Object v3 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).getLegendItem((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesCreateEntities((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2));
    Object v3 = null;
    Object v4 = 0;
    Object v5 = false;
    Object v6 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesVisible((((java.lang.Integer)v4).intValue()),((java.lang.Boolean)v5),(((java.lang.Boolean)v6).booleanValue()));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 27;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = 1;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v2).lookupSeriesOutlineStroke((((java.lang.Integer)v3).intValue()));
    Object v5 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesOutlineStroke((((java.lang.Integer)v1).intValue()),((java.awt.Stroke)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelsVisible((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    Object v3 = 1;
    Object v4 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v5 = 0;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v4).lookupLegendShape((((java.lang.Integer)v5).intValue()));
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesShape((((java.lang.Integer)v3).intValue()),((java.awt.Shape)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    Object v3 = true;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 3;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getSeriesPaint((((java.lang.Integer)v1).intValue()));
    Object v3 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v4 = -18;
    Object v5 = 12;
    Object v6 = true;
    Object v7 = ((org.jfree.chart.renderer.AbstractRenderer)v3).getItemOutlinePaint((((java.lang.Integer)v4).intValue()),(((java.lang.Integer)v5).intValue()),(((java.lang.Boolean)v6).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2));
    Object v3 = null;
    Object v4 = 1;
    Object v5 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v6 = 0;
    Object v7 = 0;
    Object v8 = true;
    Object v9 = ((org.jfree.chart.renderer.AbstractRenderer)v5).getItemLabelPaint((((java.lang.Integer)v6).intValue()),(((java.lang.Integer)v7).intValue()),(((java.lang.Boolean)v8).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v4).intValue()),((java.awt.Paint)v9));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = true;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseCreateEntities((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    Object v4 = -17;
    Object v5 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesOutlinePaint((((java.lang.Integer)v4).intValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 16;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = 0;
    Object v4 = 33;
    Object v5 = false;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemFillPaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6));
    Object v7 = null;
    Object v8 = 0;
    Object v9 = -19;
    Object v10 = true;
    Object v11 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemCreateEntity((((java.lang.Integer)v8).intValue()),(((java.lang.Integer)v9).intValue()),(((java.lang.Boolean)v10).booleanValue()));
    org.junit.Assert.assertEquals((Object)(true), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = -19;
    Object v2 = "Series index out of bounds";
    Object v3 = java.text.NumberFormat.getInstance();
    Object v4 = new org.jfree.chart.labels.StandardCategoryItemLabelGenerator(((java.lang.String)v2),((java.text.NumberFormat)v3));
    Object v5 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesItemLabelGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryItemLabelGenerator)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = true;
    Object v2 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseSeriesVisible((((java.lang.Boolean)v1).booleanValue()),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 2.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v1).floatValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseLegendShape(((java.awt.Shape)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).clearSeriesPaints((((java.lang.Boolean)v1).booleanValue()));
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getBaseSeriesVisible();
    org.junit.Assert.assertEquals((Object)(true), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.labels.ItemLabelPosition();
    Object v3 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesNegativeItemLabelPosition((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.ItemLabelPosition)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    org.junit.Assert.assertNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 58;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupLegendTextFont((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).isSeriesVisible((((java.lang.Integer)v1).intValue()));
    Object v3 = 0.0F;
    Object v4 = 0.0F;
    Object v5 = 0.0F;
    Object v6 = java.awt.Color.getHSBColor((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseItemLabelPaint(((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = -27;
    Object v2 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setSeriesToolTipGenerator((((java.lang.Integer)v1).intValue()),((org.jfree.chart.labels.CategoryToolTipGenerator)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -1;
    Object v2 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesOutlinePaint((((java.lang.Integer)v1).intValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = -18;
    Object v4 = 12;
    Object v5 = true;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemOutlinePaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = -18;
    Object v4 = 12;
    Object v5 = true;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemOutlinePaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v10 = new org.jfree.chart.labels.StandardCategorySeriesLabelGenerator();
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v9).setLegendItemToolTipGenerator(((org.jfree.chart.labels.CategorySeriesLabelGenerator)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 2.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v1).floatValue()));
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBaseShape(((java.awt.Shape)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
    Object v5 = 0;
    Object v6 = true;
    Object v7 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesCreateEntities((((java.lang.Integer)v5).intValue()),((java.lang.Boolean)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = -18;
    Object v4 = 12;
    Object v5 = true;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemOutlinePaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v10 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v9).hashCode();
    org.junit.Assert.assertEquals((Object)(894294124), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v2 = -1;
    Object v3 = ((org.jfree.chart.renderer.AbstractRenderer)v1).lookupSeriesOutlinePaint((((java.lang.Integer)v2).intValue()));
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePaint(((java.awt.Paint)v3));
    Object v4 = null;
    Object v5 = -30;
    Object v6 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v5).intValue()),((java.lang.Boolean)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = -18;
    Object v4 = 12;
    Object v5 = true;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemOutlinePaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v10 = 21;
    Object v11 = -45;
    Object v12 = false;
    Object v13 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v9).getItemLabelGenerator((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = new org.jfree.chart.labels.StandardCategoryToolTipGenerator();
    Object v2 = false;
    ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).setBaseToolTipGenerator(((org.jfree.chart.labels.CategoryToolTipGenerator)v1),(((java.lang.Boolean)v2).booleanValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -47;
    Object v2 = 0;
    Object v3 = false;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemOutlinePaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = -18;
    Object v4 = 12;
    Object v5 = true;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemOutlinePaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v10 = -14;
    Object v11 = 42;
    Object v12 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v9).getLegendItem((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()));
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = -48;
    Object v2 = true;
    Object v3 = true;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelsVisible((((java.lang.Integer)v1).intValue()),((java.lang.Boolean)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = new org.jfree.chart.labels.ItemLabelPosition();
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setBasePositiveItemLabelPosition(((org.jfree.chart.labels.ItemLabelPosition)v1));
    Object v2 = null;
    Object v3 = -24;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).lookupSeriesFillPaint((((java.lang.Integer)v3).intValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.category.LineRenderer3D();
    Object v1 = 0;
    Object v2 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v3 = -18;
    Object v4 = 12;
    Object v5 = true;
    Object v6 = ((org.jfree.chart.renderer.AbstractRenderer)v2).getItemOutlinePaint((((java.lang.Integer)v3).intValue()),(((java.lang.Integer)v4).intValue()),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = false;
    ((org.jfree.chart.renderer.AbstractRenderer)v0).setSeriesItemLabelPaint((((java.lang.Integer)v1).intValue()),((java.awt.Paint)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v8 = null;
    Object v9 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v0).clone();
    Object v10 = -17;
    Object v11 = 6;
    Object v12 = true;
    Object v13 = ((org.jfree.chart.renderer.category.AbstractCategoryItemRenderer)v9).getToolTipGenerator((((java.lang.Integer)v10).intValue()),(((java.lang.Integer)v11).intValue()),(((java.lang.Boolean)v12).booleanValue()));
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.jfree.chart.renderer.WaferMapRenderer();
    Object v1 = 0;
    Object v2 = 23;
    Object v3 = true;
    Object v4 = ((org.jfree.chart.renderer.AbstractRenderer)v0).getItemOutlinePaint((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()),(((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }
}
