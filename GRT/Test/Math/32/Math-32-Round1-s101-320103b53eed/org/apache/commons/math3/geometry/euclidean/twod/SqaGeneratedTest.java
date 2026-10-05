package org.apache.commons.math3.geometry.euclidean.twod;
public class SqaGeneratedTest {
  @org.junit.Test(timeout = 4000)
  public void test0() throws Throwable {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = false;
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).getTree((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test1() throws Throwable {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = true;
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).getTree((((java.lang.Boolean)v3).booleanValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test2() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).getBarycenter();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test3() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = new org.apache.commons.math3.analysis.function.Logit();
    Object v4 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test4() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = new org.apache.commons.math3.analysis.function.Logit();
    Object v4 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v3));
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.BSPTree)v4).getCell(((org.apache.commons.math3.geometry.Vector)v6));
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v4));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test5() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v2).computeGeometricalProperties();
    Object v3 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test6() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v3).doubleValue()));
    Object v5 = true;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6).wholeSpace();
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test7() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v3).doubleValue()));
    Object v5 = true;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v4),(((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test8() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test9() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test10() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v7).getVertices();
    org.junit.Assert.assertNotNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test11() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).computeGeometricalProperties();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test12() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getSize();
    org.junit.Assert.assertEquals((Object)(207.12367294937144D), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test13() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v5).doubleValue()));
    Object v7 = true;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test14() throws Throwable {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test15() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).getTree((((java.lang.Boolean)v8).booleanValue()));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test16() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).getBoundarySize();
    Object v9 = false;
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).getTree((((java.lang.Boolean)v9).booleanValue()));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test17() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = true;
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getTree((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test18() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).getBarycenter();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test19() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).getSize();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test20() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = new org.apache.commons.math3.analysis.function.Logit();
    Object v9 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v9));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test21() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v7).computeGeometricalProperties();
    Object v8 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test22() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).copySelf();
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v7).getVertices();
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test23() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).isEmpty();
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 0.0D;
    Object v10 = 1.0D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v9).doubleValue()),(((java.lang.Double)v10).doubleValue()));
    Object v12 = 0.0D;
    Object v13 = 1.0D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v12).doubleValue()),(((java.lang.Double)v13).doubleValue()));
    Object v15 = 15.945578771398713D;
    Object v16 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v14),(((java.lang.Double)v15).doubleValue()));
    Object v17 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v11),((org.apache.commons.math3.geometry.euclidean.twod.Line)v16));
    Object v18 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v17));
    Object v19 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).intersection(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v18));
    org.junit.Assert.assertNull(v19);
  }

  @org.junit.Test(timeout = 4000)
  public void test24() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = false;
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).getTree((((java.lang.Boolean)v8).booleanValue()));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).getBarycenter();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test25() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = 0.0D;
    Object v9 = 1.0D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v8).doubleValue()),(((java.lang.Double)v9).doubleValue()));
    Object v11 = 15.945578771398713D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v10),(((java.lang.Double)v11).doubleValue()));
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v12));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test26() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v5).doubleValue()));
    Object v7 = true;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v8).copySelf();
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v8));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test27() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    org.junit.Assert.assertNotNull(v0);
  }

  @org.junit.Test(timeout = 4000)
  public void test28() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 0.0D;
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v4).doubleValue()),(((java.lang.Double)v5).doubleValue()));
    Object v7 = 0.0D;
    Object v8 = 1.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 15.945578771398713D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Segment(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v3),((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v6),((org.apache.commons.math3.geometry.euclidean.twod.Line)v11));
    Object v13 = new org.apache.commons.math3.geometry.euclidean.twod.SubLine(((org.apache.commons.math3.geometry.euclidean.twod.Segment)v12));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).intersection(((org.apache.commons.math3.geometry.partitioning.SubHyperplane)v13));
    org.junit.Assert.assertNotNull(v14);
  }

  @org.junit.Test(timeout = 4000)
  public void test29() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getBarycenter();
    Object v2 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).getVertices();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test30() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v1).doubleValue()));
    Object v3 = true;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v4).wholeSpace();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v4));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test31() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).checkPoint(((org.apache.commons.math3.geometry.Vector)v3));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Region.Location.INSIDE), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test32() throws Throwable {
    try {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).copySelf();
    Object v9 = new org.apache.commons.math3.analysis.function.Logit();
    Object v10 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v9));
    Object v11 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v7).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v10));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test33() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = false;
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getTree((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test34() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getBoundarySize();
    org.junit.Assert.assertEquals((Object)(0.0D), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test35() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).contains(((org.apache.commons.math3.geometry.partitioning.Region)v1));
    org.junit.Assert.assertEquals((Object)(true), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test36() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).isEmpty();
    org.junit.Assert.assertEquals((Object)(false), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test37() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getBoundarySize();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getSize();
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test38() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getBoundarySize();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getBarycenter();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test39() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getBarycenter();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test40() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 15.945578771398713D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v5));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test41() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = true;
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getTree((((java.lang.Boolean)v1).booleanValue()));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test42() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).computeGeometricalProperties();
    Object v1 = null;
    org.junit.Assert.assertNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test43() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v1).doubleValue()));
    Object v3 = true;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v2),(((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v4));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test44() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()));
    Object v4 = 15.945578771398713D;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v3),(((java.lang.Double)v4).doubleValue()));
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v5));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).computeGeometricalProperties();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test45() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).getSize();
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test46() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = -31.294819170734428D;
    Object v2 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v1).doubleValue()));
    Object v3 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v2));
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v3));
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v6 = true;
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getTree((((java.lang.Boolean)v6).booleanValue()));
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v7));
    org.junit.Assert.assertEquals((Object)(false), v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test47() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).getVertices();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test48() throws Throwable {
    try {
    Object v0 = 0.0D;
    Object v1 = 0.0D;
    Object v2 = 1.0D;
    Object v3 = 3.0D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test49() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = 1.0D;
    Object v2 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v1).doubleValue()));
    Object v3 = ((org.apache.commons.math3.geometry.Vector)v2).normalize();
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).checkPoint(((org.apache.commons.math3.geometry.Vector)v2));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Region.Location.INSIDE), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test50() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test51() throws Throwable {
    Object v0 = 0.03883888175026369D;
    Object v1 = 50.37080950286647D;
    Object v2 = 1.0D;
    Object v3 = 5.115151272508994D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getBarycenter();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test52() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test53() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = -31.294819170734428D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v9));
    org.junit.Assert.assertNotNull(v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test54() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    org.junit.Assert.assertNotNull(v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test55() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = -31.294819170734428D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v9));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v10).computeGeometricalProperties();
    Object v11 = null;
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test56() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = -31.294819170734428D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v9));
    Object v11 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v10).getBarycenter();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test57() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    org.junit.Assert.assertNotNull(v1);
  }

  @org.junit.Test(timeout = 4000)
  public void test58() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getBarycenter();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test59() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v1).getVertices();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test60() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v6).getVertices();
    org.junit.Assert.assertNotNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test61() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = new org.apache.commons.math3.analysis.function.Logit();
    Object v6 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v5));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test62() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = true;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    org.junit.Assert.assertEquals((Object)(false), v4);
  }

  @org.junit.Test(timeout = 4000)
  public void test63() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).computeGeometricalProperties();
    Object v5 = null;
    org.junit.Assert.assertNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test64() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v4).getVertices();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test65() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = true;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test66() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v1).computeGeometricalProperties();
    Object v2 = null;
    org.junit.Assert.assertNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test67() throws Throwable {
    try {
    Object v0 = -16.43685632268828D;
    Object v1 = 0.0D;
    Object v2 = 0.0D;
    Object v3 = 0.0D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet((((java.lang.Double)v0).doubleValue()),(((java.lang.Double)v1).doubleValue()),(((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
      org.junit.Assert.fail("Expected java.lang.NullPointerException");
    } catch (java.lang.NullPointerException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test68() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).getVertices();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test69() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getSize();
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test70() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getBarycenter();
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test71() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    org.junit.Assert.assertNotNull(v3);
  }

  @org.junit.Test(timeout = 4000)
  public void test72() throws Throwable {
    Object v0 = java.util.Comparator.naturalOrder();
    Object v1 = new java.util.TreeSet(((java.util.Comparator)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((java.util.Collection)v1));
    org.junit.Assert.assertNotNull(v2);
  }

  @org.junit.Test(timeout = 4000)
  public void test73() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = true;
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getTree((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test74() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = -31.294819170734428D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v9));
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v12 = true;
    Object v13 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v11).getTree((((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v10).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v13));
    Object v15 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v10).getVertices();
    org.junit.Assert.assertNotNull(v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test75() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = -31.294819170734428D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v9));
    Object v11 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v10).getSize();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test76() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = new org.apache.commons.math3.analysis.function.Logit();
    Object v3 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v2));
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = true;
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getTree((((java.lang.Boolean)v5).booleanValue()));
    Object v7 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v1).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v6));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v1).computeGeometricalProperties();
    Object v8 = null;
    org.junit.Assert.assertNull(v8);
  }

  @org.junit.Test(timeout = 4000)
  public void test77() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = false;
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).getTree((((java.lang.Boolean)v5).booleanValue()));
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test78() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    org.junit.Assert.assertNotNull(v5);
  }

  @org.junit.Test(timeout = 4000)
  public void test79() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v3 = false;
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).getTree((((java.lang.Boolean)v3).booleanValue()));
    Object v5 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v1).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v4));
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).contains(((org.apache.commons.math3.geometry.partitioning.Region)v5));
    ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).computeGeometricalProperties();
    Object v7 = null;
    org.junit.Assert.assertNull(v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test80() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = -31.294819170734428D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v9));
    Object v11 = false;
    Object v12 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v10).getTree((((java.lang.Boolean)v11).booleanValue()));
    org.junit.Assert.assertNotNull(v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test81() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v4 = false;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v2).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = false;
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).getTree((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test82() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).getTree((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test83() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).getBarycenter();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test84() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = 1.0D;
    Object v3 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v2).doubleValue()));
    Object v4 = true;
    Object v5 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v3),(((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v5));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test85() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = 1.0D;
    Object v7 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v6).doubleValue()));
    Object v8 = true;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v7),(((java.lang.Boolean)v8).booleanValue()));
    Object v10 = 1.0D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v10).doubleValue()));
    Object v12 = true;
    Object v13 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v11),(((java.lang.Boolean)v12).booleanValue()));
    Object v14 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v9).sameOrientationAs(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v13));
    Object v15 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v9));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test86() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = 0.0D;
    Object v7 = 1.0D;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v6).doubleValue()),(((java.lang.Double)v7).doubleValue()));
    Object v9 = 15.945578771398713D;
    Object v10 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v8),(((java.lang.Double)v9).doubleValue()));
    Object v11 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v10));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v11);
  }

  @org.junit.Test(timeout = 4000)
  public void test87() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).getTree((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v5).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v8));
    org.junit.Assert.assertNotNull(v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test88() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).copySelf();
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).getTree((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v8));
    org.junit.Assert.assertEquals((Object)(false), v9);
  }

  @org.junit.Test(timeout = 4000)
  public void test89() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.analysis.function.Logit();
    Object v2 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v1));
    Object v3 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v2));
    Object v4 = true;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    Object v7 = -31.294819170734428D;
    Object v8 = java.awt.geom.AffineTransform.getRotateInstance((((java.lang.Double)v7).doubleValue()));
    Object v9 = org.apache.commons.math3.geometry.euclidean.twod.Line.getTransform(((java.awt.geom.AffineTransform)v8));
    Object v10 = 0.0D;
    Object v11 = 1.0D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 15.945578771398713D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math3.geometry.partitioning.Transform)v9).apply(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v14));
    Object v16 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).applyTransform(((org.apache.commons.math3.geometry.partitioning.Transform)v9));
    org.junit.Assert.assertNotNull(v16);
  }

  @org.junit.Test(timeout = 4000)
  public void test90() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).getTree((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v5).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v8));
    Object v10 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v9).getSize();
    org.junit.Assert.assertEquals((Object)(Double.POSITIVE_INFINITY), v10);
  }

  @org.junit.Test(timeout = 4000)
  public void test91() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBarycenter();
    Object v7 = 0.0D;
    Object v8 = 1.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v7).doubleValue()),(((java.lang.Double)v8).doubleValue()));
    Object v10 = 15.945578771398713D;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v9),(((java.lang.Double)v10).doubleValue()));
    Object v12 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v11));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v12);
  }

  @org.junit.Test(timeout = 4000)
  public void test92() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).getBarycenter();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test93() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = 0.0D;
    Object v3 = 1.0D;
    Object v4 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v2).doubleValue()),(((java.lang.Double)v3).doubleValue()));
    Object v5 = 15.945578771398713D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v4),(((java.lang.Double)v5).doubleValue()));
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v6));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v7);
  }

  @org.junit.Test(timeout = 4000)
  public void test94() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v7 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).contains(((org.apache.commons.math3.geometry.partitioning.Region)v6));
    Object v8 = 1.0D;
    Object v9 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v8).doubleValue()));
    Object v10 = true;
    Object v11 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v9),(((java.lang.Boolean)v10).booleanValue()));
    Object v12 = 1.0D;
    Object v13 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v12).doubleValue()));
    Object v14 = true;
    Object v15 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v13),(((java.lang.Boolean)v14).booleanValue()));
    Object v16 = ((org.apache.commons.math3.geometry.partitioning.Hyperplane)v11).sameOrientationAs(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v15));
    Object v17 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v5).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v11));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v17);
  }

  @org.junit.Test(timeout = 4000)
  public void test95() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v5).getVertices();
    org.junit.Assert.assertNotNull(v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test96() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).copySelf();
    Object v6 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v7 = true;
    Object v8 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v6).getTree((((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v5).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v8));
    Object v10 = 0.0D;
    Object v11 = 1.0D;
    Object v12 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D((((java.lang.Double)v10).doubleValue()),(((java.lang.Double)v11).doubleValue()));
    Object v13 = 15.945578771398713D;
    Object v14 = new org.apache.commons.math3.geometry.euclidean.twod.Line(((org.apache.commons.math3.geometry.euclidean.twod.Vector2D)v12),(((java.lang.Double)v13).doubleValue()));
    Object v15 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v9).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v14));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v15);
  }

  @org.junit.Test(timeout = 4000)
  public void test97() throws Throwable {
    try {
    Object v0 = new org.apache.commons.math3.analysis.function.Logit();
    Object v1 = new org.apache.commons.math3.geometry.partitioning.BSPTree(((java.lang.Object)v0));
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet(((org.apache.commons.math3.geometry.partitioning.BSPTree)v1));
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).getBoundarySize();
    Object v4 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).getSize();
      org.junit.Assert.fail("Expected java.lang.ClassCastException");
    } catch (java.lang.ClassCastException expected) { }
  }

  @org.junit.Test(timeout = 4000)
  public void test98() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v0).copySelf();
    Object v2 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v2).copySelf();
    Object v4 = false;
    Object v5 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v3).getTree((((java.lang.Boolean)v4).booleanValue()));
    Object v6 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).isEmpty(((org.apache.commons.math3.geometry.partitioning.BSPTree)v5));
    org.junit.Assert.assertEquals((Object)(false), v6);
  }

  @org.junit.Test(timeout = 4000)
  public void test99() throws Throwable {
    Object v0 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v1 = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet();
    Object v2 = false;
    Object v3 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v1).getTree((((java.lang.Boolean)v2).booleanValue()));
    Object v4 = ((org.apache.commons.math3.geometry.euclidean.twod.PolygonsSet)v0).buildNew(((org.apache.commons.math3.geometry.partitioning.BSPTree)v3));
    Object v5 = 1.0D;
    Object v6 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((((java.lang.Double)v5).doubleValue()));
    Object v7 = true;
    Object v8 = new org.apache.commons.math3.geometry.euclidean.oned.OrientedPoint(((org.apache.commons.math3.geometry.euclidean.oned.Vector1D)v6),(((java.lang.Boolean)v7).booleanValue()));
    Object v9 = ((org.apache.commons.math3.geometry.partitioning.AbstractRegion)v4).side(((org.apache.commons.math3.geometry.partitioning.Hyperplane)v8));
    org.junit.Assert.assertEquals((Object)(org.apache.commons.math3.geometry.partitioning.Side.BOTH), v9);
  }
}
