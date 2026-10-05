package org.jfree.chart.plot;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v3 = "]";
    Object v4 = 47;
    Object v5 = java.awt.Color.getColor(((java.lang.String)v3),(((java.lang.Integer)v4).intValue()));
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v5));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v3));
    ((org.jfree.chart.plot.Marker)v1).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelTextAnchor();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.util.RectangleInsets)v6).toString();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelFont();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = "]";
    Object v3 = 47;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v2).floatValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v3 = 3L;
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v2),((java.lang.Comparable)v5));
    Object v7 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v6));
    ((org.jfree.chart.plot.Marker)v1).removeChangeListener(((org.jfree.chart.event.MarkerChangeListener)v7));
    Object v8 = null;
    Object v9 = 26.678586811820857D;
    Object v10 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.chart.plot.Marker)v10).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v1).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelOffsetType();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelFont();
    Object v5 = 1;
    Object v6 = ((java.awt.Font)v4).canDisplay((((java.lang.Integer)v5).intValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelFont(((java.awt.Font)v4));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = "]";
    Object v3 = 47;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.plot.Marker)v1).setOutlinePaint(((java.awt.Paint)v4));
    Object v5 = null;
    Object v6 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v7 = new java.io.ByteArrayInputStream(((byte[])v6));
    Object v8 = ((org.jfree.chart.plot.ValueMarker)v1).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = "]";
    Object v3 = 47;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelPaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelOffsetType();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = "]";
    Object v3 = 47;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    ((org.jfree.chart.plot.Marker)v1).setOutlinePaint(((java.awt.Paint)v4));
    Object v5 = null;
    Object v6 = "]";
    Object v7 = 47;
    Object v8 = java.awt.Color.getColor(((java.lang.String)v6),(((java.lang.Integer)v7).intValue()));
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelAnchor();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getPaint();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 3L;
    Object v3 = 0L;
    Object v4 = java.time.Instant.ofEpochSecond((((java.lang.Long)v2).longValue()),(((java.lang.Long)v3).longValue()));
    Object v5 = ((org.jfree.chart.plot.ValueMarker)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getAlpha();
    org.junit.Assert.assertEquals((Object)(0.8F), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v2).floatValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getStroke();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getPaint();
    ((org.jfree.chart.plot.Marker)v1).setLabelPaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelAnchor();
    ((org.jfree.chart.plot.Marker)v1).setLabelAnchor(((org.jfree.chart.util.RectangleAnchor)v4));
    Object v5 = null;
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.plot.Marker)v7).getLabelFont();
    ((org.jfree.chart.plot.Marker)v1).setLabelFont(((java.awt.Font)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = new byte[]{Byte.valueOf((byte)0),Byte.valueOf((byte)0),Byte.valueOf((byte)0)};
    Object v3 = new java.io.ByteArrayInputStream(((byte[])v2));
    Object v4 = ((org.jfree.chart.plot.ValueMarker)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelOffset();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getPaint();
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelFont();
    ((org.jfree.chart.plot.Marker)v1).setLabelFont(((java.awt.Font)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v1).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getPaint();
    Object v5 = ((java.awt.Transparency)v4).getTransparency();
    ((org.jfree.chart.plot.Marker)v1).setLabelPaint(((java.awt.Paint)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v3));
    Object v5 = ((org.jfree.chart.plot.Marker)v1).equals(((java.lang.Object)v4));
    Object v6 = 72.48014658350743D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.plot.Marker)v7).getLabelOffsetType();
    Object v9 = ((org.jfree.chart.util.LengthAdjustmentType)v8).hashCode();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffsetType(((org.jfree.chart.util.LengthAdjustmentType)v8));
    Object v10 = null;
    org.junit.Assert.assertNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v3));
    ((org.jfree.chart.plot.Marker)v1).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v4));
    Object v5 = null;
    Object v6 = ((org.jfree.chart.plot.Marker)v1).getStroke();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelAnchor();
    ((org.jfree.chart.plot.Marker)v1).setLabelAnchor(((org.jfree.chart.util.RectangleAnchor)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v2).floatValue()));
    Object v3 = null;
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    ((org.jfree.chart.plot.Marker)v1).setStroke(((java.awt.Stroke)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getStroke();
    ((org.jfree.chart.plot.Marker)v1).setOutlineStroke(((java.awt.Stroke)v4));
    Object v5 = null;
    Object v6 = ((org.jfree.chart.plot.Marker)v1).getLabel();
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelFont();
    Object v5 = 1.0D;
    Object v6 = 34.702688442870084D;
    Object v7 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = false;
    Object v9 = false;
    Object v10 = new java.awt.font.FontRenderContext(((java.awt.geom.AffineTransform)v7),(((java.lang.Boolean)v8).booleanValue()),(((java.lang.Boolean)v9).booleanValue()));
    Object v11 = new char[]{Character.valueOf((char)1),Character.valueOf((char)0)};
    Object v12 = ((java.awt.Font)v4).createGlyphVector(((java.awt.font.FontRenderContext)v10),((char[])v11));
    ((org.jfree.chart.plot.Marker)v1).setLabelFont(((java.awt.Font)v4));
    Object v13 = null;
    org.junit.Assert.assertNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getStroke();
    ((org.jfree.chart.plot.Marker)v1).setOutlineStroke(((java.awt.Stroke)v4));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = 2.0D;
    Object v9 = 22.08442666421565D;
    Object v10 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.chart.plot.ValueMarker)v1).equals(((java.lang.Object)v10));
    org.junit.Assert.assertEquals((Object)(false), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 19.312487980967923D;
    ((org.jfree.chart.plot.ValueMarker)v1).setValue((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 1;
    Object v8 = 1;
    Object v9 = new java.awt.Rectangle((((java.lang.Integer)v7).intValue()),(((java.lang.Integer)v8).intValue()));
    Object v10 = 26.678586811820857D;
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.jfree.chart.plot.Marker)v11).getLabelOffsetType();
    Object v13 = 72.48014658350743D;
    Object v14 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.jfree.chart.plot.Marker)v14).getLabelOffsetType();
    Object v16 = ((org.jfree.chart.util.RectangleInsets)v6).createAdjustedRectangle(((java.awt.geom.Rectangle2D)v9),((org.jfree.chart.util.LengthAdjustmentType)v12),((org.jfree.chart.util.LengthAdjustmentType)v15));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v17 = null;
    org.junit.Assert.assertNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 27.16301F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v2).floatValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v3));
    ((org.jfree.chart.plot.Marker)v1).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelPaint();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v3 = 3L;
    Object v4 = 0L;
    Object v5 = java.time.Instant.ofEpochSecond((((java.lang.Long)v3).longValue()),(((java.lang.Long)v4).longValue()));
    Object v6 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v2),((java.lang.Comparable)v5));
    Object v7 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v6));
    ((org.jfree.chart.plot.Marker)v1).removeChangeListener(((org.jfree.chart.event.MarkerChangeListener)v7));
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = "]";
    Object v3 = 47;
    Object v4 = java.awt.Color.getColor(((java.lang.String)v2),(((java.lang.Integer)v3).intValue()));
    Object v5 = ((java.awt.Transparency)v4).getTransparency();
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabelTextAnchor();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ">";
    ((org.jfree.chart.plot.Marker)v1).setLabel(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getPaint();
    Object v4 = ((java.awt.Transparency)v3).getTransparency();
    Object v5 = 72.48014658350743D;
    Object v6 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.plot.Marker)v6).getStroke();
    Object v8 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelPaint();
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getStroke();
    Object v5 = 1;
    Object v6 = 1;
    Object v7 = new java.awt.Rectangle((((java.lang.Integer)v5).intValue()),(((java.lang.Integer)v6).intValue()));
    Object v8 = ((java.awt.Stroke)v4).createStrokedShape(((java.awt.Shape)v7));
    ((org.jfree.chart.plot.Marker)v1).setStroke(((java.awt.Stroke)v4));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = -19.741028138784312D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getPaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = 72.48014658350743D;
    Object v12 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.jfree.chart.plot.Marker)v12).getPaint();
    Object v14 = ((java.awt.Transparency)v13).getTransparency();
    Object v15 = 72.48014658350743D;
    Object v16 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v15).doubleValue()));
    Object v17 = ((org.jfree.chart.plot.Marker)v16).getStroke();
    Object v18 = 0.0F;
    Object v19 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10),((java.awt.Paint)v13),((java.awt.Stroke)v17),(((java.lang.Float)v18).floatValue()));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelOffset();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v4));
    Object v5 = null;
    Object v6 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v7 = 3L;
    Object v8 = 0L;
    Object v9 = java.time.Instant.ofEpochSecond((((java.lang.Long)v7).longValue()),(((java.lang.Long)v8).longValue()));
    Object v10 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v6),((java.lang.Comparable)v9));
    Object v11 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v10));
    ((org.jfree.chart.plot.Marker)v1).addChangeListener(((org.jfree.chart.event.MarkerChangeListener)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelOffset();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v9 = 3L;
    Object v10 = 0L;
    Object v11 = java.time.Instant.ofEpochSecond((((java.lang.Long)v9).longValue()),(((java.lang.Long)v10).longValue()));
    Object v12 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v8),((java.lang.Comparable)v11));
    Object v13 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v12));
    ((org.jfree.chart.plot.Marker)v1).addChangeListener(((org.jfree.chart.event.MarkerChangeListener)v13));
    Object v14 = null;
    org.junit.Assert.assertNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v1).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v4));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = 2.0D;
    Object v9 = 22.08442666421565D;
    Object v10 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 1;
    Object v12 = 1;
    Object v13 = new java.awt.Rectangle((((java.lang.Integer)v11).intValue()),(((java.lang.Integer)v12).intValue()));
    Object v14 = 26.678586811820857D;
    Object v15 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.jfree.chart.plot.Marker)v15).getLabelOffsetType();
    Object v17 = 26.678586811820857D;
    Object v18 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.jfree.chart.plot.Marker)v18).getLabelOffsetType();
    Object v20 = ((org.jfree.chart.util.RectangleInsets)v10).createAdjustedRectangle(((java.awt.geom.Rectangle2D)v13),((org.jfree.chart.util.LengthAdjustmentType)v16),((org.jfree.chart.util.LengthAdjustmentType)v19));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v10));
    Object v21 = null;
    org.junit.Assert.assertNull(v21);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getOutlinePaint();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getStroke();
    ((org.jfree.chart.plot.Marker)v1).setStroke(((java.awt.Stroke)v4));
    Object v5 = null;
    Object v6 = 72.48014658350743D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.plot.Marker)v7).getPaint();
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelOffset();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v4));
    Object v5 = null;
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.plot.Marker)v7).getLabelOffsetType();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffsetType(((org.jfree.chart.util.LengthAdjustmentType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    try {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = -2.7488682F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v2).floatValue()));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getOutlinePaint();
    ((org.jfree.chart.plot.Marker)v1).setOutlinePaint(((java.awt.Paint)v4));
    Object v5 = null;
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = 2.0D;
    Object v9 = 22.08442666421565D;
    Object v10 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v10));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelPaint();
    ((org.jfree.chart.plot.Marker)v1).setLabelPaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0D;
    Object v3 = 34.702688442870084D;
    Object v4 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.plot.ValueMarker)v1).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 1.0F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v2).floatValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelOffsetType();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffsetType(((org.jfree.chart.util.LengthAdjustmentType)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = "The 'data' isnull.";
    ((org.jfree.chart.plot.Marker)v1).setLabel(((java.lang.String)v2));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10));
    Object v12 = 72.48014658350743D;
    Object v13 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.jfree.chart.plot.Marker)v13).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v11).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v14));
    Object v15 = null;
    Object v16 = 72.48014658350743D;
    Object v17 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.jfree.chart.plot.Marker)v17).getLabelPaint();
    Object v19 = ((java.awt.Transparency)v18).getTransparency();
    ((org.jfree.chart.plot.Marker)v11).setPaint(((java.awt.Paint)v18));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v2).floatValue()));
    Object v3 = null;
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.plot.Marker)v5).getPaint();
    ((org.jfree.chart.plot.Marker)v1).setLabelPaint(((java.awt.Paint)v6));
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v3));
    ((org.jfree.chart.plot.Marker)v1).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v4));
    Object v5 = null;
    Object v6 = 72.48014658350743D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.plot.Marker)v7).getOutlinePaint();
    ((org.jfree.chart.plot.Marker)v1).setLabelPaint(((java.awt.Paint)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10));
    Object v12 = ((org.jfree.chart.plot.Marker)v11).getLabelAnchor();
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = 26.678586811820857D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v5));
    ((org.jfree.chart.plot.Marker)v3).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v3).getStroke();
    ((org.jfree.chart.plot.Marker)v1).setStroke(((java.awt.Stroke)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 26.678586811820857D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelFont();
    Object v5 = 0.0D;
    Object v6 = 1.0D;
    Object v7 = 2.0D;
    Object v8 = 22.08442666421565D;
    Object v9 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((java.awt.Font)v4).equals(((java.lang.Object)v9));
    ((org.jfree.chart.plot.Marker)v1).setLabelFont(((java.awt.Font)v4));
    Object v11 = null;
    org.junit.Assert.assertNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelAnchor();
    Object v5 = ((org.jfree.chart.util.RectangleAnchor)v4).hashCode();
    ((org.jfree.chart.plot.Marker)v1).setLabelAnchor(((org.jfree.chart.util.RectangleAnchor)v4));
    Object v6 = null;
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelTextAnchor();
    Object v5 = ((org.jfree.chart.plot.Marker)v1).equals(((java.lang.Object)v4));
    Object v6 = 72.48014658350743D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.plot.Marker)v7).getLabelOffsetType();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffsetType(((org.jfree.chart.util.LengthAdjustmentType)v8));
    Object v9 = null;
    org.junit.Assert.assertNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v3 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v4 = ((org.jfree.chart.plot.ValueMarker)v1).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getOutlineStroke();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v1).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = 26.678586811820857D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelPaint();
    ((org.jfree.chart.plot.Marker)v1).setPaint(((java.awt.Paint)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v1).clone();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v9 = 72.48014658350743D;
    Object v10 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.chart.plot.Marker)v10).getLabelOffset();
    Object v12 = ((org.jfree.chart.plot.ValueMarker)v8).equals(((java.lang.Object)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.ValueMarker)v1).getValue();
    org.junit.Assert.assertEquals((Object)(72.48014658350743D), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v9 = 72.48014658350743D;
    Object v10 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.chart.plot.Marker)v10).getOutlinePaint();
    ((org.jfree.chart.plot.Marker)v8).setLabelPaint(((java.awt.Paint)v11));
    Object v12 = null;
    Object v13 = 26.678586811820857D;
    Object v14 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.jfree.chart.plot.Marker)v14).getLabelOffsetType();
    ((org.jfree.chart.plot.Marker)v8).setLabelOffsetType(((org.jfree.chart.util.LengthAdjustmentType)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v9 = new org.jfree.data.statistics.DefaultStatisticalCategoryDataset();
    Object v10 = 3L;
    Object v11 = 0L;
    Object v12 = java.time.Instant.ofEpochSecond((((java.lang.Long)v10).longValue()),(((java.lang.Long)v11).longValue()));
    Object v13 = org.jfree.data.general.DatasetUtilities.createPieDatasetForColumn(((org.jfree.data.category.CategoryDataset)v9),((java.lang.Comparable)v12));
    Object v14 = new org.jfree.chart.plot.PiePlot(((org.jfree.data.general.PieDataset)v13));
    ((org.jfree.chart.plot.Marker)v8).addChangeListener(((org.jfree.chart.event.MarkerChangeListener)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v9 = 72.48014658350743D;
    Object v10 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.chart.plot.Marker)v10).getLabelAnchor();
    ((org.jfree.chart.plot.Marker)v8).setLabelAnchor(((org.jfree.chart.util.RectangleAnchor)v11));
    Object v12 = null;
    Object v13 = 26.678586811820857D;
    Object v14 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.jfree.chart.plot.Marker)v14).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v8).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v15));
    Object v16 = null;
    org.junit.Assert.assertNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    try {
    Object v0 = 10.893030374080823D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = 72.48014658350743D;
    Object v12 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.jfree.chart.plot.Marker)v12).getPaint();
    Object v14 = 72.48014658350743D;
    Object v15 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v14).doubleValue()));
    Object v16 = ((org.jfree.chart.plot.Marker)v15).getOutlineStroke();
    Object v17 = 2.061612F;
    Object v18 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10),((java.awt.Paint)v13),((java.awt.Stroke)v16),(((java.lang.Float)v17).floatValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.plot.Marker)v5).getOutlineStroke();
    Object v7 = 72.48014658350743D;
    Object v8 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.jfree.chart.plot.Marker)v8).getLabelPaint();
    Object v10 = 72.48014658350743D;
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.jfree.chart.plot.Marker)v11).getOutlineStroke();
    Object v13 = 1;
    Object v14 = 1;
    Object v15 = new java.awt.Rectangle((((java.lang.Integer)v13).intValue()),(((java.lang.Integer)v14).intValue()));
    Object v16 = ((java.awt.Stroke)v12).createStrokedShape(((java.awt.Shape)v15));
    Object v17 = 31.37445F;
    Object v18 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v6),((java.awt.Paint)v9),((java.awt.Stroke)v12),(((java.lang.Float)v17).floatValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getOutlineStroke();
    ((org.jfree.chart.plot.Marker)v1).setStroke(((java.awt.Stroke)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10));
    Object v12 = 72.48014658350743D;
    Object v13 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.jfree.chart.plot.Marker)v13).getOutlineStroke();
    ((org.jfree.chart.plot.Marker)v11).setStroke(((java.awt.Stroke)v14));
    Object v15 = null;
    org.junit.Assert.assertNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v3 = -29.907404F;
    ((org.jfree.chart.plot.Marker)v1).setAlpha((((java.lang.Float)v3).floatValue()));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10));
    Object v12 = 0.0D;
    Object v13 = 1.0D;
    Object v14 = 2.0D;
    Object v15 = 22.08442666421565D;
    Object v16 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()),(((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()));
    Object v17 = 1;
    Object v18 = 1;
    Object v19 = new java.awt.Rectangle((((java.lang.Integer)v17).intValue()),(((java.lang.Integer)v18).intValue()));
    Object v20 = false;
    Object v21 = false;
    Object v22 = ((org.jfree.chart.util.RectangleInsets)v16).createInsetRectangle(((java.awt.geom.Rectangle2D)v19),(((java.lang.Boolean)v20).booleanValue()),(((java.lang.Boolean)v21).booleanValue()));
    ((org.jfree.chart.plot.Marker)v11).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v16));
    Object v23 = null;
    org.junit.Assert.assertNull(v23);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10));
    Object v12 = 26.678586811820857D;
    Object v13 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v12).doubleValue()));
    Object v14 = ((org.jfree.chart.plot.Marker)v13).getLabelFont();
    ((org.jfree.chart.plot.Marker)v11).setLabelFont(((java.awt.Font)v14));
    Object v15 = null;
    Object v16 = 72.48014658350743D;
    Object v17 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v16).doubleValue()));
    Object v18 = ((org.jfree.chart.plot.Marker)v17).getLabelTextAnchor();
    Object v19 = 72.48014658350743D;
    Object v20 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v19).doubleValue()));
    Object v21 = ((org.jfree.chart.text.TextAnchor)v18).equals(((java.lang.Object)v20));
    ((org.jfree.chart.plot.Marker)v11).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v18));
    Object v22 = null;
    org.junit.Assert.assertNull(v22);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = ((org.jfree.chart.plot.Marker)v1).getLabel();
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v1).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v4));
    Object v5 = null;
    Object v6 = 1.0D;
    Object v7 = 34.702688442870084D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.jfree.chart.plot.ValueMarker)v1).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v9 = 26.678586811820857D;
    Object v10 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v9).doubleValue()));
    Object v11 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v10));
    ((org.jfree.chart.plot.Marker)v8).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v11));
    Object v12 = null;
    org.junit.Assert.assertNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = 2.0D;
    Object v5 = 22.08442666421565D;
    Object v6 = new org.jfree.chart.util.RectangleInsets((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.plot.Marker)v1).setLabelOffset(((org.jfree.chart.util.RectangleInsets)v6));
    Object v7 = null;
    Object v8 = ((org.jfree.chart.plot.Marker)v1).clone();
    Object v9 = 72.48014658350743D;
    Object v10 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.chart.plot.Marker)v10).getLabelTextAnchor();
    ((org.jfree.chart.plot.Marker)v8).setLabelTextAnchor(((org.jfree.chart.text.TextAnchor)v11));
    Object v12 = null;
    Object v13 = 26.678586811820857D;
    Object v14 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.jfree.chart.plot.Marker)v14).getLabelOffsetType();
    Object v16 = 35.44159949019356D;
    Object v17 = -39.88176782331868D;
    Object v18 = new org.jfree.chart.util.Size2D((((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = ((org.jfree.chart.util.LengthAdjustmentType)v15).equals(((java.lang.Object)v18));
    ((org.jfree.chart.plot.Marker)v8).setLabelOffsetType(((org.jfree.chart.util.LengthAdjustmentType)v15));
    Object v20 = null;
    org.junit.Assert.assertNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 72.48014658350743D;
    Object v2 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.jfree.chart.plot.Marker)v2).getOutlinePaint();
    Object v4 = 72.48014658350743D;
    Object v5 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v4).doubleValue()));
    Object v6 = 26.678586811820857D;
    Object v7 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v6).doubleValue()));
    Object v8 = new org.jfree.chart.event.MarkerChangeEvent(((org.jfree.chart.plot.Marker)v7));
    ((org.jfree.chart.plot.Marker)v5).notifyListeners(((org.jfree.chart.event.MarkerChangeEvent)v8));
    Object v9 = null;
    Object v10 = ((org.jfree.chart.plot.Marker)v5).getStroke();
    Object v11 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()),((java.awt.Paint)v3),((java.awt.Stroke)v10));
    Object v12 = -22.104088F;
    ((org.jfree.chart.plot.Marker)v11).setAlpha((((java.lang.Float)v12).floatValue()));
    Object v13 = null;
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getStroke();
    ((org.jfree.chart.plot.Marker)v1).setStroke(((java.awt.Stroke)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 48.9871314960554D;
    ((org.jfree.chart.plot.ValueMarker)v1).setValue((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    org.junit.Assert.assertNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getLabelOffsetType();
    ((org.jfree.chart.plot.Marker)v1).setLabelOffsetType(((org.jfree.chart.util.LengthAdjustmentType)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = 72.48014658350743D;
    Object v1 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v0).doubleValue()));
    Object v2 = 72.48014658350743D;
    Object v3 = new org.jfree.chart.plot.ValueMarker((((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.plot.Marker)v3).getOutlineStroke();
    ((org.jfree.chart.plot.Marker)v1).setOutlineStroke(((java.awt.Stroke)v4));
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }
}
