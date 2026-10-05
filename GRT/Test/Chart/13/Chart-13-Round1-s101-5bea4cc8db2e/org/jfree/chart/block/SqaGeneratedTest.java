package org.jfree.chart.block;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = ((org.jfree.chart.block.AbstractBlock)v1).getContentYOffset();
    Object v3 = null;
    Object v4 = -56.74364462340591D;
    Object v5 = 0.0D;
    Object v6 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.block.RectangleConstraint)v6).toUnconstrainedWidth();
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFR(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v3),((org.jfree.chart.block.RectangleConstraint)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = "Null 'stroke' argument.";
    Object v4 = "Null 'strVoke' argument.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = "Null 'font' argumaent.";
    ((org.jfree.chart.block.Block)v2).setID(((java.lang.String)v3));
    Object v4 = null;
    Object v5 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = 0.0D;
    Object v3 = 3.045665134604077D;
    Object v4 = new org.jfree.chart.util.Size2D((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = "Null 'stroke' argument.";
    Object v2 = "Null 'strVoke' argument.";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = -56.74364462340591D;
    Object v2 = 0.0D;
    Object v3 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.util.RectangleInsets();
    Object v2 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = 0.0D;
    Object v4 = 3.045665134604077D;
    Object v5 = new org.jfree.chart.util.Size2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v5));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = -56.74364462340591D;
    Object v3 = 0.0D;
    Object v4 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = null;
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).arrange(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v2),((org.jfree.chart.block.RectangleConstraint)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = ((org.jfree.chart.block.Block)v1).getBounds();
    Object v3 = 0.0D;
    Object v4 = 3.045665134604077D;
    Object v5 = new org.jfree.chart.util.Size2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = 0.0D;
    Object v2 = 3.045665134604077D;
    Object v3 = new org.jfree.chart.util.Size2D((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = null;
    Object v3 = -9.378246673829299D;
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFN(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = 0.0D;
    Object v3 = 3.045665134604077D;
    Object v4 = new org.jfree.chart.util.Size2D((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.util.RectangleInsets();
    Object v2 = 0.0F;
    Object v3 = 1.0F;
    Object v4 = 0.0F;
    Object v5 = java.awt.Color.getHSBColor((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = new org.jfree.chart.block.BlockBorder(((org.jfree.chart.util.RectangleInsets)v1),((java.awt.Paint)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v2).clear();
    Object v3 = null;
    Object v4 = 0.0D;
    Object v5 = 3.045665134604077D;
    Object v6 = new org.jfree.chart.util.Size2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v6));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.block.AbstractBlock)v1).setPadding(((org.jfree.chart.util.RectangleInsets)v2));
    Object v3 = null;
    Object v4 = null;
    Object v5 = 0.0D;
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFN(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v4),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v2));
    Object v4 = 0.0D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v6));
    Object v8 = 0.0D;
    Object v9 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = null;
    Object v11 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeRR(((org.jfree.chart.block.BlockContainer)v1),((org.jfree.data.Range)v5),((org.jfree.data.Range)v9),((java.awt.Graphics2D)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = 0.0F;
    Object v4 = 1.0F;
    Object v5 = 0.0F;
    Object v6 = java.awt.Color.getHSBColor((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.util.RectangleInsets();
    Object v3 = 0.0F;
    Object v4 = 1.0F;
    Object v5 = 0.0F;
    Object v6 = java.awt.Color.getHSBColor((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.jfree.chart.block.BlockBorder(((org.jfree.chart.util.RectangleInsets)v2),((java.awt.Paint)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v2));
    Object v4 = 0.0D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v2 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v1));
    org.junit.Assert.assertEquals((Object)(false), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.util.RectangleInsets();
    Object v3 = 0.0F;
    Object v4 = 1.0F;
    Object v5 = 0.0F;
    Object v6 = java.awt.Color.getHSBColor((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = new org.jfree.chart.block.BlockBorder(((org.jfree.chart.util.RectangleInsets)v2),((java.awt.Paint)v6));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = ((org.jfree.chart.block.Block)v2).getID();
    Object v4 = "Null 'stroke' argument.";
    Object v5 = "Null 'strVoke' argument.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    Object v7 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v8 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v6),((org.jfree.data.KeyedValues)v7));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = 0.0D;
    ((org.jfree.chart.block.AbstractBlock)v1).setWidth((((java.lang.Double)v2).doubleValue()));
    Object v3 = null;
    Object v4 = null;
    Object v5 = -56.74364462340591D;
    Object v6 = 0.0D;
    Object v7 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v0).arrange(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v4),((org.jfree.chart.block.RectangleConstraint)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = ((org.jfree.chart.block.Block)v2).getBounds();
    Object v4 = 0.0D;
    Object v5 = 3.045665134604077D;
    Object v6 = new org.jfree.chart.util.Size2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = "5";
    ((org.jfree.chart.block.AbstractBlock)v1).setID(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = java.util.TimeZone.getDefault();
    Object v5 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v4));
    Object v6 = 0.0D;
    Object v7 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v5),(((java.lang.Double)v6).doubleValue()));
    Object v8 = java.util.TimeZone.getDefault();
    Object v9 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v8));
    Object v10 = 0.0D;
    Object v11 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = null;
    Object v13 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeRR(((org.jfree.chart.block.BlockContainer)v1),((org.jfree.data.Range)v7),((org.jfree.data.Range)v11),((java.awt.Graphics2D)v12));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.util.RectangleInsets();
    Object v3 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.util.RectangleInsets();
    Object v3 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v2));
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v2).clear();
    Object v3 = null;
    Object v4 = new org.jfree.chart.util.RectangleInsets();
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v4));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = "Null 'stroke' argument.";
    Object v3 = "Null 'strVoke' argument.";
    Object v4 = new java.io.File(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v6 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v4),((org.jfree.data.KeyedValues)v5));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = ((org.jfree.chart.block.Block)v1).getID();
    Object v3 = new org.jfree.chart.util.RectangleInsets();
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v3));
    Object v4 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = "Null 'stroke' argument.";
    Object v3 = "Null 'strVoke' argument.";
    Object v4 = new java.io.File(((java.lang.String)v2),((java.lang.String)v3));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = -56.74364462340591D;
    Object v3 = 0.0D;
    Object v4 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v3));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = java.util.TimeZone.getDefault();
    Object v4 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v3));
    Object v5 = 0.0D;
    Object v6 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v4),(((java.lang.Double)v5).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = new org.jfree.chart.util.RectangleInsets();
    Object v4 = ((org.jfree.chart.block.BlockContainer)v2).equals(((java.lang.Object)v3));
    Object v5 = null;
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeNN(((org.jfree.chart.block.BlockContainer)v2),((java.awt.Graphics2D)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v2));
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v3 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v3).clear();
    Object v4 = null;
    Object v5 = java.util.TimeZone.getDefault();
    Object v6 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v5));
    Object v7 = 0.0D;
    Object v8 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v6),(((java.lang.Double)v7).doubleValue()));
    Object v9 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v8));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v1).clear();
    Object v2 = null;
    Object v3 = 0.0D;
    Object v4 = 3.045665134604077D;
    Object v5 = new org.jfree.chart.util.Size2D((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = "Null 'stroke' argument.";
    Object v2 = "Null 'strVoke' argument.";
    Object v3 = new java.io.File(((java.lang.String)v1),((java.lang.String)v2));
    Object v4 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v5 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v3),((org.jfree.data.KeyedValues)v4));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = -36.53507666112472D;
    Object v3 = 1.0D;
    Object v4 = 40.444220952702146D;
    Object v5 = 1.0D;
    ((org.jfree.chart.block.AbstractBlock)v1).setMargin((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v6 = null;
    Object v7 = null;
    Object v8 = -56.74364462340591D;
    Object v9 = 0.0D;
    Object v10 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.jfree.chart.block.BorderArrangement)v0).arrange(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v7),((org.jfree.chart.block.RectangleConstraint)v10));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v4));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = null;
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = java.util.TimeZone.getDefault();
    Object v7 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v6));
    Object v8 = 0.0D;
    Object v9 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = ((org.jfree.chart.block.RectangleConstraint)v5).toRangeHeight(((org.jfree.data.Range)v9));
    Object v11 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFR(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v2),((org.jfree.chart.block.RectangleConstraint)v5));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = null;
    Object v4 = -27.5538289248783D;
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFN(((org.jfree.chart.block.BlockContainer)v2),((java.awt.Graphics2D)v3),(((java.lang.Double)v4).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v1).clear();
    Object v2 = null;
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = "Null 'stroke' argument.";
    Object v4 = "Null 'strVoke' argument.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    Object v6 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v7 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v5),((org.jfree.data.KeyedValues)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v7));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = null;
    Object v3 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeNN(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v2));
    Object v4 = 0.0D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = null;
    Object v3 = 0.0D;
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFN(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v2),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = "Null 'stroke' argument.";
    Object v3 = "Null 'strVoke' argument.";
    Object v4 = new java.io.File(((java.lang.String)v2),((java.lang.String)v3));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = java.util.TimeZone.getDefault();
    Object v2 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v1));
    Object v3 = 0.0D;
    Object v4 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v2),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v3));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v3 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v2));
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = 0.0F;
    Object v3 = 1.0F;
    Object v4 = 0.0F;
    Object v5 = java.awt.Color.getHSBColor((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v3));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v4));
    Object v5 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = "Null 'st5roke' argument.";
    ((org.jfree.chart.block.Block)v1).setID(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = "Null 'stroke' argument.";
    Object v6 = "Null 'strVoke' argument.";
    Object v7 = new java.io.File(((java.lang.String)v5),((java.lang.String)v6));
    Object v8 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v9 = org.jfree.data.general.DatasetUtilities.createCategoryDataset(((java.lang.Comparable)v7),((org.jfree.data.KeyedValues)v8));
    Object v10 = ((org.jfree.chart.block.BorderArrangement)v4).equals(((java.lang.Object)v9));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v10));
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = new org.jfree.chart.block.BorderArrangement();
    Object v6 = new org.jfree.chart.block.BorderArrangement();
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v5).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v4).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v8));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = -56.74364462340591D;
    Object v3 = 0.0D;
    Object v4 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v4));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = new org.jfree.chart.util.RectangleInsets();
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v4));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = 0.0F;
    Object v3 = 1.0F;
    Object v4 = 0.0F;
    Object v5 = java.awt.Color.getHSBColor((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = ((org.jfree.chart.block.BlockContainer)v2).clone();
    Object v4 = null;
    Object v5 = -56.74364462340591D;
    Object v6 = 0.0D;
    Object v7 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v0).arrange(((org.jfree.chart.block.BlockContainer)v2),((java.awt.Graphics2D)v4),((org.jfree.chart.block.RectangleConstraint)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = null;
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.block.RectangleConstraint)v5).toUnconstrainedHeight();
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).arrange(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v2),((org.jfree.chart.block.RectangleConstraint)v5));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = "Null 'paint' argument.";
    ((org.jfree.chart.block.Block)v1).setID(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v4).equals(((java.lang.Object)v5));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v2).clear();
    Object v3 = null;
    Object v4 = -56.74364462340591D;
    Object v5 = 0.0D;
    Object v6 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v2));
    Object v4 = 0.0D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.data.Range)v5).hashCode();
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v7));
    Object v9 = 0.0D;
    Object v10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = null;
    Object v12 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeRR(((org.jfree.chart.block.BlockContainer)v1),((org.jfree.data.Range)v5),((org.jfree.data.Range)v10),((java.awt.Graphics2D)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v4));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v5));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v3).clear();
    Object v4 = null;
    Object v5 = -56.74364462340591D;
    Object v6 = 0.0D;
    Object v7 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v8));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v9));
    Object v10 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v2).clear();
    Object v3 = null;
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v4));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v1).clear();
    Object v2 = null;
    Object v3 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v3));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v2).clear();
    Object v3 = null;
    Object v4 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v4));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v1).clear();
    Object v2 = null;
    Object v3 = new org.jfree.chart.util.RectangleInsets();
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v3));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = ((org.jfree.chart.block.Block)v1).getID();
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v2));
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = null;
    Object v3 = -13.852063843833864D;
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFN(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v2),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v4));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v4).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v6));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = null;
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v1).arrangeNN(((org.jfree.chart.block.BlockContainer)v2),((java.awt.Graphics2D)v3));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = java.util.TimeZone.getDefault();
    Object v3 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v2));
    Object v4 = 0.0D;
    Object v5 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.data.Range)v5).toString();
    Object v7 = java.util.TimeZone.getDefault();
    Object v8 = new org.jfree.data.time.TimeTableXYDataset(((java.util.TimeZone)v7));
    Object v9 = 0.0D;
    Object v10 = org.jfree.data.general.DatasetUtilities.findStackedRangeBounds(((org.jfree.data.xy.TableXYDataset)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = null;
    Object v12 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeRR(((org.jfree.chart.block.BlockContainer)v1),((org.jfree.data.Range)v5),((org.jfree.data.Range)v10),((java.awt.Graphics2D)v11));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = ((org.jfree.chart.block.Block)v1).getBounds();
    Object v3 = "Null 'stroke' argument.";
    Object v4 = "Null 'strVoke' argument.";
    Object v5 = new java.io.File(((java.lang.String)v3),((java.lang.String)v4));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v5));
    Object v6 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = new org.jfree.chart.block.BorderArrangement();
    Object v6 = new org.jfree.chart.block.BorderArrangement();
    Object v7 = new org.jfree.chart.block.BorderArrangement();
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v6).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.block.BorderArrangement)v5).equals(((java.lang.Object)v8));
    Object v10 = ((org.jfree.chart.block.BorderArrangement)v4).equals(((java.lang.Object)v9));
    Object v11 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v10));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v2),((java.lang.Object)v11));
    Object v12 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v1).clear();
    Object v2 = null;
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v3));
    Object v5 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v3).clear();
    Object v4 = null;
    Object v5 = new org.jfree.data.general.DefaultKeyedValuesDataset();
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v7));
    Object v9 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = null;
    Object v4 = -56.74364462340591D;
    Object v5 = 0.0D;
    Object v6 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).arrangeFR(((org.jfree.chart.block.BlockContainer)v2),((java.awt.Graphics2D)v3),((org.jfree.chart.block.RectangleConstraint)v6));
      org.junit.Assert.fail("Expected java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = "D";
    ((org.jfree.chart.block.Block)v1).setID(((java.lang.String)v2));
    Object v3 = null;
    Object v4 = "Null 'stroke' argument.";
    Object v5 = "Null 'strVoke' argument.";
    Object v6 = new java.io.File(((java.lang.String)v4),((java.lang.String)v5));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v6));
    Object v7 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BorderArrangement();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = -56.74364462340591D;
    Object v4 = 0.0D;
    Object v5 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v1).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v0).equals(((java.lang.Object)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = ((org.jfree.chart.block.Block)v1).getID();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = new org.jfree.chart.block.BorderArrangement();
    Object v5 = new org.jfree.chart.block.BlockContainer();
    Object v6 = null;
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v4).arrangeNN(((org.jfree.chart.block.BlockContainer)v5),((java.awt.Graphics2D)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v7));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = ((org.jfree.chart.block.BlockContainer)v1).clone();
    Object v3 = null;
    Object v4 = -56.74364462340591D;
    Object v5 = 0.0D;
    Object v6 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).arrange(((org.jfree.chart.block.BlockContainer)v1),((java.awt.Graphics2D)v3),((org.jfree.chart.block.RectangleConstraint)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v3).clear();
    Object v4 = null;
    Object v5 = new org.jfree.chart.block.BorderArrangement();
    Object v6 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v5));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v6));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v7));
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    ((org.jfree.chart.block.BorderArrangement)v0).clear();
    Object v1 = null;
    Object v2 = new org.jfree.chart.block.BlockContainer();
    Object v3 = null;
    Object v4 = -56.74364462340591D;
    Object v5 = 0.0D;
    Object v6 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v0).arrange(((org.jfree.chart.block.BlockContainer)v2),((java.awt.Graphics2D)v3),((org.jfree.chart.block.RectangleConstraint)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    try {
    Object v0 = new org.jfree.chart.block.BorderArrangement();
    Object v1 = new org.jfree.chart.block.BlockContainer();
    Object v2 = new org.jfree.chart.block.BorderArrangement();
    Object v3 = new org.jfree.chart.block.BorderArrangement();
    Object v4 = -56.74364462340591D;
    Object v5 = 0.0D;
    Object v6 = new org.jfree.chart.block.RectangleConstraint((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.jfree.chart.block.BorderArrangement)v3).equals(((java.lang.Object)v6));
    Object v8 = ((org.jfree.chart.block.BorderArrangement)v2).equals(((java.lang.Object)v7));
    ((org.jfree.chart.block.BorderArrangement)v0).add(((org.jfree.chart.block.Block)v1),((java.lang.Object)v8));
    Object v9 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }
}
