package org.jfree.chart.util;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = new java.awt.geom.GeneralPath();
    Object v2 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v0),((java.awt.geom.GeneralPath)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = new java.awt.Polygon();
    Object v2 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v0));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = 25.276815F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createLineRegion(((java.awt.geom.Line2D)v0),(((java.lang.Float)v1).floatValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds();
    Object v2 = 0.0D;
    Object v3 = 24.130266F;
    Object v4 = -0.79740775F;
    Object v5 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds2D();
    Object v2 = 29.303278003280354D;
    Object v3 = 1.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v0));
    Object v2 = new java.awt.geom.GeneralPath();
    Object v3 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v1),((java.awt.Shape)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 0.0F;
    Object v2 = 7.203503F;
    Object v3 = 1.0F;
    Object v4 = 25.38843F;
    Object v5 = 0.0F;
    Object v6 = 0.0F;
    Object v7 = new java.awt.geom.AffineTransform((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 9.142643175441133D;
    Object v9 = ((java.awt.Shape)v0).getPathIterator(((java.awt.geom.AffineTransform)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = -31.844313210177802D;
    Object v11 = 0.0F;
    Object v12 = 1.0F;
    Object v13 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v10).doubleValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = -30.372815937179663D;
    Object v2 = 1.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 2.889243335686075D;
    Object v2 = 1.0F;
    Object v3 = -22.550997F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 5.3147656545988315D;
    Object v2 = 1.0D;
    Object v3 = ((java.awt.Shape)v0).contains((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -9.159944265373944D;
    Object v5 = -37.80853F;
    Object v6 = 1.0F;
    Object v7 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v4).doubleValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    Object v0 = 2.0F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0F;
    Object v2 = 7.203503F;
    Object v3 = 1.0F;
    Object v4 = 25.38843F;
    Object v5 = 0.0F;
    Object v6 = 0.0F;
    Object v7 = new java.awt.geom.AffineTransform((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 2.0D;
    Object v9 = ((java.awt.Shape)v0).getPathIterator(((java.awt.geom.AffineTransform)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 16.125730055625954D;
    Object v11 = -57.02517F;
    Object v12 = 1.0F;
    Object v13 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v10).doubleValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()));
    org.junit.Assert.assertNotNull(v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = new java.awt.geom.GeneralPath();
    Object v2 = ((java.awt.Shape)v1).getBounds2D();
    Object v3 = 29.303278003280354D;
    Object v4 = 1.0D;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v1),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v0),((java.awt.Shape)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 16.343834F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 2.889243335686075D;
    Object v2 = 1.0F;
    Object v3 = -22.550997F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 5.3147656545988315D;
    Object v2 = 1.0D;
    Object v3 = ((java.awt.Shape)v0).contains((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -9.159944265373944D;
    Object v5 = -37.80853F;
    Object v6 = 1.0F;
    Object v7 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v4).doubleValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new java.awt.Polygon();
    Object v9 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v7),((java.awt.Shape)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0F;
    Object v2 = 7.203503F;
    Object v3 = 1.0F;
    Object v4 = 25.38843F;
    Object v5 = 0.0F;
    Object v6 = 0.0F;
    Object v7 = new java.awt.geom.AffineTransform((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 2.0D;
    Object v9 = ((java.awt.Shape)v0).getPathIterator(((java.awt.geom.AffineTransform)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 16.125730055625954D;
    Object v11 = -57.02517F;
    Object v12 = 1.0F;
    Object v13 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v10).doubleValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = 0.0D;
    Object v15 = 25.694399076729283D;
    Object v16 = 3.256553986315251D;
    Object v17 = 0.0D;
    Object v18 = ((java.awt.Shape)v13).contains((((java.lang.Double)v14).doubleValue()),(((java.lang.Double)v15).doubleValue()),(((java.lang.Double)v16).doubleValue()),(((java.lang.Double)v17).doubleValue()));
    Object v19 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v13));
    org.junit.Assert.assertNotNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 1.0D;
    Object v2 = 0.0D;
    Object v3 = 52.31548550172087D;
    Object v4 = 0.0D;
    Object v5 = ((java.awt.Shape)v0).intersects((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.awt.geom.GeneralPath();
    Object v7 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v6));
    Object v8 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v0),((java.awt.Shape)v7));
    org.junit.Assert.assertEquals((Object)(true), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -10.137931847765278D;
    Object v5 = 0.0D;
    Object v6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 16.343834F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 7.624249160913587D;
    Object v4 = 2.0D;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.geom.Path2D.Float)v0).clone();
    Object v2 = new java.awt.geom.GeneralPath();
    Object v3 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v0),((java.awt.geom.GeneralPath)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    Object v0 = new java.awt.Polygon();
    ((java.awt.Polygon)v0).reset();
    Object v1 = null;
    Object v2 = new java.awt.Polygon();
    Object v3 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0F;
    Object v2 = 7.203503F;
    Object v3 = 1.0F;
    Object v4 = 25.38843F;
    Object v5 = 0.0F;
    Object v6 = 0.0F;
    Object v7 = new java.awt.geom.AffineTransform((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 2.0D;
    Object v9 = ((java.awt.Shape)v0).getPathIterator(((java.awt.geom.AffineTransform)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 16.125730055625954D;
    Object v11 = -57.02517F;
    Object v12 = 1.0F;
    Object v13 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v10).doubleValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = new java.awt.geom.GeneralPath();
    Object v15 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v13),((java.awt.Shape)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 12.617612568580084D;
    Object v2 = 0.0F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 1.0D;
    Object v2 = -1.5353321053997628D;
    Object v3 = 10.269977565863154D;
    Object v4 = 32.21177700449729D;
    Object v5 = ((java.awt.Polygon)v0).contains((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.awt.Polygon();
    Object v7 = 0.0F;
    Object v8 = 7.203503F;
    Object v9 = 1.0F;
    Object v10 = 25.38843F;
    Object v11 = 0.0F;
    Object v12 = 0.0F;
    Object v13 = new java.awt.geom.AffineTransform((((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()),(((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = 2.0D;
    Object v15 = ((java.awt.Polygon)v6).getPathIterator(((java.awt.geom.AffineTransform)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v6));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 1.0D;
    Object v2 = 89.707690401267D;
    Object v3 = 0.0D;
    Object v4 = -24.955796603603805D;
    Object v5 = ((java.awt.Shape)v0).contains((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v0));
    org.junit.Assert.assertNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds2D();
    Object v2 = 29.303278003280354D;
    Object v3 = 1.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 32.32403303908154D;
    Object v6 = 4.74159507329166D;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 15.718679244466104D;
    Object v2 = -14.899188F;
    Object v3 = 85.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds2D();
    Object v2 = 29.303278003280354D;
    Object v3 = 1.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 32.32403303908154D;
    Object v6 = 4.74159507329166D;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = 0.0D;
    Object v9 = -29.684626825177293D;
    Object v10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 0.0F;
    Object v2 = 7.203503F;
    Object v3 = 1.0F;
    Object v4 = 25.38843F;
    Object v5 = 0.0F;
    Object v6 = 0.0F;
    Object v7 = new java.awt.geom.AffineTransform((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = ((java.awt.Polygon)v0).getPathIterator(((java.awt.geom.AffineTransform)v7));
    Object v9 = new java.awt.Polygon();
    Object v10 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v9));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -10.137931847765278D;
    Object v5 = 0.0D;
    Object v6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new java.awt.geom.GeneralPath();
    Object v8 = 5.3147656545988315D;
    Object v9 = 1.0D;
    Object v10 = ((java.awt.Shape)v7).contains((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = -9.159944265373944D;
    Object v12 = -37.80853F;
    Object v13 = 1.0F;
    Object v14 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v7),(((java.lang.Double)v11).doubleValue()),(((java.lang.Float)v12).floatValue()),(((java.lang.Float)v13).floatValue()));
    Object v15 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v6),((java.awt.Shape)v14));
    org.junit.Assert.assertEquals((Object)(false), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 12.015054F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = 15.274527F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 7.514880124612269D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = new java.awt.Polygon();
    Object v2 = ((java.awt.Polygon)v1).getBounds2D();
    Object v3 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v1));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = -62.55446F;
    Object v1 = -27.405407F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 12.617612568580084D;
    Object v2 = 0.0F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = new java.awt.Polygon();
    Object v6 = 15.718679244466104D;
    Object v7 = -14.899188F;
    Object v8 = 85.0F;
    Object v9 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v4),((java.awt.Shape)v9));
    org.junit.Assert.assertEquals((Object)(false), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0D;
    Object v2 = -15.429255F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = 15.274527F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = new java.awt.geom.GeneralPath();
    Object v3 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v1),((java.awt.geom.GeneralPath)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0F;
    Object v2 = 7.203503F;
    Object v3 = 1.0F;
    Object v4 = 25.38843F;
    Object v5 = 0.0F;
    Object v6 = 0.0F;
    Object v7 = new java.awt.geom.AffineTransform((((java.lang.Float)v1).floatValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = 2.0D;
    Object v9 = ((java.awt.Shape)v0).getPathIterator(((java.awt.geom.AffineTransform)v7),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 16.125730055625954D;
    Object v11 = -57.02517F;
    Object v12 = 1.0F;
    Object v13 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v10).doubleValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = ((java.awt.Shape)v13).getBounds();
    Object v15 = new java.awt.geom.GeneralPath();
    Object v16 = 0.0D;
    Object v17 = -15.429255F;
    Object v18 = 0.0F;
    Object v19 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v15),(((java.lang.Double)v16).doubleValue()),(((java.lang.Float)v17).floatValue()),(((java.lang.Float)v18).floatValue()));
    Object v20 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v13),((java.awt.Shape)v19));
    org.junit.Assert.assertEquals((Object)(false), v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 14.368603183364085D;
    Object v2 = 1.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = 2.0F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v0).floatValue()));
    Object v2 = 0.0F;
    Object v3 = 12.015054F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v1),((java.awt.geom.GeneralPath)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 2.889243335686075D;
    Object v2 = 1.0F;
    Object v3 = -22.550997F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = new java.awt.Polygon();
    Object v6 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v4),((java.awt.Shape)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds2D();
    Object v2 = 29.303278003280354D;
    Object v3 = 1.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 32.32403303908154D;
    Object v6 = 4.74159507329166D;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = new java.awt.geom.GeneralPath();
    Object v9 = 5.3147656545988315D;
    Object v10 = 1.0D;
    Object v11 = ((java.awt.Shape)v8).contains((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = -9.159944265373944D;
    Object v13 = -37.80853F;
    Object v14 = 1.0F;
    Object v15 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v8),(((java.lang.Double)v12).doubleValue()),(((java.lang.Float)v13).floatValue()),(((java.lang.Float)v14).floatValue()));
    Object v16 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v7),((java.awt.Shape)v15));
    org.junit.Assert.assertEquals((Object)(false), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -10.137931847765278D;
    Object v5 = 0.0D;
    Object v6 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = new java.awt.geom.GeneralPath();
    Object v8 = 0.0D;
    Object v9 = 0.0D;
    Object v10 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v7),(((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = -10.137931847765278D;
    Object v12 = 0.0D;
    Object v13 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v10),(((java.lang.Double)v11).doubleValue()),(((java.lang.Double)v12).doubleValue()));
    Object v14 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v6),((java.awt.Shape)v13));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds2D();
    Object v2 = 29.303278003280354D;
    Object v3 = 1.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 32.86916031243747D;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = 2.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 0.0D;
    Object v2 = 15.842103381613796D;
    Object v3 = ((java.awt.Shape)v0).contains((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0F;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((((java.lang.Float)v4).floatValue()));
    Object v6 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v0),((java.awt.Shape)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = new java.awt.Polygon();
    Object v2 = 7.514880124612269D;
    Object v3 = 0.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v0),((java.awt.Shape)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 15.718679244466104D;
    Object v2 = -14.899188F;
    Object v3 = 85.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = 1.0D;
    Object v6 = -6.4596195F;
    Object v7 = 0.0F;
    Object v8 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 16.343834F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = -22.056989223905052D;
    Object v4 = -95.02338441741774D;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 16.343834F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 13.77840670025503D;
    Object v4 = 1.0D;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = new java.awt.geom.GeneralPath();
    Object v2 = 0.0F;
    Object v3 = 7.203503F;
    Object v4 = 1.0F;
    Object v5 = 25.38843F;
    Object v6 = 0.0F;
    Object v7 = 0.0F;
    Object v8 = new java.awt.geom.AffineTransform((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = ((java.awt.geom.Path2D.Float)v1).getPathIterator(((java.awt.geom.AffineTransform)v8));
    Object v10 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v0),((java.awt.geom.GeneralPath)v1));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = ((java.awt.Polygon)v0).getBounds2D();
    Object v2 = new java.awt.Polygon();
    Object v3 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v2));
    org.junit.Assert.assertEquals((Object)(true), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = 70.29545F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = 70.29545F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = 0.0D;
    Object v3 = 0.0F;
    Object v4 = 0.0F;
    Object v5 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = 29.54889F;
    Object v1 = 0.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = ((java.awt.Shape)v0).getBounds();
    Object v2 = new java.awt.geom.GeneralPath();
    Object v3 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v0),((java.awt.Shape)v2));
    org.junit.Assert.assertEquals((Object)(false), v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 75;
    Object v2 = 12;
    ((java.awt.Polygon)v0).translate((((java.lang.Integer)v1).intValue()),(((java.lang.Integer)v2).intValue()));
    Object v3 = null;
    Object v4 = new java.awt.Polygon();
    Object v5 = 1.0D;
    Object v6 = 0.0D;
    Object v7 = -44.317457438490734D;
    Object v8 = 52.58795423446167D;
    Object v9 = ((java.awt.Polygon)v4).contains((((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v4));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = -17.167598409835097D;
    Object v2 = 5.5269055F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = -18.653998836134452D;
    Object v2 = -2.4853642860684992D;
    Object v3 = 12.066034769210303D;
    Object v4 = 1.0D;
    Object v5 = ((java.awt.Polygon)v0).intersects((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.awt.Polygon();
    Object v7 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v6));
    org.junit.Assert.assertEquals((Object)(true), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = 2.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v2));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 15.718679244466104D;
    Object v2 = -14.899188F;
    Object v3 = 85.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = 15.274527F;
    Object v6 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v5).floatValue()));
    Object v7 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v4),((java.awt.Shape)v6));
    org.junit.Assert.assertEquals((Object)(false), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 15.718679244466104D;
    Object v2 = -14.899188F;
    Object v3 = 85.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = 0.0D;
    Object v6 = 0.0D;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = 29.54889F;
    Object v1 = 0.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 0.6042083087410922D;
    Object v4 = 10.257749169348546D;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = 0.0D;
    Object v3 = 16.057475082841204D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds2D();
    Object v2 = 29.303278003280354D;
    Object v3 = 1.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 32.32403303908154D;
    Object v6 = 4.74159507329166D;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v7));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = -62.55446F;
    Object v1 = -27.405407F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 29.54889F;
    Object v4 = 0.0F;
    Object v5 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    Object v6 = 1.0F;
    Object v7 = 0.0F;
    Object v8 = 45.096275F;
    Object v9 = -7.986903F;
    Object v10 = 16.469954F;
    Object v11 = -7.79969F;
    ((java.awt.geom.Path2D.Float)v5).curveTo((((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()),(((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()),(((java.lang.Float)v11).floatValue()));
    Object v12 = null;
    Object v13 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v2),((java.awt.geom.GeneralPath)v5));
    org.junit.Assert.assertEquals((Object)(false), v13);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 2.889243335686075D;
    Object v2 = 1.0F;
    Object v3 = -22.550997F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v4));
    Object v6 = 0.0F;
    Object v7 = 7.203503F;
    Object v8 = 1.0F;
    Object v9 = 25.38843F;
    Object v10 = 0.0F;
    Object v11 = 0.0F;
    Object v12 = new java.awt.geom.AffineTransform((((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()),(((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((java.awt.Shape)v5).getPathIterator(((java.awt.geom.AffineTransform)v12));
    Object v14 = 0.0D;
    Object v15 = 0.90771246F;
    Object v16 = 0.0F;
    Object v17 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v5),(((java.lang.Double)v14).doubleValue()),(((java.lang.Float)v15).floatValue()),(((java.lang.Float)v16).floatValue()));
    org.junit.Assert.assertNotNull(v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = new java.awt.Polygon();
    Object v2 = 0.0F;
    Object v3 = 7.203503F;
    Object v4 = 1.0F;
    Object v5 = 25.38843F;
    Object v6 = 0.0F;
    Object v7 = 0.0F;
    Object v8 = new java.awt.geom.AffineTransform((((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    Object v9 = ((java.awt.Polygon)v1).getPathIterator(((java.awt.geom.AffineTransform)v8));
    Object v10 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v1));
    org.junit.Assert.assertEquals((Object)(true), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = 0.0D;
    Object v3 = 16.057475082841204D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new java.awt.Polygon();
    Object v6 = 0.0F;
    Object v7 = 7.203503F;
    Object v8 = 1.0F;
    Object v9 = 25.38843F;
    Object v10 = 0.0F;
    Object v11 = 0.0F;
    Object v12 = new java.awt.geom.AffineTransform((((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()),(((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((java.awt.Shape)v5).getPathIterator(((java.awt.geom.AffineTransform)v12));
    Object v14 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v4),((java.awt.Shape)v5));
    org.junit.Assert.assertEquals((Object)(false), v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v0));
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = ((java.awt.Shape)v0).getBounds2D();
    Object v2 = 29.303278003280354D;
    Object v3 = 1.0D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 32.32403303908154D;
    Object v6 = 4.74159507329166D;
    Object v7 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v8 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v7));
    Object v9 = 0.0D;
    Object v10 = 0.0D;
    Object v11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    org.junit.Assert.assertNotNull(v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 7.514880124612269D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -44.82078495023558D;
    Object v5 = 0.0F;
    Object v6 = -36.334846F;
    Object v7 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 2.889243335686075D;
    Object v2 = 1.0F;
    Object v3 = -22.550997F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v4));
    Object v6 = 0.0F;
    Object v7 = 7.203503F;
    Object v8 = 1.0F;
    Object v9 = 25.38843F;
    Object v10 = 0.0F;
    Object v11 = 0.0F;
    Object v12 = new java.awt.geom.AffineTransform((((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()),(((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()),(((java.lang.Float)v11).floatValue()));
    Object v13 = ((java.awt.Shape)v5).getPathIterator(((java.awt.geom.AffineTransform)v12));
    Object v14 = 0.0D;
    Object v15 = 0.90771246F;
    Object v16 = 0.0F;
    Object v17 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v5),(((java.lang.Double)v14).doubleValue()),(((java.lang.Float)v15).floatValue()),(((java.lang.Float)v16).floatValue()));
    Object v18 = 0.0D;
    Object v19 = 3.4874810076362404D;
    Object v20 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v17),(((java.lang.Double)v18).doubleValue()),(((java.lang.Double)v19).doubleValue()));
    org.junit.Assert.assertNotNull(v20);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 2.889243335686075D;
    Object v2 = 1.0F;
    Object v3 = -22.550997F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v4));
    Object v6 = 16.602169636650828D;
    Object v7 = 0.0F;
    Object v8 = 1.0F;
    Object v9 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v5),(((java.lang.Double)v6).doubleValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    try {
    Object v0 = null;
    Object v1 = null;
    Object v2 = org.jfree.chart.util.ShapeUtilities.intersects(((java.awt.geom.Rectangle2D)v0),((java.awt.geom.Rectangle2D)v1));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDownTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = 0.0D;
    Object v3 = 16.057475082841204D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = 1.2782227F;
    Object v7 = 1.0F;
    Object v8 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v4),(((java.lang.Double)v5).doubleValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()));
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 7.514880124612269D;
    Object v2 = 0.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -44.82078495023558D;
    Object v5 = 0.0F;
    Object v6 = -36.334846F;
    Object v7 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    Object v8 = new java.awt.geom.GeneralPath();
    Object v9 = 14.368603183364085D;
    Object v10 = 1.0D;
    Object v11 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v8),(((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v7),((java.awt.Shape)v11));
    org.junit.Assert.assertEquals((Object)(false), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    Object v0 = 1.0F;
    Object v1 = 2.0F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 0.0F;
    Object v4 = 7.203503F;
    Object v5 = 1.0F;
    Object v6 = 25.38843F;
    Object v7 = 0.0F;
    Object v8 = 0.0F;
    Object v9 = new java.awt.geom.AffineTransform((((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()),(((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()));
    Object v10 = ((java.awt.Shape)v2).getPathIterator(((java.awt.geom.AffineTransform)v9));
    Object v11 = 1.0D;
    Object v12 = -62.26512F;
    Object v13 = -10.599864F;
    Object v14 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v2),(((java.lang.Double)v11).doubleValue()),(((java.lang.Float)v12).floatValue()),(((java.lang.Float)v13).floatValue()));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 16.343834F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 3.083081027729091D;
    Object v4 = 0.0F;
    Object v5 = 0.0F;
    Object v6 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = -30.787414766539634D;
    Object v2 = 1.0F;
    Object v3 = 1.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = 70.29545F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = new java.awt.geom.GeneralPath();
    Object v3 = ((java.awt.Shape)v2).getBounds2D();
    Object v4 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v1),((java.awt.Shape)v2));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 1.0D;
    Object v2 = -55.18147939824653D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = 15.274527F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 12.015054F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createDiagonalCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 1.0D;
    Object v4 = 0.0D;
    Object v5 = 2.0D;
    Object v6 = 0.0D;
    ((java.awt.geom.Path2D.Float)v2).quadTo((((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()),(((java.lang.Double)v6).doubleValue()));
    Object v7 = null;
    Object v8 = new java.awt.geom.GeneralPath();
    Object v9 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v2),((java.awt.geom.GeneralPath)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = 15.274527F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v0).floatValue()));
    Object v2 = 1.0D;
    Object v3 = -35.86662038766708D;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = 0.0F;
    Object v1 = 16.343834F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 3.083081027729091D;
    Object v4 = 0.0F;
    Object v5 = 0.0F;
    Object v6 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v2),(((java.lang.Double)v3).doubleValue()),(((java.lang.Float)v4).floatValue()),(((java.lang.Float)v5).floatValue()));
    Object v7 = 2.0F;
    Object v8 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v7).floatValue()));
    Object v9 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Shape)v6),((java.awt.Shape)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = 14.368603183364085D;
    Object v2 = 1.0D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = -6.104953865735233D;
    Object v5 = 31.725697F;
    Object v6 = 1.0F;
    Object v7 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = -62.55446F;
    Object v1 = -27.405407F;
    Object v2 = org.jfree.chart.util.ShapeUtilities.createRegularCross((((java.lang.Float)v0).floatValue()),(((java.lang.Float)v1).floatValue()));
    Object v3 = 70.29545F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.createUpTriangle((((java.lang.Float)v3).floatValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.geom.GeneralPath)v2),((java.awt.geom.GeneralPath)v4));
    org.junit.Assert.assertEquals((Object)(false), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = -39.18770562486598D;
    Object v2 = 1.0D;
    Object v3 = 40.226256235272814D;
    Object v4 = 9.081107201885828D;
    Object v5 = ((java.awt.Polygon)v0).intersects((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()),(((java.lang.Double)v4).doubleValue()));
    Object v6 = new java.awt.Polygon();
    Object v7 = 0.0F;
    Object v8 = 7.203503F;
    Object v9 = 1.0F;
    Object v10 = 25.38843F;
    Object v11 = 0.0F;
    Object v12 = 0.0F;
    Object v13 = new java.awt.geom.AffineTransform((((java.lang.Float)v7).floatValue()),(((java.lang.Float)v8).floatValue()),(((java.lang.Float)v9).floatValue()),(((java.lang.Float)v10).floatValue()),(((java.lang.Float)v11).floatValue()),(((java.lang.Float)v12).floatValue()));
    Object v14 = 1.0D;
    Object v15 = ((java.awt.Polygon)v6).getPathIterator(((java.awt.geom.AffineTransform)v13),(((java.lang.Double)v14).doubleValue()));
    Object v16 = org.jfree.chart.util.ShapeUtilities.equal(((java.awt.Polygon)v0),((java.awt.Polygon)v6));
    org.junit.Assert.assertEquals((Object)(true), v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 12.617612568580084D;
    Object v2 = 0.0F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    Object v5 = org.jfree.chart.util.ShapeUtilities.clone(((java.awt.Shape)v4));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new java.awt.geom.GeneralPath();
    Object v1 = -31.475325013226183D;
    Object v2 = 1.0F;
    Object v3 = 0.0F;
    Object v4 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Float)v2).floatValue()),(((java.lang.Float)v3).floatValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    Object v0 = -13.008384F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v0).floatValue()));
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = -13.008384F;
    Object v1 = org.jfree.chart.util.ShapeUtilities.createDiamond((((java.lang.Float)v0).floatValue()));
    Object v2 = -4.8888417838486715D;
    Object v3 = 0.0F;
    Object v4 = 1.0F;
    Object v5 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v1),(((java.lang.Double)v2).doubleValue()),(((java.lang.Float)v3).floatValue()),(((java.lang.Float)v4).floatValue()));
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new java.awt.Polygon();
    Object v1 = 1.0D;
    Object v2 = -55.18147939824653D;
    Object v3 = org.jfree.chart.util.ShapeUtilities.createTranslatedShape(((java.awt.Shape)v0),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 7.0D;
    Object v5 = -12.609266F;
    Object v6 = 0.0F;
    Object v7 = org.jfree.chart.util.ShapeUtilities.rotateShape(((java.awt.Shape)v3),(((java.lang.Double)v4).doubleValue()),(((java.lang.Float)v5).floatValue()),(((java.lang.Float)v6).floatValue()));
    org.junit.Assert.assertNotNull(v7);
  }
}
